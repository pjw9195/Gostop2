package com.example.jinwoo.gostop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.example.jinwoo.gostop.R.drawable.oneone;
import static com.example.jinwoo.gostop.R.drawable.twelvefour;
import static com.example.jinwoo.gostop.R.id.center;
import static com.example.jinwoo.gostop.R.id.player1;
import static com.example.jinwoo.gostop.R.id.player1animal;
import static com.example.jinwoo.gostop.R.id.player1dan;
import static com.example.jinwoo.gostop.R.id.player1light;
import static com.example.jinwoo.gostop.R.id.player1panpi;
import static com.example.jinwoo.gostop.R.id.player2;
import static com.example.jinwoo.gostop.R.id.player2animal;
import static com.example.jinwoo.gostop.R.id.player2dan;
import static com.example.jinwoo.gostop.R.id.player2light;
import static com.example.jinwoo.gostop.R.id.player2panpi;


public class MainActivity extends AppCompatActivity {


    int[] imageArray = {0, oneone, R.drawable.onetwo, R.drawable.onethree, R.drawable.onefour, R.drawable.twoone, R.drawable.twotwo, R.drawable.twothree,
            R.drawable.twofour, R.drawable.threeone, R.drawable.threetwo, R.drawable.threethree, R.drawable.threefour, R.drawable.fourone, R.drawable.fourtwo, R.drawable.fourthree,
            R.drawable.fourfour, R.drawable.fiveone, R.drawable.fivetwo, R.drawable.fivethree, R.drawable.fivefour, R.drawable.sixone, R.drawable.sixtwo, R.drawable.sixthree, R.drawable.sixfour,
            R.drawable.sevenone, R.drawable.seventwo, R.drawable.seventhree, R.drawable.sevenfour, R.drawable.eightone, R.drawable.eighttwo, R.drawable.eightthree, R.drawable.eightfour,
            R.drawable.nineone, R.drawable.ninetwo, R.drawable.ninethree, R.drawable.ninefour, R.drawable.tenone, R.drawable.tentwo, R.drawable.tenthree, R.drawable.tenfour,
            R.drawable.elevenone, R.drawable.eleventwo, R.drawable.eleventhree, R.drawable.elevenfour, R.drawable.tweleveone, R.drawable.twelvetwo, R.drawable.twelvethree, twelvefour};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startGostop();
    }

    //List
    static List<Month> centerlist = new ArrayList<Month>();
    static List<Month> player1list = new ArrayList<Month>();
    static List<Month> player2list = new ArrayList<Month>();
    static List<Month> player1panlist = new ArrayList<Month>();
    static List<Month> player2panlist = new ArrayList<Month>();
    private static int b = 0; // 랜덤함수 Count 함수..
    private static int Xrandom[] = new int[48];
    private static int player1ts = 0; ////playertotalscore
    private static int player2ts = 0;
    private static int player1ps = 0; ////pastscore
    private static int player2ps = 0;
    private static int centerhand = 0; //centerhand index
    private static int playerhand = 0; //playerhand index

    /////////// player1 점수측정
    public int player1Score() {

        int TotalBasicScore = 0;
        int TotalGodori = 0;
        int TotalBlue = 0;
        int TotalRed = 0;
        int TotalCho = 0;
        int TotalLight = 0;
        int TotalAnimal = 0;
        int TotalDan = 0;
        int TotalBiLight = 0;
        int TotalScore = 0;
        for (int i = 0; i < player1panlist.size(); i++) {
            Month playerpanl1 = player1panlist.get(i);
            TotalBasicScore = TotalBasicScore + playerpanl1.BasicScore;
            TotalGodori = TotalGodori + playerpanl1.Godori;
            TotalBlue = TotalBlue + playerpanl1.Blue;
            TotalRed = TotalRed + playerpanl1.Red;
            TotalCho = TotalCho + playerpanl1.Cho;
            TotalLight = TotalLight + playerpanl1.Light;
            TotalAnimal = TotalAnimal + playerpanl1.Animal;
            TotalDan = TotalDan + playerpanl1.Dan;
            TotalBiLight = TotalBiLight + playerpanl1.BiLight;
        }
        if (TotalBasicScore > 11) { //1 and 2
            TotalScore = TotalScore + TotalBasicScore - 9;
        }
        if (TotalLight > 2) { //3
            TotalScore = TotalScore + TotalLight;
            if (TotalBiLight == 1) {
                TotalScore = TotalScore - 1;
            }
        }
        if (TotalRed == 3) {//5
            TotalScore = TotalScore + TotalRed;
        }
        if (TotalBlue == 3) {//6
            TotalScore = TotalScore + TotalBlue;
        }
        if (TotalCho == 3) { //7
            TotalScore = TotalScore + TotalCho;
        }
        if (TotalAnimal > 4) { //8
            TotalScore = TotalScore + TotalAnimal - 4;
        }
        if (TotalGodori == 3) { //9
            TotalScore = TotalScore + TotalGodori;
        }
        if (TotalDan > 4) { //5 and 6 and 7
            TotalScore = TotalScore + TotalDan - 4;
        }

        return TotalScore;

    }

    //player2 점수측정
    public int player2Score() {

        int TotalBasicScore = 0;
        int TotalGodori = 0;
        int TotalBlue = 0;
        int TotalRed = 0;
        int TotalCho = 0;
        int TotalLight = 0;
        int TotalAnimal = 0;
        int TotalDan = 0;
        int TotalBiLight = 0;
        int TotalScore = 0;
        for (int i = 0; i < player2panlist.size(); i++) {
            Month playerpanl2 = player2panlist.get(i);
            TotalBasicScore = TotalBasicScore + playerpanl2.BasicScore;
            TotalGodori = TotalGodori + playerpanl2.Godori;
            TotalBlue = TotalBlue + playerpanl2.Blue;
            TotalRed = TotalRed + playerpanl2.Red;
            TotalCho = TotalCho + playerpanl2.Cho;
            TotalLight = TotalLight + playerpanl2.Light;
            TotalAnimal = TotalAnimal + playerpanl2.Animal;
            TotalDan = TotalDan + playerpanl2.Dan;
            TotalBiLight = TotalBiLight + playerpanl2.BiLight;
        }
        if (TotalBasicScore > 11) { //1 and 2
            TotalScore = TotalScore + TotalBasicScore - 9;
        }
        if (TotalLight > 2) { //3
            TotalScore = TotalScore + TotalLight;
            if (TotalBiLight == 1) {
                TotalScore = TotalScore - 1;
            }
        }
        if (TotalRed == 3) {//5
            TotalScore = TotalScore + TotalRed;
        }
        if (TotalBlue == 3) {//6
            TotalScore = TotalScore + TotalBlue;
        }
        if (TotalCho == 3) { //7
            TotalScore = TotalScore + TotalCho;
        }
        if (TotalAnimal > 4) { //8
            TotalScore = TotalScore + TotalAnimal - 4;
        }
        if (TotalGodori == 3) { //9
            TotalScore = TotalScore + TotalGodori;
        }
        if (TotalDan > 4) { //5 and 6 and 7
            TotalScore = TotalScore + TotalDan - 4;
        }


        return TotalScore;

    }

    /////////////중복방지하면서 뽑는 랜덤변수
    public static int Count() {
        Random random = new Random();
        boolean shift = true;
        int a = 0;
        while (shift) {
            shift = false;
            a = random.nextInt(47) + 1; //랜덤변수
            for (int i = 0; i < 48; i++) {
                if (Xrandom[i] == a) {
                    shift = true;
                }
            }
        }
        for (int i = 0; i < 48; i++) { //중복방지하기위해 배열에 넣는다.
            if (b == i) {
                Xrandom[i] = a;
            }
        }
        b++;

        return a;
    }
    public static int swit = 1; //남의패 작동못하게 swit걸어둠
    ///////////// List프린트함수
    public void print() {
        swit++;
        centerhand = 0;
        playerhand = 0;
        LinearLayout de = (LinearLayout) findViewById(center);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player1);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player2);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player1light);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player1dan);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player1animal);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player1panpi);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player2panpi);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player2light);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player2dan);
        de.removeAllViews();
        de = (LinearLayout) findViewById(player2animal);
        de.removeAllViews(); //layout초기화


        for (int i = 0; i < centerlist.size(); i++) {
            Month centerl1 = centerlist.get(i);
            LinearLayout iv = (LinearLayout) findViewById(center);
            ImageButton img = new ImageButton(this);
            img.setImageResource(imageArray[centerl1.best()]);
            img.setLayoutParams(new LinearLayout.LayoutParams(100, 200));

            if (i == 0) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 0;
                    }
                });
            } else if (i == 1) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 1;
                    }
                });
            } else if (i == 2) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 2;
                    }
                });
            } else if (i == 3) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 3;
                    }
                });
            } else if (i == 4) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 4;
                    }
                });
            } else if (i == 5) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 5;
                    }
                });
            } else if (i == 6) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 6;
                    }
                });
            } else if (i == 7) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 7;
                    }
                });
            } else if (i == 8) {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 8;
                    }
                });
            } else {
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        centerhand = 9;
                    }
                });
            }

            iv.addView(img);
        }

        System.out.printf("\n");
        System.out.printf("player1 : ");
        for (int i = 0; i < player1list.size(); i++) {
            Month playerl1 = player1list.get(i);
            LinearLayout iv = (LinearLayout) findViewById(player1);
            ImageButton img = new ImageButton(this);
            img.setImageResource(imageArray[playerl1.best()]);
            img.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
            if(swit%2 == 0) {
                if (i == 0) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            playerhand = 0;
                            player1Gostop();
                        }
                    });
                } else if (i == 1) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 1;
                            player1Gostop();
                        }
                    });
                } else if (i == 2) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 2;
                            player1Gostop();
                        }
                    });
                } else if (i == 9) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 9;
                            player1Gostop();
                        }
                    });
                } else if (i == 3) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 3;
                            player1Gostop();
                        }
                    });
                } else if (i == 4) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 4;
                            player1Gostop();
                        }
                    });
                } else if (i == 5) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 5;
                            player1Gostop();
                        }
                    });
                } else if (i == 6) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 6;
                            player1Gostop();
                        }
                    });
                } else if (i == 7) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 7;
                            player1Gostop();
                        }
                    });
                } else if (i == 8) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 8;
                            player1Gostop();
                        }
                    });
                }
            }
            iv.addView(img);
        }
        for (int i = 0; i < player1panlist.size(); i++) {
            Month playerpanl1 = player1panlist.get(i);
            if(playerpanl1.BasicScore>0){
                LinearLayout iv = (LinearLayout) findViewById(player1panpi);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(80, 160));
                iv.addView(img);
            }
             else if(playerpanl1.Dan>0){
                LinearLayout iv = (LinearLayout) findViewById(player1dan);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(80, 160));
                iv.addView(img);
            }
            else if(playerpanl1.Animal>0){
                LinearLayout iv = (LinearLayout) findViewById(player1animal);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(80, 160));
                iv.addView(img);
            }
            else if(playerpanl1.Light>0){
                LinearLayout iv = (LinearLayout) findViewById(player1light);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(80, 160));
                iv.addView(img);
            }

        }
        for (int i = 0; i < player2list.size(); i++) {
            Month playerl2 = player2list.get(i);
            LinearLayout iv = (LinearLayout) findViewById(player2);
            ImageButton img = new ImageButton(this);
            img.setImageResource(imageArray[playerl2.best()]);
            img.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
            if(swit%2 == 1 ) {
                if (i == 0) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 0;
                            player1Gostop();
                        }
                    });
                } else if (i == 1) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 1;
                            player2Gostop();
                        }
                    });
                } else if (i == 2) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 2;
                            player2Gostop();
                        }
                    });
                } else if (i == 9) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 9;
                            player2Gostop();
                        }
                    });
                } else if (i == 3) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 3;
                            player2Gostop();
                        }
                    });
                } else if (i == 4) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 4;
                            player2Gostop();
                        }
                    });
                } else if (i == 5) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 5;
                            player2Gostop();
                        }
                    });
                } else if (i == 6) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 6;
                            player2Gostop();
                        }
                    });
                } else if (i == 7) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 7;
                            player2Gostop();
                        }
                    });
                } else if (i == 8) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 8;
                            player2Gostop();
                        }
                    });
                }
            }
            iv.addView(img);
        }
        for (int i = 0; i < player2panlist.size(); i++) {
            Month playerpanl2 = player2panlist.get(i);
            if(playerpanl2.BasicScore>0){
                LinearLayout iv = (LinearLayout) findViewById(player2panpi);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(80, 160));
                iv.addView(img);
            } else if(playerpanl2.Dan>0){
                LinearLayout iv = (LinearLayout) findViewById(player2dan);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(60, 160));
                iv.addView(img);
            }
            else if(playerpanl2.Animal>0){
                LinearLayout iv = (LinearLayout) findViewById(player2animal);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(60, 160));
                iv.addView(img);
            }
            else if(playerpanl2.Light>0){
                LinearLayout iv = (LinearLayout) findViewById(player2light);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(60, 160));
                iv.addView(img);
            }
        }
        System.out.printf("\n");
