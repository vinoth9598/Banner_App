import java.util.HashMap ;
public class BannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        // Pattern for 'P'
        charMap.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *        ",
                " *        ",
                " *        "
        });

        // Pattern for 'S'
        charMap.put('S', new String[]{
                "  *****  ",
                " *        ",
                " *        ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        // Pattern for space
        charMap.put(' ', new String[]{
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        });

        return charMap;
    }

    /**
     * Displays a banner message using character patterns from the HashMap.
     *
     * @param message the message to display
     * @param charMap map containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();

        // Height of banner (7 lines)
        int patternHeight = charMap.get('O').length;

        // Loop through each line
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Loop through each character in message
            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]);
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
