package model;

public class Teacher extends User {
    private static Long idGenerator = 1l;
    private Long idTeacher;
    private Disciplines discipline;

    public Teacher(String name, String lastName, Integer bornYear, Disciplines discipline) {
        super(name, lastName, bornYear);
        this.idTeacher = idGenerator++;
        this.discipline = discipline;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    @Override
    public String toString() {
        return "techId " + this.idTeacher  + " " + super.toString();

    }
}
