package Type_casting;

public class widening_implicit_explicit {
    public static void main(String[] args) {
        // widening implicit
        byte a=10;
        int b=a;
        System.out.println(b);


        // Widening explicit
        byte a1= 20;
        int b1= (int) a1;
        System.out.println(b1);

        int a3=23;
        float f1=(float)a3;
        System.out.println(f1);


    }
}
