<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:if test="${fn:length(fieldList) > 0 }">
	<h6>분야 선택</h6>
	<div class="kind_wrap">
		<c:forEach varStatus="status" var="field" items="${fieldList }">
		<div class="kind_item" style="line-height: 50px;" onclick="selectField(${field.seqNo })">
			<input type="radio" name="radioField" value="${field.seqNo }"  value="${consultWay.seqNo }" style="height: 25px; width: 30px;">
			<label for="radio1" style="font-size: 30px;">${field.fieldName }</label>
		</div>
		</c:forEach>
	</div>
</c:if>	
	<div class="pj_btnwrap" style="justify-content: center; margin-top: 100px;">
		<button type="" id="modal_btn" class="btn_type01"  style="jwidth: 200px; height: 50px; font-size: 20px;" onclick="next()">컨설팅 신청하기 > </button>
	</div>
	<script>
	function selectField(fieldSeq) {
		
		globalFieldSeq = fieldSeq;
		console.log(fieldSeq);
	}
	
	function next() {
		
		if(globalProgramYn == "Y") {
			gloablFieldSeq = 0;
		}
		
		var obj = {
			waySeq : globalWaySeq,
			fieldSeq : globalFieldSeq,
			programYn : globalProgramYn
		};
		
		var form = makeForm(obj);
		form.action = "/mmm/guest/applyStep";
		form.method = "post";
		form.submit();
		
	}
	</script>
