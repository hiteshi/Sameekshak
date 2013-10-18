
function setTestLinksBasedOnRoles(roleValue) {


	if (roleValue == 1) {

//		only TestAdmin

//		alert("role 1 in test")	

		$('#option1').html("<a href=\"javascript:loadStartTestPage();\">Start Test</a>");
		$('#option2').html("<a href=\"javascript:loadOngoingTestPage();\">Ongoing Test</a>");
		$('#option3').html("-");
		$('#option4').html("-");
		$('#option5').html("-");
		$('#option6').html("-");



	} else if (roleValue == 2) {

//		only FacultyAdmin 

		$('#option1').html("<a href=\"javascript:loadUploadQuestionsPage();\">Upload Questions</a>");
		$('#option2').html("-");
		$('#option3').html("-");
		$('#option4').html("-");
		$('#option5').html("-");
		$('#option6').html("-");



	} else if (roleValue == 3) {

//		FacultyAdmin + TestAdmin

		$('#option1').html("<a  href=\"javascript:loadUploadQuestionsPage();\">Upload Questions</a>");
		$('#option2').html("<a  href=\"javascript:loadStartTestPage();\">Start Test</a>");
		$('#option3').html("<a  href=\"javascript:loadOngoingTestPage();\">Ongoing Test</a>");
		$('#option4').html("-");
		$('#option5').html("-");
		$('#option6').html("-");


	} else if (roleValue == 4) {

//		only courseAdmin

		$('#option1').html("<a href=\"javascript:loadScheduleNewPage();\">Schedule New</a>");
		$('#option2').html("<a href=\"javascript:loadReschedulePage();\">Reschedule</a>");
		$('#option3').html("<a  href=\"javascript:loadCancelTestPage();\">Cancel Test</a>");
		$('#option4').html("-");
		$('#option5').html("-");
		$('#option6').html("-");



	} else if (roleValue == 5) {

//		CourseAdmin + TestAdmin

		$('#option1').html("<a  href=\"javascript:loadScheduleNewPage();\">Schedule New</a>");
		$('#option2').html("<a  href=\"javascript:loadReschedulePage();\">Reschedule</a>");
		$('#option3').html("<a  href=\"javascript:loadStartTestPage();\">Start Test</a>");
		$('#option4').html("<a  href=\"javascript:loadOngoingTestPage();\">Ongoing Test</a>");
		$('#option5').html("-");
		$('#option6').html("-");


	} else if (roleValue == 6) {

//		CourseAdmin + FacultyAdmin

		$('#option1').html("<a href=\"javascript:loadScheduleNewPage();\">Schedule New</a>");
		$('#option2').html("<a href=\"javascript:loadReschedulePage();\">Reschedule</a>");
		$('#option3').html("<a href=\"javascript:loadUploadQuestionsPage();\">Upload Questions</a>");
		$('#option4').html("<a  href=\"javascript:loadCancelTestPage();\">Cancel Test</a>");
		$('#option5').html("-");
		$('#option6').html("-");


	} else if (roleValue == 7) {

//		all roles

		$('#option1').html("<a  href=\"javascript:loadScheduleNewPage();\">Schedule New</a>");
		$('#option2').html("<a  href=\"javascript:loadReschedulePage();\">Reschedule</a>");
		$('#option3').html("<a  href=\"javascript:loadUploadQuestionsPage();\">Upload Questions</a>");
		$('#option4').html("<a  href=\"javascript:loadStartTestPage();\">Start Test</a>");
		$('#option5').html("<a  href=\"javascript:loadOngoingTestPage();\">Ongoing Test</a>");
		$('#option6').html("<a  href=\"javascript:loadEligibleStudentPage();\">Select Eligible Student</a>");
		$('#option6').html("<a  href=\"javascript:loadCancelTestPage();\">Cancel Test</a>");


	}


}
//------------------------------setTestLinksBasedOnRoles------------ending ----------------------




