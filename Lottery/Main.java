import java.util.Random;
import java.util.Arrays;
import java.text.NumberFormat;

public class Main {

    public static void rand(int array[], int a) {
        Setting setting1  = new Setting();

        NumberFormat comFormat = NumberFormat.getNumberInstance(); // 数字のカンマ区切り


        // 疑似設定
        setting1.c1 = 1;
        setting1.c2 = 2;
        setting1.c3 = 3;
        setting1.c4 = 4;
        setting1.c5 = 5;
        setting1.c6 = 6;
        setting1.c7 = 7;

        int[] buy = { setting1.c1, setting1.c2, setting1.c3, setting1.c4, setting1.c5, setting1.c6, setting1.c7 }; // 購入数字の配列作成

        
        //TxtField.frame(buy, setting1);

        for (int i = 0; i <= 100; i++) {
            // 乱数生成----------------------
            // Creating object for Random class
            Random rd = new Random();

            // Starting from the last element and swapping one by one.
            for (int z = a - 1; z > 0; z--) {

                // Pick a random index from 0 to i
                int j = rd.nextInt(z + 1);

                // Swap array[i] with the element at random index
                int temp = array[z];
                array[z] = array[j];
                array[j] = temp;
            }

            int m1 = array[1];
            int m2 = array[2];
            int m3 = array[3];
            int m4 = array[4];
            int m5 = array[5];
            int m6 = array[6];
            int m7 = array[7];
            int s1 = array[8];
            int s2 = array[9];

            // 本数字7個のソート設定、表示
            int[] mainnum = { m1, m2, m3, m4, m5, m6, m7 };
            Arrays.sort(mainnum);
            System.out.print("本数字");
            for (int mi = 0; mi < mainnum.length; mi++)
                // Printing the random generated array
                System.out.print(mainnum[mi] + " ");
            System.out.println();

            // ボーナス数字2個のソート設定、表示
            int[] subnum = { s1, s2 };
            Arrays.sort(subnum);
            System.out.print("ボーナス数字");
            for (int si = 0; si < subnum.length; si++)
                System.out.print(subnum[si] + " ");
            System.out.println();

            // 乱数生成ここまで----------------------

            int mus = setting1.sum;
            // ここにsys
            Synthesis.s(mainnum, subnum, buy, setting1);
            if (!(setting1.sum == mus)) {
                setting1.electedCount++;

            }

            setting1.totalAmount = 300 * i;
            System.out.println(i + "回目");
            System.out.println("これまでの合計使用金額" + comFormat.format(setting1.totalAmount) + "円");
            System.out.println("これまでの合計当選回数" + setting1.electedCount + "回");
            System.out.println("これまでの合計当選金額" + comFormat.format(setting1.sum) + "円");

            if (setting1.totalAmount >= setting1.sum) {
                setting1.lossAndgain = "赤字";
            } else {
                setting1.lossAndgain = "黒字";
            }

            setting1.result = Math.abs(setting1.totalAmount - setting1.sum);
            System.out.println("結果" + comFormat.format(setting1.result) + "円の" + setting1.lossAndgain + "です。");


        }

    }

    public static void main(String[] args) {

        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32, 33, 34, 35, 36, 37 };
        int b = ar.length;
        rand(ar, b);

    }
}