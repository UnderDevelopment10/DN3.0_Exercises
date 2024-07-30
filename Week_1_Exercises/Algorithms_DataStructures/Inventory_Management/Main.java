public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.add(new Product(1, "Prod1", 2, 1000f));
        inv.add(new Product(2, "Prod2", 5, 2000f));
        inv.add(new Product(3, "Prod3", 1, 1700f));
        inv.display();
        inv.get(3).show();
        inv.delete(3);
        inv.display();
        inv.update(2, null, 1000, null);
        inv.display();
    }
}
