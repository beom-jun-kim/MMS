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
		
		<h6>컨설팅절차안내</h6>

		<!-- 컨설팅 절차 안내 -->
		<div class="usage_guide">
			<div class="usage_guide_exp">
				<ul>
				<c:forEach varStatus="status" var="step" items="${stepList }">
					<li>
						<div class="consultant_li_title_box">
							<div class="consultant_li_title">
								<h4>${step.stepNo }. ${step.title }</h4>
							</div>
							<div class="consultant_li_exp">
								<p>${step.detail } </p>
							</div>
						</div>
					</li>
					
				<c:if test="${!status.last }">
					<i class="fa-solid fa-circle-chevron-down"></i>
				</c:if>
					
				</c:forEach>	
				
				</ul>
				
				<div class="usage_guide_btn">
					<button onclick="next()">확인</button>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="<%= footerInc %>"></jsp:include>

</body>
<script type="text/javascript">

function next() {
	var obj = {
		waySeq : ${projectVO.waySeq},
		fieldSeq : ${projectVO.fieldSeq},
		programYn : '${projectVO.programYn}'
	};
	
	var form = makeForm(obj);
	form.action = "/mmm/guest/agreement";
	form.method = "post";
	form.submit();
	
}

</script>
</html>