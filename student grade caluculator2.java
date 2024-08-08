import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("STUDENT GRADE CALUCULATOR");
        System.out.println("Enter the no of subjects: ");
        int s=sc.nextInt();
        int total=0;
        for(int i=0;i<s;i++){
            System.out.println("Enter marks of subject "+(i+1)+":");
            int marks=sc.nextInt();
            total+=marks;
        }
        double avgP=(double)total/s;
        char grade;
        if(avgP>=90){
            grade='O';
        }
        else if(avgP>=80){
            grade='A';
        }
        else if(avgP>=70){
            grade='B';
        }
        else if(avgP>=60){
            grade='c';
        }
        else if(avgP>=50){
            grade='D';
        }
        else{
            grade='E';
        }
        System.out.println("Total Marks Secured: "+total);
        System.out.println("Average Percentage is: "+avgP+"%");
        System.out.println("Grade :"+grade);
    } 
}
