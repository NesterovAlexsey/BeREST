package spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.domain.Event;
import spring.service.EventService;

@RestController
public class EventRestController {

  @Autowired //analog constructor
  private EventService eventService;

  @GetMapping("/events")
  public List<Event> findAll() {
    return eventService.findAll();
  }

  @GetMapping("/event/{id}")
  //
  public Event findById(@PathVariable Integer id) {
    return eventService.get(id);
  }

  @PostMapping("/event/add")
  //объект будет взят из тела запроса
  public Event add(@RequestBody Event event) {
    return eventService.add(event);
  }

  @PutMapping("/event/update/{id}")
  public Event update(@PathVariable int id, @RequestBody Event event) {
    return eventService.update(id, event);
  }

  @DeleteMapping("/event/delete/{id}")
  public Event delete(@PathVariable Integer id) {
    return eventService.delete(id);
  }
}
