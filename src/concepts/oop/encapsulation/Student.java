package concepts.oop.encapsulation;

public class Student {

    private String name;
    private int id;
    private String address;
    private String email;
    private String dateOfBirth;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, String address, String email, String dateOfBirth) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public void registerForClass() {
        System.out.println(this.name + " registered for class");
    }

    public void dropClass() {
        System.out.println(this.name + " dropped class");
    }

    public void getStudentInfo() {
        System.out.println("concepts.oop.encapsulation.Student name is " + this.name + ", and their id is: " + this.id +
                ". They live in " + address + ". Their email address is " + this.email + ". They were born on " +
                this.dateOfBirth + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}