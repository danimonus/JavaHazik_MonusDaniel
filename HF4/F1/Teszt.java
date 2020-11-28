package F1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monus
 */
public class Teszt implements RealNumbers{

        List<Double> valos = new ArrayList<>();

    @Override
    public void add(double num) {
      valos.add(num);
    }

    @Override
    public double get(int idx) {
         return valos.get(idx);
    }

    @Override
    public void delete(int idx) {
      valos.remove(idx);
    }

    @Override
    public boolean contains(double num) {
        return valos.contains(num);
    }

    @Override
    public int getFirstOccurrence(double num) {
        return valos.indexOf(num);
    }
    
    
}
