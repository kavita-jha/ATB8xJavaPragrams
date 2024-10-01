package operators;

public class Ternary_opertaor {
    public static void main(String[] args) {
        //using 3 operands
        //syntax(condition?if true:if false);
        int age=25;
        int b=(age>=18? 10:20);
        System.out.println(b);

        //another example
        int tushar=4;
        int prabhu=7;
        String result=tushar>prabhu?"tushar won":"Prabhu won";
        System.out.println(result);

        //max and min between two numbers
        int num1=20;
        int num2=40;
        String s1=num1>num2?"Number 1 id maximun":"Number 2 is maximun";
        System.out.println(s1);


    }
}
