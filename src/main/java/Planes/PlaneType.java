package Planes;

public enum PlaneType {
    BOEING747 (524, 183500),
    AIRBUS_A380 (800, 575000),
    BOEING757 (243,57840),
    AIRBUS_A330 (440,181840);

    private final int capacity;
    private final int weight;

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
