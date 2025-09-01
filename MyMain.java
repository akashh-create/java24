// Define SchoolStudent class
class SchoolStudent {
    int rollNumber;
    String name;

    // constructor
    public SchoolStudent(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // methods
    public void attend_class() {
        System.out.println(name + " (Roll " + rollNumber + ") is attending class.");
    }

    public void give_exam() {
        System.out.println(name + " (Roll " + rollNumber + ") is giving the exam.");
    }

    public void register() {
        System.out.println(name + " (Roll " + rollNumber + ") has registered successfully.");
    }
}

// Main class
public class MyMain {
    public static void main(String[] args) {
        SchoolStudent ss = new SchoolStudent(12, "Akash");
        ss.attend_class();
        ss.give_exam();
        ss.register();
    }
}
