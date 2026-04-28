//level 1


import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[10];

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        // Check
        for (int i = 0; i < 10; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid age");
            } else if (age[i] >= 18) {
                System.out.println("Age " + age[i] + " can vote");
            } else {
                System.out.println("Age " + age[i] + " cannot vote");
            }
        }
    }
}




import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        // Check
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0)
                    System.out.println(arr[i] + " is positive and even");
                else
                    System.out.println(arr[i] + " is positive and odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[4])
            System.out.println("Equal");
        else if (arr[0] > arr[4])
            System.out.println("First is greater");
        else
            System.out.println("Last is greater");
    }
}



import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int table[] = new int[10];

        System.out.print("Enter number: ");
        num = sc.nextInt();

        // Store
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        // Display
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }
}



//level 2


import java.util.Scanner;

public class BonusProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary[] = new double[10];
        int years[] = new int[10];
        double bonus[] = new double[10];
        double newSalary[] = new double[10];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextInt();

            if (salary[i] < 0 || years[i] < 0) {
                System.out.println("Invalid input, re-enter");
                i--;
            }
        }

        // Calculation
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
}




import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age[] = new int[3];
        double height[] = new double[3];
        String names[] = {"Amar", "Akbar", "Anthony"};

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex])
                youngestIndex = i;

            if (height[i] > height[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}




//level 3



import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int freq[] = new int[10];

        while (num != 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}