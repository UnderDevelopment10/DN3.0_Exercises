public class Main {
    public static void main(String[] args) {
        EmployeeList emps = new EmployeeList();
        emps.add(new Employee(1, "Bob", "Manager", 20000f));
        emps.add(new Employee(2, "Jack", "Developer", 10000f));
        emps.add(new Employee(3, "Peter", "Clerk", 5000f));
        emps.add(new Employee(4, "William", "Developer", 10000f));
        emps.add(new Employee(5, "Tim", "Tester", 8000f));

        System.out.println("Searched employee:");
        emps.search(3).show();
        emps.traverse();
        System.out.println("Deleted employee:");
        emps.delete(3).show();
        emps.traverse();
    }
}
