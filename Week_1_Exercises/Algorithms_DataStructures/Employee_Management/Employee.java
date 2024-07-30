public class Employee {
    Integer employeeId;
    String employeeName;
    String position;
    Float salary;
    Employee(Integer id, String name, String pos, Float sal){
        employeeId = id;
        employeeName = name;
        position = pos;
        salary = sal;
    }

    public Integer getId(){
        return employeeId;
    }
    public String getName(){
        return employeeName;
    }
    public String getPosition(){
        return position;
    }
    public Float getSalary(){
        return salary;
    }
    public void show(){
        System.out.println(employeeId+"\t"+employeeName+"\t"+position+"\t"+salary+"\t");
    }
}
