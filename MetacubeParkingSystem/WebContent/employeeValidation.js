function employeeRegistration() {
	var name = document.getElementById("FullName").value;
	var email = document.getElementById("Email").value;
	var contact = document.getElementById("Contact").value;
	
	var regexName = /[a-zA-Z]{2,}/;
	var regexName2 = /^[a-zA-Z]+ [a-zA-Z]+$/;
	if (name.length <= 2) {
		document.getElementById('invalidName').style.color = "red";
    	document.getElementById('invalidName').innerHTML = "Insert name greater than 2 character";
        return false;
	} else if (regexName2.test(name) || regexName.test(name)) {
		document.getElementById("invalidName").innerHTML = "";
		
	} else {
		document.getElementById('invalidName').style.color = "red";
    	document.getElementById('invalidName').innerHTML = "Name must contain letter's only.";
        return false;x
	}
	var filterEmail = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (email == "") {
		document.getElementById('invalidEmail').style.color = "red";
    	document.getElementById('invalidEmail').innerHTML = "Insert a email id";
        return false;
	}
	if (!filterEmail.test(email)) {
		document.getElementById('invalidEmail').style.color = "red";
    	document.getElementById('invalidEmail').innerHTML = "Insert a Valid Email";
        return false;
	} else {
		document.getElementById("invalidEmail").innerHTML = "";
	}
	var filterContact = new RegExp('/^\d{10}$/');
	
	if ((contact.length !=10)) {
		document.getElementById('invalidContact').style.color = "red";
    	document.getElementById('invalidContact').innerHTML = "Number length must be 10";
        return false;
	} else if (filterContact.test(contact)) {
		document.getElementById('invalidContact').style.color = "red";
    	document.getElementById('invalidContact').innerHTML = "Numeric value only allowed";
        return false;
	} else {
		document.getElementById("invalidContact").innerHTML = "";
	}
	return true;
}
