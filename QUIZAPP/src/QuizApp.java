import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("🧠 Welcome to the Java Quiz 🧠");
        System.out.println("----------------------------------");

        // Question 1
        System.out.println("1. What are Java loops?");
        System.out.println("A) Used for recursion");
        System.out.println("B) Used to repeat a block of code");
        System.out.println("C) Used for inheritance");
        System.out.println("D) None of these");
        System.out.print("Enter your answer (A/B/C/D): ");
        char ans1 = sc.next().toUpperCase().charAt(0);
        if (ans1 == 'B') score++;

        // Question 2
        System.out.println("\n2. What is an enhanced for-loop?");
        System.out.println("A) Used to iterate collections easily");
        System.out.println("B) A while loop");
        System.out.println("C) Used for threading");
        System.out.println("D) None");
        System.out.print("Enter your answer (A/B/C/D): ");
        char ans2 = sc.next().toUpperCase().charAt(0);
        if (ans2 == 'A') score++;

        // Question 3
        System.out.println("\n3. What is ArrayList?");
        System.out.println("A) Fixed-size array");
        System.out.println("B) Resizable array in Java");
        System.out.println("C) Map type");
        System.out.println("D) None");
        System.out.print("Enter your answer (A/B/C/D): ");
        char ans3 = sc.next().toUpperCase().charAt(0);
        if (ans3 == 'B') score++;

        // Question 4
        System.out.println("\n4. How can we shuffle elements in a List?");
        System.out.println("A) Collections.shuffle()");
        System.out.println("B) List.random()");
        System.out.println("C) Random.shuffle()");
        System.out.println("D) None");
        System.out.print("Enter your answer (A/B/C/D): ");
        char ans4 = sc.next().toUpperCase().charAt(0);
        if (ans4 == 'A') score++;

        // Result
        System.out.println("\n----------------------------------");
        System.out.println("🎯 Your Final Score: " + score + "/4");
        System.out.println("Thank you for playing! 💫");

        sc.close();
    }
}

