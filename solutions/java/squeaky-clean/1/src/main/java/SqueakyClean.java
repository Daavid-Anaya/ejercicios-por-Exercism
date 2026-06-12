class SqueakyClean {
    static String clean(String identifier) {
        char[] asArray = identifier.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < asArray.length; i++) {
            if (asArray[i] == ' ') {
                sb.append('_' ); 
            } else if (asArray[i] == '-') {
                if (i + 1 < asArray.length) {
                    asArray[i+1] = Character.toUpperCase(asArray[i+1]);
                }
            } else if (Character.isDigit(asArray[i])) {
                switch (asArray[i]) {
                    case '0': sb.append('o'); break;
                    case '1': sb.append('l'); break;
                    case '3': sb.append('e'); break;
                    case '4': sb.append('a'); break;
                    case '7': sb.append('t'); break;
                    default: break;
                }
            } else if (Character.isLetter(asArray[i])) {
                sb.append(asArray[i]);
            }
        }
        
        return sb.toString();
    }
}
