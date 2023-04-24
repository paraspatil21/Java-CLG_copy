import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        multiplicationTable();
//        calci();
//        String str = "Aa kiu, I SWD SKIEO 23658.GH kiu:sieo??25.33";
//        charactercount(str);
//        if (firstSmallThirdBig(5, 10, 15)) {
//            System.out.println("The function returned true value");
//        } else {
//            System.out.println("The function returned false value");
//        }
//        System.out.println(sumAverageRunningInt(1, 100));
//        sumAverageRunningIntModified(1, 100);
//        calciSwitchCase(13, 17);
//        incomeTaxCalculator(85000);
//        PensionContributionCalculator();
    }

    public static void multiplicationTable() {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the number :");
        int x = io.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * x);
        }
        io.close();
    }

    public static void calci() {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the two numbers :");
        int a = io.nextInt();
        int b = io.nextInt();
        System.out.println("The addition of these two numbers is : " + (a + b));
        System.out.println("The subtraction of these two numbers is : " + (a - b));
        System.out.println("The multiplication of these two numbers is : " + (a * b));
        System.out.println("The division of these two numbers is : " + (float) (a / b));
        System.out.println("The remainder of these two numbers is : " + (a % b));
        io.close();
    }

    public static void charactercount(String str) {
        char c;
        int space = 0, letters = 0, num = 0, other = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == ' ') {
                space++;
            } else if (c >= '0' && c <= '9') {
                num++;
            } else if ((c >= 'a' && c < 'z') || (c >= 'A' && c <= 'Z')) {
                letters++;
            } else {
                other++;
            }
        }
        System.out.print("spaces: " + space + ", letters: " + letters + ", numbers: " + num + ", other: " + other);
    }

    public static boolean firstSmallThirdBig(int a, int b, int c) {
        return b > a && b < c;
    }

    public static double sumAverageRunningInt(int lowerbound, int upperbound) {
        lowerbound--;
        return (double) ((((upperbound) * (upperbound + 1)) / 2) - (((lowerbound) * (lowerbound + 1) / 2))) / (upperbound - lowerbound);
    }

    public static void sumAverageRunningIntModified(int lowerbound, int upperbound) {
        double sumOdd = 0, sumEven = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        
        System.out.println("sum of even no's : " + sumEven);
        System.out.println("sum of odd no's : " + sumOdd);
		double abdiff=sumEven>sumOdd?sumEven-sumOdd:sumOdd-sumEven;
		System.out.println("The absolute difference between sumOdd and sumEven is : " + abdiff);
    }

    public static void incomeTaxCalculator(int income) {
        int incomeTaxSum = 0;

        if (income > 40000) {
            incomeTaxSum += (income * 10 / 100);
            income = income - 40000;
        }
        if (income > 20000) {
            incomeTaxSum += (income * 20 / 100);
            income -= 20000;
        }
        if (income > 0) {
            incomeTaxSum += (income * 30 / 100);
        }
        System.out.println("The total income tax on this income is : " + incomeTaxSum);
    }

    public static void calciSwitchCase(int a, int b) {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform ");
        char c = io.next().toCharArray()[0];
        switch (c) {
            case '+' : System.out.println("The addition of these two numbers is : " + (a + b));
							break;
            case '-' : System.out.println("The subtraction of these two numbers is : " + (a - b));
							break;
            case '*' : System.out.println("The  of these two numbers is : " + (a * b));
							break;
            case '/' : System.out.println("The division of these two numbers is : " + (float) (a / b));
							break;
            default : {
                System.out.println("Please enter valid operator");
                calciSwitchCase(a, b);
            }
        }
    }

    public static void PensionContributionCalculator() {
        double employeeRate = 0, employerRate = 0;
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the monthly salary : ");
        int salary = io.nextInt();
        System.out.println("Enter the age : ");
        int age = io.nextInt();
        if (salary > 6000) {
            salary = 6000;
        }

        if (age <= 55) {
            employerRate += salary * 0.17;
            employeeRate += salary * 0.20;
        } else if (age <= 60) {
            employerRate += salary * 0.13;
            employeeRate += salary * 0.13;
        } else if (age <= 65) {
            employerRate += salary * 0.09;
            employeeRate += salary * 0.075;
        } else {
            employerRate += salary * 0.075;
            employeeRate += salary * 0.05;
        }
        System.out.printf("The employee's contribution is : %.2f\n", employeeRate);
        System.out.printf("The employer's contribution is : %.2f\n", employerRate);
    }
}
