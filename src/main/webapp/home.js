
function getServerData(url, success){
    $.ajax({
        dataType: "json",
        url: url
    }).done(success);
}

function putServerData(url, success, data){
	$.ajax({
	  method: "PUT",
	  dataType: "json",
	  url: url,
	  data: data
	})
	  .done(success);
}

function callDone(result){
	var templateExample = _.template($('#templateExample').html());

	var html = templateExample({
		"attribute":JSON.stringify(result)
	});

	$("#result").append(html);
}

$(function(){
	$("#button").click(function(){
		getServerData("ws/flight/search/{param}",callDone);
	});
});