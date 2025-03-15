public class WildcardMatching {

    public boolean isMatch(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        int sIndex = 0;
        int pIndex = 0;
        int fakePIndex = -1;
        int fakeSIndex = -1;

        while (sIndex < sLength) {
            if (pIndex < pLength && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?')) {
                sIndex++;
                pIndex++;
            } else if (pIndex < pLength && p.charAt(pIndex) == '*') {
                fakePIndex = pIndex;
                fakeSIndex = sIndex;
                pIndex++;
            } else if (fakePIndex != -1) {
                pIndex = fakePIndex + 1;
                fakeSIndex++;
                sIndex = fakeSIndex;
            } else {
                return false;
            }
        }

        while (pIndex < pLength && p.charAt(pIndex) == '*') {
            pIndex++;
        }

        return pIndex == pLength;
    }
}
