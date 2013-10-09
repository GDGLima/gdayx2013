/*
@author Eduardo Medina 
*/

(function() 
{

	window.requestAnimFrame = (function()
	{
		return window.requestAnimationFrame ||
		window.webkitRequestAnimationFrame ||
		window.mozRequestAnimationFrame ||
		window.oRequestAnimationFrame ||
		window.msRequestAnimationFrame ||
		function (callback) 
		{
			window.setTimeout(callback, 1000 / 60);
		};
	})();

	document.addEventListener('DOMContentLoaded', init);
 
 	function createLogoGDGLima()
 	{
 		
 	}
 	
	function init() 
	{
		console.log("init test");
		createLogoGDGLima();
	}

})();