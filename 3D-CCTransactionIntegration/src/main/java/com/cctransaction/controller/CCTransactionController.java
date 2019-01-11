package com.cctransaction.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cctransaction.bean.CCTransaction;
import com.cctransaction.service.CCTransactionService;

@RestController
public class CCTransactionController {

	@Autowired
	private CCTransactionService service;

	@PostMapping(value = "/getCCTransDetails", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public String saveAndExecuteTransaction(@RequestBody CCTransaction transaction)
			throws ClientProtocolException, IOException {
		return service.creditCardTransaction(transaction);

	}

	@PostMapping(value = "/getTransDetalisById")
	public CCTransaction getTransactionDetailsById(@RequestParam int marchantTxnId, HttpServletRequest request) {
		return service.getTransactionDetailsByMarchantTxnId(marchantTxnId);

	}

}
