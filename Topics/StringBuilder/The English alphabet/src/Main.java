class EnglishAlphabet {
    static char[] upperCaseAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < upperCaseAlphabet.length ; i++) {
            sb.append(upperCaseAlphabet[i]);
            if(upperCaseAlphabet.length -1 != i)
                sb.append(" ");
        }
        return sb;
    }
}