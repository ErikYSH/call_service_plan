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
            System.out.printf("Plan A is the right choice for you cost $%d \n", planA);
        } else if (talk<500 && text>=0 && data ==0){
            System.out.printf("Plan B is the right choice for you cost $%d \n", planB);
        } else if (talk>= 500 && text>=0 && data ==0) {
            System.out.printf("Plan C is the right choice for you cost $%d \n", planC);
        } else if (talk>= 500 && text<100 && data==0) {
            System.out.printf("Plan C is the right choice for you cost $%d \n", planC);
        } else if (talk>= 500 && text>=0 && data==0) {
            System.out.printf("Plan C is the right choice for you cost $%d \n", planC);
        } else (talk>= 500 && text>=0 && data==0) {
            System.out.printf("Plan C is the right choice for you cost $%d \n", planC);
        }


         



    }
}