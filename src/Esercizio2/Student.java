package Esercizio2;

import java.util.ArrayList;
import java.time.*;

public class Student {

    String firstName;
    String lastName;
    String birthdate;
    ArrayList<String> grades = new ArrayList<String>();

    public Student(String firstName, String lastName, String birthdate, ArrayList<String> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGrades(ArrayList<String> grades) {
        this.grades = grades;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }

    public void getAge() {
        LocalDate Dob;
        Dob = LocalDate.parse(birthdate);

        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob, currentDate).getYears();
        System.out.println("Age is: " + age);
    }

    public void getAverageGrade() {
        int currentGrade = 0;
        float sumOfGrades = 0;
        int counter = 0;

        for (int i = 0; i < grades.size(); i++) {
            currentGrade = Integer.parseInt(grades.get(i));
            sumOfGrades += currentGrade;
            counter++;
        }

        System.out.println(sumOfGrades/counter);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", grades=" + grades +
                '}';
    }
}
