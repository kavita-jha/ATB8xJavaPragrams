package Type_casting;

public class Narrowing_implicit_explicit {
    public static void main(String[] args) {

       //Narrowing implicit (but its not valid it will give error)
        //int num=10;
       // byte b1=num;
        //System.out.println(b1);

        //Narrowing explicit
        int a1= 600;
        byte b1=(byte)a1;
        System.out.println(b1);// It will take only upto his storage value else the data will loose
    }
}
