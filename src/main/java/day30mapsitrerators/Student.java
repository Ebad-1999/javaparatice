package day30mapsitrerators;

public class Student {

    public String email;
    public int age;
    public int grade;
    public String nationality;

    public Student(String email, int age, int grade, String nationality) {
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
