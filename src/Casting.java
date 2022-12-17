import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Casting {


    public static void main(String args[]) {
//        Random random = new Random();
//
//       String currency =  NumberFormat.getPercentInstance().format(0.3);
//        System.out.println(currency);
//        System.out.println(  random.nextInt(4, 90));
//    }

//        String percent = NumberFormat.getPercentInstance().format(0.767);
//        String salary = NumberFormat.getCurrencyInstance(Locale.CANADA).format(45.9746523960);
//        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
//        System.out.println(percent);
//        System.out.println(salary);

    //    NumberFormat.getIntegerInstance(Locale.getISOCountries().).format(35);

        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert your age");
        int number = scanner.nextInt();

        int age = 45;

        if(age < 18){
            System.out.println("under age");

        } else if (18< age && 50 > age) {
            System.out.println("you're young " );
        }
        else {
            System.out.println("your old");
        }


        if(number%2==0){
            //even
            if(number >2 && number < 5 ){
                System.out.println(" not weired");
            }

            if(number >6 && number < 20 ){
                System.out.println(" weired");
            }

            if( number > 20 ){
                System.out.println(" weired");
            }

        }
        else{
            System.out.println("weired");
            //odd
        }





    }
}