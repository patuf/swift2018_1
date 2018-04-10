$(document).ready(function(){
  $(".changeble").hide();
  $("#welcome").show();
    $(document).on("click", "li", function()
    {
      var divs = document.getElementsByTagName("div");
      var val = $(this).attr("value");
      console.log(val);
      $(".changeble").hide();
      $("#"+val).show();
    });
})
