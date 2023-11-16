package user_defined_logic;

import static user_defined_logic.Q18.hexCharToDecimal;

/**
 * Convert hexadecimal to decimal
 */
public class Q19 {
    public static int hexToDecimal(String hexString) {
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            int hexDigitValue = hexCharToDecimal(hexChar);
            decimalValue = decimalValue * 16 + hexDigitValue;
        }
        return decimalValue;
    }

}
