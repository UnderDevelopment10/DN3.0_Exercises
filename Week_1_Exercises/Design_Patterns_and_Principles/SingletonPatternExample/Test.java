public class Test {
    public static void main(String[] args) {
        Logger ob1 = Logger.getInstance();
        Logger ob2 = Logger.getInstance();

        ob1.log("This is the first log message.");
        ob2.log("This is the second log message.");

        if (ob1 == ob2) {
            System.out.println("ob1 and ob2 are the same instance.");
        } else {
            System.out.println("ob1 and ob2 are different instances.");
        }
    }
}
