package operators;

public class Relation_operator {
    public static void main(String[] args) {

        // Checks the condition and gives the value "True" or "false" according to the condition
        int a=67;
        int b =45;
        boolean c=a>b;
        boolean c1=a<b;
        boolean c2=a>=b;
        boolean c3= a<=b;
        boolean c4= a==b;
        boolean c5 =a!=b;
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        boolean t =true;
        System.out.println(t);
        System.out.println(!t);
        System.out.println(!(!t));
        System.out.println(!!!(t));
        System.out.println(!!!!(!t));

        // Interview question
        int n =12;
        boolean bl=(a>10&&a>15); // in and condition both the condition shoul;d true
        System.out.println(bl);

        boolean b2=(a<8||a>8);  // in or any one them should true
        System.out.println(b2);

        char y= 'A';
        char z='B';
        int x=y+z;
        System.out.println(x);


        System.out.println('A'==65); //ASCII

        short r=10;
        char r1='C';
        System.out.println(r+r1);


    }
}
