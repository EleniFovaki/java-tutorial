public class Car extends Machine{ //Inheritance
    public void wipeWindShield(){
        System.out.println("wiping wind shield");
    }
    public void start(){ //the header part of the method should stay the same as the base class
        System.out.println("Car started");
    }

    @Override //annotation, check if you have overwritten the method with the right name
    public void stop() { //right click here, press generate, override methods
        super.stop();
    }
}
