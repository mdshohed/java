package OOP;

class pertion{
    String s, email;
    int age;
    void details( ) {                         // pertion class ( class one)
        System.out.println("name: "+s);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
    }
}

class tearch extends  pertion{     // first of all i have created class one, then creat second class
    void details2() {               // 2nd class will be called form 1st class . that means any time use from
        details();         // 1st class all access
    }
}

public  class  Inheritance{
    public static void main(String[] args) {
        tearch m = new tearch();
        m.s = "md shohed";
        m.email = "mdshoehd170@gmail.com";
        m.age = 30;
        m.details2();
    }
}
