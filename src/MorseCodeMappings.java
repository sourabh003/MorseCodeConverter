import java.util.HashMap;

public class MorseCodeMappings {
    public String LETTER_SPACING = " ";
    public String WORD_SPACING = "   ";

    public String A = ".-";
    public String B = "-...";
    public String C = "-.-.";
    public String D = "-..";
    public String E = ".";
    public String F = "..-.";
    public String G = "--.";
    public String H = "....";
    public String I = "..";
    public String J = ".--";
    public String K = "-.-";
    public String L = ".-..";
    public String M = "--";
    public String N = "-.";
    public String O = "---";
    public String P = ".--.";
    public String Q = "--.-";
    public String R = ".-.";
    public String S = "...";
    public String T = "-";
    public String U = "..-";
    public String V = "...-";
    public String W = ".--";
    public String X = "-..-";
    public String Y = "-.--";
    public String Z = "--..";

    public String ZERO = "-----";
    public String ONE = ".----";
    public String TWO = "..---";
    public String THREE = "...--";
    public String FOUR = "....-";
    public String FIVE = ".....";
    public String SIX = "-....";
    public String SEVEN = "--...";
    public String EIGHT = "---..";
    public String NINE = "----.";

    HashMap<String, String> mapping = new HashMap<>();
    HashMap<String, String> reverseMapping = new HashMap<>();

    public MorseCodeMappings() {

        mapping.put("A", A);
        mapping.put("B", B);
        mapping.put("C", C);
        mapping.put("D", D);
        mapping.put("E", E);
        mapping.put("F", F);
        mapping.put("G", G);
        mapping.put("H", H);
        mapping.put("I", I);
        mapping.put("J", J);
        mapping.put("K", K);
        mapping.put("L", L);
        mapping.put("M", M);
        mapping.put("N", N);
        mapping.put("O", O);
        mapping.put("P", P);
        mapping.put("Q", Q);
        mapping.put("R", R);
        mapping.put("S", S);
        mapping.put("T", T);
        mapping.put("U", U);
        mapping.put("V", V);
        mapping.put("W", W);
        mapping.put("X", X);
        mapping.put("Y", Y);
        mapping.put("Z", Z);

        mapping.put("0", ZERO);
        mapping.put("1", ONE);
        mapping.put("2", TWO);
        mapping.put("3", THREE);
        mapping.put("4", FOUR);
        mapping.put("5", FIVE);
        mapping.put("6", SIX);
        mapping.put("7", SEVEN);
        mapping.put("8", EIGHT);
        mapping.put("9", NINE);

        reverseMapping.put(A, "A");
        reverseMapping.put(B, "B");
        reverseMapping.put(C, "C");
        reverseMapping.put(D, "D");
        reverseMapping.put(E, "E");
        reverseMapping.put(F, "F");
        reverseMapping.put(G, "G");
        reverseMapping.put(H, "H");
        reverseMapping.put(I, "I");
        reverseMapping.put(J, "J");
        reverseMapping.put(K, "K");
        reverseMapping.put(L, "L");
        reverseMapping.put(M, "M");
        reverseMapping.put(N, "N");
        reverseMapping.put(O, "O");
        reverseMapping.put(P, "P");
        reverseMapping.put(Q, "Q");
        reverseMapping.put(R, "R");
        reverseMapping.put(S, "S");
        reverseMapping.put(T, "T");
        reverseMapping.put(U, "U");
        reverseMapping.put(V, "V");
        reverseMapping.put(W, "W");
        reverseMapping.put(X, "X");
        reverseMapping.put(Y, "Y");
        reverseMapping.put(Z, "Z");

        reverseMapping.put(ZERO, "0");
        reverseMapping.put(ONE, "1");
        reverseMapping.put(TWO, "2");
        reverseMapping.put(THREE, "3");
        reverseMapping.put(FOUR, "4");
        reverseMapping.put(FIVE, "5");
        reverseMapping.put(SIX, "6");
        reverseMapping.put(SEVEN, "7");
        reverseMapping.put(EIGHT, "8");
        reverseMapping.put(NINE, "9");
    }

    public HashMap<String, String> getMorseCodeMapping() {
        return mapping;
    }

    public HashMap<String, String> getReverseMapping() {
        return reverseMapping;
    }
}
