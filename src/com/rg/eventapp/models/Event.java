package com.rg.eventapp.models;

import java.util.Random;

public class Event {

	private String title;
	private Integer id;

	public Event(String title) {
		this.id = new Random().nextInt();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Event [title=" + title + ", id=" + id + "]";
	}

	
	
}
