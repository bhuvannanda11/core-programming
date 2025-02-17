import java.util.*;
public class StudentVoteL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the age of the students :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                System.out.println("Invalid Age "+arr[i]);
            }
            else if(arr[i] >= 18){
                System.out.println("The student with the age "+arr[i]+" can vote");
            }
            else{
                System.out.println("The student with the age "+arr[i]+" cannot vote");
            }
        }

        sc.close();
    }
}