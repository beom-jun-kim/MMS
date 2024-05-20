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
	
		<h6>기업정보 입력</h6>
		
		<div class="acodian_01">
			<div class="sr_title" style="justify-content: left;">기업정보
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span style="color: red;">* 가능한 정보만 입력하시면 됩니다.</span>
			</div>
			<div class="sr_box">
				<%-- 
				<div class="cl cl100">
					<p>기업구분</p>
					<div>
						<select name="" id="">
							<option value="">주식회사</option>
							<option value="">유한회사</option>
							<option value="">유한책임회사</option>
							<option value="">합명회사</option>
							<option value="">합자회사</option>
						</select>
						<small></small>
					</div>
				</div>
				
				<div class="cl cl100">
					<p>구분위치</p>
					<div>
						<select name="" id="">
							<option value="">앞</option>
							<option value="">뒤</option>
						</select>
						<small>
							<svg class="svg-inline--fa fa-circle-exclamation" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-exclamation" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg="">
								<path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM232 152C232 138.8 242.8 128 256 128s24 10.75 24 24v128c0 13.25-10.75 24-24 24S232 293.3 232 280V152zM256 400c-17.36 0-31.44-14.08-31.44-31.44c0-17.36 14.07-31.44 31.44-31.44s31.44 14.08 31.44 31.44C287.4 385.9 273.4 400 256 400z"></path>
							</svg>
							<!-- <i class="fa-solid fa-circle-exclamation"></i> Font Awesome fontawesome.com -->
							(주)의 위치(법인기업만 선택)
						</small>
					</div>
				</div>
				--%>
				
				<div class="cl">
					<p>업종</p>
					<div>
						<input type="text" id="businessItems" value="업종">
					</div>
				</div>
				
				<div class="cl">
					<p>업태</p>
					<div>
						<input type="text" id="businessType" value="업태">
					</div>
				</div>
				
				<div class="cl cl100">
					<p>기업체명</p>
					<div>
						<input type="text" id="name" value="기업체명">
						<small></small>
					</div>
				</div>
				<div class="cl">
					<p>사업자번호</p>
					<div>
						<input type="text" id="businessNo" maxlength="12" placeholder="- 제외하고 입력하여 주시기 바랍니다." value="123456789">
					</div>
				</div>
				<div class="cl">
					<p>법인번호</p>
					<div>
						<input type="text" id="corporateNumber" maxlength="14" placeholder="- 제외하고 입력하여 주시기 바랍니다." value="123456789">
					</div>
				</div>
				<div class="cl cl100">
					<p>설립일</p>
					<div>
						<input type="date" id="startDate" value="1999-12-01">
						<small>
							<svg class="svg-inline--fa fa-circle-exclamation" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-exclamation" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg="">
								<path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM232 152C232 138.8 242.8 128 256 128s24 10.75 24 24v128c0 13.25-10.75 24-24 24S232 293.3 232 280V152zM256 400c-17.36 0-31.44-14.08-31.44-31.44c0-17.36 14.07-31.44 31.44-31.44s31.44 14.08 31.44 31.44C287.4 385.9 273.4 400 256 400z"></path>
							</svg>
							<!-- <i class="fa-solid fa-circle-exclamation"></i> Font Awesome fontawesome.com -->
							사업자등록증상의 개업 년 월일 (예:2012-07-12)
						</small>
					</div>
				</div>
				<div class="cl">
					<p>사업장 연락처</p>
					<div class="tel fl_nw">
						<input type="tel" id="phone1" maxlength="3" oninput="formatPhoneNumber()" value="123">
						<span>-</span>
						<input type="tel" id="phone2" maxlength="4" oninput="formatPhoneNumber()" value="1234">
						<span>-</span>
						<input type="tel" id="phone3" maxlength="4" oninput="formatPhoneNumber()" value="6789">
					</div>
				</div>
				<div class="cl">
					<p>사업장 팩스번호</p>
					<div class="tel fl_nw">
						<input type="tel" id="fax1" maxlength="3" oninput="formatPhoneNumber()" value="123">
						<span>-</span>
						<input type="tel" id="fax2" maxlength="4" oninput="formatPhoneNumber()" value="456">
						<span>-</span>
						<input type="tel" id="fax3" maxlength="4" oninput="formatPhoneNumber()"  value="1234">
					</div>
				</div>
				<%-- 
				<div class="cl cl100">
					<p>사업장 E-Mail</p>
					<div class="em fl_nw">
						<input type="text">
						<span>@</span>
						<input type="text" id="customEmail" name="customEmail" style="display: none;">
						<select id="emailSelect" name="emailSelect" onchange="toggleCustomEmail()">
							<option value="select">선택</option>
							<option value="naver">naver.com</option>
							<option value="gmail">gmail.com</option>
							<option value="daum">daum.net</option>
							<option value="nate">nate.com</option>
							<option value="custom">직접 입력</option>
						</select>
					</div>
				</div>
				
				<script>
				function toggleCustomEmail() {
					var emailSelect = document.getElementById("emailSelect");
					var customEmailinput = document.getElementById("customEmail");
				
					if (emailSelect.value === "custom") {
						customEmailinput.style.display = "inline"; // 직접 입력란 보이기
						customEmailinput.required = true; // 필수 입력으로 설정
					} else {
						customEmailinput.style.display = "none"; // 직접 입력란 숨기기
						customEmailinput.required = false; // 필수 입력 해제
					}
				}
				</script>
				--%>
				
				<div class="cl cl100">
					<p>사업장주소</p>
					<div class="cl_box">
						<div>
							<span>우편번호</span>
							<input type="text" id="zipCode">
							<div class="f_ad_btn" onclick="searchAddr()">우편번호 검색
								<svg class="svg-inline--fa fa-magnifying-glass" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="magnifying-glass" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg="">
									<path fill="currentColor" d="M500.3 443.7l-119.7-119.7c27.22-40.41 40.65-90.9 33.46-144.7C401.8 87.79 326.8 13.32 235.2 1.723C99.01-15.51-15.51 99.01 1.724 235.2c11.6 91.64 86.08 166.7 177.6 178.9c53.8 7.189 104.3-6.236 144.7-33.46l119.7 119.7c15.62 15.62 40.95 15.62 56.57 0C515.9 484.7 515.9 459.3 500.3 443.7zM79.1 208c0-70.58 57.42-128 128-128s128 57.42 128 128c0 70.58-57.42 128-128 128S79.1 278.6 79.1 208z"></path>
								</svg>
								<!-- <i class="fa-solid fa-magnifying-glass"></i> Font Awesome fontawesome.com -->
							</div>
						</div>
						<div>
							<span>도로명주소</span>
							<input type="text" id="address1">
						</div>
						<div>
							<span>싱세주소</span>
							<input type="text" id="address2">
						</div>
						<div>
							<small>
								<svg class="svg-inline--fa fa-circle-exclamation" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-exclamation" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg="">
									<path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM232 152C232 138.8 242.8 128 256 128s24 10.75 24 24v128c0 13.25-10.75 24-24 24S232 293.3 232 280V152zM256 400c-17.36 0-31.44-14.08-31.44-31.44c0-17.36 14.07-31.44 31.44-31.44s31.44 14.08 31.44 31.44C287.4 385.9 273.4 400 256 400z"></path>
								</svg><!-- <i class="fa-solid fa-circle-exclamation"></i> Font Awesome fontawesome.com -->사업장 주소지는 사업자등록증, 법인 등기부 등본상의 본사 주소지
								입력
							</small>
						</div>
					</div>
				</div>
				
			</div>
		</div>
		
		<div class="acodian_01">
			<div class="sr_title">대표자 정보</div>
			<div class="sr_box">
				<div class="cl">
					<p>대표자명</p>
					<div>
						<input type="text" id="ownerName" value="대표자명">
					</div>
				</div>
				
				<div class="cl">
					<p>대표자 주민등록번호</p>
					<div>
						<input type="text" id="ownerId" value="123456789">
					</div>
				</div>
				
				<div class="cl cl100">
					<p>생년월일</p>
					<div>
						<input type="date" id="ownerBirthDate" value="1999-12-12">
					</div>
				</div>
				
				<div class="cl cl100">
					<p>대표자 휴대폰</p>
					<div class="tel fl_nw">
						<input type="tel" id="ownerPhone1" maxlength="3" oninput="formatPhoneNumber()" value="123">
						<span>-</span>
						<input type="tel" id="ownerPhone2" maxlength="4" oninput="formatPhoneNumber()" value="4567">
						<span>-</span>
						<input type="tel" id="ownerPhone3" maxlength="4" oninput="formatPhoneNumber()" value="7890">
					</div>
				</div>
				
				<div class="cl cl100">
					<p>대표자 E-Mail</p>
					<div class="em fl_nw">
						<input type="text" id="ownerMail1" value="test">
						<span>@</span>
						<input type="text" id="ownerMail2" value="test.com">
					</div>
				</div>
				
				<div class="cl cl100">
					<p>비밀번호</p>
					<div class="em fl_nw">
						<input type="text" id="password" value="asdf1234">
					</div>
				</div>
				
				<%-- 
				<div class="cl cl100">
					<p>대표자 E-Mail</p>
					<div class="em fl_nw">
						<input type="text">
						<span>@</span>
						<input type="text">
						
						<input type="text" id="customEmail" name="customEmail" style="display: none;">
						<select id="emailSelect" name="emailSelect" onchange="toggleCustomEmail()">
							<option value="select">선택</option>
							<option value="naver">naver.com</option>
							<option value="gmail">gmail.com</option>
							<option value="daum">daum.net</option>
							<option value="nate">nate.com</option>
							<option value="custom">직접 입력</option>
						</select>
					</div>
				</div>
			
				<script>
				function formatPhoneNumber() {
					var phoneNumber1 = document.getElementById("phoneNumber1").value;
					var phoneNumber2 = document.getElementById("phoneNumber2").value;
					var phoneNumber3 = document.getElementById("phoneNumber3").value;
					// 각 입력란의 값이 숫자인지 확인
					if (!(/^\d*$/.test(phoneNumber1))) {
						document.getElementById("phoneNumber1").value = phoneNumber1.slice(0, -1);
					}
					if (!(/^\d*$/.test(phoneNumber2))) {
						document.getElementById("phoneNumber2").value = phoneNumber2.slice(0, -1);
					}
					if (!(/^\d*$/.test(phoneNumber3))) {
						document.getElementById("phoneNumber3").value = phoneNumber3.slice(0, -1);
					}
				}
				</script>
				--%>
			</div>
		</div>
		
		<div class="modal-btn-wrap" style="justify-content: center; margin-top: 100px;">
			<div class="confilrm" onclick="saveCustomer()">저장하기</div>
		</div>
		
	</div>
