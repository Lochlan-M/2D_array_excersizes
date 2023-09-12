import java.util.Random;
import java.util.Scanner;


public class Transpose {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows-->");
        int r = scan.nextInt();
        System.out.println("Enter number of columns-->");
        int c = scan.nextInt();
        int arr[][]= new int[r][c];
        Random rand = new Random();
        int g = 0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                g = rand.nextInt(101);
                if(rand.nextBoolean()){
                    g *= -1;
                }
                arr[i][j] = g;
            }
        }
        System.out.println("Generated Matrix:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int arr2[][]= new int[c][r];

        int o, p;
        for (o = 0; o < c; o++)
            for (p = 0; p < r; p++)
                arr2[o][p] = arr[p][o];


        System.out.println("Transpose");
        for(int k=0;k<c;k++) {
            for(int l=0;l<r;l++) {
                System.out.print(arr2[k][l]+" ");
            }
            System.out.println();
        }

    }

}
