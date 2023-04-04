public class Sheep implements IAnimal {

    private String name;

    public Sheep() {

        System.out.println("Sheep is Made");

    }

    public IAnimal makeCopy() {

        System.out.println("Sheep is Being Made");

        Sheep sheepObject = null;

        try {

            // Calls the Animal super classes clone()
            // Then casts the results to Sheep

            sheepObject = (Sheep) super.clone();

        }

        // If Animal didn't extend Cloneable this error
        // is thrown

        catch (CloneNotSupportedException e) {

            System.out.println("The Sheep was Turned to Mush");

            e.printStackTrace();

        }

        return sheepObject;
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
        return "Dolly is my Hero, Baaaaa";
    }

}