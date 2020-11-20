package zadania;

public class Bakterie {
    static double liczBakterie(int t){
        if(t==0)return 1;
        else {
            return 2*liczBakterie(t-1);
        }

    }

    public static void main(String[] args) {
        int t=1;
        double ile = liczBakterie(t);
        while (ile<1000){
            t++;
            ile=liczBakterie(t);
        }
        System.out.println("Liczba bakterii: "+ ile+ " upłynęło minut "+ 2*t);
        while (ile<10000){
            t++;
            ile=liczBakterie(t);
        }
        System.out.println("Liczba bakterii: "+ ile+ " upłynęło minut "+ 2*t);
        while (ile<100000){
            t++;
            ile=liczBakterie(t);
        }
        System.out.println("Liczba bakterii: "+ ile+ " upłynęło minut "+ 2*t);
        while (ile<1000000){
            t++;
            ile=liczBakterie(t);
        }
        System.out.println("Liczba bakterii: "+ ile+ " upłynęło minut "+ 2*t);
    }

}
