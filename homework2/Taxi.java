package homework2;

import java.util.Scanner;

public class Taxi extends fuel implements ride {
    static int basicdistance = 2000;
    static int distancePrice = 20;
    static int basicPrice = 3300;
    static int taxiIndex = 200;
    int taxiNum;
    int price;
    int goalDistance;
    String destination;


    public Taxi(String destination, int goalDistance, int nowSpeed, int fuelVolume) {
        this.destination = destination;
        this.goalDistance = goalDistance;
        this.nowSpeed = nowSpeed;
        this.fuelVolume = fuelVolume;

        taxiIndex++;
        taxiNum = taxiIndex;

    }

    public boolean drive() {
        if (fuelVolume <= 10) {
            System.out.println("주유상태"+fuelVolume);
            System.out.println("주유량이 10이상이어야 합니다");
            state =false;
        }else{
            System.out.println("운행이가능합니다");
            state=true;
        }
        return state;
    }

    public boolean taxiState(){
        drive();
        if(state==true){
            System.out.println("운행 가능");
        }else{
            System.out.println("운행 불가");
        }
        return state;
    }

    public int speedChange(){
        System.out.println("속도 입력");
        Scanner scanner=new Scanner(System.in);
        int addSpeed = scanner.nextInt();
        nowSpeed += addSpeed;
        if(nowSpeed<=0){
            System.out.println("현재 속도 0");
        }else {
            System.out.println("현재속도"+nowSpeed);
        }
        return nowSpeed;
    }

    public void pay(){
        state= false;
        if (goalDistance>basicdistance)
            price = basicPrice+(distancePrice*(goalDistance-basicdistance));
        else
            price = basicPrice;
        System.out.println("요금"+price);
    }

}

