package com.fuegodequasar.springboot.web.app.service;

import java.util.ArrayList;
import java.util.List;

import com.fuegodequasar.springboot.web.app.message.MessageException;
import com.fuegodequasar.springboot.web.app.message.SatelliteRequest;
import com.fuegodequasar.springboot.web.app.models.SpaceShip;

public interface MessageService {

	
	ArrayList<String> extractMessage(ArrayList<Object> satellites) throws MessageException;
	
	
	/**
    *
    * @param distance distancia del satelite a la nave.
    * @return Respuesta de posicion y mensaje.
	* @throws MessageException 
    */
	SpaceShip getMessage(List<SatelliteRequest> dataObj) throws MessageException;
}
