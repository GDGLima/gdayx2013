/*
    Utilitarios
 */
function Utils()
{

}
Utils.toRad=function(_angle)
{
	return _angle*Math.PI/180;
}
Utils.randomByRange=function (_min, _max)
{
    return _min+ Math.random()*(_max-_min);
}

Utils.createTimer=function(_id,_function,_time)
{
    return  setInterval(_function,_time);
}

Utils.shuffleArray=function(array) 
{
    for (var i = array.length - 1; i > 0; i--) 
    {
        var j = Math.floor(Math.random() * (i + 1));
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    return array;
}