package zadania;

public class EpidemiaSzczur {

    static double dz3(int d){
        if(d==1){
            return 10;
        }else if(d>1 && d<=7){
            return dz3(d-1) + 2*0.5*dz3(d-1);
        }else{
            return dz3(d-1) + 2*0.5*dz3(d-1) - dz3(d-7);
        }
    }

    public static void main(String[] args){
        double ch = 0;
        int czas = 0;
        while(ch<50000){
            czas++;
            ch = dz3(czas);
            System.out.println("Liczba chorych " +ch);
        }
        System.out.println("Dzień: " +czas);
    }

}
