$(document).ready(function(){
    $("#newItemButton").click(function(){
        var name = $("name").name();
        var volume = $("volume").name();
        var weight = $("weight").name();
        var price = $("price").name();
        $.post("ReqestHandler.jsp", {type : "newItem",name :name, volume : volume, weight: weight, price : price},function(data) {
            $("#console").html(data)
        });
    });
});



    // $(document).ready(function(){
    //     $("#newItemButton").click(function(){
    //         var console = $("#name").val();
    //         $.post("RequestHandler.jsp", {Console : console}, function(data) {
    //             $("#console").html(data)
    //         });
    //     });
    // });


