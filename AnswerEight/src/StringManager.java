public class StringManager {
    public String modifyString(String text){
        String trim = text.trim();
        String modified = trim.replace('A', 'B').replace('a', 'B');
        
        if (modified.length() > 3){
            return modified.substring(0, 3);
        }else{
            return modified;
        }
    }
}
