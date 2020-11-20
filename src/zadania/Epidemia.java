package zadania;

public class Epidemia {
    static int dni=1;
    static int[] tab= new int[10000];
    static int ozdrowiency = 0;
    static int ludnosc=100000;
    static int epidemia(int n){

        if(dni>7){
            n=n-tab[dni-7];
            ludnosc=ludnosc-tab[dni-7];
            ozdrowiency=+tab[dni-7];
        }

        while(ludnosc>n){
            System.out.printf("Dzien "+dni);
            System.out.println(" Ludnosc ktora moze zachorowac "+(ludnosc-n));
            System.out.printf(" chorzy " +n);
            System.out.printf(" ozdrowiency "+ozdrowiency);
            System.out.println("");
            tab[dni]=n;
            dni++;
            return epidemia(n + 2*n);
        }
        return n; }




    public static void main(String [] args){
        System.out.println(epidemia(10));
    }


}