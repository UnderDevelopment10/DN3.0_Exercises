public class Test{
    public static void main(String[] args) {
        Student student = new Student("Alice", 1, "A");
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);

        studentController.updateView();

        studentController.setStudentName("Bob");
        studentController.setStudentId(3);
        studentController.setStudentGrade("B");

        studentController.updateView();
    }
}