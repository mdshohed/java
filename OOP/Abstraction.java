package OOP;

public class Abstraction {
    public static void main(String[] args) {
        tusar obj = new tusar();
        obj.print();
    }
}

abstract class abs_class{
    public abstract  void print(); //this class can't possible to access form the main function.
}
abstract class shohed {
    public void run() {
        System.out.println("Run");
    }
    public  void input() {
        System.out.println("Input");
    }
    public abstract void print();
}

class tusar {
    public void print() {
        System.out.println( "mdshohed");
    }
}

// If atleast one function is abstract then this function whole class will be abstract.