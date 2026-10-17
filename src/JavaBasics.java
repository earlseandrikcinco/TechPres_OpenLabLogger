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
        // TODO
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
        // TODO
    }

    // ---- 3. Operators and casting ----

    /**
     * TODO: show + - * / % with ints, and show that 7 / 2 is 3 (integer division!).
     * TODO: show 7 / 2.0 gives 3.5, then cast: (int) 3.9 gives 3.
     * TODO: show ++ and += quickly.
     * TODO (talk): implicit widening (int -> double) vs explicit narrowing cast.
     */
    private static void demoOperatorsAndCasting() {
        // TODO
    }

    // ---- 4. Decisions ----

    /**
     * TODO: write an if / else if / else that prints a grade message for a score.
     * TODO: write a short switch on an int (1 to 3) using break in every case.
     * TODO (talk): the condition must be a boolean (Java does not treat 0 or "" as false,
     *              unlike C / Python / JavaScript).
     */
    private static void demoControlFlow() {
        // TODO
    }

    // ---- 5. Loops ----

    /**
     * TODO: a classic for loop that prints 1 to 5.
     * TODO: a while loop that counts down from 3.
     * TODO: an enhanced for loop over an int[] array: for (int n : numbers).
     * TODO (talk): arrays have a fixed size and a .length field (no parentheses!).
     */
    private static void demoLoops() {
        // TODO
    }

    // ---- 6. Methods ----

    /**
     * TODO: call the helper method add(int, int) below and print the result.
     * TODO (talk): every method needs a return type, parameter types, and lives inside a class.
     *              There are no free-standing functions in Java.
     */
    private static void demoMethods() {
        // TODO
    }

    /**
     * TODO: return the sum of a and b.
     */
    private static int add(int a, int b) {
        return 0; // TODO: replace
    }

    // ---- 7. Strings ----

    /**
     * TODO: show length(), toUpperCase(), charAt(0), substring(0, 3), and contains("lab").
     * TODO (talk): Strings are IMMUTABLE: toUpperCase() returns a NEW String,
     *              the original is unchanged. Prove it by printing both.
     * TODO (talk): Strings use double quotes, chars use single quotes.
     */
    private static void demoStrings() {
        // TODO
    }
}
