





import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<Character> userGuesses = new ArrayList<>();
    Words words = new Words();
    Controller controller = new Controller();

    public static void main(String[] args) {
        Main main = new Main();

        main.showMenu();
    }

    void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("\nWelcome to Hangman, are you ready to play?");
            System.out.println("\nEnter Play to start game");
            System.out.println("\nEnter Quit to end program...");

            System.out.println("Choose an option");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "quit":
                    System.out.println("Exiting Application");
                    break;
                case "play":
                    System.out.println("New game");
                    newGame();
                    break;
                default:
                    break;
            }
        } while (!userInput.equals("Quit"));
        return;
    }

    public void newGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The word is:");
//        HangmanTree hangmanTree = new HangmanTree();
        String word = words.randomWord();
        System.out.println(word);
        printWord(word, userGuesses);

    }


    void printWord(String word, List<Character> userGuesses) {
        for (int i = 0; i <= word.length(); i++) {
            if (userGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }

        }
    }
}

