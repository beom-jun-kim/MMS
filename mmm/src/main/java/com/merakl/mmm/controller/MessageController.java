package com.merakl.mmm.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.Transport;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;
import org.springframework.web.socket.sockjs.frame.Jackson2SockJsMessageCodec;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.merakl.mmm.handler.MyStompSessionHandler;
import com.merakl.mmm.vo.ChatMessageVO;
import com.merakl.mmm.vo.MessageInfoVO;
/*
import com.sml.erp.db.as400.DB2Controller;
import com.sml.erp.handler.MyStompSessionHandler;
import com.sml.erp.service.EmployeeAccountService;
import com.sml.erp.service.FCMService;
import com.sml.erp.service.MessageService;
import com.sml.erp.vo.AksawrVO;
import com.sml.erp.vo.ChatMessageVO;
import com.sml.erp.vo.EmployeeVO;
import com.sml.erp.vo.FileVO;
import com.sml.erp.vo.MessageDetailVO;
import com.sml.erp.vo.MessageInfoVO;
import com.sml.erp.vo.ResultVO;
*/
import com.merakl.mmm.vo.ResultVO;

@Controller
@RequestMapping(value = "message")
public class MessageController {

//	@Autowired
//	private MessageService messageService;
//	
//	@Autowired
//	private FCMService fcmService;
//	
//	@Autowired
//	private EmployeeAccountService employeeAccountService;
	
//	@RequestMapping(value = "message.do")
//	public String message(Model model
//			, HttpSession session
//			, HttpServletRequest request
//			, HttpServletResponse response
//			, MessageInfoVO messageVO) {
//		
//		response.setHeader("Expires", "Sat, 6 May 1995 12:00:00 GMT"); 
//		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
//		response.addHeader("Cache-Control", "post-check=0, pre-check=0"); 
//		response.setHeader("Pragma", "no-cache");
//		
//		EmployeeVO employeeVO = (EmployeeVO) session.getAttribute("employee");
//		messageVO.setN70sdept(employeeVO.getAkdecd().trim());
//		messageVO.setN70sdnam(employeeVO.getAddenm().trim());
//		
//		model.addAttribute("messageVO", messageVO);
//		
//		return "/message/message";
//	}
	
//	@RequestMapping(value = "messageList.do")
//	public String messageList(Model model
//			, HttpSession session
//			, MessageInfoVO messageVO) throws SQLException {
//		
//		EmployeeVO employeeVO = (EmployeeVO) session.getAttribute("employee");
//		messageVO.setN70sdept(employeeVO.getAkdecd().trim());
//		messageVO.setN70sdnam(employeeVO.getAddenm().trim());
//		
//		Connection connection = DB2Controller.getDBConnection();
//		try {
//			model.addAttribute("messageVO", messageVO);
//			model.addAttribute("messageList", messageService.messageList(connection, messageVO));
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			if(connection != null) {
//				connection.close();
//			}
//		}
//		
//		return "/message/messageList";
//	}
	
//	@RequestMapping(value = "checkMessage.do")
//	public @ResponseBody ResultVO checkMessage(Model model
//			, HttpSession session
//			, MessageInfoVO messageVO) throws SQLException {
//		
//		EmployeeVO employeeVO = (EmployeeVO) session.getAttribute("employee");
//		messageVO.setN70rdept(employeeVO.getAkdecd().trim());
//		messageVO.setN70cksab(employeeVO.getAksano());
//		messageVO.setN70cknam(employeeVO.getAksanm());
//		
//		Connection connection = DB2Controller.getDBConnection();
//		ResultVO resultVO = null;
//		
//		try {
//			resultVO = messageService.checkMessage(connection, messageVO);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			if(connection != null) {
//				connection.close();
//			}
//		}
//		return resultVO;
//	}
	
//	@RequestMapping(value = "sendPush.do")
//	public @ResponseBody ResultVO sendPush(@RequestParam("msgJsonAry")String msgJsonAry) throws SQLException {
//		List<MessageInfoVO> messageList = new Gson().fromJson(msgJsonAry, new TypeToken<List<MessageInfoVO>>(){}.getType());
//		for(MessageInfoVO messageInfoVO : messageList) {
//			messageInfoVO.setPushTitle("SML 메시지");
//			messageInfoVO.setLisFlag("Y");
//			sendMessage(messageInfoVO);
//		}
//		
//		refresh();
//		
//		return new ResultVO("ok");
//	}
	
	@MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
	@MessageExceptionHandler
    public ResultVO sendMessage(@Payload MessageInfoVO messageInfoVO) throws SQLException {
		ResultVO resultVO = null;
		if(messageInfoVO != null && messageInfoVO.getLisFlag() != null) {
			
//			Connection connection = DB2Controller.getDBConnection();
//			List<AksawrVO> pushTargetList = null;
//			try {
//				if(messageInfoVO.getLisFlag().equalsIgnoreCase("N")) {
//					// 어플메시지 일 경우만 db저장 
//					resultVO = messageService.insertMessage(connection, messageInfoVO);
//				}
//				
//				// 푸쉬메시지 발송
//				pushTargetList = employeeAccountService.pushTargetList(connection, messageInfoVO.getN70rdept().trim());
//				
//			} finally {
//				if(connection != null) {
//					connection.close();
//				}
//			}
//			
//			if(pushTargetList != null) {
//				for(AksawrVO target : pushTargetList) {
//					messageInfoVO.setAppToken(target.getAraptn().trim());
//					fcmService.sendFCM(messageInfoVO);
//				}
//			}
		} else {
			// third party call
			resultVO = new ResultVO("ok", null);
		}
		
        return resultVO;
    }

	@MessageMapping("/chat.addUser")
	@SendTo("/topic/public")
	@MessageExceptionHandler
	public ChatMessageVO addUser(@Payload ChatMessageVO chatMessage, SimpMessageHeaderAccessor headerAccessor){
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}
	
	private void refresh() {
		// TODO Auto-generated method stub
		try {
			StandardWebSocketClient client = new StandardWebSocketClient();
			
			List<Transport> transports = new ArrayList<Transport>(1);
			transports.add(new WebSocketTransport(client));
			
			SockJsClient sockJsClient = new SockJsClient(transports);
			sockJsClient.setMessageCodec(new Jackson2SockJsMessageCodec());
			
			WebSocketStompClient stompClient = new WebSocketStompClient(sockJsClient);
			stompClient.setMessageConverter(new MappingJackson2MessageConverter());
			 
			StompSessionHandler sessionHandler = new MyStompSessionHandler();
			stompClient.connect("wss://erp.smlab.co.kr/sml/ws", sessionHandler);
			
			stompClient.stop();
			
			sessionHandler = null;
			stompClient = null;
			sockJsClient = null;
			transports = null;
			client = null;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
