package level2.utils;

/**
 * Utility class to format the sign of a numeric change.
 * Returns '+' if the value is positive, otherwise a space character.
 */
public class ChangeSymbolFormatter {

    public static String changeSymbol(double value) {
        if (value > 0) return "+";
        return "";
    }

}
