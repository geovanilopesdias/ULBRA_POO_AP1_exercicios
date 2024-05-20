public class GeneralUtilities {
    /**
     * Checks if a string is a number; from Baeldung.com.
     * */
    public static boolean isNumeric(String sv) {
        if (sv == null) return false;
        try {float fv = Float.parseFloat(sv);}
        catch (NumberFormatException nfe) {return false;}
        return true;
    }
}
