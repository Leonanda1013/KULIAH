public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= (0.02 * strength);
    }

    public String getBerrierInfo() {
        String info = "Berrier Strength: " + strength + "\n";
        return info;
    }
}
