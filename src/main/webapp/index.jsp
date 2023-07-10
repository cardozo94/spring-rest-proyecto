<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1 style="text-align:center">Aplicación Spring REST</h1>
		
		<a href="${pageContext.request.contextPath}/prueba/saludo">Ir a Saludo</a>
		</br>
		<a href="${pageContext.request.contextPath}/api/empleados">Ir a Empleados</a>
		</br>
		<a href="${pageContext.request.contextPath}/api/empleados/1">Ir a Empleado</a>
	</body>
</html>