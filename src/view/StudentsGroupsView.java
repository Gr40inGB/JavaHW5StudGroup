package view;

import controller.StudentsGroupsController;
import model.StudentsGroup;

import java.util.Scanner;

public class StudentsGroupsView extends View {
    private StudentsGroupsController controller;
    Scanner scanner;

    public StudentsGroupsController getController() {
        return controller;
    }

    public StudentsGroupsView(StudentsGroupsController controller) {
        super();
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    @Override
    public void start() {
        System.out.println("menu for view in development - i will finished in homeWork 6 - in presenter type");
        while (working) {

            Integer selected = inputData("1 - show all\n2 - exit\n>>>> ", 2);
            if (selected == 1) {
                System.out.println(getController().getStudentsGroupService().showAll());
            }
            if (selected == 2) exit();

        }
    }

    @Override
    public void showInfo(String info) {
        System.out.println(info);
    }

    public Integer inputData(String welcome, Integer maxvalue) {
        boolean inputError = true;
        int rezult = 0;
        while (inputError) {
            System.out.print(welcome);
            try {
                rezult = Integer.parseInt(scanner.nextLine());
                if (rezult <= maxvalue && rezult > 0) {
                    inputError = false;
                } else System.out.print("Choose between 1-" + maxvalue + "\n>>>> ");
            } catch (NumberFormatException nfe) {
                System.out.println("error - try again:");
            }
        }
        return rezult;
    }

}
