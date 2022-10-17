import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class MyArray {
    public static void task1(int[] array, int n) {
        boolean first = true;
        int indexFist = 0;
        int tempPrevious = 0;
        int temp;

        for (int i = 0; i < n; ++i) {
            if (primeNumber(array[i]) && first) {
                first = false;
                indexFist = i;
                tempPrevious = array[i];
            } else if (primeNumber(array[i])) {
                temp = array[i];
                array[i] = tempPrevious;
                tempPrevious = temp;
            }
        }
        array[indexFist] = tempPrevious;
        System.out.println("Первое задание");
        System.out.println(Arrays.toString(array) + "\n");
    }

    public static boolean primeNumber(int number) {
        boolean flag = number != 1;

        for(int i = number / 2; i > 1 && flag; --i) {
            flag = number % i != 0;
        }

        return flag;
    }

    public static void task2(int[] array, int n) {
        int length = 0;
        int maxLength = 0;
        int index = 0;
        int maxIndex = 0;
        boolean flag = false;

        for(int i = 0; i < n; ++i) {
            if (array[i] == 1 && !flag) {
                flag = true;
                ++length;
                index = i;
            } else if (array[i] == 1) {
                ++length;
            } else if (array[i] != 1 && flag) {
                flag = false;
                maxLength = Math.max(maxLength, length);
                if (maxLength == length) {
                    maxIndex = index;
                }

                length = 0;
            }
        }

        System.out.println("Второе задание");
        System.out.println("Количество единиц = " + maxLength);
        System.out.println("Индекс первой единицы = " + maxIndex + "\n");
    }

    public static boolean madgicSquare(int[][] matrix, int n) {
        int standard = 0;

        int sumVertical;
        for(sumVertical = 0; sumVertical < n; ++sumVertical) {
            standard += matrix[sumVertical][0];
        }

        sumVertical = 0;
        int sumHorizontal = 0;
        int sumDiaganal1 = 0;
        int sumDiaginal2 = 0;
        boolean flag = true;

        for(int l = 0; l < n && flag; ++l) {
            int j;
            for(j = 0; j < n; ++j) {
                sumVertical += matrix[j][l];
            }

            for(j = 0; j < n; ++j) {
                sumHorizontal += matrix[l][j];
            }

            sumDiaganal1 += matrix[l][l];
            sumDiaginal2 += matrix[n - l - 1][n - l - 1];
            flag = sumVertical == standard && sumHorizontal == standard;
            sumVertical = 0;
            sumHorizontal = 0;
        }

        if (flag) {
            flag = sumDiaganal1 == standard && sumDiaginal2 == standard;
        }

        return flag;
    }

    public static int[][] rotateMatrix(int[][] matrix, int n) {
        int[][] newMatrix = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                newMatrix[i][n - j - 1] = matrix[j][i];
            }
        }

        return newMatrix;
    }

    public static void task3(int[][] matrix, int n) {
        if (madgicSquare(matrix, n)) {
            matrix = rotateMatrix(matrix, n);
        }

        System.out.println("Третье задание");
        Stream var10000 = Arrays.stream(matrix).map(Arrays::toString);
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
        System.out.println();
    }

    public static void test() {
        int[] array1 = new int[]{1, 6, 8, 5, 1, 2, 5, 3, 4, 9};
        int[] array2 = new int[]{1, 6, 8, 5, 1, 1, 1, 3, 4, 1};
        int[][] matrix = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        task1(array1, 10);
        task2(array2, 10);
        task3(matrix, 3);
    }
}
