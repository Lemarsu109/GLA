// JavaScript source code
function getServerData(url, success) {
	$.ajax({
		url: url
	}).done(success);
}

function putServerData(url, data, success) {
	$.ajax({
		method: "PUT",
		url: url,
		data: data
	})
		.done(success);
}

var userId = "";
var user = { "": "" };
var flightId = "";

function callDoneConnection(result) {
	userId = result.id;
	user = result;
	console.log(user);
}

function callDone(result) {
	
}

$(function () {
	$("#log_in").click(function () {
		var email = document.getElementById("email").value;
		var password = document.getElementById("password").value;
		getServerData("ws/user/" + email + "/" + password, callDoneConnection);

		document.location.href = "http://localhost:8080/my_flights.html";
	});
});

$(function () {
	$("#new_user").click(function () {
		const rbs = document.querySelectorAll('input[name="usertype"]');
		let selectedValue;
		for (const rb of rbs) {
			if (rb.checked) {
				selectedValue = rb.value;
				break;
			}
		}
		var usertype = selectedValue;
		var name = document.getElementById("name").value;
		var surname = document.getElementById("surname").value;
		var dateOfBirth = document.getElementById("dateofbirth").value;
		const rbs2 = document.querySelectorAll('input[name="gender"]');
		let selectedValue2;
		for (const rb2 of rbs2) {
			if (rb2.checked) {
				selectedValue2 = rb2.value;
				break;
			}
		}
		var gender = selectedValue2;
		var address = document.getElementById("address").value;
		var phonenb = document.getElementById("phonenb").value;
		var email = document.getElementById("email").value;
		var password = document.getElementById("password").value;

		var data = name + "/" + surname + "/"
			+ dateOfBirth + "/" + gender + "/" + address + "/"
			+ phonenb + "/" + email + "/" + password;
		if (usertype == "passenger") {
			putServerData("ws/user/passenger", data, callDone);

			getServerData("ws/user/pass" + email + "/" + password, callDoneConnection);

		} else {
			var exp = window.prompt("What is your experience ? ");
			var qualif = window.prompt("What are your qualifications ? ");
			var noh = window.prompt("How many hours did you fly ? ");
			data = data + "/" + exp + "/" + qualif + "/" + noh
			putServerData("ws/user/pilot", data, callDone);

			getServerData("ws/user/pass" + email + "/" + password, callDoneConnection);
		}

		document.location.href = "http://localhost:8080/my_flights.html";

	});
});


/*Call Done for a new flight*/
function callDoneNF(result) {
	document.location.href = "http://localhost:8080/my_flights.html";
}

$(function () {
	$("#new_flight").click(function () {
		var depairport = document.getElementById("depairport").value;
		var arrairport = document.getElementById("arraiport").value;
		var date = document.getElementById("date").value;
		var time = document.getElementById("time").value;
		var nop = document.getElementById("nbpass").value;
		var planedescr = document.getElementById("planedescr").value;
		var publicdescr = document.getElementById("publicdescr").value;
		var privatedescr = document.getElementById("privatedescr").value;

		var data = depairport + "/" + arrairport + "/" + date
			+ "/" + time + "/" + nop + "/" + planedescr
			+ "/" + publicdescr + "/" + privatedescr + "/" + userId;

		putServerData("ws/flight/new", data, callDoneNF);

	});
});


/**
 * Prints the name of user and his list of flights
 */
function callDonePrint(result) {
	var username = document.createElement("text");
	var utext = document.createTextNode(result.name + ' ' + result.surname);
	username.appendChild(utext);

	var uexit = document.getElementById("username");
	uexit.appendChild(username);


	var flights = document.createElement("text");
	var ftext = document.createTextNode(result.flightList);
	flights.appendChild(ftext);

	var fexit = document.getElementById("flights");
	fexit.appendChild(flight);

}

$(window).load(function () {

	
	if (document.location.href == "http://localhost:8080/my_flights.html") {
		getServerData("ws/user/" + userId, callDonePrint);
	}

	if (document.location.href == "http://localhost:8080/new_flight.html") {
		getServerData("ws/user/" + userId, callDonePrint);
	}

});

$(function () {
	$("#nf_link").click(function () {
		document.location.href = "http://localhost:8080/new_flight.html";
	});
});

$(function () {
	$("#li_link").click(function () {
		document.location.href = "http://localhost:8080/log_in.html";
	});
});

$(function () {
	$("#si_link").click(function () {
		document.location.href = "http://localhost:8080/sign_in.html";
	});
});