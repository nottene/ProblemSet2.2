//Charles Shi
//Oct 4, 2022
//ProblemSet2.2
public class call {
    public static void main(String[] args) {
        System.out.println("EXERCISE 1 TEST CASES:");
        System.out.print("lastLetter(\"Hello, World!\") returns ");
        System.out.println(lastLetter("Hello, World!"));
        System.out.print("lastLetter(\"Hello\") returns ");
        System.out.println(lastLetter("Hello"));
        System.out.print("lastLetter(\"H\") returns ");
        System.out.println(lastLetter("H"));

        System.out.println("EXERCISE 2 TEST CASES:");
        System.out.print("nonStart(\"Hello\", \"World!\") returns ");
        System.out.println(nonStart("Hello", "World!"));
        System.out.print("nonStart(\"Hello\", \"Code\") returns ");
        System.out.println(nonStart("Java", "Code"));
        System.out.print("nonStart(\"H\", \"I\") returns ");
        System.out.println(nonStart("H", "I"));

        System.out.println("EXERCISE 3 TEST CASES:");
        System.out.print("middleThree(\"Candy\") returns ");
        System.out.println(middleThree("Candy"));
        System.out.print("middleThree(\"Solving\") returns ");
        System.out.println(middleThree("Solving"));
        System.out.print("middleThree(\"ABC\") returns ");
        System.out.println(middleThree("ABC"));

        System.out.println("EXERCISE 4 TEST CASES:");
        System.out.print("swapLastTwo(\"Candy\") returns ");
        System.out.println(swapLastTwo("Candy"));
        System.out.print("swapLastTwo(\"GTA\") returns ");
        System.out.println(swapLastTwo("GTA"));
        System.out.print("swapLastTwo(\"OK\") returns ");
        System.out.println(swapLastTwo("OK"));

        System.out.println("EXERCISE 5 TEST CASES:");
        System.out.print("frontAgain(\"edited\") returns ");
        System.out.println(frontAgain("edited"));
        System.out.print("frontAgain(\"edit\") returns ");
        System.out.println(frontAgain("edit"));
        System.out.print("frontAgain(\"ed\") returns ");
        System.out.println(frontAgain("ed"));

    }

        //returns the last character in the string
        public static String lastLetter(String str) {
            return (str.substring(str.length()-1));
        }

        //returns the concatenation of the two Strings without their first character
        public static String nonStart(String str1, String str2) {
            return (str1.substring(1) + str2.substring(1));
        }

        //returns a substring of length 3 from the parameter’s middle
        public static String middleThree(String str) {
            return (str.substring(str.length()/2-1,str.length()/2+2));
        }

        //returns a new string with the last 2 characters swapped
        public static String swapLastTwo(String str) {
            return (str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2,str.length()-1));
        }

        //returns true if the string's first two characters are the same as its last two characters
        public static boolean frontAgain(String str) {
            if (str.substring(0,2).equals(str.substring(str.length()-2))) {
                return true;
            } else {
                return false;
            }
        }
}
