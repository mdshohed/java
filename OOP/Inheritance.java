package OOP;


public  class  Inheritance{
    public static void main(String[] args) {
        tearch m = new tearch();
        m.s = "md shohed";
        m.email = "mdshoehd170@gmail.com";
        m.age = 30;
        m.details2();
        System.out.println();

        c s = new c();
    }
}

class pertion{
    // super class parent
    String s, email;
    int age;
    public void details( ) {
        System.out.println("name: "+s);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
    }
}

class tearch extends  pertion{
    // sub class child

    public void details2() {
        details();
    }
}

 class a {
    public a() {
        System.out.println( "Teacher");
    }
    public a( int x) {
        System.out.println( "total Teacher " + x);
    }

    protected void print() {
    }
}

class b extends a {
    public b() {
        System.out.println( "Student");
    }
    public  b( int x) {
        System.out.println( "Total student: "+x);
    }
}
class c extends b{
    public c(){
        System.out.println("Teacher and student");
    }
}