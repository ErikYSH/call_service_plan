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

        // USER INTRO 
        System.out.print("---------------------------------------\n");
        System.out.print("Plan A (Budget) - Ulimited Call , No Text, No Data \nPlan B - Over 500mins Call, Ulimited Text, No Data \nPlan C - Over 500mins Call, 99 Text, No Data \nPlan D - Over 500mins Call, Over 100 Text, No Data \nPlan E - No Call, Ulimited Text, less than 3GB Data Usage \nPlan F - Ulimited Call, Ulimited Text, over 3GB Data Usage \nLet us help you choose! Enter your required Calling, Texting, Data usage. \n");
        System.out.print("---------------------------------------\n");
        
        // USER INPUT
        Scanner in = new Scanner(System.in);
        
         System.out.println("Enter maximum minutes for calling (0-1000 minutes):");
         int inputTalk = in.nextInt();
         talk = inputTalk;

         System.out.println("Enter maximum text message (0-500 messages):");
         int inputText = in.nextInt();
         text = inputText;

         System.out.println("Enter maximum data usage (0-10GB)");
         int inputData = in.nextInt();
         data = inputData;

        // CONDITIONS
        if (talk<500 && text==0 && data==0){
            System.out.printf("Plan A cost $%d/month and is the right choice for you  \n", planA);
        } else if (talk<500 && text>=0 && data ==0){
            System.out.printf("Plan B cost $%d/month and is the right choice for you \n", planB);
        } else if (talk>= 500 && text<100 && data ==0) {
            System.out.printf("Plan C cost $%d/month and is the right choice for you \n", planC);
        } else if (talk>= 500 && text>=100 && data==0) {
            System.out.printf("Plan D cost $%d/month and is the right choice for you \n", planD);
        } else if (talk>= 0 && text>= 0 && data<3) {
            System.out.printf("Plan E cost $%d/month and is the right choice for you \n", planE);
        } else if (talk>=0 && text>=0 && data>=3) {
            System.out.printf("Plan F cost $%d/month and is the right choice for you \n", planF);
        }

    }
}