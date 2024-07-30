public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Task(1, "Task1", "Complete"));
        list.add(new Task(2, "Task2", "Ongoing"));
        list.add(new Task(3, "Task3", "Ongoing"));
        list.add(new Task(4, "Task4", "Ongoing"));

        list.traverse();
        System.out.println("Deleted element:");
        list.delete(2).show();
        list.traverse();
        
        System.out.println("Searched element:");
        list.search(4).show();
        System.out.println("Searched element:");
        list.search(7);
    }
}
