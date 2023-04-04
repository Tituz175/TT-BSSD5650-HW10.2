public class Mouse implements IAnimal {

    private String name;

    public Mouse() {

        System.out.println("Mouse is Made");

    }

    public IAnimal makeCopy() {

        System.out.println("Mouse is Being Made");

        Mouse mouseObject = null;

        try {

            // Calls the Animal super classes clone()
            // Then casts the results to Sheep

            mouseObject = (Mouse) super.clone();

        }

        // If Animal didn't extend Cloneable this error
        // is thrown

        catch (CloneNotSupportedException e) {

            System.out.println("The Mouse was Turned to Mush");

            e.printStackTrace();

        }

        return mouseObject;
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
        return "Ratatouille is my Hero.";
    }
}
