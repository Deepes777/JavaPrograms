class Driver{
    public static void main(String args[]) {
        A superObj = new A();
        B childObj = new B();

        superObj.x = 10;
        superObj.Showx();

 
        childObj.x = 7;
        childObj.y = 20;
        childObj.Showy();
        childObj.sum();
    }
}

// To inherit a class, you simply incorporate the definition of one class into
// another by using the "extends" keyword

// Points to be noted :
// - multiple inheritacne is not supported in java i.e. You can only specify one superclass for any subclass that you create. 
// -no class can be a superclass of itself
