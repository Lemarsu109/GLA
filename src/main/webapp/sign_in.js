// JavaScript source code



function putServerData(url, success) {
	$.ajax({
		method: "PUT",
		dataType: "json",
		url: url,
		data: data
	})
		.done(success);
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
		getServerData("ws/user", callDone );
	});
});

