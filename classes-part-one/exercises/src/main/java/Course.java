import java.util.ArrayList;

public class Course {
    private String courseName;
    private String teacherName;
    private ArrayList<Student> studentsEnrolled;

    public Course(String aCourseName, String aTeacherName) {
        this.courseName = aCourseName;
        this.teacherName = aTeacherName;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled){
        this.studentsEnrolled = studentsEnrolled;
    }

}
