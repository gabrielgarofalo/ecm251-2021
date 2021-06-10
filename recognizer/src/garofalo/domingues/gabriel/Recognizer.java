package garofalo.domingues.gabriel;

public class Recognizer {
    // Relevant states
    public static final int INITIAL = 0;
    public static final int FINAL = 1;
    public static final int ERROR = 4;
    // Symbol constants
    public static final int DIGIT = 0;
    public static final int SIGNAL = 1;
    public static final int SYMBOL = 2;
    public static final int OTHER = 3;
    private int[][] table = { { 1, 2, 4, 4 }, { 1, 4, 3, 4 }, { 1, 4, 4, 4 },
             { 1, 2, 4, 4 }, { 4, 4, 4, 4 }};
    private int currentState;
    // Constructor (empty)
    public Recognizer() {
    }
    // Recognize (or not) if the string is a number
    // returns the number or throws an NumberFormatException , otherwise
    public double recognize(String s) throws NumberFormatException {
        s = s.replaceAll("[^\\.0123456789eE-]", "");
        int pos = 0;
        double resultado;
        int number = 0;
        int signal = 1;
        double sym = 0;
        currentState = INITIAL;
        while (pos < s.length()) {
            char c = s.charAt(pos);
            int symbol = getSymbol(c);
            currentState = table[currentState][symbol];
            if (currentState == ERROR) {
                throw new NumberFormatException(s + " is not a number!");
            }
            if (symbol == DIGIT) {
                number = (c - '0');
            }
            if (symbol == SIGNAL) {
            //Variable c carries the signal symbol
                signal = signal * (c == '+' ? 1 : (-1));
            }
            if (symbol == SYMBOL){
                Double ant =  Double.parseDouble(s.substring(0, pos));
                Double expoente =  Double.parseDouble(s.substring(pos+1));
                Double tem_ponto = Double.parseDouble(s);
                if (c == 'e'){
                    sym = ant * Math.exp(expoente);
                } else if (c == 'E') {
                    sym = ant * Math.pow(10, expoente);
                } else if (c == '.'){
                    sym = tem_ponto;
                }
                else{
                    sym = number;
                }
            }
            pos++;
        }
        if (currentState != FINAL) {
            throw new NumberFormatException(s + " is not a number!");
        }
        if (s.contains("e") || s.contains("E") || s.contains(".")) {
            return sym;
        }
        resultado = Double.parseDouble(s);
        return resultado;
    }
    private int getSymbol(char c) {
        if (Character.isDigit(c)) {
            return DIGIT;
        } else if (c == '-' || c == '+') {
            return SIGNAL;
        } else if (c == '.' || c == 'e' || c == 'E'){
            return SYMBOL;
        }else {
            return OTHER;
        }
    }
}
