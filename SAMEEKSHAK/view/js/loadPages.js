	function loadEditProfileAdminPage() {
		
//		alert(" in schedule new page");
/*		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			//alert("after reschedule panel load load");
		});*/
		$('#changingPanel').load("/sameekshak/view/jsp/admin/profile/EditAdmin.jsp");
		
//		alert("-------------1-");
	}
	
	function loadEditStudentProfilePage() {
		
//		alert(" in schedule new page");
/*		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			//alert("after reschedule panel load load");
		});*/
		$('#changingPanel').load("/sameekshak/view/jsp/admin/profile/EditStudent.jsp");
		
//		alert("-------------1-");
	}	
	function loadCreateStudentPage() {
		
//		alert(" in schedule new page");
/*		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			//alert("after reschedule panel load load");
		});*/
		$('#changingPanel').load("/sameekshak/view/jsp/admin/profile/CreateStudent.jsp");
		
//		alert("-------------1-");
	}

	function loadCreateAdminPage() {
		
//		alert(" in schedule new page");
/*		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			//alert("after reschedule panel load load");
		});*/
		$('#changingPanel').load("/sameekshak/view/jsp/admin/profile/CreateAdmin.jsp");
		
//		alert("-------------1-");
	}	


	function loadViewAdminProfilePage() {
		
		alert(" in view admin profile page");
/*		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			//alert("after reschedule panel load load");
		});*/
		$('#changingPanel').load("/sameekshak/view/jsp/admin/profile/ViewAdmin.jsp");
		
//		alert("-------------1-");
	}
	
	function loadViewStudentProfilePage() {
		
//		alert(" in schedule new page");
/*		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			//alert("after reschedule panel load load");
		});*/
		$('#changingPanel').load("/sameekshak/view/jsp/admin/profile/ViewStudent.jsp");
		
//		alert("-------------1-");
	}	
	function loadReschedulePage() {
		
//		alert(" in schedule new page");
		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			$('#changingPanel').load("/sameekshak/view/jsp/admin/scheduleTest.jsp");
			//alert("after reschedule panel load load");
		});
		
//		alert("-------------1-");
	}		
	
	
	
	function loadReschedulePage() {
		
//		alert(" in schedule new page");
		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			$('#changingPanel').load("/sameekshak/view/jsp/admin/scheduleTest.jsp");
			//alert("after reschedule panel load load");
		});
		
//		alert("-------------1-");
	}	
	
	function loadReschedulePage() {
		
//		alert(" in schedule new page");
		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			$('#changingPanel').load("/sameekshak/view/jsp/admin/scheduleTest.jsp");
			//alert("after reschedule panel load load");
		});
		
//		alert("-------------1-");
	}	
	
	function loadScheduleNewPage() {
		
//		alert(" in schedule new page");
		$.ajax({
			type: 'POST',
			url: 'populateTestDetails',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			$('#changingPanel').load("/sameekshak/view/jsp/admin/scheduleTest.jsp");
			//alert("after reschedule panel load load");
		});
		
//		alert("-------------1-");
	}
	
	
function loadScheduleNewPage() {
	
//	alert(" in schedule new page");
	$.ajax({
		type: 'POST',
		url: 'populateTestDetails',
		data: 'cmd=fetchData', 
		dataType: 'html', 
	}).done(function(msg) { 

		$('#changingPanel').load("/sameekshak/view/jsp/admin/scheduleTest.jsp");
		//alert("after reschedule panel load load");
	});
	
//	alert("-------------1-");
}

////////////////// Student profile ////////////////
function getProfile(User){
	
	alert("kuch aaya   "+User);
	var msg1=User;
	if(User=='Student'){
		alert("admin me.....   "+User);
		/*$.ajax({
			type: 'POST',
			url: 'studentProfile',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 

			$("#result").html(msg);
		}); */
		
	}
	else{
		alert("admin me.....   "+User);
	
		$.ajax({
			type: 'POST',
			url: 'adminProfile',
			data: 'cmd=fetchData', 
			dataType: 'html', 
		}).done(function(msg) { 
			alert(""+msg);
			msg1='dddddddddddddddd';
			//$("#result").html(msg1);
			//alert("after reschedule panel load load");
		}); 
	}
	$("#result").html(msg1);
	alert("kisse result aaya "+ msg1);
}


