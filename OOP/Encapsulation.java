package OOP;

public class Encapsulation {
    public static void main(String[] args) {
        student m = new student();
        m.setName("mdshohed");
        System.out.println(m.getname());     // form the class private valute not use
        m.setage(100);                      // i can use first of all constructor
        System.out.println(m.getage());    // create then form the public value to private
    }
}

// Encapsulation class...
class student{
    private  String a ;
    private  int b;
    public void setName( String a) {
        this.a = a;
    }
    public  String getname(){
        return a;
    }
    public void setage( int b) {
        this.b = b;
    }
    public  int getage(){
        return b;
    }
}
