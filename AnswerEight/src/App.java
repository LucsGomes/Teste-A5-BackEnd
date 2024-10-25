public class App {
    public static void main(String[] args) throws Exception {
        String text1 = "Bolacha Biscoito"; 
        String text2 = "   aA    "; 

        StringManager stringChanger = new StringManager();

        System.out.println(stringChanger.modifyString(text1));
        System.out.println(stringChanger.modifyString(text2));
    }
}
