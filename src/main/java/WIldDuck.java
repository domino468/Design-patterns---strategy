public class WIldDuck extends Duck {

    public WIldDuck(){
        quackInterface = new Quack();
        flyInterface = new FlyWithWings();
    }
    public  void show(){
        System.out.println("Jestem prawdziwą Dziką Kaczką");
    }
}
