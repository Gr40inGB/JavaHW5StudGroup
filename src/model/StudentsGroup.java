package model;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    static Long idGenerator = 1l;
    private Teacher groupTeacher;
    private List<Student> studentList;
    private Long groupId;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student group №").append(this.groupId).append(System.lineSeparator());
        stringBuilder.append("\t").append(this.groupTeacher).append(System.lineSeparator());
        for (Student s: this.studentList             ) {
            stringBuilder.append("\t").append("\t").append(s).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    public StudentsGroup(Teacher groupTeacher, List<Student> studentList) {
        this.groupTeacher = groupTeacher;
        this.studentList = studentList;
        this.groupId = idGenerator++;
    }

    public StudentsGroup(User groupTeacher) {
        if (groupTeacher.getClass().equals(Teacher.class)) {
            this.groupTeacher = (Teacher) groupTeacher;
            this.studentList = new ArrayList<>();
            this.groupId = idGenerator++;
        }
        else {
            System.out.println("Please choose a teacher (not student)");
        }
    }

    public Teacher getGroupTeacher() {
        return groupTeacher;
    }

    public void setGroupTeacher(Teacher groupTeacher) {
        this.groupTeacher = groupTeacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public Long getGroupId() {
        return groupId;
    }
}
