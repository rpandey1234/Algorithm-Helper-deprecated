$(document).ready(function(){
	$('.collapse').click(function() {
	//alert($(this).text());
  		$(this).next().toggle('fast');
  		return false;
	}).next().hide();
});