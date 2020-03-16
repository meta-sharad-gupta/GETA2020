// variables used for saving details of employee and vehicles
let name = "";
let email = "";
let password = "";
let confirmPassword = "";
let contactNumber = "";
let employeeID = "";
let vehicleNumber = "";
let vehicleName = "";
let pass = "";
let vehicleIdentification = "";

// regex needed fot he programme
let regexName = /[a-zA-Z]{2,}/;
let regexName1 = /^[a-zA-Z]+ [a-zA-Z]+$/;
let regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
let regexPassword = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})/;
let regexContactNumber = /^\d{10}$/;
let regexVehicleName = /[a-zA-Z]/;
let regexForVehicleNumber = /^[A-Za-z]{2}\s[0-9]{2}\s[A-Za-z]{2}\s[0-9]{4}$/;

// This method will check the validation of name and will show next input
nameCheck = () => {

    name = document.getElementById("input").value;
    if (name != "") {
        if (regexName.test(name) || regexName1.test(name)) {
            document.getElementById("genderIdLabel").innerHTML = "Hi " + name + " ! Please Enter your Gender : ";
            document.getElementById("formGender").style.display = "block";
            document.getElementById("formForAllInput").style.display = "none";
        } else {
            alert("Name should contain only letter and minimum 2 letters.");
        }
    } else {
        alert("Name can't be empty.");
    }
}

// This method will check the validation of gender and will show next input
genderCheck = () => {
    if (document.getElementById("maleGender").checked == true || document.getElementById("femaleGender").checked == true) {
        document.getElementById("formGender").style.display = "none";
        document.getElementById("formForAllInput").style.display = "block";
        document.getElementById("idLabel").innerHTML = "Hi " + name + "!" + " Enter Your Email ";
        document.getElementById("input").type = "email";
        document.getElementById("input").value = "";
        document.getElementById("refrenceLink").onclick = emailCheck;
    } else {
        alert("please select your gender");
    }
}

// This method will check the validation of Email and will show next input
emailCheck = () => {
    email = document.getElementById("input").value;
    if (email != "") {
        if (regexEmail.test(email)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please Enter your password : ";
            document.getElementById("input").type = 'password';
            document.getElementById("input").value = "";
            document.getElementById("refrenceLink").onclick = passwordCheck;
            document.getElementById("input").onkeyup = boundaryColor;
        } else {
            alert("Enter email in proper format. Format : abc@abc.com");
        }
    } else {
        alert("Email can't be empty.");
    }
}

// This method will check the validation of Password and will show next input
passwordCheck = () => {
    password = document.getElementById("input").value;
    if (password != "") {
        if (regexPassword.test(password)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please confirm your password : ";
            document.getElementById("input").type = 'password';
            document.getElementById("input").style.borderColor = "";
            document.getElementById("input").value = "";
            document.getElementById("refrenceLink").onclick = confirmPasswordCheck;
            document.getElementById("input").onkeyup = confirmBoundaryColor;
        } else {
            alert("password should contain one uppercase letter,lowercase letter , number and minimum length should be 8");
        }
    } else {
        alert("Password can't be empty.");
    }
}

// This method will check the validation of coinfirm password and will show next input
confirmPasswordCheck = () => {
    confirmPassword = document.getElementById("input").value;
    if (confirmPassword == password) {
        document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please enter your Contact Number : ";
        document.getElementById("input").type = "text";
        document.getElementById("input").style.borderColor = "";
        document.getElementById("input").value = "";
        document.getElementById("refrenceLink").onclick = contactnumberCheck;
        document.getElementById("input").onkeyup = "";
    } else {
        alert("Your password don't match!!!");
    }
}

// This method will check the validation of Contact Number and will show next input
contactnumberCheck = () => {
    contactNumber = document.getElementById("input").value;
    if (document.getElementById("input").value != "") {
        if (regexContactNumber.test(contactNumber)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your Employee ID : ";
            document.getElementById("input").value = "";
            document.getElementById("refrenceLink").onclick = employeeIDCheck;
            document.getElementById("input").style.borderColor = "";
        } else {
            alert("Contact number should only contain 10 numbers.");
        }
    } else {
        alert("Looks Like Your Contact Number is Empty!!");
    }
}

// This method will check the validation of Employee ID and will show next input
employeeIDCheck = () => {
    employeeID = document.getElementById("input").value;
    if (employeeID != "") {
        document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your vehicle name : ";
        document.getElementById("input").value = "";
        document.getElementById("refrenceLink").onclick = vehicleNameCheck;
        document.getElementById("input").style.borderColor = "";
    } else {
        alert("Employee ID can't be empty!!!");
    }
}

