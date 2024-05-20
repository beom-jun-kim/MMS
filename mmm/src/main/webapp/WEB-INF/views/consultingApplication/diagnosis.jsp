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
		
		<h6>자가진단</h6>
		
		<table class="self_test_table">
			<thead>
				<tr>
					<th>순서</th>
					<th>문항</th>
					<th>전혀 그렇지<br>않다</th>
					<th>그렇지<br>않다</th>
					<th>보통이다</th>
					<th>그렇다</th>
					<th>매우<br>그렇다</th>
				</tr>
			</thead>
			<tbody id="questionList">
			<c:forEach varStatus="status" var="question" items="${questionList }">
				<tr>
					<td>${question.orderNo }.<input type="hidden" id="seqNo" value="${question.seqNo }"></td>
					<td>${question.question }</td>
					<td>
						<input type="radio" name="radioAnswer${status.index }" value="0">
					</td>
					<td>
						<input type="radio" name="radioAnswer${status.index }" value="2">
					</td>
					<td>
						<input type="radio" name="radioAnswer${status.index }" value="5">
					</td>
					<td>
						<input type="radio" name="radioAnswer${status.index }" value="7">
					</td>
					<td>
						<input type="radio" name="radioAnswer${status.index }" value="10">
					</td>
				</tr>
			</c:forEach>	
			</tbody>
		</table>
		
		<div class="test_complete">
			<button onclick="completeDiagnosis()">평가완료</button>
		</div>
		<input type="hidden" id="projectSeq" value="${menteeVO.projectSeq }">
		<input type="hidden" id="mail1" value="${menteeVO.mail1 }">
		<input type="hidden" id="mail2" value="${menteeVO.mail2 }">
		
	</div>
</div>

<jsp:include page="<%= footerInc %>"></jsp:include>

</body>
<script type="text/javascript">

function completeDiagnosis() {
	
	var trs = $("#questionList").find("tr");
	var answerAry = new Array();
	
	for(var i = 0; i < trs.length; i++) {
		var answer = {
			diagnosisSeq : $(trs[i]).find("#seqNo").val(),
			projectSeq : $("#projectSeq").val(),
			menteeMail1 : $("#mail1").val(),
			menteeMail2 : $("#mail2").val(),
			result : $(trs[i]).find("input[name='radioAnswer" + i + "']:checked").val()
		}; 
		
		console.log(answer);
		answerAry.push(answer);
		
	}
	
	var obj = {
		answerAry : JSON.stringify(answerAry),
		mail1 : $("#mail1").val(),
		mail2 : $("#mail2").val(),
		projectSeq : $("#projectSeq").val()
	};
	
	callAjax("/mmm/guest/answer", "post", obj, next);
	
}

function next(result) {
	if(result.status == "O") {
		var obj = {
			projectSeq : result.data.seqNo,
			menteeMail1 : result.data.menteeMail1,
			menteeMail2 : result.data.menteeMail2
		}
		console.log(obj);
		debugger;
		var form = makeForm(obj);
		form.action = "/mmm/project/list";
		form.method = "post";
		form.submit();
	} else {
		alert(data.message);
	}
}

</script>
</html>