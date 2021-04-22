package objectDemo;

public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
        System.out.println(test.method(10,8));
    }

    public int method(int m,int n){
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }
}

