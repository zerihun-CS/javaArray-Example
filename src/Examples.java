import java.util.Scanner;

public class Examples {

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);
//        String name;
//
//        System.out.println("pleaser insert your name ");
//
//        name  =  input.next();
//
//        System.out.println("hello "+name);
//
//        System.out.println("please insert your date of birth");
//
//        int dob = input.nextInt();
//        int age = 2022-dob;
//
//        // dataType var = (expression)?statement:falseStatement
//        String ageStatus = (age>18)?"your an adult":"you are underage";
//
//        System.out.println("hello "+name+" "+ageStatus);

        boolean condominiumStatusCheck;


        boolean isPreviouslyRegistered;
        boolean isNewlyRegistered;
        boolean hasCriminalRecord;
        boolean hasEnoughSaving;
        float minimumAmountOfSaving = 280_000;






        System.out.println("hello,  insert your name ");

        String name  =  input.next();

        System.out.println("hello "+name+" are you included on the previous registration ? YES/NO ");

        String inputRegistrationStatus = input.next();

        // dataType var = (expression)?statement:falseStatement

        isNewlyRegistered = !(inputRegistrationStatus.equalsIgnoreCase("YEs"));

        isPreviouslyRegistered = !isNewlyRegistered;

        System.out.println("can you insert your saving amount please ? ");
        double savingAmount = input.nextDouble();

        hasEnoughSaving = (savingAmount > minimumAmountOfSaving)?true:false;

        System.out.println("please insert True if you hava a criminal record and false if not ?");
        hasCriminalRecord = input.nextBoolean();

        condominiumStatusCheck = hasEnoughSaving &&
                (isPreviouslyRegistered) || ( isNewlyRegistered && !hasCriminalRecord);


        System.out.println(condominiumStatusCheck);

























    }
}
