import java.util.*;
class  With_TryCatchFinally_Block {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("First No. : ");
        a = sc.nextInt();
        System.out.println("Second No. : ");
        b = sc.nextInt();
       try{
            c = a/b;
            System.out.println("Result: "+ c);
       }
       catch (Exception e){
        System.out.println("Problem in divide.");
    }
    System.out.println("Some other work.");
        }
}
