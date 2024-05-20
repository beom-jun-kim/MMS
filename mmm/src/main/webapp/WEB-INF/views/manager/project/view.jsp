<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<% 
	String headInc = "../../inc/head.jsp";
	String navInc = "../../inc/nav.jsp";
	String searchFormInc = "../../inc/searchForm.jsp";
	String footerInc = "../../inc/footer.jsp";
	
	String searchBox = "../../common/searchBox.jsp";
%>

<jsp:include page="<%= headInc %>"></jsp:include>

<body>

<jsp:include page="<%= navInc %>"></jsp:include>
	
<div id="contents" class="sp_wrap">
	<div class="sp_container">
		
		<jsp:include page="<%= searchFormInc %>"></jsp:include>
		
		<div class="pj_table">
			<div class="cl_fr">
				<p>전체 1건 페이지 1/1</p>
				<small>(단위:원)</small>
			</div>
			<div class="pj_table_hd">
				<div>신청일</div>
				<div class="tw30">기업명</div>
				<div>컨설턴트</div>
				<div>담당PM</div>
				<div>컨설팅 종류</div>
				<div>컨설팅 부문</div>
				<div>컨설팅 기간</div>
				<div>계약일</div>
				<div>진행상태</div>
				<div>상세보기</div>
			</div>
			<div class="pj_content_wrap">
				<div class="pj_content">
				    <div>2024-01-31</div>
				    <div class="tw30">(주)로보스텍</div>
				    <div>(주)메라클</div>
				    <div>강병진</div>
				    <div>특화컨설팅</div>
				    <div>Value-Up</div>
				    <div>2024-02-26 ~ 2024-03-29<div class="button_pj">계약관리</div>
				    </div>
				    <div></div>
				    <div>완료보고중</div>
				    <div>
				        <div class="button_pj">상세</div>
				    </div>
				</div>
			</div>
		    <div class="pj_pagenation_wrap">
		        <div class="first">
		            <i class="fa-solid fa-angles-left"></i>
		        </div>
		        <div class="prev">
		            <i class="fa-solid fa-angle-left"></i>
		        </div>
		        <p class="page_active">1</p>
		        <p>2</p>
		        <div class="next">
		            <i class="fa-solid fa-angle-right"></i>
		        </div>
		        <div class="last">
		            <i class="fa-solid fa-angles-right"></i>
		        </div>
		    </div>
		</div>
	
	
	
	</div>
</div>

<jsp:include page="<%= footerInc %>"></jsp:include>

</body>


<script type="text/javascript">



</script>
</html>