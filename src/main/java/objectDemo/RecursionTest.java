package objectDemo;

public class RecursionTest {
    public static void main(String[] args) {
        int sum = new RecursionTest().recursion(100);
        System.out.println("sum : " + sum);
    }

    public int recursion(int num){
        if (num == 1){
            return 1;
        }else{
            return num + recursion(num -1);
        }
    }
}
