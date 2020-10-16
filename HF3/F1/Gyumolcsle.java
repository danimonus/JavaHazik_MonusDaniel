package F1;


/**
 *Absztrakt osztály amely az Ital szintén abdsztrakt osztályból van származtatva.
 * @author monus
 */
abstract class Gyumolcsle extends Ital{
    
    public abstract void Gyumolcsle(Gyumolcs gy);
    
    public abstract String mibolFacsartak();
    public abstract String mibolKeszult();
    public abstract String milyenIzu();
    

    @Override
    public String toString() {
        return "Gyumolcsle{" + '}';
    }
    
    
    
}
