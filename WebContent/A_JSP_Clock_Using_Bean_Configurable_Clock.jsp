<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>A JSP CLock Using a Bean</title>
</head>
<body>
<jsp:useBean id="myBean" class="Part1_3.ConfigurableClockBean" />
	<div align="center">
		<br>
		Hello there!
		<br><br>
		It's been 
		<jsp:getProperty name="myBean" property="currentTimeSinceEpoch"/>
		milliseconds
		since midnight, January 1st 1970
		<br><br>
		In other words, its
		<jsp:getProperty name="myBean" property="readableDate"/>
		<br>
		Or in other words, it's the month of
		<jsp:setProperty name="myBean" property="dateFormat" value="MMMMMMMMM"/>
		<jsp:getProperty name="myBean" property="readableDate"/>
		in
		<jsp:setProperty name="myBean" property="dateFormat" value="YYYY"/>
		<jsp:getProperty name="myBean" property="readableDate"/>
	</div>
</body>
</html>