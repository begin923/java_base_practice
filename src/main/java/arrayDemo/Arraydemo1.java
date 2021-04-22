package arrayDemo;

public class Arraydemo1 {
    public static void main(String[] args) {
        int [] arr1,arr2;
        arr1 = new int[]{1,2,3};
//        arr2 = arr1;
//        arr2[2] = 5;
//        System.out.println(arr1[2] + " - " + arr2[2]);
//        System.out.println(arr1 + "\t " + arr2);

        // 数组赋值
        arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length ; i++){
            arr2[i] = arr1[i];
        }

        // 数组元素反转
        for(int i = 0 ,j = arr1.length - 1; i < j ; i++,j--){
            int temp = arr1[j];
            arr1[j] = arr1[i];
            arr1[i] = temp;
        }

        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }
    }
}
