public class FlyDecorator implements IFlyDecorator {

    private IAnimal animal;

    public FlyDecorator(IAnimal animal) {
        this.animal = animal;
    }

    @Override
    public void fly() {
        System.out.println(animal.getName() + ", can fly.");
    }

    @Override
    public IAnimal makeCopy() {
        return new WalkDecorator(animal.makeCopy());
    }

    @Override
    public void setName(String name) {
        animal.setName(name);
    }

    @Override
    public String getName() {
        return animal.getName();
    }
}