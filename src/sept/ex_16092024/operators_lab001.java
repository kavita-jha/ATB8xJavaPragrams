package sept.ex_16092024;

public class operators_lab001 {
    public static void main(String[] args) {
        //assignment operator== when we are assigning the value to the variable

        // Also a urnary operator which requires only one operand or variable
        int a =+34;
        System.out.println(a);

        int b =-4;
        System.out.println(b);

        // assignment operator in string
         String s1="Kavita ";
         String s2="jha";
         System.out.println(s1+s2); // it will concatenete in string datatype

        // Airthmetic operator(+,--,*,/,%)

        int a1 =10;
        int b1=7;

        System.out.println(a1+b1);
        System.out.println(a1-b1);
        System.out.println(a1*b1);
        System.out.println(a1/b1);
        System.out.println(a1%b1); // gives yu the remainder

        //int enum=10------- enum is a keyword and cannot be use as a identifier
               // System.out.println(enum);

        //interview Question
        System.out.println(s1+s2+a+b); // it will just concatenate the string integer
        System.out.println(a+b+s1+s2); // it will first add the integer and the concatenate the string
        System.out.println(s1+s2+(a+b)); // it will concatenate the string and add the integer






    }
}
