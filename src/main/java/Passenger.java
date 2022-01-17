public class Passenger extends Person {

    private int numberOfBags;

    public Passenger(String _name, int numberOfBags) {
        super(_name);
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
