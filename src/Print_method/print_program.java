package Print_method;

public class print_program {
    public static void main(String[] args) {
        int a=1;
        float f=4.5f;
        byte b =28;
        long l=123456789l;
        double d =34.65;
        char c='A';
        char c1='a';
        String s= "Hello World!";
        // Every variable prints in same line that why we are using print

        System.out.print(a);
        System.out.print(f);
        System.out.print(d);
        System.out.print(l);
        System.out.print(c);
        System.out.print(c1);
        System.out.print(s);

        // But if we want that every variable value prints in different line then we ptintln which means print in next line

        System.out.println();
        System.out.println(a);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(s);



    }
}
