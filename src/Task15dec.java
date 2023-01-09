
import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Task15dec {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/dictionary");
        Map<String, String> hashMap = new HashMap<>();
        List<String> linkedList = new LinkedList<>();

        int c;
        StringBuilder string = new StringBuilder();

        while ((c=file.read())!=-1) {
            if (c != (int) '=' && c != (int) '\n') {
                string.append((char) c);
            } else {
                if (string.charAt(string.length() - 1) == ' ')
                    string.deleteCharAt(string.length() - 1);

                if (string.charAt(0) == ' ')
                    string.deleteCharAt(0);
                linkedList.add(string.toString());
                string.delete(0, string.length());
            }
        }

        linkedList.add(string.toString());
        string.delete(0, string.length());

        for (int i = 0; i + 1 < linkedList.size(); i+=2) {
            hashMap.put(linkedList.get(i), linkedList.get(i + 1));
        }

        file.close();
        file = new FileReader("src/text");

        while ((c=file.read())!=-1) {
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                string.append((char) c);
            } else {
                if (hashMap.containsKey(string.toString())) {
                    System.out.print(hashMap.get(string.toString()));
                    System.out.print((char) c);
                    string.delete(0, string.length());
                } else {
                    string.append((char) c);
                }
            }
        }
        if (hashMap.containsKey(string.toString())) {
            System.out.print(hashMap.get(string.toString()));
        }
        file.close();
    }
}
