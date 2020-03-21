// variables used for saving details of employee and vehicles
let empName:string;
let email:string = "";
let password:string = "";
let confirmPassword:string = "";
let contactNumber:number ;
let employeeID:string = "";
let vehicleNumber:string = "";
let vehicleName:string = "";
let pass:string = "";
let vehicleIdentification:string = "";
let vehicleType:string="";

// regex needed fot he programme
let regexName = /[a-zA-Z]{2,}/;
let regexName1 = /^[a-zA-Z]+ [a-zA-Z]+$/;
let regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
let regexPassword = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})/;
let regexContactNumber : any = /^\d{10}$/;
let regexVehicleName = /[a-zA-Z]/;
let regexForVehicleNumber = /^[A-Za-z]{2}[0-9]{2}[A-Za-z]{2}[0-9]{4}$/;

// This method will check the validation of name and will show next input
function nameCheck() {
    empName = (<HTMLInputElement>document.getElementById("input")).value;
   
    if (empName != "") {
        if (regexName.test(empName) || regexName1.test(empName)) {
            document.getElementById("genderIdLabel").innerHTML = "Hi " + empName + " ! Please Enter your Gender : ";
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
function genderCheck() {
    if ((< HTMLInputElement >document.getElementById("maleGender")).checked == true || (< HTMLInputElement >document.getElementById("femaleGender")).checked == true) {
        document.getElementById("formGender").style.display = "none";
        document.getElementById("formForAllInput").style.display = "block";
        document.getElementById("idLabel").innerHTML = "Hi " + name + "!" + " Enter Your Email ";
        (< HTMLInputElement >document.getElementById("input")).type = "email";
        (< HTMLInputElement >document.getElementById("input")).value = "";
        document.getElementById("refrenceLink").onclick = emailCheck;
    } else {
        alert("please select your gender");
    }
}

// This method will check the validation of Email and will show next input
function emailCheck(){
    email = (< HTMLInputElement >document.getElementById("input")).value;
    if (email != "") {
        if (regexEmail.test(email)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please Enter your password : ";
            (< HTMLInputElement >document.getElementById("input")).type = 'password';
            (< HTMLInputElement >document.getElementById("input")).value = "";
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
function passwordCheck(){
    password = (< HTMLInputElement >document.getElementById("input")).value;
    if (password != "") {
        if (regexPassword.test(password)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please confirm your password : ";
            (< HTMLInputElement >document.getElementById("input")).type = 'password';
            document.getElementById("input").style.borderColor = "";
            (< HTMLInputElement >document.getElementById("input")).value = "";
            document.getElementById("refrenceLink").onclick = confirmPasswordCheck;
            document.getElementById("input").onkeyup = confirmBoundaryColor;
        } else {
            alert("password should contain one uppercase varter,lowercase varter , number and minimum length should be 8");
        }
    } else {
        alert("Password can't be empty.");
    }
}

// This method will check the validation of coinfirm password and will show next input
function confirmPasswordCheck(){
    confirmPassword = (< HTMLInputElement >document.getElementById("input")).value;
    if (confirmPassword == password) {
        document.getElementById("idLabel").innerHTML = "Hi " + name + " ! Please enter your Contact Number : ";
        (< HTMLInputElement >document.getElementById("input")).type = "text";
        document.getElementById("input").style.borderColor = "";
        (< HTMLInputElement >document.getElementById("input")).value = "";
        document.getElementById("refrenceLink").onclick = contactnumberCheck;
        document.getElementById("input").onkeyup = none;
    } else {
        alert("Your password don't match!!!");
    }
}

function none(){

}

// This method will check the validation of Contact Number and will show next input
function contactnumberCheck(){
    contactNumber = parseInt((< HTMLInputElement >document.getElementById("input")).value);
    if ((< HTMLInputElement >document.getElementById("input")).value != "") {
        if (regexContactNumber.test(contactNumber)) {
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your Employee ID : ";
            (< HTMLInputElement >document.getElementById("input")).value = "";
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
function employeeIDCheck(){
    employeeID = (< HTMLInputElement >document.getElementById("input")).value;
    if (employeeID != "") {
        document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your vehicle name : ";
        (< HTMLInputElement >document.getElementById("input")).value = "";
        document.getElementById("refrenceLink").onclick = vehicleNameCheck;
        document.getElementById("input").style.borderColor = "";
    } else {
        alert("Employee ID can't be empty!!!");
    }
}

// This method will check the validation of Vehicle name and will show next input
function vehicleNameCheck(){
    vehicleName = (< HTMLInputElement >document.getElementById("input")).value;
    if ((< HTMLInputElement >document.getElementById("input")).value != "") {
        if (regexVehicleName.test(vehicleName)) {
            document.getElementById("input").style.borderColor = "";
            document.getElementById("idLabel").innerHTML = "Hi " + name + "! " + "Please Enter your vehicle number!";
            (< HTMLInputElement >document.getElementById("input")).value = "";
            document.getElementById("refrenceLink").onclick = vehicleNumberCheck;
        } else {
            alert("Only varters are allowed!!!");
        }
    } else {
        alert("Vehicle number can't be empty!!");
    }
}

// This method will check the validation of Vehicle Number and will show next input
function vehicleNumberCheck(){
  
    vehicleNumber = (< HTMLInputElement >document.getElementById("input")).value;
    
    if (vehicleNumber != "") {
        
        if (regexForVehicleNumber.test(vehicleNumber)) {
           
            document.getElementById("input").style.borderColor = "";
            document.getElementById("selectVehicleType").style.display = "block"
            document.getElementById("vehicleTypeLabel").innerHTML = "Hi " + name + "! " + "What's Your Vehicle Type?";
            document.getElementById("formForAllInput").style.display = "none";
            document.getElementById("refrenceLink").onclick = vehicleTypeCheck;

        } else {
            alert("Please Enter Vehicle Number in form like RJXXCAXXXX!");
        }
    } else {
        alert("Please Enter Vehicle Number!!");
    }
}

// This method will check the validation of Vehicle Type and will show next input
function vehicleTypeCheck(){
    vehicleType = (< HTMLInputElement >document.getElementById("vehicleType")).value;
    if (vehicleType != "") {
        document.getElementById("boxSpan").innerHTML = '';
        document.getElementById("boxSpan").innerHTML = '<textarea></textarea>';
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
function showPass(){
    document.getElementById("idLabel").style.display = "none";
    document.getElementById("boxSpan").style.display = 'none';
    document.getElementById("formForAllInput").style.display = "none";
    document.getElementById("selectVehicleType").style.display = "none";
    document.getElementById("input").style.display = 'none';
    document.getElementById("refrenceLink").style.display = 'none';
    
    if ("Cycle" == vehicleType) {

        document.getElementById("selectCyclePassType").style.display = "block";
        document.getElementById("idLabelCycvarype").innerHTML = "Choose Your Pass!";
    } else if ("MotorCycle" == vehicleType) {
        document.getElementById("selectTwoPassType").style.display = "block";
        document.getElementById("idLabelTwoType").innerHTML = "Choose Your Pass!";
    } else {
        document.getElementById("selectFourPassType").style.display = "block";
        document.getElementById("idLabelFourType").innerHTML = "Choose Your Pass!";
    }
}

// This method will show the pass price
function passCheck(){
    
    document.getElementById("formForAllInput").style.display = "none";
   
    document.getElementById("selectVehicleType").style.display = "none";
    
    if ("Cycle" == vehicleType) {
        pass = (< HTMLInputElement >document.getElementById("Cycle")).value;
    } else if ("MotorCycle" == vehicleType) {
        pass = (< HTMLInputElement >document.getElementById("TwoWheeler")).value;
    } else if ("FourWheeler" == vehicleType) {
        pass = (< HTMLInputElement >document.getElementById("FourWheeler")).value;
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
function boundaryColor(){
    password = (< HTMLInputElement >document.getElementById("input")).value;
    if (regexPassword.test(password)) {
        document.getElementById("input").style.borderColor = "green";
    } else if (password.length < 4) {
        document.getElementById("input").style.borderColor = "red";
    } else if (password.length > 4) {
        document.getElementById("input").style.borderColor = "yellow";
    }
}

// This method will change the color of boundary according to the confirmation if the password and confirm password input match
function confirmBoundaryColor(){
    confirmPassword = (< HTMLInputElement >document.getElementById("input")).value;
    if (confirmPassword != password) {
        document.getElementById("input").style.borderColor = "red";

    } else {
        document.getElementById("input").style.borderColor = "green";
    }
}