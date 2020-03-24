package com.rg.eventapp.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rg.eventapp.models.Event;

public class InFileEventRepository implements EventRepository {

	private Map<Integer, Event> eventMap = new HashMap<>();

	@Override
	public void save(Event event) {

		eventMap.put(event.getId(), event);

	}

	@Override
	public List<Event> findAll() {

		return new ArrayList<>(eventMap.values());

	}
}
