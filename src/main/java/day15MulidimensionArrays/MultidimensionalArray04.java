package day15MulidimensionArrays;

public class MultidimensionalArray04 {
    public static void main(String[] args) {
        int arr[][] ={{5, 0}, {-2, 4}, {65, -12, 23}};
        int max = arr[0][0];
        for (int[] W:arr){
            for (int u: W){
                max = Math.max(max, u);


            }
        }
        System.out.println(max);
    }
}
