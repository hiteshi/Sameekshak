<%@page import="com.cdac.sameekshak.entities.Question"%>
<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.cdac.sameekshak.entities.Student"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
	
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="/sameekshak/view/js/jquery-1.7.2.js"></script>
<link rel="stylesheet" href="/sameekshak/view/css/codemirror.css" />
<!-- basic -->
<script src="/sameekshak/view/js/codemirror.js"></script>
<!-- basic -->
<script src="/sameekshak/view/js/css.js"></script>
<!--  -->
<link rel="stylesheet" href="/sameekshak/view/css/night.css" />
<!-- theam color -->
<script src="/sameekshak/view/js/closetag.js"></script>
<!-- automatic closing tags -->
<script src="/sameekshak/view/js/clike.js"></script>
<!-- script for color for key words -->
<script src="/sameekshak/view/js/xml.js"></script>
<!--  -->
<link rel="stylesheet" href="/sameekshak/view/css/docs.css" />
<!-- page alignment  -->

<style type="text/css">
.editmenu12 {
	background: white;
	height: 37px;
	border: 3px solid blue;
 	left: 10px;
	top: 10px;
	margin-left: -99;
	margin-top: -230px;
}

.CodeMirror {
	border-top: 1px solid black;
	border-bottom: 1px solid black;
}

.CodeMirror-fullscreen { /*display: block;*/
	position: absolute;
	top: 5%;
	left: 0;
	width: 100%;
	height: 95%;
	z-index: 9999;
	margin: 0;
	padding: 0;
	border: 0px solid #BBBBBB;
	opacity: 1;
}

.pratikshak {
	visibility: hidden;
	background-color: silver;
	position: absolute;
	z-index: 100;
	height: 100%;
	width: 100%;
	opacity: 0.6;
}
</style>
<script type="text/javascript">
$(window).load(function() {
	//alert("sdf")
	$("#editmenu").hide();
});
$(document).ready(function(){
	var select;
    $("input[name='Sample']:radio").change(function() {
    	
    	select=$(this);
    	$("#input_to_code").val($(this).val());
    	
    });
    $("#save_user_case").click(function() {
    	
    	select.val($("#input_to_code").val());
    });
	$("#clear").click(function() {
    	
    	$("#input_to_code").val("");
    });
});
</script>
<script language="javascript" type="text/javascript">

// $('#submitButton').click(function(){
	
// 	alert(" submit called");
// }



</script>


<script language="javascript" type="text/javascript">
window.onload=clock();
var strTime;
function clock() {
	//alert("Question Page started.......");
	   var now = new Date();
	   strTime = now.getHours()+':'+now.getMinutes()+':'+now.getSeconds();
	   //document.getElementById('clockDiv').innerHTML=outStr;
	   //alert("Start Timming ......."+strTime);
	   Tick();	
	}
	var abc="10";
function Tick()
{
	
	//alert("Timming started......."+strTime);
	//abc=strTime;
	
	$.ajax({
		type: 'POST',
		url: '/sameekshak/testTimer',
		data: 'cmd='+strTime, 
		dataType: 'html', 
	}).done(function(msg) {
// 		alert("time left : "+msg);
		//document.getElementById("clockDiv").innerHTML = msg;
		if(msg=="TimeOut"){
// 			alert("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = "+msg);
			
			
<%-- 			<% RequestDispatcher rd = request.getRequestDispatcher("/studentLogout"); --%>
// 				rd.forward(request, response); %>
			
			$.ajax({
				type: 'POST',
				url: '/sameekshak/studentLogout',
				data: "cmd=FetchData"+'&filename=hello',
				dataType: 'html', 
			}).done(function(msg) {
				window.location.href = "http://localhost:8080/sameekshak/";	
			}); 
			
			
			
 			//document.getElementById("code").innerHTML = "<a href=\"view/jsp/student/testPage.jsp\">Code</a>";
		}
		else{
			//abc=msg;
// 			alert(msg);
			//$("#tim").val(msg);
			//document.getElementById("tim").innerHTML = "<lable id='tim'>TimeLeft :"+msg+"</lable>";
			$("#clockDiv").html(msg);
// 			document.getElementById("clockDiv").innerHTML = "TimeLeft : "+msg;
			//alert("Tick called()");
			setTimeout("Tick()", 1000);
			//alert("Tick called()");
		}
	});
	//alert("hiii");
	
}
function popitup(url) {
	newwindow=window.open(url,'name','height=500,width=500');
	if (window.focus) {newwindow.focus()}
	return false;
}

