<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="sr_box">
	<div class="cl cl100">
		<p>사업기간</p>
		<div class="fl_nw">
			<input type="date" id="startDate"> <small>~</small> <input type="date" id="endDate">
			<div class="btn_grl">
				<div class="btn_active" onclick="selectSubscription(1, 1)">1개월</div>
				<div onclick="selectSubscription(2, 3)">3개월</div>
				<div onclick="selectSubscription(3, 6)">6개월</div>
				<div onclick="selectSubscription(4, 12)">12개월</div>
			</div>
		</div>
	</div>
	
	<div class="cl cl100">
		<p>구분</p>
		<div>
			<select name="selectStatus" id="selectStatus">
				<option value="-">전체</option>
				<option value="REQ">심사중</option>
				<option value="REF">반려</option>
				<option value="ING">진행중</option>
				<option value="COM">완료</option>
			</select>
		</div>
		
		<p>검색</p>
		<div class="fl_nw">
			<select name="selectKeywordType" id="selectKeywordType">
				<option value="선택">선택</option>
				<option value="1">사업자번호</option>
				<option value="2">업체명</option>
			</select>
			<input type="text" id="inputKeyword">
		</div>
	</div>
</div>
<div class="btn_search">조회</div>

<script type="text/javascript">

function selectSubscription(months, amount) {
	
	$("#startDate").val(date_format(new Date()));
	$("#endDate").val(date_format(addDate(new Date(), amount, 'm')));
	
	var buttons = document.querySelectorAll('.btn_grl div');
	buttons.forEach(function (button) {
		button.classList.remove('btn_active');
	});
	
	var selectedButton = document.querySelector('.btn_grl div:nth-child(' + months + ')');
	selectedButton.classList.add('btn_active');
}


</script>