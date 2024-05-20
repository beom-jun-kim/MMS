<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<% 
	String headInc = "../inc/head.jsp";
	String navInc = "../inc/nav.jsp";
	String footerInc = "../inc/footer.jsp";
	
	String searchBox = "../common/searchBox.jsp";
%>

<jsp:include page="<%= headInc %>"></jsp:include>

<body>

<jsp:include page="<%= navInc %>"></jsp:include>
	
<div id="contents" class="sp_wrap">
	<div class="sp_container">
		
		<h6>컨설팅 절차 안내</h6>
		<div class="consult_wrap">
		
		<%-- 
		<c:forEach varStatus="status" var="consultWay" items="${consultWayList }">
			<div class="consult_item" style="line-height: 50px;">
				<input type="radio" name="consultation" value="${consultWay.seqNo }" style="height: 25px; width: 30px;"  onclick="clickWay(${consultWay.seqNo })">
				<i class="fa-solid fa-person-chalkboard"></i>
				<label for="face_to_face" style="font-size: 30px;">${consultWay.wayName }</label>
			</div>
		</c:forEach>
		--%>
		</div>
		
		<button onclick="next()">다음</button>	
	</div>
</div>

<jsp:include page="<%= footerInc %>"></jsp:include>

</body>
<script type="text/javascript">

function 

function clickWay(waySeq) {
	console.log(waySeq);
	
	var obj = {
		waySeq : waySeq	
	};
	
	callAjax("/mmm/guest/fieldView", "post", obj, successLoadField);
}	

function successLoadField(data) {
	$("#fieldArea").html(data);
}

 
</script>
</html>