// This method will check the validation of Vehicle name and will show next input
vehicleNameCheck = () => {
    vehicleName = document.getElementById("input").value;
    if (document.getElementById("input").value != "") {
        if (regexVehicleName.test(vehicleName)) {
            document.getElementById("input").style.borderColor = "";
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your vehicle number!";
            document.getElementById("input").value = "";
            document.getElementById("refrenceLink").onclick = vehicleNumberCheck;
        } else {
            alert("Only letters are allowed!!!");
        }
    } else {
        alert("Vehicle number can't be empty!!");
    }
}

// This method will check the validation of Vehicle Number and will show next input
vehicleNumberCheck = () => {
    vehicleNumber = document.getElementById("input").value;
    if (vehicleNumber != "") {
        if (regexForVehicleNumber.test(vehicleNumber)) {
            document.getElementById("input").style.borderColor = "";
            document.getElementById("selectVehicleType").style.display = "block"
            document.getElementById("vehicleTypeLabel").innerHTML = "Hi " + name + "! " + "What's Your Vehicle Type?";
            document.getElementById("formForAllInput").style.display = "none";
            document.getElementById("refrenceLink").onclick = vehicleTypeCheck;

        } else {
            alert("Please Enter Vehicle Number in form like RJ XX CA XXXX!");
        }
    } else {
        alert("Please Enter Vehicle Number!!");
    }
}

// This method will check the validation of Vehicle Type and will show next input
vehicleTypeCheck = () => {
    vehicleType = document.getElementById("vehicleType").value;
    if (vehicleType != "") {
        document.getElementById("box-span").innerHTML = '';
        document.getElementById("box-span").innerHTML = '<textarea></textarea>';
        document.getElementById("formForAllInput").style.display = "block";
        document.getElementById("selectVehicleType").style.display = "none"
        document.getElementById("input").style.display = 'none';
        document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please Enter your vehicle Identification : ";

        document.getElementById("refrenceLink").onclick = showPass;
    } else {
        alert("Please select your vehicle type!!");
    }
}

// This method will show the pass of vehicle
showPass = () => {
    document.getElementById("idLabel").style.display = "none";
    document.getElementById("box-span").style.display = 'none';
    document.getElementById("formForAllInput").style.display = "none";
    document.getElementById("selectVehicleType").style.display = "none";
    document.getElementById("input").style.display = 'none';
    document.getElementById("refrenceLink").style.display = 'none';
    if ("Cycle" == vehicleType) {

        document.getElementById("selectCyclePassType").style.display = "block";
        document.getElementById("idLabelCycleType").innerHTML = "Choose Your Pass!";
    } else if ("MotorCycle" == vehicleType) {
        document.getElementById("selectTwoPassType").style.display = "block";
        document.getElementById("idLabelTwoType").innerHTML = "Choose Your Pass!";
    } else {
        document.getElementById("selectFourPassType").style.display = "block";
        document.getElementById("idLabelFourType").innerHTML = "Choose Your Pass!";
    }
}

// This method will show the pass price
passCheck = () => {
    document.getElementById("formForAllInput").style.display = "none";
    document.getElementById("selectVehicleType").style.display = "none";
    if ("Cycle" == vehicleType) {
        pass = document.getElementById("Cycle").value;
    } else if ("MotorCycle" == vehicleType) {
        pass = document.getElementById("TwoWheeler").value;
    } else if ("FourWheeler" == vehicleType) {
        pass = document.getElementById("FourWheeler").value;
    }
    if (pass != "") {
        document.getElementById("formForAllInput").style.display = "none";
        document.getElementById("selectTwoPassType").style.display = "none";
        document.getElementById("selectFourPassType").style.display = "none";
        document.getElementById("selectCyclePassType").style.display = "none";
        document.getElementById("finalMessage").innerHTML = " Your pass price is Rs." + pass + "  !!!!!";

    } else {
        alert("Please Select Pass");
    }
}

// This method will change the color of boundary according to the password length
boundaryColor = () => {
    password = document.getElementById("input").value;
    if (regexPassword.test(password)) {
        document.getElementById("input").style.borderColor = "green";
    } else if (password.length < 2) {
        document.getElementById("input").style.borderColor = "red";
    } else if (password.length > 2) {
        document.getElementById("input").style.borderColor = "yellow";
    }
}

// This method will change the color of boundary according to the confirmation if the password and confirm password input match
confirmBoundaryColor = () => {
    confirmPassword = document.getElementById("input").value;
    if (confirmPassword != password) {
        document.getElementById("input").style.borderColor = "red";

    } else {
        document.getElementById("input").style.borderColor = "green";
    }
}