package F3;

/**
 *
 * @author monus
 */
public class teherAuto extends Auto{

private int teherbiras;

    public teherAuto(String rendszám, int teljesítmény, boolean automata,int teherbiras) {
        super(rendszám, teljesítmény, automata);
        this.teherbiras = teherbiras;
    }

    @Override
    public String toString() {
        return super.toString() +" " + teherbiras;
    }

    public int getTeherbiras() {
        return teherbiras;
    }


    

    
}
