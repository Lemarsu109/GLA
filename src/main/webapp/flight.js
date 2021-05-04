// JavaScript source code

function getServerData(url, success) {
	$.ajax({
		dataType: "json",
		url: url
	}).done(success);
}

function callDone(result) {
	var templateExample = _.template($('#templateExample').html());

	var html = templateExample({
		"attribute": JSON.stringify(result)
	});

	$("#result").append(html);
}

$(function () {
	$("#button").click(function () {

		/*var name = window.prompt("Enter your name: ");
		alert("Your name is " + name);*/

		var nbpass = document.getElementById("nbpass").value;
		console.log(nbpass);
		getServerData("ws/user/" + email + "/" + password, callDone);

	});
});
