import java.util.Scanner;

public class Service {
    public static void main (String[] args) {
        // PLANS
        int planA = 49;
        int planB = 55;
        int planC = 61;
        int planD = 70;
        int planE = 79;
        int planF = 87;

        // USER INPUT VARIABLE 
        int talk = 0;
        int text = 0;
        int data = 0;

        /*
         * input variable for Talk, Text, Data
         * prompt user maximium minut of Talk
         * prompt user maximum Text message
         * prompt user maximum Data usage
         */

         Scanner in = new Scanner(System.in);

         System.out.println("Enter maximum minutes for talk data (0-1000 minutes):");
         int inputTalk = in.nextInt();
         talk = inputTalk;

         System.out.println("Enter maximum text message (0-500 messages):");
         int inputText = in.nextInt();
         text = inputText;

         System.out.println("Enter maximum data usage (0-10GB)");
         int inputData = in.nextInt();
         data = inputData;

        if (talk<500 && text==0 && data==0){
            System.out.printf("Plan A cost $%d and is the right choice for you  \n", planA);
        } else if (talk<500 && text>=0 && data ==0){
            System.out.printf("Plan B cost $%d and is the right choice for you \n", planB);
        } else if (talk>= 500 && text>=0 && data ==0) {
            System.out.printf("Plan C cost $%d and is the right choice for you \n", planC);
        } else if (talk>= 500 && text>=100 && data==0) {
            System.out.printf("Plan D cost $%d and is the right choice for you \n", planD);
        } else if (talk>= 0 && text>= 0 && data<=3) {
            System.out.printf("Plan E cost $%d and is the right choice for you \n", planE);
        } else if (talk>=0 && text>=0 && data>=3) {
            System.out.printf("Plan F cost $%d and is the right choice for you \n", planF);
        }

    }
}