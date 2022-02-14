public class Animal {
    
    //field 
    String name;
     
    // default Constructors 
    public Animal() { 
        name = "";
    }

    // overloaded constructor with one parameter 
    public Animal(String n) {
        name = n;
    }

    // method
    public void details() {
        System.out.println(" Animal : " + name );
    }
}

