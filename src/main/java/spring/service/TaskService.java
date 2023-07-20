package spring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import spring.domain.Task;

@Service
public class TaskService {

  static List<Task> todoList = new ArrayList<Task>();

  {
    todoList.add(new Task("Do Java homework: code Todo list", 2));
    todoList.add(new Task("Create postman auto-test collection", 1));
    todoList.add(new Task("Read Spring Boot book", 1));
    todoList.add(new Task("looking for possible final backend project", 1));
  }

  public List<Task> findAllTasks() {
    return todoList;
  }

  public Task getTask(int id) {
    for (Task task : todoList) {
      if (task.getId() == id) {
        return task;
      }
    }
    return null;
  }

  public Task add(Task task) {
    Task newTask = new Task(task.getTaskDescription(), task.getTaskEstimate());
    todoList.add(newTask);
    return newTask;
  }

  public Task update(int id, Task task) {
    Task updTask = getTask(id);
    if (updTask != null) {
      updTask.setTaskDescription(task.getTaskDescription());
      updTask.setTaskEstimate(task.getTaskEstimate());
    }
    return updTask;
  }

  public Task taskDone(int id) {
    Task doneTask = getTask(id);
    if (doneTask != null) {
      doneTask.setTaskDone(true);
    }
    return doneTask;
  }

  public Task deleteID(int id) {
    Task delTask = getTask(id);
    if (delTask != null) {
      todoList.remove(delTask);
    }
    return delTask;
  }
}
