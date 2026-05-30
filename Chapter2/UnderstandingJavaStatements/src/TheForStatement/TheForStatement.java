package TheForStatement;

public class TheForStatement {
    public static void main(String[] args) {
        for (int i = 0;i < 10; i ++) {
            System.out.println(i + " ");
        }
    }

    public void multipleFor(){
        int x=0;
        for(long y=0, z=4;x<5 && y<10; x++, y++){
            System.out.println(y + " ");
        }
        System.out.println(x);
    }
}
