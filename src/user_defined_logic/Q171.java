package user_defined_logic;

public class Q171 {
    public static void main(String[] args) {
        int x = 10;
        max(x, 5);
        System.out.println("x after method call: " + x);
    }

    public static void max(int a, int b) {
        a = (a > b) ? a : b;
    }
}