function loadReschedulePage() {
	
	//alert(" in load Reschedule  page");
	//var accountNo = '555';
	
	$.ajax({
		type: 'POST',
		url: 'populateTestDetails',
		data: 'cmd=fetchData', 
		dataType: 'html', 
	}).done(function(msg) { 

		$('#changingPanel').load("/sameekshak/view/jsp/admin/reschedule.jsp");
		//alert("after reschedule panel load load");
	}); 
	
}
function loadUploadQuestionsPage() {
	
//	alert(" in load upload question page");
	$.ajax({
		type: 'POST',
		url: 'populateTestDetails',
		data: 'cmd=fetchData', 
		dataType: 'html', 
	}).done(function(msg) { 

		$('#changingPanel').load("/sameekshak/view/jsp/admin/UploadQuestion.jsp");
		//alert("after reschedule panel load load");
	}); 
}

function loadStartTestPage() {
	
//	alert(" in load start test page");
	$.ajax({
		type: 'POST',
		url: 'getTestDetails',
		data: 'cmd=fetchData', 
		dataType: 'html', 
	}).done(function(msg) { 

		$('#changingPanel').load("/sameekshak/view/jsp/admin/startTest.jsp");
		//alert("after reschedule panel load load");
	}); 
	
}

function loadOngoingTestPage() {
	
	$.ajax({
		type: 'POST',
		url: 'populateTestDetails',
		data: 'cmd=fetchData', 
		dataType: 'html', 
	}).done(function(msg) { 
		alert("after load ongoing panel load ");
		$('#changingPanel').load("/sameekshak/view/jsp/admin/OngoinTest.jsp");
		
	}); 
	
}

function loadEligibleStudentPage() {
	
	//alert(" in load loadEligibleStudentPage");
	$.ajax({
		type: 'POST',
		url: 'populateTestDetails',
		data: 'cmd=fetchData', 
		dataType: 'html', 
	}).done(function(msg) { 

		$('#changingPanel').load("/sameekshak/view/jsp/admin/EligibleStudent.jsp");
		//alert("after loadEligibleStudentPage panel load ");
	}); 
	
}

function radiosel(testId) {
	
//	alert("hello from radiodel() testId  = "+testId);
//	alert("now in populateTestDetailsInRescheduleBar");
	$.ajax({
		type: 'POST',
		url: 'populateTestDetailsInRescheduleBar',
		data: 'cmd=addFriend'+'&val=' + testId, 
		dataType: 'html', 
	}).done(function(msg) { 

		$("#testDetailsBar").html(msg);
//		alert("after reschedule panel load load");
	}); 
	
	
}
function clickRadioselStartTest(testId) {
	
//	alert("hello from radiodel() testId  = "+testId);
	$.ajax({
		type: 'POST',
		url: 'startTestDetails',
		data: 'cmd=addFriend'+'&val=' + testId, 
		dataType: 'html', 
	}).done(function(msg) { 

		$("#testDetailsBar").html(msg);
//		alert("after reschedule panel load load");
	}); 
	
	
}


function setRoleAdmin(){
	
	$("#testAdmincb").va
	$("#facultyAdmincb")
	$("#courseAdmincb")
	
	
	
}

function loadCancelTestPage() {
	
//	alert("hello from radiodel() testId  = "+testId);
	$.ajax({
		type: 'POST',
		url: 'getTestDetails',
		data: 'cmd=fetchData', 
		dataType: 'html', 
	}).done(function(msg) { 


		$('#changingPanel').load("/sameekshak/view/jsp/admin/cancelTest.jsp");
		//alert("after reschedule panel load load");
	}); 
	
	
}
