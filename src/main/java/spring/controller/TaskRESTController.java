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
import spring.domain.Task;
import spring.service.TaskService;

@RestController
public class TaskRESTController {

  @Autowired
  private TaskService taskService;

  @GetMapping("/tasks")
  public List<Task> findAllTasks() {
    return taskService.findAllTasks();
  }

  @GetMapping("/task/{id}")
  public Task findById(@PathVariable Integer id) {
    return taskService.getTask(id);
  }

  @PostMapping("/task/add")
  public Task add(@RequestBody Task task) {
    return taskService.add(task);
  }

  @PutMapping("/task/update/{id}")
  public Task update(@PathVariable int id, @RequestBody Task task) {
    return taskService.update(id, task);
  }

  @PutMapping("/task/done/{id}")
  public Task taskDone(@PathVariable int id) {
    return taskService.taskDone(id);
  }

  @DeleteMapping("/task/delete/{id}")
  public Task delete(@PathVariable Integer id) {
    return taskService.deleteID(id);
  }

}
