public class code {
    public static boolean check(int mytile, int friendtile){
        if(mytile==friendtile || mytile>friendtile){
            return false;
        }
        int distance=friendtile-mytile;
        return 1<=distance && distance<=6;
    }
    public static void main(String[] args) {
        System.out.println(check(3, 7));
        System.out.println(check(1,9));
        System.out.println(check(5, 3));
    }
}