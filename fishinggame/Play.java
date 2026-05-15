package fishinggame;

import java.util.Scanner;

public class Play {

    public static void play() {
        Scanner play = new Scanner(System.in);
        System.out.println("何回釣りますか？＞");
        int playNum = play.nextInt();

        // プレイ回数が1回以上であることを確認
        if (playNum <= 0) {
            System.out.println("1以上の数字を入力してください");
        } else {
            FishList fl = new FishList();
            SpotList sl = new SpotList();
            Spot[] spotList = sl.getSpots();
            int totalPoint = 0;

            for (int i = 1; i <= playNum; i++) {
                Scanner spot = new Scanner(System.in);
                System.out.println("スポットを入力してください（0~4）＞");
                int spotNum = spot.nextInt();

                // 指定外の値を入力されたとき、強制的に"川"で行う
                if (spotNum < 0 || spotNum >= spotList.length) {
                    System.out.println("無効なスポットです。今回は川で釣ります。");
                    spotNum = 0;
                }
                Spot spotSelected = spotList[spotNum];

                Fish pickFish = fl.getRandomFish();

                // 1回分の結果を表示
                System.out.println("====" + i + "回目" + "====");
                System.out.println(spotSelected + "で釣りました");
                System.out.println("釣れた魚：" + pickFish.getName() + " " + "ポイント：" + pickFish.getPoint());
                System.out.println("=======================");

                totalPoint += pickFish.getPoint();
            }
            System.out.println("~釣り終了~");
            System.out.println("合計ポイント：" + totalPoint + "点");

        }

    }
}