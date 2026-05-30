package TheWhileStatement;

public class TheDoWhileStatement {
    public static void main(){
        int x = 10;
        if(x > 10) {
            do {
                x--;
            } while(x > 10);
        } else {
            x++;
        }
        System.out.println(x);
    }
}
