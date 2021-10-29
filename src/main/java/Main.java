import java.util.Scanner;

public class Main {

    private String currentWord;
    private String userWord;
    private String userInput = "";
    private Scanner scanner = new Scanner(System.in);

    Words words = new Words();
    Controller controller = new Controller();

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }

    void showMenu() {

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
                    System.out.println("Next step");
                    newStep();
                    break;
            }
        } while (!userInput.equals("Quit"));
        return;
    }

    private void newStep() {
       if(userInput.length() == 1){
           System.out.println("this is a letter");
           int foundIndex = currentWord.indexOf(userInput.charAt(0));

           if(foundIndex != -1){
               System.out.println(foundIndex);
               // replace in userWord
               char[] userWordArray = userWord.toCharArray();
               userWordArray[foundIndex] = userInput.charAt(0);
               userWord = new String(userWordArray);
               System.out.println(userWord);

           }
       }

        if(userInput.length() == currentWord.length()){
            System.out.println("this is a word");
        }



    }

    public void newGame() {
        Scanner scanner = new Scanner(System.in);
        currentWord = words.randomWord();
        System.out.println("The word is:" + currentWord);
        for(int i = 0; i <= currentWord.length()-1; i++)
        System.out.print("_");
        System.out.println();
        userWord = scanner.nextLine();

        userWord = userWord.concat("_");
        System.out.println(userWord);
        }



    }





