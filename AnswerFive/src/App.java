public class App {
    public static void main(String[] args) throws Exception {
        Audi ttrs = new Audi();
        ttrs.accelerate(20);
        ttrs.breakCar(1);
        System.err.println(ttrs.getCurrentSpeed());
    }
}
