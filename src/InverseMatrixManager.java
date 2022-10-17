public class InverseMatrixManager {
    public static void check(double[][] array) throws InverseMatrixMissing {
        boolean flag = true;
        for (int i = 0; i < 2 && flag; i++) {
            for (int j = 0; j < 2 && flag; j++) {
                flag = !Double.isNaN(array[i][j]) && !Double.isInfinite(array[i][j]);
            }
        }
        if (!flag)
            throw new InverseMatrixMissing("There is no inverse matrix");
    }
}
