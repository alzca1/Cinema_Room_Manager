package cinema;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        System.out.println(" 1 2 3 4 5 6 7 8");
        for(int i = 1; i < 8; i++){
            String str = String.format("%d %s", i, "S S S S S S S S");
            System.out.println(str);
        }
    }
}