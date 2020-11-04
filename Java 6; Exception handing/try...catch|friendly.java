

package Javacode;
public class Codechef {
    public static void main(String[] args) {
      
         try {       // main function call
           int ara[] = {4,5,3,4,2};
           System.out.println(ara[3]);
         }catch (IndexOutOfBoundsException e) {
          System.out.println("IndexOutOfBoundsException: "+e.getMessage());
        }
      
        // another way call...
        try_catch x = new try_catch();
        x.chack();
    }
}
class try_catch{
    public int[] ara = new int[10];
    public void chack(){
        try {
            ara[45] = 555;				    // whenever, we give wrong input for any value 
            System.out.println(ara[6]);     //  when we use try method, which try to do catch 
            								// and return message 
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException: "+e.getMessage());
        }catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException: "+ e2.getMessage());
        }
    }
}
