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
	
	<div id="contents" class="sp_wrap">
		<div class="sp_container">
			<div class="login_box_wrap">
		        <div class="login_box" onclick="goLogin('3')">
		            <h4>멘토 로그인</h4>
		            <p>멘토회원이시라면 선택하세요</p>
		        </div>
		        <div class="login_box" onclick="goLogin('4')">
		            <h4>멘티 로그인</h4>
		            <p>멘티회원이시라면 선택하세요</p>
		        </div>
		        <div class="guest_login_box" onclick="goWay()"><span>멘토링 신청하기 </span></div>
		    </div>		
	    </div>	
	</div>
	
    <jsp:include page="<%= footerInc %>"></jsp:include>
    
</body>
<script type="text/javascript">

//1: 관리자(메라클직원), 2: 매니저(회원사직원), 3: 멘토, 4: 멘티
function goLogin(userType) {
	var obj = {
			"userType": userType
	}
	
	var form = makeForm(obj);
	form.action = "/mmm/login/loginView";
	form.method = "post";
	form.submit();
}

function goWay() {
	var obj = {
			"memberSeq": ${memberCompanyVO.seqNo}
	}
	
	var form = makeForm(obj);
	form.action = "/mmm/guest/wayView";
	form.method = "post";
	form.submit();
}

</script>
</html>