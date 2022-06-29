public class Bus {
    int maxPassenger;
    int currentPassenger;
    int price;
    int busNumber;
    int fuelVolume;
    int currentSpeed;
    String situation;

    public Bus(int maxPassenger, int currentPassenger, int price, int currentSpeed, int busNumber, int fuelVolume, String situation) {
        this.maxPassenger = maxPassenger;
        this.currentPassenger = currentPassenger;
        this.price = price;
        this.currentSpeed = currentSpeed;
        this.busNumber = busNumber;
        this.fuelVolume = fuelVolume;
        this.situation = situation;
    }
    public void setBusNumber(int busNumber) {
        for (int i = 0; i < 20; i++) {

            int random = (int) (Math.random() * 100);
            System.out.println(+random+"운행");

        }
    }
    public void current(int maxPassenger,int currentPassenger) {
        int maxPassenger1 = this.maxPassenger;
        int currentPassenger1= this.currentPassenger;

        for (int i=0;i<maxPassenger1;i++){
            if(currentPassenger1<=maxPassenger1) {
                System.out.println("탑승불가");
            }else{
                currentPassenger1+=i;
            }
        }
    }
    public void bussituation(){
        int fuelVolume1=this.fuelVolume;
        if(fuelVolume1==0){
            
        }

    }


}
