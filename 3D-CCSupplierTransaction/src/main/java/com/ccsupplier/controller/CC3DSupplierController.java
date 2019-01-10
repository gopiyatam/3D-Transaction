package com.ccsupplier.controller;

import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC3DSupplierController {

	private Long supplierTxnId = null;
	String status = null;
	private JSONObject obj = null;

	@PostMapping(value = "/supplierCcTransPending")
	@ResponseBody
	public String creditCardTransactionSupplierPending(HttpServletRequest request,
			@RequestBody String transactionDetails) {

		obj = new JSONObject(transactionDetails);
		supplierTxnId = ThreadLocalRandom.current().nextLong(1000L, 910999999999L);
		status = "PENDING";

		obj.put("supplierTxnId", supplierTxnId);
		obj.put("status", status);

		return obj.toString();

	}

	@PostMapping(value = "/supplierCCTransExecute")
	@ResponseBody
	public String creditCardTransSupplier(HttpServletRequest request, @RequestBody String pendingDetails) {

		obj = new JSONObject(pendingDetails);
		double amount = obj.getDouble("amount");

		if (amount >= 10) {
			obj.remove("status");
			String status = "SUCCESS";
			obj.put("status", status);
			return obj.toString();

		} else {

			obj.remove("status");
			String status = "DECLINED";
			obj.putOnce("status", status);
			return obj.toString();

		}

	}
}