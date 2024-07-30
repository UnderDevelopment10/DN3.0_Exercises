public class Test {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .setStorage("1TB HDD")
                .build();

        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println("Basic Computer: ");
        basicComputer.show();
        System.out.println("Gaming Computer: ");
        gamingComputer.show();
    }
}
