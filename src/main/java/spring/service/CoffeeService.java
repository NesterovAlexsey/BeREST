package spring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import spring.domain.Coffee;

@Service
public class CoffeeService {
  static List<Coffee> coffees = new ArrayList<>();
  {
    coffees.add(new Coffee("Café Cereza"));
    coffees.add(new Coffee("Café Ganador"));
    coffees.add(new Coffee("Café Lareño"));
    coffees.add(new Coffee("Café Três Pontas"));

  }

  public Iterable<Coffee> getCoffees() {
    return coffees;
  }
}
