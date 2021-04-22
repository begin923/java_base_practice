package objectDemo;

public class StudentTest {

    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for(int i = 0 ; i < stus.length ; i++){
            stus[i] = new Student();
            stus[i].number = i + 1;
            stus[i].state = (int)(Math.random() * 6 + 1);
            stus[i].score = (int)(Math.random() * 100);
        }

        // 根据学生分数排名 - 冒泡排序
        for(int i = 0 ; i < stus.length - 1 ; i++){
            for (int j = 0 ; j < stus.length - 1- i ; j++){
                if (stus[j].score < stus[j + 1].score){
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }

        for(int i = 0 ; i < stus.length ; i++){
            System.out.println(i + " - " + stus[i].number + "\t" + stus[i].state + "\t" + stus[i].score);
        }
    }

}

class Student{
    int number;
    int state;
    int score;
}
