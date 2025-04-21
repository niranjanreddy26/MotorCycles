package TwoWheelers;

public abstract class MotorCycle {
    public int topSpeed ;
    public boolean pilianSeat;
    public String bikeName ;
    public boolean start=false;
    public int currSpeed;
    public int range;


    public boolean start(int speed){
        System.out.println("The bike is started!");
        currSpeed=speed;
        return start= true;
    }
    public boolean stop(boolean start){
        System.out.println("The bike is started!");
        return start= false;
    }

    public int acclerate(int speed){
        System.out.println("The acceleration is turned on and the speed is:");
        if(start==true) {
            return currSpeed = currSpeed + speed;
        }
        return 0;
    }

    public int brake(int speed){
        System.out.println("The brakes are applied! and the speed is:");
        if(start==true) {
            return currSpeed = currSpeed - speed;
        }
        return 0;
    }

    public void displayInfo(){
        System.out.println("The "+bikeName+" has a top speed of "+topSpeed+" is travelling at a speed of " +currSpeed+" the range of the motorcycle is "+range);
    }
}
