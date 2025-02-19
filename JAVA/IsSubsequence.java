public class IsSubsequence {
    public static void main(String[] args) {

    }
    static boolean Subseq(String process, String unprocess){
        int i = 0, j = 0;
        while (i < process.length() && j < unprocess.length()) {
            if (process.charAt(i) == unprocess.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == process.length();
    }
}

