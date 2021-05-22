package assignment10;

public class Q21_prefixAppearance {

    public static void main(String[] args) {

        appearance("abXYabc", 1);
        appearance("abXYabc", 2);
        appearance("abXYabc", 3);

    }

    public static void appearance(String str, int n) {
        boolean output = false;
        String inputWord = str;
        String searchWord = str.substring(0, n);
        int counter = 0;
        while (str.contains(searchWord)) {
            str = str.replaceFirst(searchWord, "");
            counter++;
            if (counter>1) {
                output = true;
            }

        }
        System.out.println("input: " + inputWord);
        System.out.println("input: " + n);
        System.out.println("output: " + output);
        System.out.println(searchWord + " appears " + counter + " only");
    }

}