package com.rg.eventapp.repositories;

import java.util.List;

import com.rg.eventapp.models.Event;

public interface EventRepository {
	public void save(Event event);

	public List<Event> findAll();
}
