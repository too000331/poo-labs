package universities;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    int foundationYear;
    List<Student> students = new ArrayList<>();

    public University(String univerName, int univerFoundationYear){
        name = univerName;
        foundationYear = univerFoundationYear;
    }

    public void setStudent(Student student){
        students.add(student);
    }

    public float computeAverageMedia(){
        float sumOfGrades = 0;

        for (Student student : students) {
            sumOfGrades += student.getMark();
        }

        return sumOfGrades / students.size();
    }
}
