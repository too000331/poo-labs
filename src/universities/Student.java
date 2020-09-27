package universities;

public class Student {
    String name;
    int age;
    int mark;

    public Student(String studentName, int studentAge){
        name=studentName;
        age=studentAge;
    }
    public void setMark(int mark){
        this.mark=mark;
    }


    public int getMark() {
        return mark;
    }
}
