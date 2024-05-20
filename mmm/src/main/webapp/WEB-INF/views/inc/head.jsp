<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<link rel="stylesheet" href="/mmm/resources/css/style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"/>
	
	<script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.4.0/sockjs.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.min.js"></script>
	
	<%--다음 우편번호 --%>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	<script src="/mmm/resources/js/jquery-1.11.1.min.js" type="text/javascript"></script>
	<script src="/mmm/resources/js/common.js" type="text/javascript"></script>
	
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<title>MMS</title>
	<script type="text/javascript">
	var stompClient = null;
	var aksano = '${fn:trim(sessionScope.employee.aksano)}';
	/*
	  deptList : 부서목록
	  messageRoomList : 대화방 목록
	  messageList : 대화목록
	*/
	var viewCode = "";
	
	$(document).ready(function() {
		connect();
		setInterval(connect, 1000 * (60 * 5));
	});
	
	function connect(event) {
		var socket = new SockJS("/mmm/ws"); 
		stompClient = Stomp.over(socket);
		
		stompClient.connect({}, onConnected, onError);
	}

	function onConnected() {
		// Subscribe to the Public Topic
		stompClient.subscribe('/topic/public', onMessageReceived);
		
		// Tell your aksano to the server
		stompClient.send("/app/chat.addUser", {}, JSON.stringify({sender: aksano, type: 'JOIN'}))
	}

	function onMessageReceived(payload) {
		console.log(payload.body);
		
		var resultObj = JSON.parse(payload.body);
		if(resultObj["status"] == "ok") {
			<%--
			switch(viewCode) {
				case "deptList":
					getDepartmentList();
					break;
				case "messageRoomList":
					getMessageRoomList();
					break;
				case "messageList": 
					getMessageList();
					$("#inputMessage").val('');
					break;
				case "pouchSenderList": 
					getList();
					break;
				case "sinilList": 
					getList();
					break;
				case "pouchHeadList": 
					getList();
					break;
				case "covidBooking": 
					getList();
					break;
				default:
					break;
			}
			--%>
		}
	}

	function onError(error) {
		console.log('Could not connect to WebSocket server. Please refresh this page to try again!');
		console.log('red');
	}
	
	function setAppToken(token) {
		alert(token);
	}
	
	function onResume() {
		onConnected();
	}
	</script>
</head>