import java.util.HashMap;
import java.util.Map;

public class CloneFactory {

    // Receives any Animal, or Animal subclass and
    // makes a copy of it and stores it in its own
    // location in memory

    // CloneFactory has no idea what these objects are
    // except that they are subclasses of Animal

    static Map<String, IAnimal> animals = new HashMap<>();

    enum IAnimalsEnum {

        BIRD{
          public IAnimal getInstance(){
              IAnimal dove = (IAnimal) (new Bird());
              dove.setName("Dove");
              return dove;
          }
        },
        CYBERMOUSE{
          public IAnimal getInstance(){
              IAnimal cm = (IAnimal) (new Mouse());
              cm.setName("Mauser");
              return cm;
          }
        },
        MOUSE {
            public IAnimal getInstance(){
                IAnimal rm =  (IAnimal) (new Mouse());
                rm.setName("Mouseketeer");
                return rm;
            }
        },
        SHEEP {
            public IAnimal getInstance() {
                return (IAnimal) (new Sheep());
            }
        };
        public abstract IAnimal getInstance();
    }

    public IAnimal getClone(IAnimalsEnum whichAnimal) {

        IAnimal prototype = animals.get(whichAnimal.toString());
        if (prototype == null) {
            prototype = whichAnimal.getInstance();
            animals.put(whichAnimal.toString(), prototype);
        }

        return prototype.makeCopy();

    }

}