</script>
<link href="/sameekshak/view/css/afterLogin.css" rel="stylesheet"
	type="text/css" />
</head>

<body id="bd">

	<script type="text/javascript">

</script>



	<%
		Student student = (Student) session.getAttribute("student");
	%>
	<div id="pratikshak" class="pratikshak" align="center">
		<img id="pratikshakImage" height="200" width="200" align="middle"
			src="/sameekshak/view/images/ajax-loader.gif" alt="pratikshak" />
		<div style="background-color: white;">
			<table width="100%" border="0" align="center">
				<tr>
					<td>---</td>
					<td id="imageBlock0"></td>
					<td id="imageBlock1"></td>
					<td id="imageBlock2"></td>
					<td id="imageBlock3"></td>
					<td id="imageBlock4"></td>
					<td id="imageBlock5"></td>
					<td id="imageBlock6"></td>
					<td id="imageBlock7"></td>
					<td id="imageBlock8"></td>
					<td id="imageBlock9"></td>
					<td>---</td>
				</tr>
			</table>
		</div>
		<div>
			<input src="/sameekshak/view/images/back-button.jpg"
				style="width: 200px; height: 150px;" id="backButtonOfSubmit"
				type="image" value="Back" />
		</div>
	</div>
	<div id="outerDiv">
		<div class="after_login_content" id="after_login_content">
			<table width="100%" class="after_login_header_table" border="1">
				<caption>&nbsp;</caption>
				<tr>
					<td colspan="4" rowspan="3">&nbsp;&nbsp;&nbsp;&nbsp;<font
						color="#4B8DF8"> Full Screen : Press F6 ------ Your Class
							name = <%=session.getAttribute("className")%></font><br />
						<div id="editmenu" class="editmenu12">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/cut.png" id="bttnCut"
								name="bttnCut" height="35px" width="35px" title="Cut" />
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/copy.png" id="bttnCopy"
								name="bttnCopy" height="35px" width="35px" title="Copy" />
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/paste.png" id="bttnPaste"
								name="bttnPaste" height="35px" width="35px" title="Paste" />
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/undo.png" id="bttnUndo"
								name="bttnUndo" height="35px" width="35px" title="Undo" />
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/redo.png" id="bttnRedo"
								name="bttnRedo" height="35px" width="35px" title="Redo" />
							&nbsp;&nbsp;
							<font
						color="#4B8DF8"> Full Screen : Press F6 ------ Your Class
							name = <%=session.getAttribute("className")%></font>
						</div>
						<div id="menuedit">
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/cut.gif" id="btnCut" name="btnCut"
								height="100%" width="25px" title="Cut" /> &nbsp;&nbsp; <input
								type="image" src="/sameekshak/view/images/copy.gif" id="btnCopy"
								name="btnCopy" height="25px" width="25px" title="Copy" />
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/paste.gif" id="btnPaste"
								name="btnPaste" height="25px" width="25px" title="Paste" />
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/undo.gif" id="btnUndo"
								name="btnUndo" height="25px" width="25px" title="Undo" />
							&nbsp;&nbsp; <input type="image"
								src="/sameekshak/view/images/redo.gif" id="btnRedo"
								name="btnRedo" height="25px" width="25px" title="Redo" />
							&nbsp;&nbsp;
						</div>
						<div id="editor">
							<textarea id="code" name="code" rows="5"></textarea>
							<br /> <br />
							<!-- Please Enter the Java File Name : <input type="button" name="compile"
		id="compile" value="Save and Compile" /> -->

						</div></td>
					<td width="210" height="82"><a
						href="view/jsp/student/ques.jsp"
						onclick="return popitup('ques.jsp')">Question</a>
					</td>
				</tr>

				<tr>
					<td>
						<div id="clockDiv" align="center"
							style="font-size: xx-large; font-family: fantasy; color: red;">
							<!--<label id="tim" ></label>  <input type="text" name="tim" id="tim"  /> -->
						</div>
					</td>
				</tr>

				<tr>
					<td>
						<div height="82">
							<!-- id="clockDiv" -->
							<table width="160px" height="151" border="1">
								<tr>
									<td><img src="/sameekshak/studentImage" alt="User Image"
										name="coder_image" width="150px" height="160px" align="middle"
										id="coder_image" />
									</td>
								</tr>
								<tr>
									<td><div align="center"><%=student.getStudentId()%></div>
									</td>
								</tr>
							</table>
						</div></td>
				</tr>
				<tr>
					<td colspan="4"><table width="100%" border="1">
							<tr>
								<td><input type="radio" id="Sample1" name="Sample"
									checked="checked" value="enter your sample" />Sample-01</td>
								<td><input type="radio" id="Sample2" name="Sample"
									value="enter your sample" />Sample-02</td>
								<td><input type="radio" id="Sample3" name="Sample"
									value="enter your sample" />Sample-03</td>
								<td><input type="radio" id="Sample4" name="Sample"
									value="enter your sample" />Sample-04</td>
								<td><input type="radio" id="Sample5" name="Sample"
									value="enter your sample" />Sample-05</td>
								<td><input type="radio" id="Sample6" name="Sample"
									value="enter your sample" />Sample-06</td>
								<td><input type="radio" id="Sample7" name="Sample"
									value="enter your sample" />Sample-07</td>
								<td><input type="radio" id="Sample8" name="Sample"
									value="enter your sample" />Sample-08</td>
								<td><input type="radio" id="Sample9" name="Sample"
									value="enter your sample" />Sample-09</td>
								<td><input type="radio" id="Sample10" name="Sample"
									value="enter your sample" />Sample-10</td>
							</tr>
						</table>
					</td>
					<td height="82" align="center"><input id="submitButton"
						type="button" value="Submit" />
					</td>
				</tr>
				<tr>
					<td width="30" rowspan="2">&nbsp;</td>
					<td width="30" rowspan="2" bgcolor="#33CCFF"><div
							align="center">
							<p>
								<strong>Input </strong>
								<textarea name="input_to_code" cols="45" rows="15"
									id="input_to_code" style="resize: none"></textarea>
							</p>
						</div>
					</td>
					<td width="85" height="94"><p>
							<input id="compile_run" name="compile_run" type="button"
								value="RUN" />
						</p>
					</td>
					<td rowspan="2" bgcolor="#33CCFF"><p align="center">
							&nbsp; <strong>Output</strong>
							<div align="center">
								<p id="OutPut">
									<textarea name="output_of_code" cols="45" rows="15"
										readonly="readonly" id="output_of_code"
										style="width: 100%; height: 100%; resize: none"></textarea>
								</p>
							</div>
					</td>
					<td rowspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td width="85"><div align="center">
							<p>
								<input name="save_user_case" id="save_user_case" type="button"
									value="SAVE" />
							</p>
							<p>
								<input name="clear" id="clear" type="button" value="CLEAR" />
							</p>
						</div>
					</td>
				</tr>
			</table>
			<p>&nbsp;</p>
			<table width="100%" border="1">
				<tr>
					<td><div align="right">CDAC-LOGO</div>
					</td>
				</tr>
			</table>
			<p>&nbsp;</p>
		</div>

	</div>

	<script>
		var pos;
		var copy;
		var editor = CodeMirror
				.fromTextArea(
						document.getElementById("code"),
						{

							lineNumbers : true,
							theme : "night",
							matchBrackets : true,
							mode : "text/x-java",
							extraKeys : {

								"'{'" : function(cm) {

									cm.closeTag(cm, '{');

								},
								"'('" : function(cm) {

									cm.closeTag(cm, '(');

								},
								"'['" : function(cm) {

									cm.closeTag(cm, '[');

								},
								"'\"'" : function(cm) {

									cm.closeTag(cm, '\"');

								},
								'\'' : function(cm) {

									cm.closeTag(cm, '\'');

								},
								"F6" : function() {

									var scroller = editor.getScrollerElement();
									if (scroller.className
											.search(/\bCodeMirror-fullscreen\b/) === -1) {

										//alert("First F4 Presses.....");
										$('#editmenu').show();
										$('#menuedit').hide();
										scroller.className += " CodeMirror-fullscreen";
										scroller.style.height = "95%";
										scroller.style.width = "100%";
										editor.refresh();

									} else {

										//alert("Second F4 Pressed....");
										$('#editmenu').hide();
										$('#menuedit').show();
										scroller.className = scroller.className
												.replace(
														" CodeMirror-fullscreen",
														"");
										scroller.style.height = '';
										scroller.style.width = '';
										editor.refresh();
									}
								},
								"Esc" : function() {

									//alert("Esc Pressed....");
									var scroller = editor.getScrollerElement();
									if (scroller.className
											.search(/\bCodeMirror-fullscreen\b/) !== -1) {

										scroller.className = scroller.className
												.replace(
														" CodeMirror-fullscreen",
														"");
										$('#editmenu').hide();
										$('#menuedit').show();
										scroller.style.height = '';
										scroller.style.width = '';
										editor.refresh();
									}
								}
							},
							wordWrap : true
						});
									
						$('#bd').live("cut copy paste",function(e) {
				            e.preventDefault();
				        });
						$("#btnCopy").click(function() {
							alert("hi");
							if(editor.getSelection().length>0)
				 				copy=editor.getSelection();
							editor.focus();
			  			});
						$("#bttnCopy").click(function() {
							alert("hi");
							if(editor.getSelection().length>0)
								copy=editor.getSelection();
							editor.focus();
			  			});
						$("#btnCut").click(function() {
							
							if(editor.getSelection().length>0) {
				 				copy=editor.getSelection();
								editor.replaceSelection("");
							}
							editor.focus();
			  			});
						$("#bttnCut").click(function() {
							
							if(editor.getSelection().length>0) {
				 				copy=editor.getSelection();
								editor.replaceSelection("");
							}
							editor.focus();
			  			});
						$("#btnPaste").click(function(){
							
							if(copy.length>0){
					  			pos=editor.getCursor();
								var ln=pos.line;
						 		var cha=pos.ch;
						 		var line=editor.getLine(ln);
								//var fs=line.substring(0,cha);
								//var fs2=line.substring(cha+1,line.length);
								line=line.substring(0,cha)+copy+line.substring(cha+1,line.length);
								editor.setLine(ln,line);
							}
							editor.focus();
						});
						$("#bttnPaste").click(function(){
							
							if(copy.length>0){
						  		pos=editor.getCursor();
								var ln=pos.line;
						 		var cha=pos.ch;
						 		var line=editor.getLine(ln);
								line=line.substring(0,cha)+copy+line.substring(cha+1,line.length);
								editor.setLine(ln,line);
							}
							editor.focus();
						});
						$("#btnUndo").click(function(){
							
					  		editor.undo();
							editor.focus();
						});
						$("#btnRedo").click(function(){
							
					  		editor.redo();
							editor.focus();
						});
						$("#bttnUndo").click(function(){
							
					  		editor.undo();
							editor.focus();
						});
						$("#bttnRedo").click(function(){
							
					  		editor.redo();
							editor.focus();
						});
						$("#compile_run").click(function FetchData(){
							
							var code=editor.getValue();
							code=encodeURIComponent(code);
							//alert(abcd);
							//alert("code :\n"+code);
							var filename=$("#fileName").val();
							var inputtext=$("#input_to_code").val();
							 $("#compile_run").attr("disabled", "disabled");
							//alert("got code and file name :"+filename);
							/*  $.ajax({
								type: "POST",
							    url: "/sameekshak/compile",
							    dataType: 'json',
							    async: false,
							    data: '{"code": "' + encodeURIComponent(code) + '", "filename" : "' + filename + '", "inputtext" : "' + inputtext + '"}',
							    contentType: "application/json; charset=utf-8"
							}).done(function(msg) {
								
								document.getElementById("outputtext").value = "";
								document.getElementById("output").innerHTML=msg;
								//alert("mesg \n"+msg);
							});  */
							
							$.ajax({
								type: 'POST',
								url: '/sameekshak/compileCode',
								data: "cmd=FetchData"+'&filename='+filename+'&code='+code+'&inputtext='+inputtext,
								dataType: 'html', 
							}).done(function(msg) {
								
								document.getElementById("OutPut").innerHTML=msg;
								//$("#output_of_code").val(msg);
								//$("textarea #output_of_code").val(msg);
								//alert($("#output_of_code").val())
								//alert(msg);
								$("#compile_run").removeAttr("disabled");
								
							}); 
							//alert("over");
						});				
						
						
