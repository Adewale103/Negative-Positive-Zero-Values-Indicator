import java.util.Scanner;
public class PositiveNegativeZero{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   int countA = 0;
   int countB = 0;
   int countC= 0;
    
    System.out.println("Enter the first number: ");
    int num1 = input.nextInt();
    if (num1 < 0) {countA +=1;}
    if (num1 == 0) {countB +=1;}
    if (num1 > 0) {countC +=1;}

    System.out.println("Enter the second number: ");
    int num2 = input.nextInt();
    if (num2 < 0) {countA +=1;}
    if (num2 == 0) {countB +=1;}
    if (num2 > 0) {countC +=1;}

    System.out.println("Enter the third number: ");
    int num3 = input.nextInt();
    if (num3 < 0) {countA +=1;}
    if (num3 == 0) {countB +=1;}
    if (num3 > 0) {countC +=1;}

    System.out.println("Enter the fourth number: ");
    int num4 = input.nextInt();
    if (num4 < 0) {countA +=1;}
    if (num4 == 0) {countB +=1;}
    if (num4 > 0) {countC +=1;}

    System.out.println("Enter the fifth number: ");
    int num5 = input.nextInt();
    if (num5 < 0) {countA +=1;}
    if (num5 == 0) {countB +=1;}
    if (num5 > 0) {countC +=1;}

    System.out.println("The number of Positive Numbers are: "+countC);
    System.out.println("The number of Zero(s) is: "+countB);
    System.out.println("The number of Negative Numbers are: "+countA);
    }
}