</div>

<jsp:include page="<%= footerInc %>"></jsp:include>

</body>
<script type="text/javascript">

function saveCustomer() {
	
	var obj = {
		memberSeq : ${sessionScope.memberCompany.seqNo},
		businessItems : $("#businessItems").val(),
		businessType : $("#businessType").val(),
		name : $("#name").val(),
		businessNo : $("#businessNo").val(),
		startDate : $("#startDate").val(),
		phone : $("#phone1").val() + $("#phone2").val() + $("#phone3").val(),
		fax : $("#fax1").val() + $("#fax2").val() + $("#fax3").val(),
		address1 : $("#address1").val(),
		address2 : $("#address2").val(),
		zipCode : $("#zipCode").val(),
		ownerName : $("#ownerName").val(),
		ownerId : $("#ownerId").val(),
		ownerBirthDate : $("#ownerBirthDate").val(),
		ownerPhone  : $("#ownerPhone1").val() + $("#ownerPhone2").val() + $("#ownerPhone3").val(),
		ownerMail1 : $("#ownerMail1").val(),
		ownerMail2 : $("#ownerMail2").val(),
		password : $("#password").val(),
		waySeq : ${projectVO.waySeq},
		fieldSeq : ${projectVO.fieldSeq},
		programYn : '${projectVO.programYn}'
	}
	
	console.log(obj);
	callAjax("/mmm/guest/addProject", "post", obj, next);
	
}

