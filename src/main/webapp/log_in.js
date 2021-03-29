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
	$("#form").click(function () {
		getServerData("ws/user/{id}", callDone);
	});
});