// 						----------------------------------------------------------------------

		$("#submitButton").click(function FetchData(){
			
			
			
							alert(" submit called 123 ");
			
							$("#pratikshak").css("visibility","visible");
							$("#pratikshakImage").css("visibility","visible");
							
							var code=editor.getValue();
							code=encodeURIComponent(code);
							
							var filename=$("#fileName").val();
							var inputtext=$("#input_to_code").val();

							
							
							$.ajax({
								type: 'POST',
								url: '/sameekshak/submitCode',
								data: "cmd=FetchData"+'&filename='+filename+'&code='+code,
								dataType: 'html', 
							}).done(function(msg) {
								
								$("#pratikshakImage").css("visibility","hidden");
// 								alert(" received message = "+msg);
// 								document.getElementById("OutPut").innerHTML=msg;

								var submitResult = msg;
								
								var counter=0;
								
								for (var i =0;i<msg.length;i++){
									
									if (msg.charAt(i) == '1'){
										
// 										alert(" 1 aya");
										counter++;
										$("#imageBlock"+i).html("<img height='70' width='70' src='/sameekshak/view/images/final-y.gif' alt='correct' />").slideUp(300).delay(800).fadeIn(400);
									}
									if (msg.charAt(i) == '0'){
											
// 										alert(" 0 ");
										$("#imageBlock"+i).html("<img height='70' width='70' src='/sameekshak/view/images/x.png' alt='wrong' />");
									}
									
								}
								
								alert(counter);
								
								if (counter == (msg.length)){
									
									$.ajax({
										type: 'POST',
										url: '/sameekshak/studentLogout',
										data: "cmd=FetchData"+'&filename=hello',
										dataType: 'html', 
									}).done(function(msg) {
											
										$("#backButtonOfSubmit").css("visibility","hidden");
										
									});
									
								}
								
								
// 								$("#compile_run").removeAttr("disabled");
								
							}); 
							
						});		
						
						
				

		$("#backButtonOfSubmit").click(function removeDivOfSubmit(){

			$("#pratikshak").css("visibility","hidden");
			$("#imageBlock0").html("-");
			$("#imageBlock1").html("-");
			$("#imageBlock2").html("-");
			$("#imageBlock3").html("-");
			$("#imageBlock4").html("-");
			$("#imageBlock5").html("-");
			$("#imageBlock6").html("-");
			$("#imageBlock7").html("-");
			$("#imageBlock8").html("-");
			$("#imageBlock9").html("-");
			
			
		});










// ----------------------------------------------------------------------------------------------------
						
						
						
						
						
						
						
						
						
						
						
	</script>


</body>
</html>