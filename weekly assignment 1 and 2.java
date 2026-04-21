//level 1
public class Age {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int age;

        age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}


public class AverageMarks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average;

        average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam's average mark in PCM is " + average);
    }
}



public class KmToMiles {
    public static void main(String[] args) {
        double km = 10.8;
        double miles;

        miles = km * 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}


//level 2

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1, number2;
        double add, sub, mul, div;

        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();

        add = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;

        if (number2 != 0) {
            div = number1 / number2;
        } else {
            System.out.println("Division by zero not possible");
            return;
        }

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);

        sc.close();
    }
}



import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;
        double areaCm, areaIn;

        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        areaCm = 0.5 * base * height;

        // Convert sq cm to sq inches
        areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and sq cm is " + areaCm);

        sc.close();
    }
}


// level 3
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit, celsiusResult;

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is " 
                           + celsiusResult + " celsius");

        sc.close();
    }
}