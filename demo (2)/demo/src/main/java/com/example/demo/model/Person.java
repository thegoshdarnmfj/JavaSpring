package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	private final String name;
	private final UUID id;
	public Person(@JsonProperty("name") String name, @JsonProperty("id") UUID id) {
		this.name = name;
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public UUID getId() {
		return id;
	}

}
