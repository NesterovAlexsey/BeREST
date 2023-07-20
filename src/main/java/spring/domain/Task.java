package spring.domain;

public class Task {

  private Integer id;
  private String taskDescription;
  private Integer taskEstimate;
  private Boolean taskDone;
  private static int count = 0;

  public Task() {
    }

  public Task(String taskDescription, Integer taskEstimate) {
    this.id = ++count;
    this.taskDescription = taskDescription;
    this.taskEstimate = taskEstimate;
    this.taskDone = false;
  }

  public Integer getId() {
    return id;
  }

  public String getTaskDescription() {
    return taskDescription;
  }

  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }

  public Integer getTaskEstimate() {
    return taskEstimate;
  }

  public void setTaskEstimate(Integer taskEstimate) {
    this.taskEstimate = taskEstimate;
  }

  public Boolean getTaskDone() {
    return taskDone;
  }

  public void setTaskDone(Boolean taskDone) {
    this.taskDone = taskDone;
  }
}
