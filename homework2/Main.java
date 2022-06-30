package homework2;

public class Main {
    public static void main(String[] args) {
        total taxi1 = new total("수원",4000,40,80);
        total taxi2 = new total("강남",1500,30,50);

        taxi1.speedChange();
        System.out.println(taxi1.nowSpeed);
        System.out.println(taxi1.taxiNum);
        System.out.println(taxi2.taxiNum);
        taxi1.taxiState();
        taxi1.pay();
    }
}
