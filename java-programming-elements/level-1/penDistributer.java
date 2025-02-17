import java.util.*;
public class PenDistributer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = 14;
        int student = 3;

        int penPerStudent = pens / student;
        int remainingPen = pens % student;

        System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remainingPen);

        sc.close();
    }
}
