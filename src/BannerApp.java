public class BannerApp {
    public static void main(String[] args){
        // Inline declaration and initialization of banner lines
        String[] lines = {
                String.join("", "  *****  ", "  *****  ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", "  *****  ", "  *****  ", " *        ", "  *****  ")
        };

        // Step 3: Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
