package controller;

import model.Student;
import model.StudentsGroup;
import model.Teacher;
import service.StudentsGroupService;
import view.StudentsGroupsView;
import view.View;

import java.util.List;

public class StudentsGroupsController {
    private StudentsGroupService studentsGroupService;
    private View groupsView;

    public View getGroupsView() {
        return groupsView;
    }

    public StudentsGroupsController() {
        this.studentsGroupService = new StudentsGroupService();
        this.groupsView = new StudentsGroupsView(this);
    }

    public StudentsGroupService getStudentsGroupService() {
        return studentsGroupService;
    }

    public void createStudentsGroup(Teacher teacher, List<Student> studentList) {
        getStudentsGroupService().createStudentsGroup(teacher,studentList);
    }
}
