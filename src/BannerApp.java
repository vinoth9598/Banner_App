public class BannerApp {

        // Method to generate pattern for letter 'O'
        public static String[] getOPattern() {
            return new String[] {
                    "  *****  ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    "  *****  "
            };
        }

        // Method to generate pattern for letter 'P'
        public static String[] getPPattern() {
            return new String[] {
                    " ******  ",
                    " *     * ",
                    " *     * ",
                    " ******  ",
                    " *        ",
                    " *        ",
                    " *        "
            };
        }

        // Method to generate pattern for letter 'S'
        public static String[] getSPattern() {
            return new String[] {
                    "  *****  ",
                    " *        ",
                    " *        ",
                    "  *****  ",
                    "       * ",
                    "       * ",
                    "  *****  "
            };
        }

        // Main method to display the OOPS banner
        public static void main(String[] args) {

            // Retrieve patterns
            String[] oPattern = getOPattern();
            String[] pPattern = getPPattern();
            String[] sPattern = getSPattern();

            // Assemble and print banner line by line
            for (int i = 0; i < oPattern.length; i++) {
                System.out.println(
                        String.join("",
                                oPattern[i],
                                oPattern[i],   // 'O' repeated twice
                                pPattern[i],
                                sPattern[i]
                        )
                );
            }
        }
}
