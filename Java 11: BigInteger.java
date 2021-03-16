import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int n = in.nextInt();

        BigInteger f = new BigInteger( "1");

        for (int i = 2; i<=n; i++ ) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println( f);
    }
}
