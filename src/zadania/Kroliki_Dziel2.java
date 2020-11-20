package zadania;

public class Kroliki_Dziel2 {
    static int rozmnazanie(int t){
        if(t==1 || t==2 )return 1;
        else return rozmnazanie(t-1)+rozmnazanie(t-2);
    }

    public static void main(String[] args) {
        int t=1;
        int stado=rozmnazanie(t);
        while(stado<100){
            t++;
            stado=rozmnazanie(t);
        }
        System.out.println("Po "+ t+" miesiącach populacja przekroczyła liczebność 100 i wynosi teraz: " + stado);

        while(stado<1000){
            t++;
            stado=rozmnazanie(t);
        }
        System.out.println("Po "+ t+" miesiącach populacja przekroczyła liczebność 1000 i wynosi teraz: " + stado);

        while(stado<10000){
            t++;
            stado=rozmnazanie(t);
        }
        System.out.println("Po "+ t+" miesiącach populacja przekroczyła liczebność 10000 i wynosi teraz: " + stado);

        while(stado<100000){
            t++;
            stado=rozmnazanie(t);
        }
        System.out.println("Po "+ t+" miesiącach populacja przekroczyła liczebność 100000 i wynosi teraz: " + stado);

        while(stado<1000000){
            t++;
            stado=rozmnazanie(t);
        }
        System.out.println("Po "+ t+" miesiącach populacja przekroczyła liczebność 1000000 i wynosi teraz: " + stado);
    }
}
