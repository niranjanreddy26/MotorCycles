package TwoWheelers;

public class Standard extends MotorCycle{
    private int  fuelCapacity;
    private int kmpp;// Kilometer per percent of fuel tank
    public Standard(boolean start,int currSpeed,int topSpeed,boolean pilianSeat,String bikeName,int fuelCapacity,int kmpp){
        this.start =start;
        this.currSpeed =currSpeed;
        this.topSpeed =topSpeed;
        this.pilianSeat =pilianSeat;
        this.bikeName =bikeName;
        this.fuelCapacity=90;
        this.kmpp=kmpp;
    }
    @Override
    public int range(Object obj){
        return this.kmpp*this.fuelCapacity;
    }
    public static void main(String[] args) {
        Standard shine = new Standard(false,0,95,true,"Honda Shine",90,6);
        Standard platina = new Standard(false,0,90,true,"Bajaj Platina",60,8);
        System.out.println("The current speed is "+shine.currSpeed);
        shine.start(50);
        System.out.println("The current speed is "+shine.currSpeed);
        System.out.println(shine.acclerate(20));
        System.out.println(shine.brake(30));
        shine.displayInfo();
        platina.displayInfo();
        System.out.println("The range of "+shine.bikeName+" is "+shine.range(shine));
        System.out.println("The range of "+platina.bikeName+" is "+platina.range(platina));
    }


}
