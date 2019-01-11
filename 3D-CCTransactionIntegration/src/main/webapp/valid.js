function ValidForm() {
	var firstname = document.getElementById("firstname");
	var lastname = document.getElementById("lastname");
	var amount = document.getElementById("amount");
	var carditCardNumber = document.getElementById("carditCardNumber");
	var expMonth = document.getElementById("expMonth");
	var expYear = document.getElementById("expYear");
	var cvv= document.getElementById("cvv");

	removeMessage();
	var valid = true;
	if (firstname.value.length == 0) {
		firstname.className = "wrong-input";
		firstname.nextElementSibling.innerHTML = "firstname can't be blank";
		valid = false;
	}

	if (lastname.value.length == 0) {
		lastname.className = "wrong-input";
		lastname.nextElementSibling.innerHTML = "lastname can't be blank";
		valid = false;
	}
	if (amount.value.length == 0) {
		amount.className = "wrong-input";
		amount.nextElementSibling.innerHTML = "amount must be required";
		valid = false;
	}
	if (carditCardNumber.value.length < 10) {
		carditCardNumber.className = "wrong-input";
		carditCardNumber.nextElementSibling.innerHTML = "credit card number is required";
		valid = false;
	}
	if (expMonth.value.length < 2 || expMonth.value.length > 2 ) {
		expMonth.className = "wrong-input";
		expMonth.nextElementSibling.innerHTML = "Expire month must be 2 digits";
		valid = false;
	}
	if (expYear.value.length < 4 || expYear.value.length > 4) {
		expYear.className = "wrong-input";
		expYear.nextElementSibling.innerHTML = "Expire year must be 4 digits";
		valid = false;
	}
	if (cvv.value.length < 3 || cvv.value.length > 3) {
		cvv.className = "wrong-input";
		cvv.nextElementSibling.innerHTML = "cvv must be 3 digits";
		valid = false;
	}

	return valid;
}

function removeMessage() {
	var errorinput = document.querySelectorAll(".wrong-input");
	[].forEach.call(errorinput, function(el) {
		el.classList.remove("wrong-input");
	});

	var errorpara = document.querySelectorAll(".error");
	[].forEach.call(errorpara, function(el) {
		el.innerHTML = "";
	});
}