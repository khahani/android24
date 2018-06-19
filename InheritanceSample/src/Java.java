import model.Student;
import model.Teacher;

public class Java {
    public static void main(String[] args) {
        Teacher khahani = new Teacher();
        khahani.name = "Mohamamdreza";
        khahani.age = 29;

        khahani.walking();

        khahani.start();
        khahani.gaz();
        khahani.gaz();
        khahani.gaz();
        khahani.stop();

        Student st1 = new Student();
        st1.name = "saeed";
        st1.grade = 97.5f;

        st1.walking();
    }
}
