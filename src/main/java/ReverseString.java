import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] inp = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        reverseString(inp);
        System.out.println(Arrays.toString(inp));
    }

    public static void reverseString(char[] s) {
        reverseString(s, 0);
    }

    public static void reverseString(char[] s, int index) {
        if (index > s.length / 2 - 1)
            return;
        char temp = s[index];
        s[index] = s[s.length - index - 1];
        s[s.length - index - 1] = temp;
        reverseString(s, index + 1);
    }
}
