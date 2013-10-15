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
    var bg,bgGBG;
    var PATHY=100;
    var DY=40;

    var px=0;
    var py=0;
    var vx=2;
    var vy=0.5;
    var arrPosXY=[];
    var arrImages=[];
    var arrLogoGDG=[];
    var arrLogoGBG=[];
    var count=0;
    var total=12;
    var totalR=18;
    var totalC=10;
    //var first=false;

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
        var cImg=0;
        bg=new Image();
        bgGBG=new Image();
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
        arrImages=new Array();
        //transparencia
        bg.onload=function()
        {
            var s=0.5;
            ctx.save();
            ctx.scale(s,s);
            ctx.globalAlpha = 0.2;
            ctx.drawImage(bg,5/s,100/s);
            ctx.restore();
        }

        bgGBG.onload=function()
        {
            var s=0.1;
            ctx.save();
            ctx.scale(s,s);
            ctx.globalAlpha = 0.2;
            ctx.drawImage(bgGBG,5/s,400/s);
            ctx.restore();
        }
    	imgChrome.onload=function()
    	{
    		ctx.drawImage(imgChrome,0,0);
            arrImages.push(imgChrome);
            console.log("arr "+arrImages.length);
            next();
    	}
    	imgAndroid.onload=function()
    	{
    		//ctx.drawImage(imgAndroid,100,PATHY);
            arrImages.push(imgAndroid);
            next();
    	}
    	imgGdrive.onload=function()
    	{
    		//ctx.drawImage(imgGdrive,150,PATHY);
            arrImages.push(imgGdrive);
            next();
    	}
    	imgGame.onload=function()
    	{
    		//ctx.drawImage(imgGame,200,PATHY);
            arrImages.push(imgGame);
            next();
    	}
    	imgPlay.onload=function()
    	{
    		//ctx.drawImage(imgPlay,250,PATHY);
            arrImages.push(imgPlay);
            next();
    	}
    	imgYoutube.onload=function()
    	{
    		//ctx.drawImage(imgYoutube,50,PATHY+DY);
    	   arrImages.push(imgYoutube);
           next();
        }
        imgDart.onload=function()
        {
           // ctx.drawImage(imgDart,100,PATHY+DY);
            arrImages.push(imgDart);
            next();
        }
        imgPlus.onload=function()
        {
           // ctx.drawImage(imgPlus,150,PATHY+DY);
            arrImages.push(imgPlus);
            next();
        }
        imgGmail.onload=function()
        {
          //  ctx.drawImage(imgGmail,200,PATHY+DY);
            arrImages.push(imgGmail);
            next();
        }
        imgSound.onload=function()
        {
            //ctx.drawImage(imgSound,250,PATHY+DY);
            arrImages.push(imgSound);
            next();
        }
        imgEarth.onload=function()
        {
            //ctx.drawImage(imgEarth,50,PATHY+2*DY);
            arrImages.push(imgEarth);
            next();
        }
        imgGoogle.onload=function()
        {
            //ctx.drawImage(imgGoogle,100,PATHY+2*DY);
            arrImages.push(imgGoogle);
            next();
        }

        bg.src="img/logo_gdg_devfest.png";
        bgGBG.src="img/logo_gbg_devfest.png";
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
    function next()
    {
       // console.log("next "+count);
        count++;
        if(count>=total)
        {
            createLogoGDGLima();
            createLogoGBGLima();
        }
    }
    function createLogoGBGLima()
    {
       arrLogoGBG=new Array(); 
       var nX=0;
       var nY=0;
       var img;
       var r=65;
       for (var k = 0; k < 4; k++) 
       {
            for (var i = 0; i < 2*Math.PI ; i+=(15*Math.PI/180))
           {
                nX=800+r*Math.cos(i);
                nY=200+r*Math.sin(i);
                arrLogoGBG[i]={x:nX,y:nY,data:getImage()};
                ctx.drawImage(arrLogoGBG[i].data,nX,nY);
           };
           r+=20;
       };


    }
    function createLogoGDGLima()
    {
        console.log("createLogoGDGLima");
        arrLogoGDG=[];
        for (var k = 0; k < totalR; k++) 
        {
            arrLogoGDG[k]={};
            for (var j = 0; j < totalC; j++) 
            {
                arrLogoGDG[k][j]=getImage();
                arrLogoGDG[k][j].scale=Utils.randomByRange(0.5,1.1);
              //  console.log("img "+k+" "+j+" "+arrLogoGDG[k][j]);
            };
        };
        renderLogo();
    } 
 	
    function renderLogo()
    {
        var aux;
        var nX=0;
        var nY=0;
        var pX=220;
        var scale=1;
        for (var i = 0; i < totalR; i++) 
        {
            for (var j = 0; j < totalC; j++) 
            {
                aux=arrLogoGDG[i][j];
                scale=aux.scale;
                ctx.save();
                ctx.scale(scale,scale);
                ctx.drawImage(arrLogoGDG[i][j],(pX+nX)/scale,(100+nY)/scale);
                ctx.restore();
                console.log(">>> "+scale);
                nX+=18;
            };
            if(i<(totalR/2-1))
            {
              pX+=17;  
            }else
            {
              pX-=17; 
            }
            nX=0;
            nY+=31;
        };
    }

    function getImage()
    {
        var pos=Math.floor(Utils.randomByRange(0,(arrImages.length-1)));
        console.log("getImage pos "+pos);
        return arrImages[pos];
    }
 	/*function redraw()
    {
    	var date=new Date();
        var tm=date.getTime();

        ctx.save();
        ctx.globalAlpha = 0.2;
        ctx.drawImage(bg,300,100);
        ctx.restore();
        //px=arrPosXY[0][0][0]+Math.cos(tm*0.003)*2;
        //py=arrPosXY[0][0][1]+Math.cos(tm*0.002)*2;
        var countX=0;
        var countY=0;
        var countImgX=0;
        var countImgY=0;
        var total =12;
        //var rd=0;
        for (var i = 0; i < total; i++) 
        {
        	for (var j = 0; j < arrImages.length; j++) 
        	{
	        	px=100+countX+countImgX+Math.cos(tm*0.003)*2;
	        	py=50+countImgY+Math.cos(tm*0.002)*2;
                //if(!first)
                {
                    rd=Math.floor(imgRandom());
                    ctx.drawImage(arrImages[rd],px,py);  
                }else
                {

                }
                ctx.drawImage(arrImages[j],px,py); 

	        	countImgX+=arrImages[j].width+5;
        	};
        	if(i<total/2)
        	{
        		countX+=10;
        	}else
        	{
        		countX-=10;
        	}

        	countImgX=0;
        	countImgY+=40;

        };*/
        /*for (var i = 0; i < arrImages.length; i++) {
        	px=arrPosXY[0][i][0]+Math.cos(tm*0.003)*2;
        	py=arrPosXY[0][i][1]+Math.cos(tm*0.002)*2;
        	ctx.drawImage(arrImages[i],px,py);
        };*/

        /*for (var i = 0; i < arrImages.length; i++) {
        	px=arrPosXY[1][i][0]+Math.cos(tm*0.003)*2;
        	py=arrPosXY[1][i][1]+Math.cos(tm*0.002)*2;
        	ctx.drawImage(arrImages[i],px,py);
        };

        for (var i = 0; i < arrImages.length; i++) {
        	px=arrPosXY[2][i][0]+Math.cos(tm*0.003)*2;
        	py=arrPosXY[2][i][1]+Math.cos(tm*0.002)*2;
        	ctx.drawImage(arrImages[i],px,py);
        };
        for (var i = 0; i < arrImages.length; i++) {
        	px=arrPosXY[3][i][0]+Math.cos(tm*0.003)*2;
        	py=arrPosXY[3][i][1]+Math.cos(tm*0.002)*2;
        	ctx.drawImage(arrImages[i],px,py);
        };*/

        /*ctx.drawImage(imgChrome,px,py);//50+px,PATHY);
        ctx.drawImage(imgAndroid,arrPosXY[0][1][0],arrPosXY[0][1][1]);//imgAndroid,100+px,PATHY);
        ctx.drawImage(imgGdrive,arrPosXY[0][2][0],arrPosXY[0][2][1]);//,150+px,PATHY);
        ctx.drawImage(imgGame,200+px,PATHY);
        ctx.drawImage(imgPlay,250+px,PATHY);
        ctx.drawImage(imgYoutube,50+px,PATHY+DY);
        ctx.drawImage(imgDart,100+px,PATHY+DY);
        ctx.drawImage(imgPlus,150+px,PATHY+DY);
        ctx.drawImage(imgGmail,200+px,PATHY+DY);
        ctx.drawImage(imgSound,250+px,PATHY+DY);
        ctx.drawImage(imgEarth,50+px,PATHY+2*DY);
        ctx.drawImage(imgGoogle,100+px,PATHY+2*DY);*/
        //px+=vx;
   // }
    function paint()
    {
        requestAnimationFrame(paint);
        ctx.clearRect(0,0,ctx.width,ctx.height);
       // redraw();

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
		loadImages();
       // paint();

	}

    //-------------------
    function imgRandom()
    {
        var i=Utils.randomByRange(0,(arrImages.length-1));
        console.log("i "+i);
        return i;
    }

})();
/*
        arrPosXY=[];
        arrPosXY[0]= [[300,100],[340,100],[380,100],[410,100],
        [450,100],[490,100],[500,100],[510,100],[520,100],
        [530,100],[540,100]];

        arrPosXY[1]= [[300,150],[340,150],[380,150],[410,150],
        [450,150],[490,150],[500,150],[510,150],[520,150],
        [530,150],[540,150]];

        arrPosXY[2]= [[310,200],[350,200],[390,200],[420,200],
        [460,200],[500,200],[510,200],[520,200],[530,200],
        [540,200],[550,200]];

        arrPosXY[3]= [[310,250],[350,250],[390,250],[420,250],
        [460,250],[500,250],[510,250],[520,250],[530,250],
        [540,250],[550,250]];

        arrPosXY[4]= [[320,300],[360,300],[400,300],[430,300],
        [470,300],[510,300],[520,300],[530,300],[540,300],
        [550,300],[560,300]];

        arrPosXY[5]= [[320,350],[360,350],[400,350],[430,350],
        [470,350],[510,350],[520,350],[530,350],[540,350],
        [550,350],[560,350]];
*/