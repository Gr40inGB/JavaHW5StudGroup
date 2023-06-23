package model;

import java.text.SimpleDateFormat;
import java.time.Year;

public abstract class User {
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
    private String name;
    private String lastName;
    private Integer bornYear;


    public User(String name, String lastName, Integer bornYear) {
        this.name = name;
        this.lastName = lastName;
        this.bornYear = Year.now().getValue() > bornYear ? bornYear : Year.now().getValue();
    }

    public Integer getAge() {
        return Year.now().getValue() - this.bornYear;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + getAge() + " y.o.";
    }
}
