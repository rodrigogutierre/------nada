<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Chacalomn</h1>
</body>
<script src="<c:url value='resources/js/jquery.js'/>"></script>

<script type="text/javascript">

	$(document).ready(function() {
		list();
	});
	
	function list() {
		var url = "cus?opc=list";//nombre del controlador 
		try {
			$.post(url, function(objJson) {
				var lista = objJson.pr;
				console.log(lista);

			});
		} catch (e) {
			console.error("Error al listar : " + e);
		}
	}
</script>

</html>