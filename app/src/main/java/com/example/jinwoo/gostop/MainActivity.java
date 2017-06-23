package com.example.jinwoo.gostop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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


    int[] imageArray = {0, R.drawable.oneone, R.drawable.onetwo, R.drawable.onethree, R.drawable.onefour, R.drawable.twoone, R.drawable.twotwo, R.drawable.twothree,
            R.drawable.twofour, R.drawable.threeone, R.drawable.threetwo, R.drawable.threethree, R.drawable.threefour, R.drawable.fourone, R.drawable.fourtwo, R.drawable.fourthree,
            R.drawable.fourfour, R.drawable.fiveone, R.drawable.fivetwo, R.drawable.fivethree, R.drawable.fivefour, R.drawable.sixone, R.drawable.sixtwo, R.drawable.sixthree, R.drawable.sixfour,
            R.drawable.sevenone, R.drawable.seventwo, R.drawable.seventhree, R.drawable.sevenfour, R.drawable.eightone, R.drawable.eighttwo, R.drawable.eightthree, R.drawable.eightfour,
            R.drawable.nineone, R.drawable.ninetwo, R.drawable.ninethree, R.drawable.ninefour, R.drawable.tenone, R.drawable.tentwo, R.drawable.tenthree, R.drawable.tenfour,
            R.drawable.elevenone, R.drawable.eleventwo, R.drawable.eleventhree, R.drawable.elevenfour, R.drawable.tweleveone, R.drawable.twelvetwo, R.drawable.twelvethree, R.drawable.twelvefour};

    int[] imageArray2 = {0 , R.drawable.oneturn,R.drawable.twoturn , R.drawable.nextturn };
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
    public void remove(){//리니어레이아웃을 초기화해 중복으로 넣어지는걸 방지한다.
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
    }

    public static int swit = 1; //남의패 작동못하게 swit걸어둠

    public void nextturn(){
        LinearLayout iv = (LinearLayout) findViewById(center);
        ImageButton img = new ImageButton(this);
        img.setImageResource(imageArray2[3]);
        img.setLayoutParams(new LinearLayout.LayoutParams(1050, 200));
        iv.addView(img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swit%2 == 0) {
                    player1Gostop();
                }
                else{
                    player2Gostop();
                }
            }
        });
    }
    ///////////// List프린트함수
    public void print() {
        swit++; // 예외처리해주는 함수
        centerhand = 0;
        playerhand = 0;
        //리니어레이아웃을 초기화해 중복으로 넣어지는걸 방지한다.
        remove();


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
            if(swit%2 == 0) {
            Month playerl1 = player1list.get(i);
            LinearLayout iv = (LinearLayout) findViewById(player1);
            ImageButton img = new ImageButton(this);
            img.setImageResource(imageArray[playerl1.best()]);
            img.setLayoutParams(new LinearLayout.LayoutParams(100, 200));
                if (i == 0) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 0;
                        }
                    });
                } else if (i == 1) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 1;
                        }
                    });
                } else if (i == 2) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 2;
                        }
                    });
                } else if (i == 9) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 9;
                        }
                    });
                } else if (i == 3) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 3;
                        }
                    });
                } else if (i == 4) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 4;
                        }
                    });
                } else if (i == 5) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 5;
                        }
                    });
                } else if (i == 6) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 6;
                        }
                    });
                } else if (i == 7) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 7;
                        }
                    });
                } else if (i == 8) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 8;
                        }
                    });
                }
                iv.addView(img);
            }
        }
        if(swit%2==1) { //player2으로 턴을넘기는 imagebutton
            LinearLayout iv = (LinearLayout) findViewById(player1);
            ImageButton img = new ImageButton(this);
            img.setImageResource(imageArray2[2]);
            img.setLayoutParams(new LinearLayout.LayoutParams(1050, 200));
            iv.addView(img);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    remove();
                    nextturn();
                }
            });
        }

        for (int i = 0; i < player1panlist.size(); i++) {
            Month playerpanl1 = player1panlist.get(i);
            if(playerpanl1.BasicScore>0){
                LinearLayout iv = (LinearLayout) findViewById(player1panpi);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
                iv.addView(img);
            }
             else if(playerpanl1.Dan>0){
                LinearLayout iv = (LinearLayout) findViewById(player1dan);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
                iv.addView(img);
            }
            else if(playerpanl1.Animal>0){
                LinearLayout iv = (LinearLayout) findViewById(player1animal);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
                iv.addView(img);
            }
            else if(playerpanl1.Light>0){
                LinearLayout iv = (LinearLayout) findViewById(player1light);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl1.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
                iv.addView(img);
            }

        }
        for (int i = 0; i < player2list.size(); i++) {
            if(swit%2 == 1 ) { //상대 패를 못보게할려는 if문
            Month playerl2 = player2list.get(i);
            LinearLayout iv = (LinearLayout) findViewById(player2);
            ImageButton img = new ImageButton(this);
            img.setImageResource(imageArray[playerl2.best()]);
            img.setLayoutParams(new LinearLayout.LayoutParams(100, 200));

                if (i == 0) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 0;
                        }
                    });
                } else if (i == 1) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 1;
                        }
                    });
                } else if (i == 2) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 2;
                        }
                    });
                } else if (i == 9) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 9;
                        }
                    });
                } else if (i == 3) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 3;
                        }
                    });
                } else if (i == 4) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 4;
                        }
                    });
                } else if (i == 5) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 5;
                        }
                    });
                } else if (i == 6) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 6;
                        }
                    });
                } else if (i == 7) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 7;
                        }
                    });
                } else if (i == 8) {
                    img.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            playerhand = 8;
                        }
                    });
                }
                iv.addView(img);
            }

        }
        if(swit%2==0) { //player2으로 턴을넘기는 imagebutton
            LinearLayout iv = (LinearLayout) findViewById(player2);
            ImageButton img = new ImageButton(this);
            img.setImageResource(imageArray2[1]);
            img.setLayoutParams(new LinearLayout.LayoutParams(1050, 200));
            iv.addView(img);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    remove();
                    nextturn();
                }
            });
        }
        for (int i = 0; i < player2panlist.size(); i++) {
            Month playerpanl2 = player2panlist.get(i);
            if(playerpanl2.BasicScore>0){
                LinearLayout iv = (LinearLayout) findViewById(player2panpi);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
                iv.addView(img);
            } else if(playerpanl2.Dan>0){
                LinearLayout iv = (LinearLayout) findViewById(player2dan);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
                iv.addView(img);
            }
            else if(playerpanl2.Animal>0){
                LinearLayout iv = (LinearLayout) findViewById(player2animal);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
                iv.addView(img);
            }
            else if(playerpanl2.Light>0){
                LinearLayout iv = (LinearLayout) findViewById(player2light);
                ImageButton img = new ImageButton(this);
                img.setImageResource(imageArray[playerpanl2.best()]);
                img.setLayoutParams(new LinearLayout.LayoutParams(70, 160));
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
    public int distinct() { //centerhand와 playerhand의 같은 월이 없는 조건

        Month cen = centerlist.get(centerhand);
        Month pla = centerlist.get(playerhand);
        if(cen.division() == pla.division()){
            return 1;
        }

        else {
            return 2;
        }
        //1이면 같은게있고
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
        distinct = distinct();

        if (distinct == 1) {

            if (centerlist != null) { // center 패가 있을때를 위한 if문
                Month center1 = centerlist.get(centerhand);
                player1panlist.add(center1);
                centerlist.remove(centerhand);

                Month player1 = player1list.get(playerhand);
                player1panlist.add(player1);
                player1list.remove(playerhand);
            } else if (centerlist == null) { //center패가 없을때를 위한 if문
                Month player1 = player1list.get(playerhand);
                centerlist.add(player1);
                player1list.remove(playerhand);
            }
        } else if (distinct == 2) { //centerhand와 playerhand가 다를경우

            Month player1 = player1list.get(playerhand);
            centerlist.add(player1);
            player1list.remove(playerhand);
        }
        center1();
        print();
    }

    public void player2Gostop() {
        int distinct = 0;
        distinct = distinct();

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
        } else if (distinct == 2) { //centerhand와 playerhand가 다를경우

            Month player2 = player2list.get(playerhand);
            centerlist.add(player2);
            player2list.remove(playerhand);
        }
        center2();
        print();

    }
}





