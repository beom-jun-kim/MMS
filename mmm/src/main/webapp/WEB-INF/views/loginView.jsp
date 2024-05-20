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
		<div class="login_table_wrap">
			<div class="login_table">
			<c:if test="${userVO.userType == 1 }">
				<h2>관리자 로그인</h2>
			</c:if>
			
			<c:if test="${userVO.userType == 2 }">
				<h2>매니저 로그인</h2>
			</c:if>
			
			<c:if test="${userVO.userType == 3 }">
				<h2>멘토 로그인</h2>
			</c:if>
			
			<c:if test="${userVO.userType == 4 }">
				<h2>멘티 로그인</h2>
			</c:if>
					
				<div class="form-group">
					<label for="username">아이디</label>
					<input type="text" id="username" name="username" required placeholder="example@example.com">
				</div>
				<div class="form-group">
					<label for="password">비밀번호</label>
					<input type="password" id="password" name="password" required>
				</div>
				<div class="form-group">
					<button onclick="checkkAccount()">로그인</button>
				</div>
			</div>
			<div class="guest_login_box"><span>아직 회원이 아니신가요? </span><a href="">게스트 로그인</a></div>
		</div>
	</div>
</div>

<jsp:include page="<%= footerInc %>"></jsp:include>

</body>
<script type="text/javascript">
function checkkAccount() {
	
	var mail1 = $("#username").val().split("@")[0];
	var mail2 = $("#username").val().split("@")[1];
	var password = $("#password").val();
	
	console.log(mail1 + ", " + mail2 + ", " + password);
	
	var obj = {
		userType: ${userVO.userType},	
		mail1: mail1,
		mail2: mail2,
		password: password
	};
	
	callAjax("/mmm/login/checkAccount", "post", obj, successFn);
	
}

function successFn(data) {
	
	if(data.status == "O") {
		var obj = {
				"userType": ${userVO.userType},
		}
		
		var form = makeForm(obj);
		
	<c:if test="${userVO.userType == 1 }">
		form.action = "/mmm/main/";
	</c:if>
	
	<c:if test="${userVO.userType == 2 }">
		form.action = "/mmm/manager/project/view";
	</c:if>
	
	<c:if test="${userVO.userType == 3 }">
		form.action = "/mmm/main/";
	</c:if>
	
	<c:if test="${userVO.userType == 4 }">
		form.action = "/mmm/main/";
	</c:if>		
		form.method = "post";
		form.submit();
	} else {
		alert(data.message);
	}
}
</script>
</html>