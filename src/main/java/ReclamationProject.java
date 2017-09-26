/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/** */
public class ReclamationProject {
    /** */
    static String doit(final String firstInput, final String secondInput) {
        /** */
        String shortInput = firstInput;
        String longInput = secondInput;
        if (firstInput.length() > secondInput.length()) {
            shortInput = secondInput;
            longInput = firstInput;
        }
        String output = "";
        for (int i = 0; i < shortInput.length(); i++) {
            for (int j = shortInput.length() - i; j > 0; j--) {
                for (int k = 0; k < longInput.length() - j; k++) {
                    if (shortInput.regionMatches(i, longInput, k, j) && j > output.length()) {
                        output = shortInput.substring(i, i + j);
                    }
                        }
                }
        }
        return output;
        }
}
