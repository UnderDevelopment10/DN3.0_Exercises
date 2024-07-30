class Node{
    Task task;
    Node next;
}

public class LinkedList {
    Node head = null;
    LinkedList(){

    }

    public void add(Task t){
        if(head == null){
            head = new Node();
            head.task = t;
            head.next = null;
        }
        else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            Node newNode = new Node();
            newNode.task = t;
            newNode.next = null;
            ptr.next = newNode;
        }
    }
    
    public Task search(int taskId){
        Node ptr = head;
        while(ptr != null){
            if(ptr.task.getId() == taskId){
                return ptr.task;
            }
            ptr = ptr.next;
        }
        System.out.println("Not found!");
        return null;
    }

    public void traverse(){
        Node ptr = head;
        System.out.println("Elements of list:");
        while(ptr != null){
            ptr.task.show();
            ptr = ptr.next;
        }
    }
    public int size(){
        Node ptr = head;
        int n=0;
        while(ptr != null){
            n++;
        }
        return n;
    }

    public Task delete(int id){
        Node ptr = head;
        if(head.task.getId() == id){
            head = head.next;
            return ptr.task;
        }
        Node prev = head;
        ptr = head.next;
        while(ptr.next != null){
            if(ptr.task.getId() == id){
                prev.next = ptr.next;
                return ptr.task;
            }
        }
        System.out.println("Not found!");
        return null;
    }
}
