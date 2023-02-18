import java.util.Scanner;
class employee{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Employ ID: ");
        int empId = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Basic Salary: ");
        double salary = sc.nextInt();
        System.out.print("Number of years of Experience: ");
        int experience = sc.nextInt();

        double hra = (salary * 35)/100;
        double da = (salary * 58)/100;
        double pf = (salary * 9.5)/100;

        double bonus = 0;
        if (experience>=30){
            bonus = (salary*59)/100;
        }
        else if(experience>=23){
            bonus = (salary*51)/100;
        }
        else if(experience>=15){
            bonus=(salary*45)/100;
        }
        else if(experience>=7){
            bonus=(salary*33)/100;
        }
        else if(experience<7){
            bonus=(salary*16)/100;
        }

        System.out.printf("The HRA = %.2f\n",hra);
        System.out.printf("The DA = %.2f\n",da);
        System.out.printf("The PF = %.2f\n",pf);
        System.out.printf("The Bonus = %.2f\n",bonus);

        double netSalary = (salary+da+hra-pf+bonus);
        System.out.printf("Net Salary = %.2f", netSalary);

    }
}
