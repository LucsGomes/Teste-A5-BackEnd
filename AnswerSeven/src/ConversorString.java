public class ConversorString {
    public Integer ConverterString( String textOne, String textTwo){
        try {
            Integer numberOne = Integer.parseInt(textOne);
            Integer numberTwo = Integer.parseInt(textTwo);
            return numberOne + numberTwo;
        } catch (Exception e) {
            System.out.println("Erro durante a conversão " + e.getMessage());
            return null;
        }
    }   
}
