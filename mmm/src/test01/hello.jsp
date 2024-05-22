<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<% 
	String headInc = "inc/head.jsp";
	String navInc = "inc/nav.jsp";
	String footerInc = "inc/footer.jsp";
	
	String searchBox = "common/searchBox.jsp";
%>

<jsp:include page="<%= headInc %>"></jsp:include>


<body>
	
	<jsp:include page="<%= navInc %>"></jsp:include>
	
	<div>test</div>
	
    <jsp:include page="<%= footerInc %>"></jsp:include>
    
</body>
<script type="text/javascript">

</script>
</html>