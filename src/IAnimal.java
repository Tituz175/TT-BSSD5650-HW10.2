// By making this class cloneable you are telling Java
// that it is ok to copy instances of this class
// These instance copies have different results when
// System.identityHashCode(System.identityHashCode(bike))
// is called 

public interface IAnimal extends Cloneable {

    public IAnimal makeCopy();
    public void setName(String name);
    public String getName();
}