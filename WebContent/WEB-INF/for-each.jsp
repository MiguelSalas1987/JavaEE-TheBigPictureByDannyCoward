<!DOCTYPE html>
<html>
<jsp:useBean id="myWallet" class="Part1_3.MyWallet"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>for each example</title>
</head>
<body>
Odd number up to 20
<c:forEach var="i" begin="1" end="20" step="2">
	${i}&nbsp;
</c:forEach>

</body>
</html>