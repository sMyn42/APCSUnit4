package base.maketriangles;

public class MakeTriangles {
    public static void triangle1(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //	1
    //	22
    //	333
    //	4444
    //	55555

    public static void triangle2(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //	1
    //	12
    //	123
    //	1234
    //	12345

    public static void triangle3(int n){
        for(int i = 1; i <=n; i++){ //i is the line
            for(int j = 1; j<=i; j++){ //j is the char #
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //    1
    //   12
    //  123
    // 1234
    //12345

    public static void triangle4(int n){
        for(int i = 1; i <= n; i++){ //i is the line
            for(int j = n; j > i; j--){ //j is the char #
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){ //j is the char #
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //	5
    //	44
    //	333
    //	2222
    //	11111

    public static void triangle5(int n){
        for(int i = 1; i <= n; i++){ //i is the line
            for(int j = 1; j <= i; j++){ //j is the char #
                System.out.print(n - i + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        triangle1(7);
        triangle2(7);
        triangle3(7);
        triangle4(7);
        triangle5(7);
    }
}