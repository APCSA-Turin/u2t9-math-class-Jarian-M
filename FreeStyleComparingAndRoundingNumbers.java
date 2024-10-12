import java.util.Scanner;

public class FreeStyleComparingAndRoundingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1;
        double num2;
        System.out.print("Let's compare two numbers first! Enter \"max\" to find which number is greater, or \"min\" to find which is smaller: ");
        String maxOrMin = scan.nextLine();
        while(!maxOrMin.equals("max")) {
            if(!maxOrMin.equals("min")) {
                System.out.print("Please enter \"max\" or \"min\": ");
                maxOrMin = scan.nextLine();
            } else {
                break;
            }
        }
        if(maxOrMin.equals("max")) {
            System.out.print("enter a number you want to compare: ");
            num1 = scan.nextDouble();
            scan.nextLine();
            System.out.print("enter a different number to compare with the first: ");
            num2 = scan.nextDouble();
            scan.nextLine();
            while(num1 == num2) {
                System.out.println("please choose a different second number to compare with the first, they can't be the same if you want to compare them!");
                System.out.print("enter a different number to compare with the first: ");
                num2 = scan.nextDouble();
            }
            double biggerNum = Math.max(num1, num2);
            System.out.println("The bigger number is: " + biggerNum);

            double smallerNum = Math.min(num1, num2);
            System.out.println("By the way, the smaller number is: " + smallerNum);
        }
        if(maxOrMin.equals("min")) {
            System.out.print("enter a number you want to compare: ");
            num1 = scan.nextDouble();
            scan.nextLine();
            System.out.print("enter a different number to compare with the first: ");
            num2 = scan.nextDouble();
            scan.nextLine();
            while(num1 == num2) {
                System.out.println("please choose a different second number to compare with the first, they can't be the same if you want to compare them!");
                System.out.print("enter a different number to compare with the first: ");
                num2 = scan.nextDouble();
            }
            double smallerNum = Math.min(num1, num2);
            System.out.println("The smaller number is: " + smallerNum);

            double biggerNum = Math.max(num1, num2);
            System.out.println("By the way, the bigger number is: " + biggerNum);
        }

        System.out.print("Now lets try rounding! Throw any decimal at me and I will round it for you to the nearest integer! Enter the decimal number: ");
        double decimalNum = scan.nextDouble();
        decimalNum = Math.round(decimalNum);
        System.out.println("Your rounded decimal number to the nearest integer is: " + decimalNum);

        scan.close();
    }
}