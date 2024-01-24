import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of subjects(100 marks each): ");
        int n = sc.nextInt();
        System.out.println("Subject Names: \n 1.Maths \n 2.English \n 3.Hindi \n 4. Physics \n 5.Chemistry \n 6.Biology");
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the marks in Subject "+ i);
            int marks=sc.nextInt();
            sum=sum+marks;
        }
        int per=sum/n;
        System.out.println("Total Marks: "+ sum);
        System.out.println("Average Percentage "+ per +"%" );
        if(per>=90){
            System.out.println("Grade: A+");
        }
        else if(per>=80 && per<90){
            System.out.println("Grade: A");
        }
        else if(per>=70 && per<80){
            System.out.println("Grade: B+");
        }
        else if(per>=60 && per<70){
            System.out.println("Grade: B");
        }
        else if(per>=50 && per<60){
            System.out.println("Grade: C");
        }
        else if(per>=40 && per<50){
            System.out.println("Grade: D");
        }
        else if(per>=30 && per<40){
            System.out.println("Grade: P(Pass)");
        }
        else{
            System.out.println("Grade: F(Fail)");
        }
    }
}
