package university;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("CourseName");
        Course course2 = new Course("courseName1");

        Classroom classroom1 = new Classroom(List.of(course1, course2));

        University university = new University("Düzce üni");

        university.addClassroom(classroom1);
        university.addCourse(course1);
        university.addCourse(course2);

        university.getCourses();
        university.getClassrooms();
        university.getUniversityName();

    }
}
