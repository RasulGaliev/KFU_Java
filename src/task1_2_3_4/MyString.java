package task1_2_3_4;

public class MyString {
    public static boolean myEquals(String str1, String str2) {
        boolean flag = str1.length() == str2.length();
        for(int i = 0; i < str1.length() && flag; ++i)
            flag = str1.charAt(i) == str2.charAt(i);
        return flag;
    }

    public static boolean myContains(String str1, String str2) {
        boolean flag = str1.length() <= str2.length();
        for(int i = 0; i < str2.length() - str1.length() + 1 && (!flag || i == 0); ++i) {
            flag = true;
            for(int j = 0; j < str1.length() && flag; ++j)
                flag = str2.charAt(i + j) == str1.charAt(j);
        }
        return flag;
    }

    public static StringBuilder firstLastLetter(String str) {
        char last = str.charAt(0);
        int l, j;
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < str.length(); i += l + 1) {
            char first = str.charAt(i);
            for(j = i, l = 0; j < str.length() && str.charAt(j) != ' '; ++j, l++)
                last = str.charAt(j);
            for(j = i; first == last && j < str.length() && str.charAt(j) != ' '; ++j)
                result.append(str.charAt(j));
            if (result.charAt(result.length() - 1) != ' ')
                result.append(" ");
        }
        return result;
    }

    public static int palindrome(String str) {
        int count = 0;
        int first, last = 0;
        boolean flag;
        int l, j;
        for(int i = 0; i < str.length(); i += l + 1) {
            first = i;
            flag = true;
            for(j = i, l = 0; j < str.length() && str.charAt(j) != ' '; ++j, l++)
                last = j;
            for(; flag && first < last; first++, last--)
                flag = str.charAt(first) == str.charAt(last);
            if (flag)
                count++;
        }
        return count;
    }

    public static void test() {
        System.out.println("Первое задание\n" + myEquals("str1", "str2") + "\n");
        System.out.println("Второе задание\n" + myContains("str", "str") + "\n");
        System.out.println("Третье задание\n" + firstLastLetter("fdf sddd sdf adfso dfrd dfd hfdgdh dfgdfsgdf") + "\n");
        System.out.println("Четвертое задание\nКоличество палиндромов " + palindrome("ssd is disk ggg hah hah ha\n\n"));
    }
}
