/*
@author Eduardo Medina 
*/

(function() 
{

	var canvas;
	var ctx;
	var imgChrome;
	var imgAndroid;
	var imgGdrive;
	var imgGame;
	var imgPlay;
	var imgYoutube,imgDart,imgPlus,imgGmail, imgGoogle,
        imgSound,imgEarth;
    var bg;
    var PATHY=100;
    var DY=40;

    var px=0;
    var py=0;
    var vx=2;
    var vy=0.5;

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
 
    function loadImages()
    {
        bg=new Image();
    	imgChrome=new Image();
    	imgAndroid=new Image();
    	imgGdrive=new Image();
    	imgGame=new Image();
    	imgPlay=new Image();
        imgYoutube=new Image();
        imgDart=new Image();
        imgPlus=new Image();
    	imgGmail=new Image();
        imgSound=new Image();
        imgEarth=new Image();
        imgGoogle=new Image();

        //transparencia
        bg.onload=function()
        {
            ctx.save();
            ctx.globalAlpha = 0.2;
            ctx.drawImage(bg,300,100);
            ctx.restore();
        }
    	imgChrome.onload=function()
    	{
    		ctx.drawImage(imgChrome,50,PATHY);
    	}
    	imgAndroid.onload=function()
    	{
    		ctx.drawImage(imgAndroid,100,PATHY);
    	}
    	imgGdrive.onload=function()
    	{
    		ctx.drawImage(imgGdrive,150,PATHY);
    	}
    	imgGame.onload=function()
    	{
    		ctx.drawImage(imgGame,200,PATHY);
    	}
    	imgPlay.onload=function()
    	{
    		ctx.drawImage(imgPlay,250,PATHY);
    	}
    	imgYoutube.onload=function()
    	{
    		ctx.drawImage(imgYoutube,50,PATHY+DY);
    	}
        imgDart.onload=function()
        {
            ctx.drawImage(imgDart,100,PATHY+DY);
        }
        imgPlus.onload=function()
        {
            ctx.drawImage(imgPlus,150,PATHY+DY);
        }
        imgGmail.onload=function()
        {
            ctx.drawImage(imgGmail,200,PATHY+DY);
        }
        imgSound.onload=function()
        {
            ctx.drawImage(imgSound,250,PATHY+DY);
        }
        imgEarth.onload=function()
        {
            ctx.drawImage(imgEarth,50,PATHY+2*DY);
        }
        imgGoogle.onload=function()
        {
            ctx.drawImage(imgGoogle,100,PATHY+2*DY);
        }

        bg.src="img/logo_gdg_devfest.png";
    	imgChrome.src="img/chrome.png";
    	imgAndroid.src="img/android.png";
    	imgGdrive.src="img/gdrive.png";
    	imgGame.src="img/game.png";
    	imgPlay.src="img/gplay.png";
        imgDart.src="img/dark.png";
    	imgPlus.src="img/googleplus.png";
        imgGmail.src="img/gmail.png";
        imgYoutube.src="img/youtube.png";
        imgGoogle.src="img/google.png";
        imgSound.src="img/gsound.png";
        imgEarth.src="img/gearth.png";
    }
 	function createLogoGDGLima()
 	{
 		loadImages();
 	}
 	function redraw()
    {
        ctx.save();
        ctx.globalAlpha = 0.2;
        ctx.drawImage(bg,300,100);
        ctx.restore();

        ctx.drawImage(imgChrome,50+px,PATHY);
        ctx.drawImage(imgAndroid,100+px,PATHY);
        ctx.drawImage(imgGdrive,150+px,PATHY);
        ctx.drawImage(imgGame,200+px,PATHY);
        ctx.drawImage(imgPlay,250+px,PATHY);
        ctx.drawImage(imgYoutube,50+px,PATHY+DY);
        ctx.drawImage(imgDart,100+px,PATHY+DY);
        ctx.drawImage(imgPlus,150+px,PATHY+DY);
        ctx.drawImage(imgGmail,200+px,PATHY+DY);
        ctx.drawImage(imgSound,250+px,PATHY+DY);
        ctx.drawImage(imgEarth,50+px,PATHY+2*DY);
        ctx.drawImage(imgGoogle,100+px,PATHY+2*DY);
        px+=vx;
    }
    function paint()
    {
        requestAnimationFrame(paint);
        ctx.clearRect(0,0,ctx.width,ctx.height);
        redraw();

    }
    function initStats()
    {
        var stats = new Stats();
        // Align top-left
        stats.domElement.style.position = 'absolute';
        stats.domElement.style.left = '10px';
        stats.domElement.style.top = '10px';
        
        document.body.appendChild( stats.domElement );
        
        setInterval( function () {
            stats.update(); 
        }, 1000 / 60 ); 
    }
	function init() 
	{

		console.log("init test");

        /*if (!canvasSupport()) {
            return;
        }*/
		console.log("init "+document.body.clientWidth+
            " "+document.body.clientHeight);
		canvas = document.getElementById("canvas");
		ctx = canvas.getContext("2d");

		ctx.width=document.body.clientWidth;
		ctx.height=document.body.clientHeight;
        
        initStats();

		createLogoGDGLima();
        paint();

	}

})();