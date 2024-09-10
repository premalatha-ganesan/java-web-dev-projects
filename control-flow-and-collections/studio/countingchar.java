
    import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;


    public class Main {
        public static void main(String[] args) {
            String testString = "";

            //        String testString =  "I am the very model if of a modern major general";

            //        Scanner input = new Scanner(System.in);
            //        System.out.println("please enter your silly String");
            //        String testString = input.nextLine();

            try {
                File script = new File("src/source.txt");
                Scanner fileInput = new Scanner(script);
                while (fileInput.hasNextLine()) {
                    String data = fileInput.nextLine();
                    testString = (testString + data);
                }
                fileInput.close();
            } catch (FileNotFoundException e) {
                System.out.println("Dang man I don't know where it is");
            }
            testString = testString.toUpperCase();
            char[] charactersInString = testString.toCharArray();
            System.out.println(charactersInString.length);
            HashMap<Character, Integer> letterCount = new HashMap<>();

            for (char letter : charactersInString) {
                if (Character.isAlphabetic(letter)) {
                    if (!letterCount.containsKey(letter)) {
                        letterCount.put(letter, 1);
                    } else {
                        letterCount.put(letter, letterCount.get(letter) + 1);
                    }
                }
            }
            for (Map.Entry <Character, Integer> outputLetter : letterCount.entrySet()) {
                System.out.println(outputLetter.getKey() + ": " + outputLetter.getValue());
            }
        }
    }








}
