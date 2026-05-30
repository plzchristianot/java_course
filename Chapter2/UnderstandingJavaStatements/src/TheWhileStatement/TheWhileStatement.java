package TheWhileStatement;

public class TheWhileStatement {
    public static void main(String[] args) {
        TheWhileStatement w = new TheWhileStatement();
        w.eatCheese(1);
    }
    public void eatCheese(int bitesOfCheese) {
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }

}
