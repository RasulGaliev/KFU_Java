import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ByteOut {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int input;
        try(FileInputStream fin = new FileInputStream("byteOutFile.txt")) {
            while ((input = fin.read()) != -1)
                set.add(input);
            list.addAll(set);
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return (o2 - o1);
                }
            });
            for (Integer elem : list)
                System.out.print(elem + " ");
        }
        catch(IOException ex){
            System.out.println("error");
        }
    }
}