/*
        System.out.printf("player 2 Score : %d \n", player2Score());
        /////////////////////
        if (player1Score() > 6 && player1ps != player1Score()) { //Go stop (Two GO까지만 구현)
            System.out.printf("\n palyer1: 1. Go 2. Stop");
            //int select = sc.nextInt();
            if (select == 1) {
                if (player1ts == 1) {
                    System.out.print("\n player1: Two go");
                } else if (player1ts == 0) {

                    System.out.print("\n player1: one go");
                }
                player1ts = player1ts + 1;
            } else {
                player1ts = player1ts + player1Score();
                System.out.printf("\n Total Score : %d ", player1ts);
                System.out.printf("\n player1 win ");
                System.exit(0);
            }
        }
        player1ps = player1Score();

        if (player2Score() > 6 && player2ps != player2Score()) { // Go stop
            System.out.printf("\n palyer2: 1. Go 2. Stop");
            //int select = sc.nextInt();
            if (select == 1) {
                if (player2ts == 1) {
                    System.out.print("\n player2: Two go");
                } else if (player2ts == 0) {

                    System.out.print("\n player2: one go");
                }
                player2ts = player2ts + 1;
            } else {
                player2ts = player2ts + player2Score();
                System.out.printf("\n Total Score : %d ", player2ts);
                System.out.printf("\n player2 win ");
                System.exit(0);
            }
        }
        player2ps = player2Score();
*/
    }

    //center패 한장 까지고 그 중에 같은월 있으면 가져온다.
    public static void center1() {
        //패한장생성
        Month card = new Month();
        int count = Count();
        card.Card(count);

        for (int i = 0; i < centerlist.size(); i++) {
            Month centerl1 = centerlist.get(i);
            if (card.division() == centerl1.division()) {
                player1panlist.add(card);
                player1panlist.add(centerl1);
                centerlist.remove(i);
                break;
            }
            if (i == centerlist.size() - 1) {
                centerlist.add(card);
                break;
            }
        }


    }

    public static void center2() {
        //패한장생성
        Month card = new Month();
        int count = Count();
        card.Card(count);

        for (int i = 0; i < centerlist.size(); i++) {
            Month centerl1 = centerlist.get(i);
            if (card.division() == centerl1.division()) {
                player2panlist.add(card);
                player2panlist.add(centerl1);
                centerlist.remove(i);
                break;
            }
            if (i == centerlist.size() - 1) {
                centerlist.add(card);
                break;
            }
        }
    }

    public static int distinct1() { //hand와 center의 같은 월이 없는 조건
        for (int i = 0; i < centerlist.size(); i++) {
            Month centerl1 = centerlist.get(i);
            for (int j = 0; j < player1list.size(); j++) {
                Month playerl1 = player1list.get(j);
                if (centerl1.division() == playerl1.division()) {
                    return 1; //1이면 같은게있고
                }
            }
        }
        return 2;
        //2면 같은게없음
    }

    public static int distinct2() {
        for (int i = 0; i < centerlist.size(); i++) {
            Month centerl2 = centerlist.get(i);
            for (int j = 0; j < player2list.size(); j++) {
                Month playerl2 = player2list.get(j);
                if (centerl2.division() == playerl2.division()) {
                    return 1; //1이면 같은게있고
                }
            }
        }
        return 2;
        //2면 같은게없음
    }

    //////////////////////////////////////
    ////처음
    public void startGostop() {
        for (int i = 0; i < 7; i++) {
            Month card = new Month();
            int count = Count();
            card.Card(count);
            centerlist.add(card);
        }
        System.out.printf(" \n");
        for (int i = 0; i < 10; i++) {
            Month card = new Month();
            int count = Count();
            card.Card(count);
            player1list.add(card);
        }
        System.out.printf(" \n");
        for (int i = 0; i < 10; i++) {
            Month card = new Month();
            int count = Count();
            card.Card(count);
            player2list.add(card);
        }
        print();
    }

    public void player1Gostop() {
        //패 옮기고 삭제하기
        int distinct = 0;
        distinct = distinct1();

        if (distinct == 1) {

            if (centerlist != null) { // center 패가 없을때를 위한 if문
                Month center1 = centerlist.get(centerhand);
                player1panlist.add(center1);
                centerlist.remove(centerhand);

                Month player1 = player1list.get(playerhand);
                player1panlist.add(player1);
                player1list.remove(playerhand);
            } else if (centerlist == null) {
                Month player1 = player1list.get(playerhand);
                player2panlist.add(player1);
                centerlist.add(player1);
            }
        } else if (distinct == 2) {

            Month player1 = player1list.get(playerhand);
            centerlist.add(player1);
            player1list.remove(playerhand);
        }
        center1();
        print();
    }

    public void player2Gostop() {
        int distinct = 0;
        distinct = distinct2();

        if (distinct == 1) {

            if (centerlist != null) { // center 패가 없을때를 위한 if문
                Month center2 = centerlist.get(centerhand);
                player2panlist.add(center2);
                centerlist.remove(centerhand);
                Month player2 = player2list.get(playerhand);
                player2panlist.add(player2);
                player2list.remove(playerhand);
            } else if (centerlist == null) {
                Month player2 = player2list.get(playerhand);
                centerlist.add(player2);
                player2list.remove(playerhand);
            }
        } else if (distinct == 2) {

            Month player2 = player2list.get(playerhand);
            centerlist.add(player2);
            player2list.remove(playerhand);
        }
        center2();
        print();

    }
}
/* public ImageButton GoView(int a){ ////고스톱 이미지버튼화
         /////////////1월
         if(a==1){
             ImageButton oneone = new ImageButton(this);
             oneone.setImageResource(imageArray[1]);
             oneone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             oneone.setOnClickListener(new View.OnClickListener(){
                 @Override
                 public void onClick(View v){
                    // centerhand =
                 }
             });
             return oneone;
         }
         else if(a==2){
             ImageButton onetwo = new ImageButton(this);
             onetwo.setImageResource(imageArray[2]);
             onetwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return onetwo;
         }
         else if(a==3){
             ImageButton onethree = new ImageButton(this);
             onethree.setImageResource(imageArray[3]);
             onethree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return onethree;
         }
         else if(a==4){
             ImageButton onefour = new ImageButton(this);
             onefour.setImageResource(imageArray[4]);
             onefour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return onefour;
         }
         //////////////2월
         else if(a==5){
             ImageButton twoone = new ImageButton(this);
             twoone.setImageResource(imageArray[5]);
             twoone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return twoone;
         }
         else if(a==6){
             ImageButton twotwo = new ImageButton(this);
             twotwo.setImageResource(imageArray[6]);
             twotwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return twotwo;
         }
         else if(a==7){
             ImageButton twothree = new ImageButton(this);
             twothree.setImageResource(imageArray[7]);
             twothree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return twothree;
         }
         else if(a==8){
             ImageButton twofour = new ImageButton(this);
             twofour.setImageResource(imageArray[8]);
             twofour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return twofour;
         }
         //////////////3월
         else if(a==9){
             ImageButton threeone = new ImageButton(this);
             threeone.setImageResource(imageArray[9]);
             threeone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return threeone;

         }
         else if(a==10){
             ImageButton threetwo = new ImageButton(this);
             threetwo.setImageResource(imageArray[10]);
             threetwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return threetwo;
         }
         else if(a==11){
             ImageButton threethree = new ImageButton(this);
             threethree.setImageResource(imageArray[11]);
             threethree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return threethree;
         }
         else if(a==12){
             ImageButton threefour = new ImageButton(this);
             threefour.setImageResource(imageArray[12]);
             threefour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return threefour;
         }
         //////////////4월
         else if(a==13){
             ImageButton fourone= new ImageButton(this);
             fourone.setImageResource(imageArray[13]);
             fourone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fourone;
         }
         else if(a==14){
             ImageButton fourtwo= new ImageButton(this);
             fourtwo.setImageResource(imageArray[14]);
             fourtwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fourtwo;
         }
         else if(a==15){
             ImageButton fourthree= new ImageButton(this);
             fourthree.setImageResource(imageArray[15]);
             fourthree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fourthree;
         }
         else if(a==16){
             ImageButton fourfour= new ImageButton(this);
             fourfour.setImageResource(imageArray[16]);
             fourfour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fourfour;
         }
         //////////////5월
         else if(a==17){
             ImageButton fiveone= new ImageButton(this);
             fiveone.setImageResource(imageArray[17]);
             fiveone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fiveone;
         }
         else if(a==18){
             ImageButton fivetwo= new ImageButton(this);
             fivetwo.setImageResource(imageArray[18]);
             fivetwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fivetwo;
         }
         else if(a==19){
             ImageButton fivethree= new ImageButton(this);
             fivethree.setImageResource(imageArray[19]);
             fivethree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fivethree;
         }
         else if(a==20){
             ImageButton fivefour= new ImageButton(this);
             fivefour.setImageResource(imageArray[20]);
             fivefour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return fivefour;
         }
         //////////////6월
         else if(a==21){
             ImageButton sixone= new ImageButton(this);
             sixone.setImageResource(imageArray[21]);
             sixone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return sixone;
         }
         else if(a==22){
             ImageButton sixtwo= new ImageButton(this);
             sixtwo.setImageResource(imageArray[22]);
             sixtwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return sixtwo;
         }
         else if(a==23){
             ImageButton sixthree= new ImageButton(this);
             sixthree.setImageResource(imageArray[23]);
             sixthree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return sixthree;
         }
         else if(a==24){
             ImageButton sixfour= new ImageButton(this);
             sixfour.setImageResource(imageArray[24]);
             sixfour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return sixfour;
         }
         //////////////7월
         else if(a==25){
             ImageButton sevenone= new ImageButton(this);
             sevenone.setImageResource(imageArray[25]);
             sevenone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return sevenone;
         }
         else if(a==26){
             ImageButton seventwo= new ImageButton(this);
             seventwo.setImageResource(imageArray[26]);
             seventwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return seventwo;
         }
         else if(a==27){
             ImageButton seventhree= new ImageButton(this);
             seventhree.setImageResource(imageArray[27]);
             seventhree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return seventhree;
         }
         else if(a==28){
             ImageButton sevenfour= new ImageButton(this);
             sevenfour.setImageResource(imageArray[28]);
             sevenfour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return sevenfour;
         }
         //////////////8월
         else if(a==29){
             ImageButton eightone= new ImageButton(this);
             eightone.setImageResource(imageArray[29]);
             eightone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return eightone;
         }
         else if(a==30){
             ImageButton eighttwo= new ImageButton(this);
             eighttwo.setImageResource(imageArray[30]);
             eighttwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return eighttwo;
         }
         else if(a==31){
             ImageButton eightthree= new ImageButton(this);
             eightthree.setImageResource(imageArray[31]);
             eightthree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return eightthree;
         }
         else if(a==32){
             ImageButton eightfour= new ImageButton(this);
             eightfour.setImageResource(imageArray[32]);
             eightfour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return eightfour;
         }
         //////////////9월
         else if(a==33){
             ImageButton nineone= new ImageButton(this);
             nineone.setImageResource(imageArray[33]);
             nineone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return nineone;
         }
         else if(a==34){
             ImageButton ninetwo= new ImageButton(this);
             ninetwo.setImageResource(imageArray[34]);
             ninetwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return ninetwo;
         }
         else if(a==35){
             ImageButton ninethree= new ImageButton(this);
             ninethree.setImageResource(imageArray[35]);
             ninethree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return ninethree;
         }
         else if(a==36){
             ImageButton ninefour= new ImageButton(this);
             ninefour.setImageResource(imageArray[36]);
             ninefour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return ninefour;
         }
         //////////////10월
         else if(a==37){
             ImageButton tenone= new ImageButton(this);
             tenone.setImageResource(imageArray[37]);
             tenone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return tenone;
         }
         else if(a==38){
             ImageButton tentwo= new ImageButton(this);
             tentwo.setImageResource(imageArray[38]);
             tentwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return tentwo;
         }
         else if(a==39){
             ImageButton tenthree= new ImageButton(this);
             tenthree.setImageResource(imageArray[39]);
             tenthree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return tenthree;
         }
         else if(a==40){
             ImageButton tenfour= new ImageButton(this);
             tenfour.setImageResource(imageArray[40]);
             tenfour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return tenfour;
         }
         //////////////11월
         else if(a==41){
             ImageButton elevenone= new ImageButton(this);
             elevenone.setImageResource(imageArray[41]);
             elevenone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return elevenone;
         }
         else if(a==42){
             ImageButton eleventwo= new ImageButton(this);
             eleventwo.setImageResource(imageArray[42]);
             eleventwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return eleventwo;
         }
         else if(a==43){
             ImageButton eleventhree= new ImageButton(this);
             eleventhree.setImageResource(imageArray[43]);
             eleventhree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return eleventhree;
         }
         else if(a==44){
             ImageButton elevenfour= new ImageButton(this);
             elevenfour.setImageResource(imageArray[44]);
             elevenfour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return elevenfour;
         }
         //////////////12월
         else if(a==45){
             ImageButton tweleveone= new ImageButton(this);
             tweleveone.setImageResource(imageArray[45]);
             tweleveone.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return tweleveone;
         }
         else if(a==46){
             ImageButton twelvetwo= new ImageButton(this);
             twelvetwo.setImageResource(imageArray[46]);
             twelvetwo.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return twelvetwo;
         }
         else if(a==47){
             ImageButton twelvethree= new ImageButton(this);
             twelvethree.setImageResource(imageArray[47]);
             twelvethree.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return twelvethree;
         }
         else{
             ImageButton twelvefour= new ImageButton(this);
             twelvefour.setImageResource(imageArray[48]);
             twelvefour.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
             return twelvefour;
         }
     }*/



