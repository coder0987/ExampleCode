/*
* To  test this code out, open the terminal and run (NOTE: you must be in the correct directory. If it doesn't work, try cd src)
javac Main.java
java Main
* */

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method");
        //This is where the program runs.

        //Object example:
        ObjectExample oe = new ObjectExample(); //Default constructor
        System.out.println(oe);//Implicit toString() call
        oe.setAge(50);
        System.out.println(oe);

        ObjectExample otherObject = new ObjectExample("other",17);//Detailed constructor
        System.out.println(otherObject);
        otherObject.setName("this other object");
        System.out.println(otherObject);
        System.out.println(oe);
        //Notice how changing otherObject's name did not change oe's name
        System.out.println(oe.getAge());

        /*Expected results:
        Main method
        ExampleName is 18
        ExampleName is 50
        other is 17
        this other object is 17
        ExampleName is 50
        50
        */
    }
}
