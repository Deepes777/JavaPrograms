public class Dog extends Animal {
    String breed;
    String colour;
    // default Constructor
    public Dog() {
        super();
        breed = "";
        colour = "";
    }

    // Constructor with one argument 
    public Dog(String b) {
        super();
        breed = b;
    }
    
    // Constructor with two argument
    public Dog(String b, String c) {
        this(b); // constructor chaining
        colour = c;
    }

    public Dog(String n, String b, String c) {
        this(b,c);
        name = n;
    }


    public void details() {
        super.details();
        System.out.println(" Breed : " + breed);
        System.out.println(" Colour : " + colour);
        System.out.println("\n"); 
    }
}