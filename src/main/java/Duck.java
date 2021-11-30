public  abstract class Duck {

    FlyInterface flyInterface;
    QuackInterface quackInterface;

    public Duck() {
    }
    public abstract  void show();

    public void fly(){
        flyInterface.fly();
    }
    public  void  doQuack(){
        quackInterface.quack();
    }
    public void swim(){
        System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
    }

    public void setQuackInterface(QuackInterface ki) {
        this.quackInterface = ki;
    }

    public void setFlyingInterface(FlyInterface li) {
        this.flyInterface = li;
    }
}

