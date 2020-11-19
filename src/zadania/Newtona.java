package zadania;
import java.util.Scanner;

public class Newtona {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj n: ");
        int n = input.nextInt();

        System.out.print("Podaj k: ");
        int k = input.nextInt();

        int[][] tab = new int[k+1][n+1];

            for (int i = 0; i < k+1; i++) {
                for (int j = 0; j < n+1; j++) {
                    if (i == j || i == 0) {
                        tab[i][j] = 1;

                    } else if (i < j && i > 0 && j > 0) {
                        tab[i][j] = tab[i - 1][j - 1] + tab[i][j-1];
                    }
                }

            }
        for(int i = 0; i < k+1; i++){
            for(int j = 0; j < n+1; j++){
                if(tab[i][j] == 0){
                    System.out.print("x");
                }else{
                    System.out.print(tab[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }

    }

}
