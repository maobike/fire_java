package com.fuegodequasar.springboot.web.app.models;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Satellite {
	private String name;
	private double distance;
	private ArrayList<String> message;


}
