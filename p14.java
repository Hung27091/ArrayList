public class p14 {
    public static void main(String[] args) {
        String[] a = {"dog", "racecar", "car"};
        longestCommonPrefix(a);
    }
    public static String longestCommonPrefix(String[] strs) {
        int[] arr = new int[strs.length];
        String s = "";
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = strs[i].length();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr[0]; i++) {
            char x = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != x) {
                    return s;
                }
            }
            s += x;

        }

        return s;
    }
}
