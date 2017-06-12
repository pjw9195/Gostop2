package com.example.jinwoo.gostop;

/**
 * Created by jinwoo on 2017-06-09.
 */


public class Month {

    protected int a = 0;
    protected int BasicScore = 0;
    protected int Godori =0;
    protected int Blue = 0;
    protected int Red = 0;
    protected int Cho = 0 ;
    protected int Light = 0;
    protected int Animal = 0;
    protected int Dan = 0;
    protected int BiLight = 0;

    public void Card(int a){
        this.a = a;
        /////////////1월
        if(a==1){
            BasicScore++;
        }
        else if(a==2){
            BasicScore++;
        }
        else if(a==3){
            Red++;
            Dan++;
        }
        else if(a==4){
            Light++;
        }
        //////////////2월
        else if(a==5){
            BasicScore++;
        }
        else if(a==6){
            BasicScore++;
        }
        else if(a==7){
            Red++;
            Dan++;
        }
        else if(a==8){
            Godori++;
            Animal++;
        }
        //////////////3월
        else if(a==9){
            BasicScore++;
        }
        else if(a==10){
            BasicScore++;
        }
        else if(a==11){
            Light++;
        }
        else if(a==12){
            Red++;
            Dan++;
        }
        //////////////4월
        else if(a==13){
            BasicScore++;
        }
        else if(a==14){
            BasicScore++;
        }
        else if(a==15){
            Godori++;
            Animal++;
        }
        else if(a==16){
            Cho++;
            Dan++;
        }
        //////////////5월
        else if(a==17){
            BasicScore++;
        }
        else if(a==18){
            BasicScore++;
        }
        else if(a==19){
            Animal++;
        }
        else if(a==20){
            Cho++;
            Dan++;
        }
        //////////////6월
        else if(a==21){
            BasicScore++;
        }
        else if(a==22){
            BasicScore++;
        }
        else if(a==23){
            Animal++;
        }
        else if(a==24){
            Blue++;
            Dan++;
        }
        //////////////7월
        else if(a==25){
            BasicScore++;
        }
        else if(a==26){
            BasicScore++;
        }
        else if(a==27){
            Cho++;
            Dan++;
        }
        else if(a==28){
            Animal++;
        }
        //////////////8월
        else if(a==29){
            BasicScore++;
        }
        else if(a==30){
            BasicScore++;
        }
        else if(a==31){
            Godori++;
            Animal++;
        }
        else if(a==32){
            Light++;
        }
        //////////////9월
        else if(a==33){
            BasicScore++;
        }
        else if(a==34){
            BasicScore++;
        }
        else if(a==35){
            Blue++;
            Dan++;
        }
        else if(a==36){
            Animal++;
        }
        //////////////10월
        else if(a==37){
            BasicScore++;
        }
        else if(a==38){
            BasicScore++;
        }
        else if(a==39){
            Animal++;
        }
        else if(a==40){
            Blue++;
            Dan++;
        }
        //////////////11월
        else if(a==41){
            BasicScore++;
        }
        else if(a==42){
            BasicScore++;
        }
        else if(a==43){
            BasicScore= BasicScore+2;
        }
        else if(a==44){
            Light++;
        }
        //////////////12월
        else if(a==45){
            BasicScore = BasicScore+2;
        }
        else if(a==46){
            Animal++;
        }
        else if(a==47){
            Dan++;
        }
        else if(a==48){
            BiLight++; // 비광++
            Light++;

        }

    }
    public int division(){

        /////////////1월
        if(a>0 && a<5){
            return 1;
        }
        //////////////2월
        else if(a>4 && a<9){
            return 2;
        }
        //////////////3월
        else if(a>8 && a<13){
            return 3;
        }
        //////////////4월
        else if(a>12 && a<17){
            return 4;
        }
        //////////////5월
        else if(a>16 && a<21){
            return 5;
        }
        //////////////6월
        else if(a>20&& a<25){
            return 6;
        }
        //////////////7월
        else if(a >24 && a<29){
            return 7;
        }
        //////////////8월
        else if(a >28 && a<33){
            return 8;
        }
        //////////////9월
        else if(a>32 && a<37){
            return 9;
        }
        //////////////10월
        else if(a>36 && a<41){
            return 10;
        }
        //////////////11월
        else if(a>40 && a<45){
            return 11;
        }
        //////////////12월
        else {
            return 12;
        }
    }
    public int best(){
        /////////////1월
        if(a==1){
            return 1;
        }
        else if(a==2){
            return 2;
        }
        else if(a==3){
            return 3;
        }
        else if(a==4){
            return 4;
        }
        //////////////2월
        else if(a==5){
            return 5;
        }
        else if(a==6){
            return 6;
        }
        else if(a==7){
            return 7;
        }
        else if(a==8){
            return 8;
        }
        //////////////3월
        else if(a==9){
            return 9;
        }
        else if(a==10){
            return 10;
        }
        else if(a==11){
            return 11;
        }
        else if(a==12){
            return 12;
        }
        //////////////4월
        else if(a==13){
            return 13;
        }
        else if(a==14){
            return 14;
        }
        else if(a==15){
            return 15;
        }
        else if(a==16){
            return 16;
        }
        //////////////5월
        else if(a==17){
            return 17;
        }
        else if(a==18){
            return 18;
        }
        else if(a==19){
            return 19;
        }
        else if(a==20){
            return 20;
        }
        //////////////6월
        else if(a==21){
            return 21;
        }
        else if(a==22){
            return 22;
        }
        else if(a==23){
            return 23;
        }
        else if(a==24){
            return 24;
        }
        //////////////7월
        else if(a==25){
            return 25;
        }
        else if(a==26){
            return 26;
        }
        else if(a==27){
            return 27;
        }
        else if(a==28){
            return 28;
        }
        //////////////8월
        else if(a==29){
            return 29;
        }
        else if(a==30){
            return 30;
        }
        else if(a==31){
            return 31;
        }
        else if(a==32){
            return 32;
        }
        //////////////9월
        else if(a==33){
            return 33;
        }
        else if(a==34){
            return 34;
        }
        else if(a==35){
            return 35;
        }
        else if(a==36){
            return 36;
        }
        //////////////10월
        else if(a==37){
            return 37;
        }
        else if(a==38){
            return 38;
        }
        else if(a==39){
            return 39;
        }
        else if(a==40){
            return 40;
        }
        //////////////11월
        else if(a==41){
            return 41;
        }
        else if(a==42){
            return 42;
        }
        else if(a==43){
            return 43;
        }
        else if(a==44){
            return 44;
        }
        //////////////12월
        else if(a==45){
            return 45;
        }
        else if(a==46){
            return 46;
        }
        else if(a==47){
            return 47;
        }
        else{
            return 48;
        }
    }
    /////////월 구별

}


