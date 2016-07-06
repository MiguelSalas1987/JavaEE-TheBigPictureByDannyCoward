<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>forEachExammple</title>
	</head>
	<jsp:useBean id="myWallet" class="Part1_3.MyWallet"/>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<body>

	<p>
		Odd numbers up to 20
		
		<c:forEach  var="i"  begin="1" end="20" step="2">
			${i}&nbsp;
		</c:forEach>	
	</p>
	
	<p>
		Coins I have:
		<c:forEach  var="coin"  items="${myWallet.coins}" >
			${coin},&nbsp;
		</c:forEach>	
	</p>
	<p>
		Currency I have in my Wallet:
		<c:forEach var="note" items="${myWallet.currency}">
			${note},&nbsp;
		</c:forEach>
	</p>
	<p>
		<c:forEach var="receip" items="${myWallet.receips}">
			${receip},&nbsp;
		</c:forEach>
		
	</p>


</body>
</html>