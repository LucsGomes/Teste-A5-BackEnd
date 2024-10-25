public class App {
    public static void main(String[] args) throws Exception {
        String textOne = "50";
        String textTwo = "10";

        ConversorString conversor = new ConversorString();

        Integer Result = conversor.ConverterString(textOne, textTwo);

        if ( Result != null){
            System.out.println("A soma das suas string é: " + Result);
        }
    }
}
