public class gettersANDsetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
class Pen {
    private String Color;
    private int Tip;
    String getColor() {
        return this.Color; //GETTERS - to return the value.
    }
    int getTip() {
        return this.Tip; //GETTERS - to return the value.
    }
    void setColor(String newColor) {
        this.Color = newColor; //SETTERS - to set or modify the value.
    }
    void setTip(int Tip) {
        this.Tip = Tip; //SETTERS - to set or modify the value.
    }
}