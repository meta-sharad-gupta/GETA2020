let vehicleType = "";
let password = "";
let number = "";
let Upperchar = "";
let Lowerchar = "";
let name = "";
let email = "";
let regexFirstName = /[a-zA-Z]/;
let regexFullName = /^[a-zA-Z]+ [a-zA-Z]+$/;
let regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
let regexForVehicleNumber = /^[A-Za-z]{2}\s[0-9]{2}\s[A-Za-z]{2}\s[0-9]{4}$/;
let regexContactNumber = /[0-9]{10}/;
next = () => {
    name = document.getElementById("input").value;
    if (name != "") {
        if (regexFirstName.test(name) || regexFullName.test(name)) {
            document.getElementById("idLabelGender").innerHTML = "Hi " + name + "!" + " Enter Your Gender ";
            document.getElementById("formGender").style.display = "block";
            document.getElementById("formField").style.display = "none";
        } else {
            alert("Name should contain only letters.");
        }
    } else {
        alert("Please enter your Name");
    }
}

next9 = () => {
    if (document.getElementById("maleGender").checked == true || document.getElementById("femaleGender").checked == true) {
        document.getElementById("formGender").style.display = "none";
        document.getElementById("formField").style.display = "block";
        document.getElementById("idLabel").innerHTML = "Hi " + name + "!" + " Enter Your Email ";
        document.getElementById("input").type = "email";
        document.getElementById("input").value = "";
        document.getElementById("a").onclick = next1;
    } else {
        alert("Your gender is empty!!!");
    }
}

next1 = () => {
    var email = document.getElementById("input").value;
    if (email != "") {
        if (regexEmail.test(email)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter Your Password Here";
            document.getElementById("input").type = "password";
            document.getElementById("input").value = "";
            document.getElementById("input").oninput = checkPassword;
            document.getElementById("a").onclick = next2;
        } else {
            alert("Please Enter Email in Proper Format! Format : abc@abc.abc");
        }
    } else {
        alert("Your Email is Empty!!");
    }
}

next2 = () => {
    password = document.getElementById("input").value;
    if (password != "" && document.getElementById("input").style.outlineColor == "green") {

        document.getElementById("input").oninput = false;
        document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Confirm Your Password Here!";
        document.getElementById("input").type = "password";
        document.getElementById("input").value = "";
        document.getElementById("a").onclick = next3;
    } else {
        alert("password should contain one uppercase letter,lowercase letter , number and minimum length should be 8");
    }
}

next3 = () => {
    var repass = document.getElementById("input").value;
    if (repass != "") {
        if (password != repass) {
            alert("Looks Like Password does not Match!!!");
        } else {
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter Your Contact Number!";
            document.getElementById("input").type = "tel";
            document.getElementById("input").value = "";
            document.getElementById("a").onclick = next4;
        }
    } else {
        alert("Oops!! Your Password is Empty!!");
    }
}

next4 = () => {
    let contactNumber = document.getElementById("input").value;
    if (document.getElementById("input").value != "") {
        if (regexContactNumber.test(contactNumber)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your vehicle number!";
            document.getElementById("input").value = "";
            document.getElementById("a").onclick = next5;
        } else {
            alert("Contact number should only contain 10 numbers.");
        }
    } else {
        alert("Looks Like Your Contact Number is Empty!!");
    }
}

next5 = () => {

    var vehNumber = document.getElementById("input").value;
    if (vehNumber != "") {
        if (regexForVehicleNumber.test(vehNumber)) {
            document.getElementById("idLabelVehType").innerHTML = "Hi " + name + "! " + "What's Your Vehicle Type?";
            document.getElementById("formField").style.display = "none";
            document.getElementById("selectVehType").style.display = "block"
        } else {
            alert("Please Enter Vehicle Number in form like RJ XX CA XXXX!");
        }
    } else {
        alert("Please Enter Vehicle Number!!");
    }
}

next6 = () => {
    vehicleType = document.getElementById("vehicleType").value;
    if (vehicleType != "") {
        document.getElementById("formField").style.display = "block";
        document.getElementById("selectVehType").style.display = "none";

        document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter Your Employee Id!";
        document.getElementById("input").type = "id";
        document.getElementById("input").value = "";
        document.getElementById("a").onclick = next7;
    } else {
        alert("Mention your Vehicle Type Please!!");
    }
}

next7 = () => {
    if (document.getElementById("input").value != "") {
        if ("Cycle" == vehicleType) {
            document.getElementById("formField").style.display = "none";
            document.getElementById("selectCyclePassType").style.display = "block";
            document.getElementById("idLabelCycleType").innerHTML = "Choose Your Pass!";
        } else if ("MotorCycle" == vehicleType) {
            document.getElementById("formField").style.display = "none";
            document.getElementById("selectTwoPassType").style.display = "block";
            document.getElementById("idLabelTwoType").innerHTML = "Choose Your Pass!";
        } else {
            document.getElementById("formField").style.display = "none";
            document.getElementById("selectFourPassType").style.display = "block";
            document.getElementById("idLabelFourType").innerHTML = "Choose Your Pass!";
        }
    } else {
        alert("Please Enter Employee Id!!");
    }
}

next8 = () => {
    var pass = 0;
    if ("Cycle" == vehicleType) {
        pass = document.getElementById("passType").value;
    } else if ("MotorCycle" == vehicleType) {
        pass = document.getElementById("TwoWheeler").value;
    } else if ("FourWheeler" == vehicleType) {
        pass = document.getElementById("FourWheeler").value;
    }
    if (pass != "") {
        document.getElementById("formField").style.display = "block";
        document.getElementById("selectTwoPassType").style.display = "none";
        document.getElementById("selectFourPassType").style.display = "none";
        document.getElementById("selectCyclePassType").style.display = "none";
        document.getElementById("formField").innerHTML = " Your pass price is Rs." + pass + "  !!!!!";

    } else {
        alert("Please Select Pass");
    }
}

checkPassword = () => {

    let regexp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{7,})/;
    let pass = document.getElementById("input").value;

    if (pass.length < 4) {
        document.getElementById("input").style.outlineColor = "red";
    } else if (pass.length > 4 && pass.length < 8) {
        document.getElementById("input").style.outlineColor = "orange";
    } else if (regexp.test(pass)) {
        document.getElementById("input").style.outlineColor = "green";
    }
}