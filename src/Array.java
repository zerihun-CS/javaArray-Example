import java.util.Arrays;

public class Array {

    public static void main(String args[]){
// String studentList[]= new String[4];
       String studentList[]={"jonnas","hermela","kira","Meriam","Eyerus","Abel","Hego","hanna","zerihun","alex","dav","asede"};

        String javaStudentList[][]= new String[3][4];


       System.arraycopy(studentList, 3, javaStudentList[1],0,4);

        System.out.println(Arrays.deepToString(javaStudentList));





       String studentList2[][] = {{"Meriam","Eyerus"},{"Abel","Hego"}};

//        System.out.println(studentList2[0][1]);
//
//
//        System.out.println(Arrays.deepToString(studentList2));
//
//        System.out.println(Arrays.toString(studentList));
        System.out.println(studentList.length);

//        studentList[0] = "Meriam";
//        studentList[1] = "Eyerus";
//        studentList[2] = "Abel";
//        studentList[3] = "Hego";



    }
}
