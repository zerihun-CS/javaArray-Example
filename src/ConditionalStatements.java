import java.util.Scanner;

public class ConditionalStatements {

    public static  void main(String args[]){

        Scanner scanner  = new Scanner(System.in);


        System.out.println("please insert DOB");
        int age  = (2022- scanner.nextInt());
        int yearsOfExperience = 0;
        if(age < 50 ){

            System.out.println("do you have previous travel history");
            String travelHistory = scanner.next();
            System.out.println("do have any work experience");
            String experience = scanner.next();
            if( experience.equalsIgnoreCase("yes")){
                System.out.println("number of years of the experience");
                 yearsOfExperience = scanner.nextInt();

            }
            System.out.println("do you have A criminal Record");
            String record = scanner.next();

            if(record.equalsIgnoreCase("yes") && yearsOfExperience> 4){
                System.out.println("your request to viza has been approved");
            } else if ((record.equalsIgnoreCase("no")|| experience.equalsIgnoreCase("no")) && travelHistory.equalsIgnoreCase("yes")) {
                System.out.println("your request to viza has been approved");
            }

            } else {
                System.out.println("your request to viza has been rejected");
            }


    }
}
