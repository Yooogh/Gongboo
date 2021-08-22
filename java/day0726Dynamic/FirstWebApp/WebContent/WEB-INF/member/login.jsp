<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	===${loginYear}년 ${loginMonth}월 ${loginDay}일 ${loginHour}:${loginMinute}:${loginSecond}===<br>
	<form action="loginPrc.do" method="post">
		<label for="userId">UserID:</label><input type="text" id="userId"   name="userId"><br>
		<label for="userPw">UserPW:</label><input type="password" id="userPw"  name="userPasswd"><br>
		<button type="submit" value="로그인" >로그인</button>
		<button type="reset"  value="다시입력">다시입력</button>
	</form>
	
</body>
</html>