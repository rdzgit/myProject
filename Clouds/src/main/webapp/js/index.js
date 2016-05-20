$(function(){
	$.post("cloudTag_getAllTag",function(data){
		var tags=$("#tags");
		tags.html("");
		var tag='<tr><td><a href="#" onclick="add();" style="font-weight: bold;">添加书签</a></td></tr>'+
		'<tr><td><a href="javascript:getFav(\'fav_getAllFav.action\')">全部</a></td></tr>'+
		'<tr><td><a href="javascript:getFav(\'fav_findFavByTagNull.action\')">未分类</a></td></tr>';
		$.each(data,function(index,item){
			tag+='<tr><td>'+
			'<a href="javascript:getFav(\'fav_findFavByTag.action\',\''+item.tname+'\')">'+item.tname+
			'</a></td></tr>';
		});
		tags.append($(tag));
		getFav('fav_getAllFav.action');
	},"json");
	
})

function getFav(url,tags){
	$.post(url,{tags:tags},function(data){
	
		var obj=$("#myfav");
		var opt;
		obj.html(""); //将原来的内容置空

		$.each(data,function(index,item){
			opt='<div style="padding: 6px 10px;">'+
			'<div>'+
			'<a href="http://www.apache.org/struts/" style="color: blue; font-size: 18px;" target="_blank" >'+item.flabel+'</a></div>'+
			'<div style="color: black; font-size: 16px;">'+item.fdesc+'</div>'+
			'<div style="color: green; font-size: 14px;">'+item.furl+'</div></div>';
			obj.append($(opt));
		});

	},"json");
}