package assignmentOne;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public void input(){
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){


            //taking a user input 

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter end to break\n Enter mean for mean\n enter array to create one");
            int mean = 0;
            int count = 0;

            String operation = myObj.nextLine();


            switch (operation){

                //Adding a case where a use want to break out of the loop

                case "end":
                    break;

                //Taking array elements from the user
                case "array":
                    while(true){
                        Scanner myObjNum = new Scanner(System.in);  // Create a Scanner object
                        System.out.println("enter the number");
                        String number = myObjNum.nextLine();

                        if(number.equals("end")){
                            break;
                        }

                        numbers.add(Integer.parseInt(number));
                        count += 1;
                        
                    }

                 //returnig mean to the user

                case "mean":
                    for (int num : numbers) {
                        mean = (mean + num) / count;
                    }
                    System.out.println(mean);

                 //returnig variance to the user

                case "variance":
                    double sumSquaredDiff = 0;

                    for (int num : numbers) {
                        mean = (mean + num) / count;
                    }
                    for(int num: numbers){
                        sumSquaredDiff += Math.pow(num - mean, 2);

                    }
                    double variance = sumSquaredDiff / count;
                    System.out.println(variance);

                    
            }
        }


    }
}

