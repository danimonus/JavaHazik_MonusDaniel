package F4;

/**
 *
 * @author monus
 */
public class Oktato extends Szemely{


private String tanszek;

    public Oktato(String név, int életkor, boolean férfi, String tanszek) {
        super(név, életkor, férfi);
        this.tanszek = tanszek;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tanszek;
    }

    public String getTanszek() {
        return tanszek;
    }

  

    


}
