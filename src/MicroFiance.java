import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class MicroFiance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float carInterestRate = 0.08F;
        float businessInterestRate = 0.13F;
        float houseInterestRate = 0.15F;
        double totalAmount = 0;

                System.out.println("how many years have you been a member ?");
        int savingYear  = scan.nextInt();

        if(savingYear > 6){
            // rest logic
            System.out.println("can you please insert your saving amount ?");
            float savingAmount = scan.nextFloat();
            System.out.println("please insert the loan amount ?");
            float loanAmount = scan.nextFloat();
            if((savingAmount * 4) >= loanAmount ){

                System.out.println("please insert the amount of years to return the loan ?");
                int returnYears = scan.nextInt();
                System.out.println("please pick on of the following loan types");
                System.out.println("1 business /n 2 Car /n 3 House ");
                String loanType = scan.next();
                double perMonthAmount = totalAmount/(returnYears*12);

                if(loanType.equalsIgnoreCase("business") || loanType.equalsIgnoreCase("1")){
                     totalAmount = loanAmount+((businessInterestRate* loanAmount)*returnYears);
                    System.out.println("your total loan amount plus the interest rate is for "+returnYears+"years is: "+totalAmount);
                    System.out.println("your payable amount per month is "+perMonthAmount);
                } else if (loanType.equalsIgnoreCase("car") || loanType.equalsIgnoreCase("2")) {
                     totalAmount = loanAmount+((carInterestRate* loanAmount)*returnYears);
                    System.out.println("your total loan amount plus the interest rate is for "+returnYears+"years is: "+totalAmount);
                    System.out.println("your payable amount per month is "+perMonthAmount);

                } else if (loanType.equalsIgnoreCase("house") || loanType.equalsIgnoreCase("3")) {
                     totalAmount = loanAmount+((houseInterestRate* loanAmount)*returnYears);
                    System.out.println("your total loan amount plus the interest rate is for "+returnYears+" years is:"+totalAmount);
                    System.out.println("your payable amount per month is "+perMonthAmount);
                }
                else {
                    System.out.println("please insert the appropriate input ");
                }


            }else{
                System.out.println("please try to insert in the range of "+savingAmount*4);
            }
        }
        else{
            System.out.println("sorry you are not eligible to take a lone ");
        }





    }

}
