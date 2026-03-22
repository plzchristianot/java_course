package DestroyingObjects;

public class Finalizer {
    protected void finalize() //Metodo deprecado
    {
        System.out.println("Calling finalize");
    }
    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}
