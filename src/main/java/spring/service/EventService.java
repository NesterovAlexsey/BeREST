package spring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import spring.domain.Event;

@Service
public class EventService {
  static List<Event> events = new ArrayList<Event>();
  {
    events.add(new Event("Opera", "London"));
    events.add(new Event("Violin concert", "Prague"));
    events.add(new Event("Jazz concert", "Berlin"));
  };

  public List<Event> findAll() {
    return events;
  }

  public Event get(int id) {
    for (Event e : events) {
      if (e.getId() == id) {
        return e;
      }
    }
    return null;
  }

  public Event add(Event event) {
    Event newEvent = new Event(event.getName(), event.getCity());
    events.add(newEvent);
    return newEvent;
  }

  public Event update(int id, Event event) {
    Event updEvent = get(id);
    if (updEvent != null) {
      updEvent.setName(event.getName());
      updEvent.setCity(event.getCity());
    }
    return updEvent;
  }

  public Event delete(int id) {
    Event event = get(id);
    if (event != null) {
      events.remove(event);
    }
    return event;
  }
}
