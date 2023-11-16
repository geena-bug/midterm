package user_defined_logic;

public class Q18 {
    public static int hexCharToDecimal(char hexChar) {
    if (hexChar >= 'A' && hexChar <= 'F') {
        return 10 + (hexChar - 'A');
    } else {
        return hexChar - '0';
    }}

}

