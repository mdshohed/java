package OOP;

public class constractor {
    public static void main(String[] args) {
        book ans = new book(5);
        System.out.println(ans.x);
    }
}

class book {
    int x;

    // Constractor
    book( int x ) {
        this.x = x;
    }
}