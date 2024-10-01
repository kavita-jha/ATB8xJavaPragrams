package Task.Sept_11;

public class find_max_using_ternary_op {
    public static void main(String[] args) {
        //Find Maximum of three numbvers
        int num1 =111;
        int num2 =111;
        int num3= 111;
        String s1=num1>num2 && num1>num3?"Number 1 is greatest":num2>num1 && num2>num3?"Number 2 is greatest":num3>num1&&num3>num2?"Number 3 is greatest":"All are equal";
        System.out.println(s1);

    }
}
