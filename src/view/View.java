package view;

public abstract class View implements ViewInterface{
    boolean working;


    public View() {
        this.working = true;
    }

    public void exit(){
        working = false;
    }


}
