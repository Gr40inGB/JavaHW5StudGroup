import controller.StudentsGroupsController;
import model.Disciplines;
import model.Student;
import model.Teacher;
import service.StudentsGroupService;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // creating users in the console in development
        // now just hard code for manupulate controller



        StudentsGroupsController controller = new StudentsGroupsController();
        controller.createStudentsGroup(new Teacher("Robert","Sapolsky",1957, Disciplines.PHILOSOPHY),
                new ArrayList<>(Arrays.asList(
                        new Student("Ivan", "Inavov", 1986),
                        new Student("Tanya", "Tankova", 1986),
                        new Student("Kirill", "Kirillov", 1986)
                )));

        controller.getGroupsView().start();
    }
}