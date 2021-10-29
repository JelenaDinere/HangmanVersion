





import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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
        String currentWord = words.randomWord();
        System.out.println(currentWord);
        String userWord = scanner.nextLine();
        for(int i = 0; i<= currentWord.length();i++)
        userWord = userWord.concat("_");
        System.out.println(userWord);
        }

    }




