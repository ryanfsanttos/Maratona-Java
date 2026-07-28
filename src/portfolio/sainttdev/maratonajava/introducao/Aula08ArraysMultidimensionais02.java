package portfolio.sainttdev.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{-2,-1,0};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{4,5,6,7,8,9};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
        for(int[] arrayBase: arrayInt2){
            System.out.println("\n--------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
