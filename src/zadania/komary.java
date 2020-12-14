public class Zadanie_1 {
    static double samce = 450;
    static double samice = 550;
    static int czas;
    static double counter = 0;

    static double komar(int n)
    {
        if (n == 0 || n == 1)
            return 1000;
        else
            samce+=0.45*komar(n-1)*0.1;
            samce-=samce*0.02;
            samice+=0.55*komar(n-1)*0.1;
            samice-=samice*0.05;
            if(samce<samice) counter++;
            return komar(n-1)*1.1;
    }

    public static void main(String[] args) {
        czas = 0;
        double ilosc = 0;
        while(samce<samice)
        {
            ilosc = komar(czas);
            czas++;
        }
        System.out.println("Samce: " + samce);
        System.out.println("Samice: " + samice);
        System.out.println("Ilosc komarow: " + ilosc);
        System.out.println("Czas: " + counter + " ,tygodnie: " + czas);
    }
}
