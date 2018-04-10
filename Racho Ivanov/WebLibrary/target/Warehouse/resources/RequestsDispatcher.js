$(document).ready(function(){
    $("#newItemButton").click(function(){
        var name = $("#newitemform input[name=name]").val();
        var volume = $("#newitemform input[name=volume]").val();
        var weight = $("#newitemform input[name=weight]").val();
        var price = $("#newitemform input[name=price]").val();
        $.post("RequestHandler.jsp", {type : "newItem",name :name, volume : volume, weight : weight, price:price},function(data) {
            $("#console").html(data)
        });
        clear_form_elements("#newitemform");
    });

    $("#newLotButton").click(function(){
        var name = $("#newitemlot input[name=name]").val();
        var volume = $("#newitemlot input[name=volume]").val();
        var weight = $("#newitemlot input[name=weight]").val();
        $.post("RequestHandler.jsp", {type : "newLot",name :name, volume : volume, weight : weight},function(data) {
            $("#console").html(data)
        });
        clear_form_elements("#newitemform");
    });

    $("#refreshStockButton").click(function refreshStock(){
        $.post("RequestHandler.jsp", {type : "refreshStock"},function(data) {
            $("#console").html(data)
        });
    });

    $("#refreshTransactionHistoryButton").click(function refreshTransactionHistory(){
        $.post("RequestHandler.jsp", {type : "refreshTransactionHistory"},function(data) {
            $("#console").html(data)
        });
    });

    $("#importButton").click(function (){
        $.post("RequestHandler.jsp", {type : "import"},function(data) {
            $("#console").html(data)
        });
    });

    $("#exportButton").click(function (){
        $.post("RequestHandler.jsp", {type : "export"},function(data) {
            $("#console").html(data)
        });
    });

    $("#removeLotButton").click(function (){
        $.post("RequestHandler.jsp", {type : "removeLot"},function(data) {
            $("#console").html(data)
        });
    });

    $("#getAvailableLotsButton").click(function getAvailableLots(){
        $.post("RequestHandler.jsp", {type : "getAvailableLots"},function(data) {
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

function clear_form_elements(ele) {

    $(ele).find(':input').each(function() {
        switch(this.type) {
            case 'password':
            case 'select-multiple':
            case 'select-one':
            case 'text':
            case 'textarea':
                $(this).val('');
                break;
            case 'checkbox':
            case 'radio':
                this.checked = false;
        }
    });

}
