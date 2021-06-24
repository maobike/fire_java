package com.fuegodequasar.springboot.web.app.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import com.fuegodequasar.springboot.web.app.message.SatelliteRequest;
import com.fuegodequasar.springboot.web.app.models.SpaceShip;
import com.fuegodequasar.springboot.web.app.service.MessageService;

@Controller
@RequestMapping("/app")
public class IndexController {

	/**
     * MessageService.
     */
    private MessageService messageService;

    /**
     * Constructor.
     *
     * @param personaService personaService.
     */
    public IndexController(MessageService messageService) {
        this.messageService = messageService;
    }
    
	
	@PostMapping("/topsecret")
	public ResponseEntity<SpaceShip> getMessage(
			@RequestBody SatelliteRequest satellites) {
		
			//System.out.print("Satellites:" + satellites + "\r\n");
		
		try {
			ArrayList<String> arrMessage = this.messageService.extractMessage(satellites.getSatellites());
			
			//SpaceShip resp = this.messageService.getMessage(satellites);
            //return new ResponseEntity<SpaceShip>(resp, HttpStatus.OK);
			return new ResponseEntity<SpaceShip>(HttpStatus.OK);
        } catch (Exception ex) {
        	throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage(), ex);
        }
		
	}
	
}
