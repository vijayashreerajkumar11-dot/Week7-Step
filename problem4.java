
class TrafficLight {

    // Private fields
    private String color;
    private final String id;

    // Constructor
    TrafficLight(String id) {
        this.id = id;
        this.color = "RED";   // Every new light starts with RED
    }

    // Moves to the next color
    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } 
        else if (color.equals("GREEN")) {
            color = "YELLOW";
        } 
        else if (color.equals("YELLOW")) {
            color = "RED";
        }
    }

    // Read-only method to check current color
    public String getColor() {
        return color;
    }

    // Read-only method to check ID
    public String getId() {
        return id;
    }
}

public class problem4 {
    public static void main(String[] args) {

        TrafficLight t = new TrafficLight("TL-9");

        System.out.println(t.getColor());  // RED

        t.next();
        System.out.println(t.getColor());  // GREEN

        t.next();
        System.out.println(t.getColor());  // YELLOW

        t.next();
        System.out.println(t.getColor());  // RED

        t.next();
        System.out.println(t.getColor());  // GREEN
    }
}