function next(result) {
	if(result.status == "O") {
		var obj = {
				projectSeq : result.data.projectSeq,
				mail1 : result.data.mail1,
				mail2 : result.data.mail2
		}
		console.log(obj);
		
		var form = makeForm(obj);
		form.action = "/mmm/guest/diagnosis";
		form.method = "post";
		form.submit();
	} else {
		alert(data.message);
	}
}

function formatPhoneNumber() {
	var phoneNumber1 = document.getElementById("phone1").value;
	var phoneNumber2 = document.getElementById("phone2").value;
	var phoneNumber3 = document.getElementById("phone3").value;

	// 각 입력란의 값이 숫자인지 확인
	if (!(/^\d*$/.test(phoneNumber1))) {
		document.getElementById("phone1").value = phoneNumber1.slice(0, -1);
	}
	if (!(/^\d*$/.test(phoneNumber2))) {
		document.getElementById("phone2").value = phoneNumber2.slice(0, -1);
	}
	if (!(/^\d*$/.test(phoneNumber3))) {
		document.getElementById("phone3").value = phoneNumber3.slice(0, -1);
	}
}

function searchAddr() {
	 new daum.Postcode({
		oncomplete: function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
			
			// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
			// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			var roadAddr = data.roadAddress; // 도로명 주소 변수
			var extraRoadAddr = ''; // 참고 항목 변수
			
			// 법정동명이 있을 경우 추가한다. (법정리는 제외)
			// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
			if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
				extraRoadAddr += data.bname;
			}
			// 건물명이 있고, 공동주택일 경우 추가한다.
			if(data.buildingName !== '' && data.apartment === 'Y'){
				extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
			}
			// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
			if(extraRoadAddr !== ''){
				extraRoadAddr = ' (' + extraRoadAddr + ')';
			}
			
			// 우편번호와 주소 정보를 해당 필드에 넣는다.
			document.getElementById('zipCode').value = data.zonecode;
			document.getElementById("address1").value = roadAddr;
			// document.getElementById("address1").value = data.jibunAddress;
			
			// 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
			if(roadAddr !== ''){
				document.getElementById("address2").value = extraRoadAddr;
			} else {
				document.getElementById("address2").value = '';
			}
			
			<%--
			var guideTextBox = document.getElementById("guide");
			// 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
			if(data.autoRoadAddress) {
				var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
				guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
				guideTextBox.style.display = 'block';
				
			} else if(data.autoJibunAddress) {
				var expJibunAddr = data.autoJibunAddress;
				guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
				guideTextBox.style.display = 'block';
			} else {0
				guideTextBox.innerHTML = '';
				guideTextBox.style.display = 'none';
			}
			--%>
		}
	}).open();
}

</script>
</html>