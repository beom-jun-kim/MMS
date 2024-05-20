<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="topMenu preR">
	<div class="navbar navbar-expand-lg navbar-white bg-white wrap">
		<div class="collapse navbar-collapse justify-content-between" id="navbarSupportedContent">
			
			<div class="ci">
				<a class="navbar-brand a2" href="/">
					<img src="data:image/png;base64,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">
				</a>
			</div>
			
			<%-- 로그인 했을때만 메뉴표출 --%>
			<c:if test="${sessionScope.user != null }">
			
			<ul class="">
				<li class="nav-item dropdown menuTopBar" v-if="menuMentoring">
					<div class="serviceCenterMenuBtn">
						<div class="nav-link menu3 a2" id="serviceCenter" style="cursor:pointer;">프로그램관리</div>
						<ul class="dropdown-menu serviceCenterSubMenu">
							<li><a class="dropdown-item" href="">프로그램목록</a></li>
							<li><a class="dropdown-item" href="">프로그램등록</a></li>
						</ul>
					</div>
				</li>
				
				<li class="nav-item dropdown menuTopBar" v-if="menuMento">
					<div class="serviceCenterMenuBtn">
						<div class="nav-link menu3 a2" id="serviceCenter" style="cursor:pointer;">
							<a class="nav-link menu8 a2" href="/main/mentor/mentorMatch">분야</a>
						</div>
						<ul class="dropdown-menu serviceCenterSubMenu">
							<li>
								<a class="dropdown-item" href="/main/mentor/mentorMatch">
									분야리스트
								</a>
							</li>
							<li>
								<a class="dropdown-item" href="/main/mentor/mentorHistory">분야등록</a>
							</li>
						</ul>
					</div>
				</li>

				<li class="nav-item dropdown menuTopBar" v-if="menuMentoring">
					<div class="serviceCenterMenuBtn">
						<div class="nav-link menu3 a2" id="serviceCenter" style="cursor:pointer;">멘티</div>
						<ul class="dropdown-menu serviceCenterSubMenu">
							<li><a class="dropdown-item" href="">멘티목록</a></li>
						</ul>
					</div>
				</li>
				
				<li class="nav-item dropdown menuTopBar" v-if="menuMentoring">
					<div class="serviceCenterMenuBtn">
						<div class="nav-link menu3 a2" id="serviceCenter" style="cursor:pointer;">고객사</div>
						<ul class="dropdown-menu serviceCenterSubMenu">
							<li><a class="dropdown-item" href="">고객사목록</a></li>
						</ul>
					</div>
				</li>
				
				<li class="nav-item dropdown menuTopBar" v-if="menuMentoring">
					<div class="serviceCenterMenuBtn">
						<div class="nav-link menu3 a2" id="serviceCenter" style="cursor:pointer;">회원사</div>
						<ul class="dropdown-menu serviceCenterSubMenu">
							<li><a class="dropdown-item" href="">회원사목록</a></li>
						</ul>
					</div>
				</li>
			</ul>
			
			<ul class="">
				<div v-if="loggedIn == true" class="d-flex">
					<li class="nav-item">
						<a href="" @click.prevent="logOut" class="nav-link text-dark btnWrap">
							<svg class="svg-inline--fa fa-user" aria-hidden="true" focusable="false" data-prefix="far" data-icon="user" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M272 304h-96C78.8 304 0 382.8 0 480c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32C448 382.8 369.2 304 272 304zM48.99 464C56.89 400.9 110.8 352 176 352h96c65.16 0 119.1 48.95 127 112H48.99zM224 256c70.69 0 128-57.31 128-128c0-70.69-57.31-128-128-128S96 57.31 96 128C96 198.7 153.3 256 224 256zM224 48c44.11 0 80 35.89 80 80c0 44.11-35.89 80-80 80S144 172.1 144 128C144 83.89 179.9 48 224 48z"></path></svg>
							마이페이지
						</a>
					</li>
					<li class="nav-item">
						<a href="" @click.prevent="logOut" class="nav-link text-dark btnWrap"></a>
					</li>
				</div>
				
				<div v-else="">
					<div class="d-flex">
						<li class="nav-item"><a href="/main/join" class="nav-link text-dark btnWrap"></li>
						<li class="nav-item">
							<a href="/main/MemberLogin" class="nav-link text-dark btnWrap">
								<svg class="svg-inline--fa fa-arrow-right-to-bracket" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="arrow-right-to-bracket" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M416 32h-64c-17.67 0-32 14.33-32 32s14.33 32 32 32h64c17.67 0 32 14.33 32 32v256c0 17.67-14.33 32-32 32h-64c-17.67 0-32 14.33-32 32s14.33 32 32 32h64c53.02 0 96-42.98 96-96V128C512 74.98 469 32 416 32zM342.6 233.4l-128-128c-12.51-12.51-32.76-12.49-45.25 0c-12.5 12.5-12.5 32.75 0 45.25L242.8 224H32C14.31 224 0 238.3 0 256s14.31 32 32 32h210.8l-73.38 73.38c-12.5 12.5-12.5 32.75 0 45.25s32.75 12.5 45.25 0l128-128C355.1 266.1 355.1 245.9 342.6 233.4z"></path></svg>로그인
							</a>
						</li>
					</div>
				</div>
			</ul>
			</c:if>
		</div>
	</div>
</div>