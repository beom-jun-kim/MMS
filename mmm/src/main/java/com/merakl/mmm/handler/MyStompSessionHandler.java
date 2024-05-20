package com.merakl.mmm.handler;

import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;

import com.merakl.mmm.vo.ChatMessageVO;
import com.merakl.mmm.vo.MessageInfoVO;


public class MyStompSessionHandler extends StompSessionHandlerAdapter {
	
	@Override
	public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
		// TODO Auto-generated method stub
		
		session.subscribe("/topic/public", this);
		session.send("/app/chat.addUser", getSampleMessage());
		
		MessageInfoVO messageInfoVO = new MessageInfoVO();
		messageInfoVO.setLisFlag("Y");
		
		session.send("/app/chat.sendMessage", messageInfoVO);
		
//		super.afterConnected(session, connectedHeaders);
	}
	
	@Override
	public void handleFrame(StompHeaders headers, Object payload) {
		// TODO Auto-generated method stub
		ChatMessageVO chatMessageVO = (ChatMessageVO) payload;
		System.out.println("Received : " + chatMessageVO.getSender());
//		super.handleFrame(headers, payload);
	}
	
	@Override
	public void handleException(StompSession session, StompCommand command, StompHeaders headers, byte[] payload,
			Throwable exception) {
		// TODO Auto-generated method stub
//		exception.printStackTrace();
		super.handleException(session, command, headers, payload, exception);
	}
	
	@Override
	public void handleTransportError(StompSession session, Throwable exception) {
		// TODO Auto-generated method stub
//		exception.printStackTrace();
		super.handleTransportError(session, exception);
	}
	
	private ChatMessageVO getSampleMessage() {
		/*
		MessageInfoVO messageInfoVO = new MessageInfoVO();
		messageInfoVO.setMessagid("");
		messageInfoVO.setSenddecd("1012");
		messageInfoVO.setRecedecd("2030");
		messageInfoVO.setRcheckok("");
		messageInfoVO.setIsreturn("N");
		messageInfoVO.setIsurgent("N");
		messageInfoVO.setReturnid("");
		messageInfoVO.setInstdate("");
		messageInfoVO.setInsttime("");
		messageInfoVO.setInstsano("102076");
		messageInfoVO.setChckdate("");
		messageInfoVO.setChcktime("");
		messageInfoVO.setChcksano("");
		messageInfoVO.setSendname("전산팀");
		messageInfoVO.setRecename("삼광부산센터");
		messageInfoVO.setLimidttm("");
		messageInfoVO.setIsreplyy("");
		messageInfoVO.setHeader("");
		messageInfoVO.setMgtype("");
		messageInfoVO.setMessageText("서드파티 테스트 전산팀 김근우");
		messageInfoVO.setLisFlag("Y");
		*/
		
		ChatMessageVO chatMessageVO = new ChatMessageVO();
		chatMessageVO.setSender("ThirdParty");
		chatMessageVO.setType("JOIN");
		
		return chatMessageVO;
		
//		return (new Gson()).toJson(chatMessageVO);
	}
	
}