function setProfileLinksBasedOnRoles(roleValue){

	if (roleValue == 1) {

//		only TestAdmin
		alert("role 1");
		$('#option1').html("<a href=\"javascript:loadViewStudentProfilePage();\">View Student Profile</a>");
		$('#option2').html("<a href=\"javascript:loadViewAdminProfilePage();\">View Admin Profile</a>");
		$('#option3').html("-");
		$('#option4').html("-");
		$('#option5').html("-");
		$('#option6').html("-");


	} else if (roleValue == 2) {

//		only FacultyAdmin 

		$('#option1').html("<a href=\"javascript:loadViewStudentProfilePage();\">View Student Profile</a>");
		$('#option2').html("<a href=\"javascript:loadViewAdminProfilePage();\">View Admin Profile</a>");
		$('#option3').html("-");
		$('#option4').html("-");
		$('#option5').html("-");
		$('#option6').html("-");


	} else if (roleValue == 3) {

//		FacultyAdmin + TestAdmin

		$('#option1').html("<a href=\"javascript:loadViewStudentProfilePage();\">View Student Profile</a>");
		$('#option2').html("<a href=\"javascript:loadViewAdminProfilePage();\">View Admin Profile</a>");
		$('#option3').html("-");
		$('#option4').html("-");
		$('#option5').html("-");
		$('#option6').html("-");

	} else if (roleValue == 4) {

//		only courseAdmin

		$('#option1').html("<a href='javascript:loadCreateStudentPage();'>Create Student</a>");
		$('#option2').html("<a href='javascript:loadCreateAdminPage();'>Create Admin</a>");
		$('#option3').html("<a href='javascript:loadEditStudentProfilePage();'>Edit Student profile</a>");
		$('#option4').html("<a href='javascript:loadEditProfileAdminPage();'>Edit Admin Profile</a>");
		$('#option5').html("<a href='loadViewStudentProfilePage();'>View Student Profile</a>");
		$('#option6').html("<a href='loadViewAdminProfilePage();'>View Admin Profile</a>");


	} else if (roleValue == 5) {

//		CourseAdmin + TestAdmin

		$('#option1').html("<a href=\"javascript:loadCreateStudentPage();\">Create Student</a>");
		$('#option2').html("<a href=\"javascript:loadCreateAdminPage();\">Create Admin</a>");
		$('#option3').html("<a href=\"javascript:loadEditStudentProfilePage();\">Edit Student profile</a>");
		$('#option4').html("<a href=\"javascript:loadEditProfileAdminPage();\">Edit Admin Profile</a>");
		$('#option5').html("<a href=\"loadViewStudentProfilePage();\">View Student Profile</a>");
		$('#option6').html("<a href=\"loadViewAdminProfilePage();\">View Admin Profile</a>");


	} else if (roleValue == 6) {

//		CourseAdmin + FacultyAdmin

		$('#option1').html("<a href=\"javascript:loadCreateStudentPage();\">Create Student</a>");
		$('#option2').html("<a href=\"javascript:loadCreateAdminPage();\">Create Admin</a>");
		$('#option3').html("<a href=\"javascript:loadEditStudentProfilePage();\">Edit Student profile</a>");
		$('#option4').html("<a href=\"javascript:loadEditProfileAdminPage();\">Edit Admin Profile</a>");
		$('#option5').html("<a href=\"loadViewStudentProfilePage();\">View Student Profile</a>");
		$('#option6').html("<a href=\"loadViewAdminProfilePage();\">View Admin Profile</a>");


	} else if (roleValue == 7) {

//		all roles

		$('#option1').html("<a href='javascript:loadCreateStudentPage();'>Create Student</a>");
		$('#option2').html("<a href='javascript:loadCreateAdminPage();'>Create Admin</a>");
		$('#option3').html("<a href='javascript:loadEditStudentProfilePage();'>Edit Student profile</a>");
		$('#option4').html("<a href='javascript:loadEditProfileAdminPage();'>Edit Admin Profile</a>");
		$('#option5').html("<a href='loadViewStudentProfilePage();'>View Student Profile</a>");
		$('#option6').html("<a href='loadViewAdminProfilePage();'>View Admin Profile</a>");


	}





}






















