package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private List<Course> courses = new ArrayList<>();
    private List<Classroom> classrooms = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public String getUniversityName() {
        return universityName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
        //Bir kişinin kitap okumasını simule edecek şekilde reader ,book ,author sınıflarını uygun özellikler set/get ve gerekli diğer metotları kullanarak oluşturun
    }
}
