public class code {
    public static boolean check(int[] notes, int price){
        int total=notes[0]*10+notes[1]*50+notes[2]*100+notes[3]*200;
        if(total>=price){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] notes={3,2,1,1};
        int price=300;
        if(check(notes,price)){
            System.out.println("I can purchase");
        }else{
            System.out.println("I need more money");
        }
    }
}