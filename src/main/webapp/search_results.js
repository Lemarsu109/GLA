// JavaScript source code
function getServerData(url, success) {
	$.ajax({
		dataType: "json",
		url: url
	}).done(success);
}

function callDone(result) {
	var montitre = document.createElement("text");

	if (result.length == 0) {
		var montexte = document.createTextNode("No result found");
		montitre.appendChild(montexte);
	}
	else {
		for (let i = 0; i < result.length; i++) {
			console.log(result[i]);


			var montexte = document.createTextNode(JSON.stringify(result[i], null, 4));
			montitre.appendChild(montexte);
		}
	}

	var passagesortie = document.getElementById("res");
	passagesortie.appendChild(montitre);

}

$(window).load(function () {

	// Récupération de l'ID
	const queryString = window.location.search;

	getServerData("ws/flight/search"+queryString, callDone);

	

});