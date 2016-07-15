<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>通信协议列表</title>
<script type="text/javascript" src="jquery-easyui-1.4.5/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.5/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="jquery-easyui-1.4.5/themes/default/easyui.css" type="text/css"/>
<link rel="stylesheet" href="jquery-easyui-1.4.5/themes/icon.css" type="text/css"/>
<script type="text/javascript">
	$(function(){
	    $('#easyUILayoutBody').layout(); 
	    $('#tt').tabs({tabPosition:"left"});
	    $('#test').click(function(){
	    	
	    });
	    
	});
</script>
</head>
<body id="easyUILayoutBody"> 
	<!--<div region="north" style="width:100px" title="查询" split="true"></div>
    <div region="west" style="width:100px" title="类别" split="true"></div>
    <div region="center" title="命令列表"></div>   -->
     <div data-options="region:'north',title:'查询'" style="height:100px"></div>
	 <div data-options="region:'west',title:'类别'" style="width:200px !important;">
		<div id="tt" class="easyui-tabs" data-options="fit:true,border:true">
			<div data-options="title:'测试',iconCls:'icon-base'" style="padding:10px;"></div>
			<div id="test" data-options="title:'通用',iconCls:'icon-base'" style="padding:10px;"></div>
			<div data-options="title:'普通',iconCls:'icon-base'" style="padding:10px;"></div>
		</div>
	</div>
	<div data-options="region:'center',title:'命令列表'"></div>
</body>  
</html>