public class Rabids {
    public static int fib(int n){
        if (n==1) return 1;
        else if (n==2) return 1;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 1;
        boolean a=false, b=false, c=false, d=false, e=false;
        while (e==false)
        {
            if(fib(n)>=100 && a==false){
                System.out.println("Liczba miesiecy: " + n + " 100 krolikow");
                a=true;
            }
            if(fib(n)>=1000 && b==false){
                System.out.println("Liczba miesiecy: " + n + " 1000 krolikow");
                b=true;
            }
            if(fib(n)>=10000 && c==false){
                System.out.println("Liczba miesiecy: " + n + " 10000 krolikow");
                c=true;
            }
            if(fib(n)>=100000 && d==false){
                System.out.println("Liczba miesiecy: " + n + " 100000 krolikow");
                d=true;
            }
            if(fib(n)>=1000000 && e==false){
                System.out.println("Liczba miesiecy: " + n + " 1000000 krolikow");
                e=true;
            }
            n++;
        }
    }
}
