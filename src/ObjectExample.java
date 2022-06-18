public class ObjectExample {
    //Private instance variables
    private String name;
    private int age;

    //Default constructor
    public ObjectExample() {
        name = "ExampleName";
        age = 18;
    }
    //Detailed constructor
    public ObjectExample(String nName, int nAge) {
        name = nName;
        age = nAge;
    }

    //Methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String nName) {
        name = nName;
    }
    public void setAge(int nAge) {
        age = nAge;
    }
    public String toString() {
        return name + " is " + age;
    }
}
