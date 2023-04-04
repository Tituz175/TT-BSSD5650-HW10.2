public class Bird implements IAnimal{

    private String name;

    public Bird() {

        System.out.println("Bird is Made");

    }

    @Override
    public IAnimal makeCopy() {
        System.out.println("Bird is Being Made");

        Bird birdObject = null;

        try {

            // Calls the Animal super classes clone()
            // Then casts the results to Sheep

            birdObject = (Bird) super.clone();

        }

        // If Animal didn't extend Cloneable this error
        // is thrown

        catch (CloneNotSupportedException e) {

            System.out.println("The Bird was Turned to Mush");

            e.printStackTrace();

        }

        return birdObject;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString() {
        return "Ronaldo is my Hero.";
    }
}
