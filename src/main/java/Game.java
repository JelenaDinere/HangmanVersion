import java.util.ArrayList;
import java.util.List;

public class Game {}
//    private String currentWord;
//    private String userWord = "";
//    private boolean gameStarted = false;
//    private String userInput = "";
//    int mistakes = 0;
//    Words words = new Words();
//    HangmanTree hangmanTree = new HangmanTree();
//
//    public void playGame() {
//        gameStarted = true;
//        currentWord = words.randomWord();
//        userWord = "";
//
//        System.out.println("+++++++The word is:++++++++" + currentWord);
//        for (int i = 0; i <= currentWord.length() - 1; i++) {
//            userWord = userWord.concat("_");
//        }
//        System.out.println("New game has started");
//        System.out.println(userWord);
//    }
//    public void newStep() {
//        boolean foundLetter = false;
//
//        if (userInput.length() == 1) {
//            System.out.println("This is a letter");
//            char[] currentWordArray = currentWord.toCharArray();
//            char[] userWordArray = userWord.toCharArray();
//
//            for (int i = 0; i < currentWordArray.length; i++) {
//                if (currentWordArray[i] == userInput.charAt(0)) {
//                    userWordArray[i] = userInput.charAt(0);
//                    userWord = new String(userWordArray);
//                    foundLetter = true;
//                    System.out.println("Correct guess");
//                    System.out.println(userWord);
//                }
//
//            }
//            if (!foundLetter) {
//                hangmanTree.draw(mistakes);
//                System.out.println("Incorrect letter and try again");
//                mistakes++;
//            }
//            if (mistakes == 5) {
//                hangmanTree.draw(mistakes);
//                System.out.println("Game Over");
//                System.out.println("The correct word was: " + currentWord);
//                playGame();
//
//            }
//
//            if(userWord.contains("_") == false){
//                // won
//                System.out.println("This is a correct word");
//                System.out.println("YOU WIN!!");
//                playGame();
//            }
//        }
//
//        if (userInput.length() == currentWord.length()) {
//
//            if (userInput.equals(currentWord)) {
//                System.out.println("This is a correct word");
//                System.out.println("YOU WIN!!");
//
//            } else {
//                hangmanTree.draw(5);
//                System.out.println("GAME OVER, This is incorrect word!!!");
//                System.out.println("The correct word was " + currentWord);
//            }
//            playGame();
//        }
//    }
//
//
//}