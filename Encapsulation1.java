class Student {
    private String name;
    private int age;

    // Setter methods (without return type)
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    // Display method to print values
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using methods without return type
        s.setName("Deepak Mishra");
        s.setAge(22);

        // Display the data
        s.displayInfo();
    }
}
