import java.io.File;
import java.util.Scanner;

public class MyCodeStarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Code Starter!");
        System.out.println("How about I print out a typical skeleton for a new program so that I can reuse it and tweak it when creating new programs, until I memorize it, if I so choose...?");
        System.out.println("Because here's the deal, when you learn a new language, it takes a while to memorize some of the building blocks.  Once you memorize building blocks, you can do incredible things and build incredible things and apply those things to solve problems, pretty quickly and creatively.  But no need to worry about the memorization part because it takes time, and all programmers learn to reference examples that they can trust work, particularly small reusable portions of code.");
        System.out.println("So, how about building up my own library of portions of code that I can reference whenever I want?  Yes you can reference api's and online examples and google away, but this can be a cool exercise also... building up your own personal library, and using it to solve problems and complete class exercises and job tasks.");

        String[] portionName = {"Main Skeleton", "String array", "For loop", "If Else Statement", "Boolean", "Int array", "While Loop"}; // Can you determine how to load this information from a file instead?
        String[] portionFilename = {"data/mainSkeleton.txt", "data/stringArray.txt", "data/forLoop.txt", "data/if-else-statement.txt", "data/boolean.txt", "data/int-array.txt", "data/while-loop.txt"}; // Same here?

        boolean done = false;

        int numOptions = portionName.length;
        while (!done) {
            int answer = 0;
            System.out.println("\n\nWhat code portion would you like to view next?");
            for (int a = 0; a < numOptions; ++a) {
                System.out.println((a + 1) + ": " + portionName[a]);
            }
            System.out.println((numOptions + 1) + ": To Quit");
            answer = input.nextInt();
            if (answer == (numOptions + 1)) {
                done = true;
                continue;
            }

            System.out.println("\n\n\n");
            try (Scanner code = new Scanner(new File(portionFilename[answer - 1]));) {
                while (code.hasNextLine()) {
                    String line = code.nextLine();
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println("Could not open targeted file." + e);
            }
            System.out.println("\n\n\n");
        }

        System.out.println("Thanks for continuing to add to your own personal checklist of portions of code that you need again and again.  This type of thing can prove helpful, and at some point, you'll likely memorize several of these.  Let's get it!");
    }
}

