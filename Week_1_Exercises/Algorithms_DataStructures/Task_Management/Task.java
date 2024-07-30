public class Task {
    Integer taskId;
    String taskName, status;

    Task(int id, String name, String stat){
        taskId = id;
        taskName = name;
        status = stat;
    }
    public Integer getId(){
        return taskId;
    }
    public void show(){
        System.out.println(taskId+"\t"+taskName+"\t"+status);
    }
}
