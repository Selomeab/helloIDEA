import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your favorite number?");
        //String name = scanner.nextLine();

            double num = 0;
            try{
            num = scanner.nextDouble();
        }catch (Exception e){
            System.out.printf(num + "is not a number");
            System.exit(0);
        }
        System.out.printf(num + "is a number");



    }//end constructor
}//end Main