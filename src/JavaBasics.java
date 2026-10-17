import java.util.Scanner;

/**
 *
 * IF YOU THINK ITS TOO MUCH FOR 6 MINUTES, PLEASE FEEL FREE TO DELETE SOME OF THE METHODS
 *
 *
 * JavaBasics - a STANDALONE demo file for the "Environment and syntax basics" section.
 * It is NOT part of the Open Lab Logger. It has its own main(), so it can be compiled
 * and run live on its own while the audience watches.
 *
 * OWNER: Member 2
 * JAVA CONCEPTS TO TEACH: javac -> bytecode -> JVM, the class/main structure, static typing,
 *                         primitive types vs String, operators, type casting,
 *                         if/else, for/while loops, methods, basic String methods
 *
 * TIP FOR THE AUDIENCE (they already know another language): for each demo, say
 * "in Python/JavaScript you would write X, in Java you must also declare Y".
 *
 * HOW TO RUN LIVE:
 *     javac -d out src/JavaBasics.java
 *     java -cp out JavaBasics
 */
public class JavaBasics {

    // Every Java program starts at this exact method signature.
    // TODO (talk): explain each word: public, static, void, main, String[] args.
    public static void main(String[] args) {
        demoHelloWorld();
        demoVariablesAndTypes();
        demoOperatorsAndCasting();
        demoControlFlow();
        demoLoops();
        demoMethods();
        demoStrings();
    }

    // ---- 1. Hello World ----

    /**
     * TODO: print "Hello, Java!" with System.out.println.
     * TODO (talk): the file name must match the public class name (JavaBasics.java).
     * TODO (talk): show that javac creates JavaBasics.class (bytecode), and java runs it on the JVM.
     */
    private static void demoHelloWorld() {
        System.out.println("Hello World");
    }

    // ---- 2. Variables and types ----

    /**
     * Java is STATICALLY TYPED: every variable has a declared type that cannot change.
     * TODO: declare an int, a double, a boolean, a char, and a String.
     * TODO: print them all in one line using + concatenation.
     * TODO (talk): show the compile error you get from  int age = "twenty";
     *              (compare: Python/JavaScript would allow reassigning to another type).
     * TODO (talk): final keyword for constants (final int MAX_PCS = 10;).
     */
    private static void demoVariablesAndTypes() {
        int age = 19;
        double height = 162.5;
        boolean isStudent = true;
        char grade = 'A';
        String name = "Lucky";

        System.out.println("Age: " + age + ", Height: " + height
                + ", Student: " + isStudent + ", Grade: " + grade
                + ", Name: " + name);
    }

    // ---- 3. Operators and casting ----

    /**
     * TODO: show + - * / % with ints, and show that 7 / 2 is 3 (integer division!).
     * TODO: show 7 / 2.0 gives 3.5, then cast: (int) 3.9 gives 3.
     * TODO: show ++ and += quickly.
     * TODO (talk): implicit widening (int -> double) vs explicit narrowing cast.
     */
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

    // ---- 4. Decisions ----

    /**
     * TODO: write an if / else if / else that prints a grade message for a score.
     * TODO: write a short switch on an int (1 to 3) using break in every case.
     * TODO (talk): the condition must be a boolean (Java does not treat 0 or "" as false,
     *              unlike C / Python / JavaScript).
     */
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

    // ---- 5. Loops ----

    /**
     * TODO: a classic for loop that prints 1 to 5.
     * TODO: a while loop that counts down from 3.
     * TODO: an enhanced for loop over an int[] array: for (int n : numbers).
     * TODO (talk): arrays have a fixed size and a .length field (no parentheses!).
     */
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

    // ---- 6. Methods ----

    /**
     * TODO: call the helper method add(int, int) below and print the result.
     * TODO (talk): every method needs a return type, parameter types, and lives inside a class.
     *              There are no free-standing functions in Java.
     */
    private static void demoMethods() {
        Scanner scan=new Scanner(System.in);
        System.out.print("num1: ");
        int num1=scan.nextInt();
        System.out.print("num2: ");
        int num2=scan.nextInt();

        int ans =add(num1,num2);
        System.out.println(ans);
    }

    /**
     * TODO: return the sum of a and b.
     */
    private static int add(int a, int b) {
        return a+b;
    }

    // ---- 7. Strings ----

    /**
     * TODO: show length(), toUpperCase(), charAt(0), substring(0, 3), and contains("lab").
     * TODO (talk): Strings are IMMUTABLE: toUpperCase() returns a NEW String,
     *              the original is unchanged. Prove it by printing both.
     * TODO (talk): Strings use double quotes, chars use single quotes.
     */
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
