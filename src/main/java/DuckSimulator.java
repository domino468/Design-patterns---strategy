public class DuckSimulator {
    public static void main(String[] args) {
        Duck wild = new WIldDuck();
        wild.doQuack();
        wild.fly();

        Duck model = new DuckModel();
        model.fly();
        model.setFlyingInterface(new FlyWithRocketEngine());
        model.fly();
    }
}
