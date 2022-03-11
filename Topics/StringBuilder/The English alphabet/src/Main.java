class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder alphabet = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.append(c + (c == 'Z' ? "" : " "));
        }
        return alphabet;
    }
}