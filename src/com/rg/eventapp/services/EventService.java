package com.rg.eventapp.services;


import java.util.List;

import com.rg.eventapp.models.Event;
import com.rg.eventapp.repositories.EventRepository;
import com.rg.eventapp.repositories.InMemoryEventRepository;

public class EventService {

	private EventRepository eventRepository;

	public void add(Event event) {
		eventRepository.save(event);
	}

	public List<Event> getAll() {
		return eventRepository.findAll();

	}

	public void setEventRepository(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	
}
