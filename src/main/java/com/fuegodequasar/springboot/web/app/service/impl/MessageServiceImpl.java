package com.fuegodequasar.springboot.web.app.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fuegodequasar.springboot.web.app.message.MessageException;
import com.fuegodequasar.springboot.web.app.message.SatelliteRequest;
import com.fuegodequasar.springboot.web.app.models.Message;
import com.fuegodequasar.springboot.web.app.models.Position;
import com.fuegodequasar.springboot.web.app.models.Satellite;
import com.fuegodequasar.springboot.web.app.models.SpaceShip;
import com.fuegodequasar.springboot.web.app.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	public ArrayList<String> extractMessage(ArrayList<Object> satellites) {
		
		System.out.print("\r\n");
		ArrayList<String> arrMessage = new ArrayList<>();
		for (int i=0; i < satellites.size(); i++) {
			Object[] msg = (Object[]) satellites.get(i);
			//Object arrMsg = msg;
			
			
			
			System.out.print( msg + "\r\n" );
			//for (int j=0; j < msg.size(); j++) {
				//if (ms.get(j) != null) {
					//System.out.print(ms.get(j)+ "[" + j + "]" + "\r\n");
					//secret.set(j, ms.get(j));
				//}
			//}
		}
		
		return arrMessage;
	}
	
	
	
	public SpaceShip getMessage(List<SatelliteRequest> dataObj) throws MessageException {

		if(dataObj.size() < 3) {
			throw new MessageException("Cantidad de satelites incorrectos");
		}

		ArrayList<Object> secret = new ArrayList<Object>();
		
		//for (int i=0; i < dataObj.size(); i++) {
		//	ArrayList<Object> ms = new ArrayList<Object>();
		//	ms = dataObj.get(i).getMessage();
		//	//System.out.print(ms + "\r\n");
		//	for (int j=0; j < ms.size(); j++) {
		//		if (ms.get(j) != null) {
		//			//System.out.print(ms.get(j)+ "[" + j + "]" + "\r\n");
		//			secret.set(j, ms.get(j));
		//		}
		//	}
		//}
		//System.out.print("Final: " + secret);
		
		//double positionX = -100.0;
		//double positionY = 75.5;
		SpaceShip spaceship = new SpaceShip();
		Position position = new Position();
		position.setX(100.1);
		position.setY(75.5);
		spaceship.setPosition(position);
		spaceship.setMessage("Este es un mensaje secreto");
		return spaceship;
	}
	
	
}
