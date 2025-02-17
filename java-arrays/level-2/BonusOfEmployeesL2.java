import java.util.*;
public class BonusOfEmployeesL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary[] = new double[10];
        double yearsOfService[] = new double[10];
        double bonusAmount[] = new double[10];
        double newSalary[] = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for(int i=0;i<10;i++){
            while(true){
                salary[i] = sc.nextDouble();
                if(salary[i] <=0){
                    System.out.println("Invalid salary");
                    continue;
                }
                yearsOfService[i] = sc.nextDouble();
                if(yearsOfService[i] < 0){
                    System.out.println("Invalid years of service");
                    continue;
                }
                break;
            }
        }

        for(int i=0;i<10;i++){
            if(yearsOfService[i] > 5){
                bonusAmount[i] = salary[i] * 0.05; // 5% Bonus
            } 
            else{
                bonusAmount[i] = salary[i] * 0.02; // 2% Bonus
            }
            newSalary[i] = salary[i] + bonusAmount[i];


            totalBonus = totalBonus + bonusAmount[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        System.out.println("Total Bonus Payout: "+totalBonus);
        System.out.println("Total Old Salary: "+totalOldSalary);
        System.out.println("Total New Salary: "+totalNewSalary);



        sc.close();
    }
}
