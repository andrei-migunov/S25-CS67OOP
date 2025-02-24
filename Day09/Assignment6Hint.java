public class Assignment6Hint{

    public static void main(String[] args){
        //...

        char[][] my_mat = new char[6][6];
        String x = "abcdef";
        char[] my_arr = x.toCharArray();
        my_mat[3] = my_arr;
       
        print_2d(my_mat);


    }

    public static void print_2d(char[][] mat){
        for(int i = 0; i < mat.length;i++){
            for(int j =0; j < mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}