package task1_2_3_4;

public class Matrix2x2 {

    private double[][] matrix = new double[2][2];
    public Matrix2x2(double elem0_0, double elem0_1, double elem1_0, double elem1_1) {
        matrix[0][0] = elem0_0;
        matrix[0][1] = elem0_1;
        matrix[1][0] = elem1_0;
        matrix[1][1] = elem1_1;
    }

    public Matrix2x2(double elem) {
        this(elem, elem, elem ,elem);
    }

    public Matrix2x2() {
        this(0.0);
    }

    public Matrix2x2(double[][] array) {
        this(array[0][0], array[0][1], array[1][0], array[1][1]);
    }

    public Matrix2x2 add(Matrix2x2 matrix_2) {
        Matrix2x2 new_matrix = new Matrix2x2();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                new_matrix.matrix[i][j] = this.matrix[i][j] + matrix_2.matrix[i][j];
        return new_matrix;
    }

    public void add2(Matrix2x2 matrix_2) {
        Matrix2x2 new_matrix = new Matrix2x2();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                this.matrix[i][j] = this.matrix[i][j] + matrix_2.matrix[i][j];
    }

    public Matrix2x2 sub(Matrix2x2 matrix_2) {
        Matrix2x2 new_matrix = new Matrix2x2();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                new_matrix.matrix[i][j] = this.matrix[i][j] - matrix_2.matrix[i][j];
        return new_matrix;
    }

    public void sub2(Matrix2x2 matrix_2) {
        Matrix2x2 new_matrix = new Matrix2x2();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                new_matrix.matrix[i][j] = this.matrix[i][j] - matrix_2.matrix[i][j];
    }

    public Matrix2x2 multNumber(double number) {
        Matrix2x2 new_matrix = new Matrix2x2();
        int ceil = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                new_matrix.matrix[i][j] = this.matrix[i][j] * number;
            }
        }
        return new_matrix;
    }

    public void multNumber2(double number) {
        int ceil = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.matrix[i][j] = this.matrix[i][j] * number;
            }
        }
    }

    public Matrix2x2 mult(Matrix2x2 matrix_2) {
        Matrix2x2 new_matrix = new Matrix2x2();
        int ceil = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    ceil += this.matrix[i][k] * matrix_2.matrix[k][j];
                new_matrix.matrix[i][j] = ceil;
            }
        }
        return new_matrix;
    }

    public void mult2(Matrix2x2 matrix_2) {
        int ceil = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    ceil += this.matrix[i][k] * matrix_2.matrix[k][j];
                this.matrix[i][j] = ceil;
            }
        }
    }

    public double det() {
        return this.matrix[0][0] * this.matrix[1][1] - this.matrix[0][1] * this.matrix[1][0];
    }

    public void transpon() {
        double temp = this.matrix[0][1];
        this.matrix[0][1] = this.matrix[1][0];
        this.matrix[1][0] = temp;
    }

    public Matrix2x2 inverseMatrix() {
        Matrix2x2 array = new Matrix2x2();
        double determination = this.det();
        double temp;
        try {
            temp = array.matrix[0][0];
            array.matrix[0][0] = this.matrix[1][1] / determination;
            array.matrix[1][1] = temp / determination;
            array.matrix[0][1] = (-1) * this.matrix[0][1] / determination;
            array.matrix[1][0] = (-1) * this.matrix[1][0] / determination;
            InverseMatrixManager.check(array.matrix);
        } catch (InverseMatrixMissing e) {
            return new Matrix2x2();
        }
        return array;
    }

    public Matrix2x2 equivalentDiagonal() {
        Matrix2x2 array = new Matrix2x2();
        array.matrix[0][0] =
        array.matrix[1][1] =  this.matrix[1][1] - this.matrix[1][0] / this.matrix[0][0] * this.matrix[0][1];
        return array;
    }

    /* public arrays.Matrix2x2 equivalentDiagonal() {
        arrays.Matrix2x2 array = new arrays.Matrix2x2();
        double a =  this.matrix[0][0];
        double b =  this.matrix[0][1];
        double c =  this.matrix[1][0];
        double d =  this.matrix[1][1];
        double discriminant;
        discriminant = (d+a) * (d+a) - 4 * (a * d - c * b);
        array.matrix[0][0] = ((d + a) + Math.sqrt(discriminant)) / (2 * (a * d - c * d));
        array.matrix[1][1] = ((d + a) - Math.sqrt(discriminant)) / (2 * (a * d - c * d));
        return array;
    } */

    public Vector2D multVector(Vector2D vec) {
        Vector2D result_vector = new Vector2D();
        result_vector.x = this.matrix[0][0] * vec.x + this.matrix[0][1] * vec.y;
        result_vector.x = this.matrix[1][0] * vec.x + this.matrix[1][1] * vec.y;
        return result_vector;
    }

    public void out() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
