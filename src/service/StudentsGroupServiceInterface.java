package service;

import model.Student;
import model.StudentsGroup;
import model.Teacher;

import java.util.List;
import java.util.Map;

public interface StudentsGroupServiceInterface {
    StudentsGroup getStudentsGroup(Long id);
    public void createStudentsGroup(Teacher teacher, List<Student> studentList);
    public String showAll();
    public void deleteStudentGroup(Long id);
}
