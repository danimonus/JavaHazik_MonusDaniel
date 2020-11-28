package F4;

public class Szemely implements Comparable<Szemely>{
 protected String név;
 protected int életkor;
 private boolean férfi;

    public Szemely(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getNév() {
        return név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public boolean isFérfi() {
        return férfi;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }

    public void setFérfi(boolean férfi) {
        this.férfi = férfi;
    }

    @Override
    public String toString() {
        return  név + " " + életkor + " " + férfi;
    }

    @Override
    public int compareTo(Szemely o) {
        
        if (this.életkor == o.getÉletkor()) {
            return 0;            
        }else if (this.életkor > o.getÉletkor()) {
            return -1;
        }else if (this.életkor < o.getÉletkor()) {
            return -1;
        }
        return -100;
    }
    
    


 
 
}