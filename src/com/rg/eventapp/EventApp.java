package com.rg.eventapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rg.eventapp.models.Event;
import com.rg.eventapp.services.EventService;

public class EventApp {

	public static void printEvents(List<Event> events) {
		for (int i = 0; i < events.size(); i++) {
			System.out.println(events.get(i).toString());
		}
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		EventService eventService = (EventService) context.getBean("eventServiceId");

		Scanner sc = new Scanner(System.in);
		String str = "start";
		while (!str.isEmpty()) {
			System.out.println("Please enter your event title");
			str = sc.nextLine();
			if (str.isEmpty()) {
				break;
			}
			Event event1 = new Event(str);
			eventService.add(event1);
		}
		sc.close();
		printEvents(eventService.getAll());

	}

}
