package Esercizio2;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        String firstName = "Andrea";
        String lastName = "Milesi";
        String birthdate = "1995-09-11";
        ArrayList<String> grades = new ArrayList<String>();
        grades.add("20");
        grades.add("20");
        grades.add("30");
        Student st = new Student(firstName, lastName, birthdate, grades);

        st.getAge();
        st.getAverageGrade();

    }
}
