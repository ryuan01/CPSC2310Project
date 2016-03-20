var day;
var button;

window.onload = function() {
	button = document.getElementById('button');
	setButton();
};
function setButton() {
	button.onclick=function() {
		day = document.getElementById('day').value;
		var xmlhttp = new XMLHttpRequest();
		xmlhttp.open('POST', 'http://localhost:8080/SuperRenter/RootService', true);

		// build SOAP requests
		var sr = '<?xml version="1.0" encoding="UTF-8"?><S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/" xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"> <SOAP-ENV:Header/> <S:Body> <ns2:post xmlns:ns2="http://scheduler/"> <arg0>'+ String(day) +'</arg0> </ns2:post> </S:Body> </S:Envelope>';
		

		xmlhttp.onreadystatechange = function () {
			if (xmlhttp.readyState === 4) {
				if (xmlhttp.status == 200) {
					console.log(xmlhttp.responseXML.getElementsByTagName('return')[0]);
				}
				else {
					console.log('something went wrong');
				}
			}
		};
		
		// Send the POST request
		xmlhttp.setRequestHeader('Content-Type', 'text/xml');
		xmlhttp.send(sr);
	};
};