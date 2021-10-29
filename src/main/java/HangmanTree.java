public class HangmanTree {
    int maxErrors=5;
    private static String switchMethod(int maxErrors) {
        switch (maxErrors) {
            case 1:
                return drawFirst();
            case 2:
                return drawSecond();
            case 3:
                return drawHead();
            case 4:
                return drawBody();
            case 5:
                return drawHangman();

            default:
                return "Something is broken";
        }
    }



    private static String drawHangman() {
        return " _________     "+
               "|         |    "+
               "|         0    "+
               "|        /|\\  "+
               "|        / \\  "+
               "|              "+
               "|______________";
        }
    private static String drawBody() {
        return " _________     "+
                "|         |    "+
                "|         0    "+
                "|        /|\\  "+
                "|              "+
                "|              "+
                "|______________";
    }

    private static String drawHead() {
        return " _________     "+
                "|         |    "+
                "|         0    "+
                "|              "+
                "|              "+
                "|              "+
                "|______________";
    }
    private static String drawSecond() {
        return " _________     "+
                "|              "+
                "|              "+
                "|              "+
                "|              "+
                "|              "+
                "|______________";
    }
    private static String drawFirst() {
        return   "              "+
                "|              "+
                "|              "+
                "|              "+
                "|              "+
                "|              "+
                "|______________";
    }
}
