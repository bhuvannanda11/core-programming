import java.util.Scanner;

public class VoteCheckerL2 {
    public static boolean canStudentVote(int age){
        if(age < 0){
            return false;
        }
        if(age >=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age[] = new int[10];
        for(int i=0;i<age.length;i++){
            age[i] = sc.nextInt();
        
            if(canStudentVote(age[i])){
                System.out.println("Student " +(i + 1) + " can vote");
            }
            else{
                System.out.println("Student " +(i + 1)+" cannot vote");
            }
        }

        sc.close();
    }
}
