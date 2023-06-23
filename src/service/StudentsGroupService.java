package service;

import model.Student;
import model.StudentsGroup;
import model.Teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsGroupService implements StudentsGroupServiceInterface {

    // all groups - Long->ID
    Map<Long, StudentsGroup> studentsGroupMap;

    public StudentsGroupService() {
        // then i'll implement deploy from database - imitation in JSON
        this.studentsGroupMap = new HashMap<>();
    }

    @Override
    public StudentsGroup getStudentsGroup(Long id) {
        return studentsGroupMap.get(id);
    }

    @Override
    public void createStudentsGroup(Teacher teacher, List<Student> studentList) {
        StudentsGroup tempLink = new StudentsGroup(teacher, studentList);
        this.studentsGroupMap.put(tempLink.getGroupId(), tempLink);
    }

    @Override
    public String showAll() {
        StringBuilder sb = new StringBuilder();
        for (StudentsGroup sGroup : this.studentsGroupMap.values()) {
            sb.append(sGroup);
        }
        return sb.toString();
    }

    @Override
    public void deleteStudentGroup(Long id) {

    }
}
