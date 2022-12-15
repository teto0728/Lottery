public class Synthesis {
    public static void s(int[] mainnum, int[] subnum, int[] buy, Setting setting1) {

        // synthesis = 合致/
        // 合致判断はメイン数字と合致で10点サブ数字合致で1点
        int syn = 0;

        /*
         * 配列表示
         * for(int i = 0; i <= 6; i++){
         * System.out.println(mainnum[i] + ",");
         * }
         */

        for (int i = 0; i <= 6; i++) {
            if (buy[0] == mainnum[i]) {
                syn += 10;
            }
            if (buy[1] == mainnum[i]) {
                syn += 10;
            }
            if (buy[2] == mainnum[i]) {
                syn += 10;
            }
            if (buy[3] == mainnum[i]) {
                syn += 10;
            }
            if (buy[4] == mainnum[i]) {
                syn += 10;
            }
            if (buy[5] == mainnum[i]) {
                syn += 10;
            }
            if (buy[6] == mainnum[i]) {
                syn += 10;
            }
        }

        for (int i = 0; i <= 1; i++) {
            if (buy[0] == subnum[i]) {
                syn += 1;
            }
            if (buy[1] == subnum[i]) {
                syn += 1;
            }
            if (buy[2] == subnum[i]) {
                syn += 1;
            }
            if (buy[3] == subnum[i]) {
                syn += 1;
            }
            if (buy[4] == subnum[i]) {
                syn += 1;
            }
            if (buy[5] == subnum[i]) {
                syn += 1;
            }
            if (buy[6] == subnum[i]) {
                syn += 1;
            }
        }
        // 点数計算
        int wm = 0; // winning Money = 当選金額
        int o = 0; // o = order 等数.一等二等など
        if (syn == 70) {
            wm = 600000000;
            o = 1;
        } else if (syn == 61) {
            wm = 7300000;
            o = 2;
        } else if (syn == 62) {
            wm = 7300000;
            o = 2;
        } else if (syn == 60) {
            wm = 700000;
            o = 3;
        } else if (syn == 50) {
            wm = 9100;
            o = 4;
        } else if (syn == 40) {
            wm = 1400;
            o = 5;
        } else if (syn == 31) {
            wm = 1000;
            o = 6;
        } else if (syn == 32) {
            wm = 1000;
            o = 6;
        }

        // 点数表示
        //System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●今回の点数" + syn);
        
        if ((syn == 70) || (syn == 61) || (syn == 62) || (syn == 60) || (syn == 50) || (syn == 40) || (syn == 31)
                || (syn == 32)) {
            System.out.println("おめでとう！　" + o + "等当選！");
        } else {
            System.out.println("残念　はずれです");
        }
        System.out.println("今回の当選金額" + wm + "円");
        setting1.sum += wm;
        // wm = 0;
        System.out.println("★★★★★★★★★★★★");

    }
}
