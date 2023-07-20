public class Kata {
    public static String findNeedle(Object[] haystack) {
        int position = -1;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] != null && haystack[i].toString().equals("needle")) {
                position = i;
                break;
            }
        }
        return "found the needle at position " + position;
    }
}
