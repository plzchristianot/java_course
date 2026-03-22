package UnderstandingVariableScope;

public class eat {

    public void eat(int pieceOfCheese) {
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
        //System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }

}

