public class ReverseWordsOnly{
    public static void main(String[] args){
        String original="Hello World";
        String reversedstr="";
        String[] split=original.split(" ");
        for(String word:split){
            String reversedword="";
            for(int i=word.length()-1;i>=0;i--){
                reversedword=reversedword+word.charAt(i);
            }
            reversedstr=reversedstr+reversedword+" ";
        }
        System.out.println(reversedstr);
    }
}