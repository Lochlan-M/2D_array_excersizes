import java.util.Random;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows-->");
        int r = scan.nextInt();
        System.out.println("Enter number of columns-->");
        int c = scan.nextInt();
        int arr[][] = new int[r][c];
        Random rand = new Random();

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        int rowsum = 0;
        for(int i=0;i<r;i++) {
            rowsum = 0;
            for(int j=0;j<c;j++) {
                rowsum += arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("    " + rowsum);
            System.out.println();
        }

        System.out.println();

        int colsum = 0;
        for(int i=0;i<c;i++) {
            colsum = 0;
            for(int j=0;j<r;j++) {
                colsum += arr[j][i];
            }
            System.out.print(colsum + " ");
        }

    }
}
