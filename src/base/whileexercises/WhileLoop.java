package base.whileexercises;

public class WhileLoop {
    //    Write an int method addOdds(int n) that calculates and returns the sum of all odd integers from 1 to
    //    n. You may assume that n is positive. Use a for loop and test on at least 3 integers.

    public static int addOdds(int n){
        int odd = 1;
        int sum = 0;
        while (odd <= n) {
            sum += odd;
            odd += 2;
        }
        return sum;
    }

    //    The population of Mexico was 111.2 million people in 2010. It is growing at a rate of 1.13% per year.
    //    Write an int method howManyYears(double startpop, double endpop) that will calculate how many
    //    years it will take to reach a particular population level. Use a while loop. Test your method using 120
    //    million and 150 million and end populations.

    public static int howManyYears(double startpop, double endpop){
        double rate = 0.0113;
        double pop = startpop; //111.2 (million) in 2010 (year 0).
        int year = 0;
        while (pop < endpop){
            year++;
            pop *= (1 + rate);
        }
        return year;
    }

    //    Write a void method printSum(int) that produces the following output for a given value of n. Test
    //    your method using 3 different values of n. Use a for loop.

    public static void printSum(int n) {
        int i = 1;
        int total = 1;
        while(i < n){
            System.out.print(i + " + ");
            i++;
            total += i;
        }
        System.out.println(i + " = " + total);
        //System.out.println("= " + ((n+1)*n/2));
    }

    //    Write a boolean method isPerfectSquare(int n) that uses a while loop and makes use of the following
    //    fact that every perfect square (x2) can be written as the sum of x consecutive odd numbers.

    public static boolean isPerfectSquare (int n) {
        int odd = 1;
        int sum = 0;
        while (sum < n){
            sum+=odd;
            odd+=2;
            if (sum == n) return true;
        }
        return false;
    }

    //    Write an int method sumDigits(int) that calculates and returns the sum of all of the digits of a given
    //    integer. You may assume the number is positive. Test on 3 numbers with different numbers of digits.

    public static int sumDigits(int n){
        int sum = 0;
        int digit = 0;

        while (n>0) {
            digit = n%10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args){
        System.out.println(addOdds(3));
        System.out.println(addOdds(7));
        System.out.println(addOdds(11));
        System.out.println();
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));
        System.out.println();
        printSum(4);
        printSum(10);
        printSum(13);
        System.out.println();
        System.out.println(isPerfectSquare(625));
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(89));
        System.out.println(isPerfectSquare(1245));
        System.out.println();
        System.out.println(sumDigits(37));
        System.out.println(sumDigits(20002));
        System.out.println(sumDigits(1625));
    }

}
