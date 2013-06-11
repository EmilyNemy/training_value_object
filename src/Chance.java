
public class Chance {
    private double probability;
    public Chance(double probability) {
        this.probability = probability;
    }

    public Chance or(Chance another) {
        double result = this.probability + another.probability;
        return new Chance(result);  //To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object another) {
        if(super.equals(another))
            return true;
        else
            if(another == null)
                return false;
            else
                if(another.getClass().equals(this.getClass()))
                    if (this.probability == ((Chance) another).probability)
                        return true;
                    else
                        return false;
                return false;
    }
}
