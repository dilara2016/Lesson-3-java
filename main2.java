import java.util.*;

class main2{
    public static void main(String[]   args)   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your lucky number: ");
        int lucky = sc.nextInt();
        System.out.println("Hello "+name+", Your lucky number is "+lucky+" Shows you really are hardworking. Keep it up!");
    }
}