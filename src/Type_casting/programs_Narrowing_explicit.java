package Type_casting;

public class programs_Narrowing_explicit {
    public static void main(String[] args) {
        long l1=123456789l;
        short s1=(short)l1;
        System.out.println(s1);

        //Another example

        int course_fee=100;
        float gst=18.45f;
        float total=course_fee+gst;
        short s2=(short)total;
        System.out.println(s2);
        // it deletes thebvalue which it can't hold and hold upto the value which it can store

        //Another Example

        float f2=345.654f;
        float f3=4563.654f;
        float f4=f2+f3;
        int i=(int)f4;
        System.out.println(i);
    }
}
