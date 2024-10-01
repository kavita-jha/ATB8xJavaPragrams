package Task.Sept_11;

public class ternary_operator_grade_system {
    public static void main(String[] args) {
        int score=87;
        String result= score>=90?"Grade A":score<=89&&score>=70?"Grade B":score<=69&&score>=50?"Grade C":score<=49&&score>=35?"Grade D":"Grade F";
        System.out.print(result);


    }
}
