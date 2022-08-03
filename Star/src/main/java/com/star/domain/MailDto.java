package com.star.domain;

import java.util.Random;

import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class MailDto {
    private String address;
    private String title;
    private String content;
    
    
    public MailDto() {
    	Random random = new Random();
		int rdNum = random.nextInt(10);
		String certifyNum = Integer.toString(rdNum);
    	
    	this.title = "인증번호입니다.";
    	this.content = certifyNum;
    	
    }
    
}