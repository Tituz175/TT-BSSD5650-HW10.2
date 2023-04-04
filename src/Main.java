public class Main {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();

        WalkDecorator stinky = new WalkDecorator(animalMaker.getClone(CloneFactory.IAnimalsEnum.MOUSE));
        stinky.setName("Jones");
        stinky.walk();

        WalkDecorator sally = new WalkDecorator(animalMaker.getClone(CloneFactory.IAnimalsEnum.SHEEP));
        sally.setName("Sally");
        sally.walk();

        FlyDecorator dove = new FlyDecorator(animalMaker.getClone(CloneFactory.IAnimalsEnum.BIRD));
        dove.setName("Dove");
        dove.fly();
    }
}