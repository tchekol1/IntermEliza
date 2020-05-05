import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class InterEliza {
    public static void main(String[] args) {
        //replace i with you
        //replace me with you
        //replace my with your
        //replace am with are
        Scanner scanner= new Scanner(System.in);
        HashMap<Integer, String>map= new HashMap<>();
        System.out.println("Good day. What is your problem?");
        System.out.println("Enter your response here or Q to quit:");
        String cont= scanner.nextLine();
        while(!(cont.equalsIgnoreCase("q"))) {
            String []replacment= cont.split(" ");
            for (int i = 0; i <replacment.length ; i++) {
                if(replacment[i].equalsIgnoreCase("i")){
                    replacment[i]="you";
                }
                else if(replacment[i].equalsIgnoreCase("me"))
                    replacment[i]="you";
                else if(replacment[i].equalsIgnoreCase("my")) {
                    replacment[i] = "your";
                }
                else if(replacment[i].equalsIgnoreCase("am")){
                    replacment[i]="are";
                }
            }

            for (int i = 0; i <replacment.length ; i++) {
                System.out.print(replacment[i]+ " ");
            }
            System.out.println();
            System.out.println("Enter your response here or Q to quit:");
            cont = scanner.nextLine();
        }}
}



