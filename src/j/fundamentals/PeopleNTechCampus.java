package j.fundamentals;

public class PeopleNTechCampus {

    private static String address = "3010 31st street, 11103 NY";
    private static String president = "Abu Hanip";
    private String[] classes;
    private int numOfStudents;
    private int numOfTeachers;
    private boolean isCampusOpen;

    public PeopleNTechCampus() {
        this.classes = new String[2];
        this.classes[0] = "Selenium";
        this.classes[1] = "UFT";
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getNumOfTeachers() {
        return numOfTeachers;
    }

    public void setNumOfTeachers(int numOfTeachers) {
        this.numOfTeachers = numOfTeachers;
    }

    public boolean isCampusOpen() {
        return isCampusOpen;
    }

    public void setCampusOpen(boolean campusOpen) {
        isCampusOpen = campusOpen;
    }
}
