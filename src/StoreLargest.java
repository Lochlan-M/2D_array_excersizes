import java.util.Random;

public class StoreLargest {
    public static void main(String[] args){
        int r = 4;
        int c = 4;
        int arr[][]= new int[4][4];
        int arr2[][]= new int[4][4];
        int arr3[][]= new int[4][4];

        Random rand = new Random();

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {

                arr[i][j] = rand.nextInt(9)+1;
            }
        }


        System.out.println("Matrix 1");
        for(int[] rows:arr)
        {
            for(int column:rows)
            {
                System.out.print(column + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {

                arr2[i][j] = rand.nextInt(9)+1;
            }
        }

        System.out.println("Matrix 2");
        for(int[] rows:arr2)
        {
            for(int column:rows)
            {
                System.out.print(column + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {

                if (arr[i][j] > arr2[i][j]){
                    arr3[i][j] = arr[i][j];
                }
                else{
                    arr3[i][j] = arr2[i][j];
                }
            }
        }

        System.out.println("Largest Elements");
        for(int[] rows:arr3)
        {
            for(int column:rows)
            {
                System.out.print(column + " ");
            }
            System.out.println("");
        }


    }
}
