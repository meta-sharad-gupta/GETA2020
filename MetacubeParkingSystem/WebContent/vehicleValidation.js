function vehicleRegister() {
	console.log('adsfdsf');
    var vName = document.getElementById("vehicleName").value;
    var type = document.getElementById("vehicleType").value;
    var vehicleNum = document.getElementById("vehicleNumber").value;
    var identity = document.getElementById("identification").value;
    if (vName.length <= 2) {
    	document.getElementById('invalidVehicleName').style.color = "red";
    	document.getElementById('invalidVehicleName').innerHTML = "Vehicle name length must be greater than 2";
        return false;
    }
    else{
    	document.getElementById("invalidVehicleName").innerHTML = "";
    }
    if (type == "none") {
    	document.getElementById('invalidType').style.color = "red";
    	document.getElementById('invalidType').innerHTML = "Select Type Of Your Vehicle";
        return false;
    }
    else{
    	document.getElementById("invalidType").innerHTML = "";
    }
    if (vehicleNum.length <= 4) {
    	document.getElementById('invalidVehicleNumber').style.color = "red";
    	document.getElementById('invalidVehicleNumber').innerHTML = "Length must be more then 4";
        return false;
    } 
    else{
    	document.getElementById("invalidVehicleNumber").innerHTML = "";
    }

    return true;
}