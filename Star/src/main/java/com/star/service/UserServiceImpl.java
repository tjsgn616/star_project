package com.star.service;

import org.springframework.beans.factory.annotation.Autowired;
//메일
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.star.domain.MailDto;
import com.star.domain.UserDTO;
import com.star.mapper.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean registerUser(UserDTO params) {
		
		return false;
	}

//	유저 정보 조회
	@Override
	public UserDTO getUser(Long userNumber) {
		return userMapper.detailUser(userNumber);
	}

	private JavaMailSender emailSender;
	 
    public void sendSimpleMessage(MailDto mailDto) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("gdqgdq05@gmail.com");
        message.setTo(mailDto.getAddress());
        message.setSubject(mailDto.getTitle());
        message.setText(mailDto.getContent());
        emailSender.send(message);
    }
	
	
}
