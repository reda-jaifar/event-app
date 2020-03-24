package com.rg.eventapp.repositories;

import java.util.ArrayList;
import java.util.List;

import com.rg.eventapp.models.Event;

public class InMemoryEventRepository implements EventRepository {

	private List<Event> eventList = new ArrayList<>();

	@Override
	public void save(Event event) {

		eventList.add(event);

	}

	@Override
	public List<Event> findAll() {

		return eventList;

	}

}
