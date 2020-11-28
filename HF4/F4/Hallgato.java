package F4;

/**
 *
 * @author monus
 */
public class Hallgato extends Szemely{
    
    public boolean jokepessegu(Hallgato h){
    
        if (h.atlagtulajdonsag >= this.joAtlag) {
            return true;
        }else
            return false;
        
    }
    
    
 private double atlagtulajdonsag;
 public static double joAtlag;

    public Hallgato(String név, int életkor, boolean férfi,double atlagtulajdonsag) {
        super(név, életkor, férfi);
        this.atlagtulajdonsag = atlagtulajdonsag;
        this.joAtlag = joAtlag;
    }

    public void setJoAtlag(double joAtlag) {
        this.joAtlag = joAtlag;
    }


    public void setAtlagtulajdonsag(double atlagtulajdonsag) {
        this.atlagtulajdonsag = atlagtulajdonsag;
    }

    
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.név).append("\n").append(super.életkor).append("\n")
                .append(super.isFérfi()).append("\n").append(this.atlagtulajdonsag);
    
        return sb.toString();

    }



}
