//CMSC 203
//Instructor: Robert Alexander
//Name : Tariq Shaath


import java.util.Scanner;

public class WifiDiagnosis
{
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);
        //Explaining the program to the user
        System.out.println("If you have a problem with the internet connectivity this WiFi Diagnosis might work.");

        //Walking the user through the steps
        System.out.println("Reboot your computer and try to connect.");

        //Asking the user to input
        System.out.println("Did that fix the problem? (yes or no)");

        //Declaring variables
        String userAnswer;

        //Reading the user input
        userAnswer=keyboard.nextLine();

        if (userAnswer.charAt(0)=='y'||userAnswer.charAt(0)=='Y')
        {
            System.out.println("Done. You now have an internet connection");
        }
        else if(userAnswer.charAt(0)=='n'||userAnswer.charAt(0)=='N')
        {
            System.out.println("Reboot your router and try to connect.");
            System.out.println("Did that fix the problem? (yes or no)");

            userAnswer=keyboard.nextLine();

            if (userAnswer.charAt(0)=='y'||userAnswer.charAt(0)=='Y')
            {
                System.out.println("Done. You now have an internet connection");
            }
            else if(userAnswer.charAt(0)=='n'||userAnswer.charAt(0)=='N')
            {
                System.out.println("Make sure the cables connecting the router are firmly"+
                        " plugged in and and power is getting to the router.");
                System.out.println("Did that fix the problem? (yes or no)");

                userAnswer=keyboard.nextLine();

                if (userAnswer.charAt(0)=='y'||userAnswer.charAt(0)=='Y')
                {
                    System.out.println("Done. You now have an internet connection");
                }
                else if(userAnswer.charAt(0)=='n'||userAnswer.charAt(0)=='N')
                {
                    System.out.println("Move the computer closer to the router and try to connect.");
                    System.out.println("Did that fix the problem? (yes or no)");

                    userAnswer=keyboard.nextLine();

                    if (userAnswer.charAt(0)=='y'||userAnswer.charAt(0)=='Y')
                    {
                        System.out.println("Done. You now have an internet connection");
                    }
                    else if(userAnswer.charAt(0)=='n'||userAnswer.charAt(0)=='N')
                    {
                        System.out.println("You will have to contact ISP");
                        System.out.println("DONE");
                    }

                }
            }

        }



    }
}
