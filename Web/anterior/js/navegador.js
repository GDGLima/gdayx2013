$(function(){

	var idpas = 'none';

	if(idpas=='none'){
	navigater('log');
	}
		
	$('#nav li a').bind('click',function(e){
		var id = $(this).attr('id');
		navigater(id);
		return false;			
	});

	function navigater(id){
		if(id!=idpas){
			$('#'+idpas+'-izquierda').animate({top:'100%'});
			$('#'+idpas+'-derecha').animate({top:'-100%'});
			$('#'+id+'-izquierda').animate({top:'45px'});
			$('#'+id+'-derecha').animate({top:'45px'});
			$('#'+idpas+'-izquierda').animate({top:'-100%'},0);
			$('#'+idpas+'-derecha').animate({top:'100%'},0);


			
				if(id=='age'){
					$('#'+id+'-mid').animate({height:'95%', top: '9%', opacity:'1'});
				}else if(idpas=='age'){
					$('#'+idpas+'-mid').animate({height:'0%', top: '45%', opacity:'0'});
				}
			idpas=id;
		}
	}
});
