package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.domain.Coffee;
import spring.service.CoffeeService;

@RestController
public class CoffeeRestController {

  @Autowired
  private CoffeeService coffeeService;

  @GetMapping("/coffees")
  Iterable<Coffee> getCoffees() {
    return coffeeService.getCoffees();
  }

}
