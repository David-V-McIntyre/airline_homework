public enum PlaneType {
    Boeing737 (100, 2000),
    Boeing747 (200, 3000),
    BoeingSkimmer (3, 500);

    protected final int capacity;
    protected final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
