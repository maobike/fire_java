package com.fuegodequasar.springboot.web.app.message;

@SuppressWarnings("serial")
public class MessageException extends Exception{

	public MessageException(String errorMessage){
        super(errorMessage);
    }
}
