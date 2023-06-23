package model;

public class Student extends User {
    static Long idGenerator = 1l;
    Long idStudent;
//    private StudentsGroup studentGroup;

    public Student(String name, String lastName, Integer bornYear) {
        super(name, lastName, bornYear);
        this.idStudent = idGenerator++;
//        this.studentGroup = studentGroup;
    }

//    public StudentsGroup getStudentGroup() {
//        return studentGroup;
//    }

//    public void setStudentGroup(StudentsGroup studentGroup) {
//        this.studentGroup = studentGroup;
//    }

    @Override
    public String toString() {
        return "stId " + idStudent + " " + super.toString();
    }
}
