package base.factorial;

public class Factorial {
    public static long calcFactorial(int n){

        long total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;

    }

    public static double calcE(){
        int term = 1;
        double e = 0;
        double addend = 1;
        while(addend > 0.001){
            e += addend;
            addend = (double)1/calcFactorial(term);
            term++;
        }
        return e;
    }

    public static double calcEX(int x){
        int term = 1;
        double ex = 1;
        double addendDenom = 1;
        double addendNum = 1;
        double addend = 1;
        while(addend >= 0.001){
            addendDenom = (double)calcFactorial(term);
            addendNum = Math.pow(x, term);
            addend = addendNum/addendDenom;
            ex += addend;
            term++;
        }
        return ex;
    }

    public static void main(String[] args){
        for(int i = 1; i <= 20; i++){
            System.out.println(calcFactorial(i));
        }
        for(int i = 1; i <= 5; i++) {
            System.out.printf("e is %2.3f \n", calcEX(i));
        }
    }

}
