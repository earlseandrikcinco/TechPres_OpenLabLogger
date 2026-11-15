import java.util.Scanner;


public class JavaBasics {



    public static void main(String[] args) {
        demoHelloWorld();
        demoVariablesAndTypes();
        demoOperatorsAndCasting();
        demoControlFlow();
        demoLoops();
        demoMethods();
        demoStrings();
    }


    private static void demoHelloWorld() {
        System.out.println("Hello World");
    }



    // Variables
    private static void demoVariablesAndTypes() {
        // Java Primitive Data Type Limits

        // byte: 8 bits | -128 to 127
        // short: 16 bits | -32,768 to 32,767
        // int: 32 bits | -2,147,483,648 to 2,147,483,647
        // long: 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // float: 32 bits | Approximately ±1.4E-45 to ±3.4028235E38
        // double: 64 bits | Approximately ±4.9E-324 to ±1.7976931348623157E308

        // char: 16 bits | 0 to 65,535 (UTF-16 code unit)
        // boolean: true or false

        // String: Reference type (not a primitive data type)
        // Stores a sequence of characters.

        int age = 19;
        double height = 162.5;
        boolean isStudent = true;
        char grade = 'A';
        String name = "Lucky";

        System.out.println("Age: " + age + ", Height: " + height
                + ", Student: " + isStudent + ", Grade: " + grade
                + ", Name: " + name);
    }


    // Operators
    private static void demoOperatorsAndCasting() {
        int a = 7;
        int b = 2;


        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));


        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7 / 2.0 = " + (7 / 2.0));


        System.out.println("(int) 3.9 = " + (int) 3.9);


        int number = 5;
        number++;
        System.out.println("After ++: " + number);

        number += 3;
        System.out.println("After += 3: " + number);
    }

    // Decisions
    private static void demoControlFlow() {
        int score = 85;


        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 75) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }


        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    // Loops
    private static void demoLoops() {


        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        int count = 3;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }


        int[] numbers = {10, 20, 30};

        for (int n : numbers) {
            System.out.println(n);
        }

    }

    //  Methods
    private static void demoMethods() {
        Scanner scan=new Scanner(System.in);
        System.out.print("num1: ");
        int num1=scan.nextInt();
        System.out.print("num2: ");
        int num2=scan.nextInt();

        int ans =add(num1,num2);
        System.out.println(ans);
    }


    private static int add(int a, int b) {
        return a+b;
    }


    private static void demoStrings() {
        String text = "lab work";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("First character: " + text.charAt(0));
        System.out.println("Substring: " + text.substring(0, 3));
        System.out.println("Contains lab: " + text.contains("lab"));

        String upper = text.toUpperCase();
        System.out.println("Original: " + text);
        System.out.println("New String: " + upper);

        String name = "Lucky";
        char letter = 'L';

        System.out.println(name);
        System.out.println(letter);
    }
}
