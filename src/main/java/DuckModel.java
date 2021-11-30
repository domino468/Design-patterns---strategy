public class DuckModel extends Duck {
    public DuckModel(){
        flyInterface = new DontFly();
        quackInterface = new DontQuake();

    }


    public void show() {
        System.out.println("Jestem modelem kaczki!");
    }
}
