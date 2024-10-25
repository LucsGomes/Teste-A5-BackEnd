public interface Car{       
         public void accelerate(int speed); // cada execução aumenta a velocidade em speed
         public void breakCar(int speed); // cada execução diminui a velocidade em speed
         public int getCurrentSpeed(); // informa a velocidade atual
 }