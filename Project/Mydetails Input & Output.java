import java.util.Scanner;

class student{
    static  String versity = "Southeast University";
    int id;
    String name , email;
    student( int id ,String name, String email) {
        this.id = id;
        this.name  = name;
        this.email = email;
    }
    void output(){
        System.out.println("University: "+versity);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Id: "+id);
    }
}
public  class first{
    static  Scanner input = new Scanner( System.in);
    public static void main(String[] args) {
        String name = input.nextLine();
        String email = input.nextLine();
        int id = input.nextInt();
        student my = new student(id, name, email);
        my.output();
    }
}
