import java.util.*;
public class codealphatask01 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String subject[]={"math","hindi","english","computer","Physics"};
        int marks[]=new int[5];
        for(int i=0;i<5;i++) {
            System.out.println("enter Marks of " + subject[i]);
            marks[i] = sc.nextInt();
            if(marks[i]>100){
                System.out.println("Please enter valid Marks");
                 return;
            }
            sum += marks[i];
        }
        int Average=sum/5;
        System.out.println("Average marks= "+Average);
        if(Average>89&& Average<100){
            System.out.println("Grade=A+");}
        else if(Average>79){
            System.out.println("Grade=A");}
        else if(Average>69){
            System.out.println("Grade=B+");}
        else if(Average>59){
            System.out.println("Grade=B");}
        else if(Average>49){
            System.out.println("Grade=C");}
        else if(Average>33){
            System.out.println("Grade=D");}
        else if(Average<33){
            System.out.println("Fail");
        }
        else {
        System.out.println("Invalid entries");}
        }}
