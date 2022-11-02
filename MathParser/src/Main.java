public class Main {

    static int parseSum(String input) throws IllegalArgumentException {
        int result = 0;
        if (input.length() == 0) {
            throw new IllegalArgumentException("Leerstring");
    }

        for (int j = 0; j < input.length(); j = j + 2) {
            if (!Character.isDigit(input.charAt(j)))
                throw new IllegalArgumentException("Operand ist kein Integer");
            }

        for (int i = 1; i < input.length(); i = i + 2) {
            if (input.charAt(i) != '+') {
                throw new IllegalArgumentException("String ohne +");
            }
        }
        for (int j = 0; j < input.length(); j = j + 2) {
            char q = input.charAt(j);
            result += (q - '0');
        }
        return result;
    }


    public static void main(String[] args) throws IllegalArgumentException {
        int x = parseSum("5+3+2");
        System.out.println(x);

        int y = parseSum("5+3+s");
        System.out.println(y);

        int w = parseSum("5 3 2");
        System.out.println(w);

        int z = parseSum("");
        System.out.println(z);
    }
}