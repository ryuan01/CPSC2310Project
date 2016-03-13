var username;
var password;

// check if either form is filled, or has valid information
function validateForm() {
    
    var uField = document.forms["login_form"]["username"].value;
    var pField = document.forms["login_form"]["password"].value;
    
    if ((uField == null || pField == null) || (uField == "" || pField == "")) {
        return false;
    }
    username = uField;
    password = pField;
    return true;
    
}
// get user login credentials
function getUserInfo() {
    
    if (validateForm()) {
        
        document.getElementById("validator").innerHTML = "\nUsername: " + username + " \nPassword: " + password;
    }
    else {
       
        document.getElementById("validator").innerHTML = "Invalid username or password.";
        document.getElementById("validator").style.color = "red";
    }
}

// search webserver for vehicle
//function searchVehicle() {
//    
//    //TODO
//}
//
//function searchReservation() {
//    
//    //TODO
//}