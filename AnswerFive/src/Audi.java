public class Audi implements Car {
    private int speed = 0;

    public void accelerate(int speed){
        this.speed += speed;
    }

    public void breakCar(int speed){
        this.speed -= speed;
    }

    public int getCurrentSpeed(){
        return speed;
    }
}
