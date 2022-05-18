<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입페이지입니다.</title>
</head>
<body>
<form action="save1" mothod="post">
    <a1>아이디:</a1> <input type="text" name="memberId" placeholder="아이디"><br>
    <a1>비밀번호:</a1> <input type="text" name="memberPassword" placeholder="비밀번호"><br>
    <a1>이름:</a1> <input type="text" name="memberName" placeholder="이름"><br>
    <a1>나이:</a1> <input type="int" name="memberAge" placeholder="나이"><br>
    <a1>핸드폰번호:</a1> <input type="text" name="memberPhone" placeholder="핸드폰번호"><br>
    <input type="submit" value="확인">
</form>

</body>
</html>
