package Day_6_Assignment;

enum TrafficLight {
    RED, YELLOW, GREEN;

    public TrafficLight next() {
        switch (this) {
            case RED: return GREEN;
            case YELLOW: return RED;
            case GREEN: return YELLOW;
            default: return RED;
        }
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLight current = TrafficLight.RED;
        System.out.println("Current: " + current);
        System.out.println("Next: " + current.next());
    }
}
