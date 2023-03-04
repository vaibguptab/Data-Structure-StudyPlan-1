package Data_structure_StudyPlan;

public class Day4 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4}};
        matrix = matrixReshape(matrix,1,4);

        int[][] twodmatrix = { {1,3,5,7} ,{10,11,16,20},{23,30,34,60}};
        System.out.println(Searchin2dmatrix(twodmatrix,16));
    }

    private static boolean Searchin2dmatrix(int[][] matrix,int k) {
        int i=0,j=matrix[0].length-1;
        while (i>=0 && i< matrix.length && j>=0 && j<matrix[0].length){
            if (matrix[i][j] == k){
                return true;
            }
            else if (matrix[i][j] > k) j--;
            else if (matrix[i][j] < k) {
                i++;
            }
        }
        return false;
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if((rows * cols) != (r * c)) return mat;

        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                output[output_rows][output_cols] = mat[i][j];
                output_cols++;
                if(output_cols == c)
                {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }

        return output;
    }
}
