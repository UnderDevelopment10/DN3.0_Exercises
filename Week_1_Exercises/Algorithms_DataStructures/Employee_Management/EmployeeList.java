import java.util.ArrayList;

public class EmployeeList {
    ArrayList<Employee> array;

    EmployeeList(){
        array = new ArrayList<>();
    }

    public void add(Employee emp){
        array.add(emp);
    }
    public Employee search(int empId){
        int n = array.size();
        for(int i=0; i<n; i++){
            if(array.get(i).getId() == empId){
                return array.get(i);
            }
        }
        return null;
    }
    public void traverse(){
        System.out.println("Elements of array:");
        for(Employee x: array){
            x.show();
        }
    }
    public Employee delete(int empId){
        int n = array.size();
        for(int i=0; i<n; i++){
            if(array.get(i).getId() == empId){
                return array.remove(i);
            }
        }
        return null;
    }
}
