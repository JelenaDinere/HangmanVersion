import java.util.Scanner;


    public class Main {
        private int mistakes = 0;
        private String currentWord;
        private String userWord = "";
        private String userInput = "";
        private Scanner scanner = new Scanner(System.in);
        private boolean gameStarted = false;


        Words words = new Words();
        Game game = new Game();
        HangmanTree hangmanTree = new HangmanTree();

        public static void main(String[] args) {
            Main main = new Main();
            main.showMenu();

        }

        void showMenu() {

            do {
                if (!gameStarted) {
                    System.out.println("\nWelcome to Hangman, are you ready to play?");
                    System.out.println("\nEnter Play to start game");
                    System.out.println("\nEnter Quit to end program...");

                    System.out.println("Choose an option");
                }
                userInput = scanner.nextLine();

                switch (userInput) {
                    case "quit":
                        System.out.println("Exiting Application");
                        break;
                    case "play":
                        System.out.println("New game");
                        playGame();
                        break;
                    default:
                        System.out.println("Next step");
                        newStep();
                        break;
                }
            } while (!userInput.equals("Quit"));
            return;
        }

        public void playGame() {
            gameStarted = true;
            currentWord = words.randomWord();
            userWord = "";

            System.out.println("+++++++The word is:++++++++" + currentWord);
            for (int i = 0; i <= currentWord.length() - 1; i++) {
                userWord = userWord.concat("_");
            }
            System.out.println("New game started");
            System.out.println(userWord);
        }

        private void newStep() {
            boolean foundLetter = false;

            if (userInput.length() == 1) {
                System.out.println("This is a letter");
                char[] currentWordArray = currentWord.toCharArray();
                char[] userWordArray = userWord.toCharArray();

                for (int i = 0; i < currentWordArray.length; i++) {
                    if (currentWordArray[i] == userInput.charAt(0)) {
                        userWordArray[i] = userInput.charAt(0);
                        userWord = new String(userWordArray);
                        foundLetter = true;
                        System.out.println("Correct guess");
                        System.out.println(userWord);
                    }

                }
                if (!foundLetter) {
                    hangmanTree.draw(mistakes);
                    System.out.println("Incorrect letter and try again");
                    mistakes++;
                }
                if (mistakes == 5) {
                    hangmanTree.draw(mistakes);
                    System.out.println("Game Over");
                    System.out.println("The correct word was: " + currentWord);
                    playGame();

                }

                if(userWord.contains("_") == false){
                    // won
                    System.out.println("This is a correct word");
                    System.out.println("YOU WIN!!");
                    playGame();
                }
            }

            if (userInput.length() == currentWord.length()) {

                    if (userInput.equals(currentWord)) {
                        System.out.println("This is a correct word");
                        System.out.println("YOU WIN!!");

                    } else {
                        hangmanTree.draw(5);
                        System.out.println("GAME OVER, This is incorrect word!!!");
                        System.out.println("The correct word was " + currentWord);
                    }
                    playGame();
                }
            }

        }







