public class Calculator {
    private double resultValue = 0;
    private String memory;

    public Calculator(){
        memory = "";
    }
    

    private double add(double value1, double value2) {
        return value1 + value2;
    };

    private double sub(double value1, double value2) {
        return value1 - value2;
    };

    private double mult(double value1, double value2) {
        return value1 * value2;
    };

    private double div(double value1, double value2) {
        return value1 / value2;
    };


    public void executeCalc(double value1, double value2, char operation){
        switch (operation){
            case '+' :
            resultValue = add(value1, value2);
            memory = value1 + " + " + value2 + " = " + resultValue;
                break;

            case '-':
            resultValue = sub(value1, value2);
            memory = value1 + " - " + value2 + " = " + resultValue;
                break;

            case '*':
            resultValue = mult(value1, value2);
            memory = value1 + " * " + value2 + " = " + resultValue;
                break;

            case '/':
            resultValue = div(value1, value2);
            memory = value1 + " / " + value2 + " = " + resultValue;
                break;

            default: 
            System.out.println("Operação inválida.");
        }
    }

    public double getResult(){
        return resultValue;
    }

    public String getMemory(){
        return memory;
    }

}
