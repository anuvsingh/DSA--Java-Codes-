public class classesAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a Pen object p1.
        p1.setColor("Blue");
        System.out.println(p1.Color);
        p1.setTip(5);
        System.out.println(p1.Tip);
        p1.Color = "Yellow";  // OR /* p1.setColor("Yellow") */
        System.out.println(p1.Color);
    }
}
class Pen {
    String Color;
    int Tip;
    void setColor (String newColor) {
        Color = newColor;
    }
    void setTip (int newTip) {
        Tip = newTip;
    }
}