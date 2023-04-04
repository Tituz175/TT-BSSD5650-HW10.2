public class WalkDecorator implements IWalkDecorator {

    private IAnimal animal;
    public WalkDecorator(IAnimal animal) {
        this.animal = animal;
    }
    @Override
    public void walk() {
        System.out.println(animal.getName() + ", can walk.");
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
