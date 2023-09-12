import java.util.Random;
import java.util.Scanner;


public class MatrixDisplayTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter matrix size --> ");
        int r = scan.nextInt();
        int c = scan.nextInt();
        int arr[][]= new int[r][c];
        Random rand = new Random();
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j] = rand.nextInt(201);
            }
        }
        System.out.println("Generated Matrix:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Numbers Less Than 100");
        System.out.println("Row\tColumn");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(arr[i][j] < 100) {
                    System.out.println(i+"\t"+j);
                }
            }
        }
    }

}
