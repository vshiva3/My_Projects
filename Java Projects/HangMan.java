import java.util.Arrays;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nLet's Play HangMan game! \nGuess the Word:");

        String word = randomWord();

        char[] missedGuess = {' ',' ',' ',' ',' ',' '};

        char[] placeholder = new char[word.length()];

        for (int i = 0; i < placeholder.length; i++) {
            placeholder[i] = '_';
        }
        int misses = 0;
        
        while(true){

            System.out.print("Guess:\t");
            char guess = sc.nextLine().charAt(0);
            if(checkGuess(guess, word.toCharArray())==true){
                updatePlaceholder(guess, word.toCharArray(), placeholder);
            }
            else if(checkGuess(guess, word.toCharArray())==false){             
                misses++;
                
            }
            gallowsList(misses);
            printPlaceholder(placeholder);
            printMissedGuesses(missedGuess,guess,word.toCharArray());

            if(Arrays.equals(placeholder, word.toCharArray())){
                System.out.println("You Guessed it Right!");
                break;
            }
            else if(misses==6){
                System.out.println("RIP!");
                System.out.println("The word was: "+word);
                break;
            }
            
        }

        sc.close();
        
    }


    /**
     * function name: randomWord()
     * 
     * This function contains a list of words stored in an array
     * It return a random word for guessing that word.
     * 
     * @return type(String)
     */

    public static String randomWord() {

        String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam", "cobra",
                "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
                "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter",
                "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon",
                "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad",
                "trout", "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra" };
        int random = (int) (Math.random() * (words.length));
        return words[random];
    }

    /**
     * function name: printPlaceholder()
     * @param placeholder
     * It takes the placeholder as parameter to print the no.of characters in that word
     * So that player can know the length of word and probability of guessing the word is increased.
     */


    public static void printPlaceholder(char[] placeholder) {
        System.out.print("Word:\t");

        for (int i = 0; i < placeholder.length; i++) {
            System.out.print(placeholder[i] + " ");
        }
        System.out.println("");
    }

    /**
     * function name: gallowList()
     * @param misses
     * It takes misses as parameter , misses are increased as player guesses each charcter wrong
     * According prints hanging symbols.
     */

    public static void gallowsList(int misses){
        String[] gallows = {"+---+\n" +
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +   //if the user didn't miss any guesses.
                        "    |\n" +
                        "    |\n" +
                        "=========\n",
                    
                        "+---+\n" +
                        "|   |\n" +
                        "O   |\n" +   //if the user missed one guess.
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",
                        
                        "+---+\n" +
                        "|   |\n" +
                        "O   |\n" +    //if the user missed two guesses.
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",
                        
                        " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +   //if the user missed three guesses.
                        "/|   |\n" +
                        "     |\n" +
                        "     |\n" +
                        " =========\n",
                        
                        " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n"+   //if the user missed four guesses.
                        "     |\n" +
                        "     |\n" +
                        " =========\n",
                        
                        " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" +  //if the user missed five guesses.
                        "/    |\n" +
                        "     |\n" +
                        " =========\n",
                        
                        " +---+\n" +
                        " |   |\n" +
                        " O   |\n" +
                        "/|\\  |\n" +   //if the user missed six guesses.
                        "/ \\  |\n" +
                        "     |\n" +
                        " =========\n"};
    
        System.out.println("\n");

        switch(misses){
            case 0: System.out.println(gallows[0]);break;
            case 1: System.out.println(gallows[1]);break;
            case 2: System.out.println(gallows[2]);break;
            case 3: System.out.println(gallows[3]);break;
            case 4: System.out.println(gallows[4]);break;
            case 5: System.out.println(gallows[5]);break;
            case 6: System.out.println(gallows[6]);break;
        }
    }

    /**
     * function name: printMissedGuesses()
     * @param missedGuess
     * @param guess
     * @param word
     * This function prints missed guesses as the player enter wrong guesses it updates missed words 
     * So that player won't make the same mistake again. And prints the misses.
     */

    public static void printMissedGuesses(char[] missedGuess, char guess, char[] word){
        System.out.print("\nMisses:\t");
        if(checkGuess(guess, word)==false){
            for(int i=0;i<missedGuess.length;i++){
                
                if(missedGuess[i]==' '){
                    missedGuess[i] = guess;
                    break;
                }
            }
        }
        
        for(int i=0;i<missedGuess.length;i++){
            System.out.print(missedGuess[i]);
        }
        

        System.out.println("\n");
    }

    /**
     * function name : updatePlaceholder()
     * @param guess
     * @param word
     * @param placeholder
     * 
     * This function updates the placeholder if the user enter correct guess.
     */

    public static void updatePlaceholder(char guess, char[] word, char[] placeholder){

        for(int i=0;i<word.length;i++){
            if(guess == word[i]){
                placeholder[i] = guess;
            }
        }
    }

    /**
     * function name: checkGuess()
     * @param guess
     * @param word
     * @return
     * This function checks the guess entered by the user and return true and false accordingly
     * which will help other functions to make changes to place holder or to update misses.
     */
    public static boolean checkGuess(char guess, char[] word) {
        for(int i=0;i<word.length;i++){
            if(guess == word[i]){
                return true;
            }
        }
        return false;
    }
}