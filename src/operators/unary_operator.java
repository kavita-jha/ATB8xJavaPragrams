package operators;

public class unary_operator {
    public static void main(String[] args) {
        //Both initialization are same whether we add + sign or not
        int a = 65;
        int a1 =+65;
        System.out.println(a);
        System.out.println(a1);

        //But we need to assign or declare (-) if the value is negative
        int b= -45;
        System.out.println(b);

        // Add sign concatenate the string
        String s1="Kavita";
        String s2= "Jha";
        System.out.println(s1 + s2);

        //add sign two values in terms of integer
        System.out.println(a+b);

        //interview Question

        System.out.println(s1+s2+a+b);  //in this string and integer value will concatenate all together
        System.out.println(a+b+s1+s2);  // in this value add first and then string concatenete
        System.out.println(s1+s2+(a+b));  // in this string concatenate first and then integer value added


    }
}
