import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator Calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = false;
        while (continueCalc == false) {
            System.out.println("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();

            System.out.println("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();

            System.out.println("Digite o simbolo da operação: ");
            char operator = scanner.next().charAt(0);
            
            Calc.executeCalc(valor1,valor2,operator);
            System.out.println(Calc.getResult());

            System.out.println("Deseja continuar? [y/n]: ");
            scanner.nextLine();
            
            String continueCalcAnswer = scanner.nextLine();
            if (continueCalcAnswer.equalsIgnoreCase("n")){
                System.out.println("Encerrado.");
                break;
            } 

            System.out.println("Deseja ver o último calculo? [y/n]: ");
            String memoryAnswer = scanner.nextLine();

            if (memoryAnswer.equalsIgnoreCase("y")){
                System.out.println(Calc.getMemory());
            } 

        }
        scanner.close();
    }
}
