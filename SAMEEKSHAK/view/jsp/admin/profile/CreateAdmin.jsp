<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<form action="/sameekshak/createAdmin" method="post" enctype="multipart/form-data">
	<table align="center">
		<tr>
			<td>Admin Id</td>
			<td>:</td>
			<td><input type="text" id="adminId" name="adminId" size="15"
				maxlength="15" class="txtfield" /></td>
		</tr>
		<tr>
			<td>Admin Name</td>
			<td>:</td>
			<td><input type="text" id="adminName" name="adminName"
				size="25" maxlength="100" class="txtfield" /></td>
		</tr>
		<tr>
			<td>Email Id</td>
			<td>:</td>
			<td><input type="text" id="adminEmailId" name="adminEmailId"
				size="25" maxlength="100" class="txtfield" /></td>
		</tr>
		<tr>
			<td>Exten No.</td>
			<td>:</td>
			<td><input type="text" id="extnNo" name="extnNo"
				size="10" maxlength="10" class="txtfield" /></td>
		</tr>
		<tr>
			<td>Select Role</td>
			<td>:</td>
			<td>
			<input type="checkbox" value="testAdmincb" id="testAdmincb" name="admin">Test Admin<br />
			<input type="checkbox" value="facultyAdmincb" id="facultyAdmincb" name="admin">Faculty Admin<br />
			<input type="checkbox" value="courseAdmincb" id="courseAdmincb" name="admin">Course Admin<br />
			
			</td>
		</tr>
		<tr>
			<td>Image</td>
			<td>:</td>
			<td><input type="file" id="image" name="image" size="25"
				class="txtfield" /></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" id="createAdmin" name="submit"
				value="Create Admin" /></td>
		</tr>
	</table>
</form>