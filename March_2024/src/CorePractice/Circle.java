package CorePractice;

class CircumferenceArea {
    CircumferenceArea() {
    }

    public double getCircumference(int r) {
        double crcf = 6.283185307179586 * (double)r;
        return crcf;
    }

    public double area(int r) {
        double crarea = Math.PI * (double)r * (double)r;
        return crarea;
    }
}

public class Circle {
    public Circle() {
    }

    public static void main(String[] args) {
        int r = 3;
        CircumferenceArea circumferenceArea = new CircumferenceArea();
        System.out.println(circumferenceArea.area(r));
        System.out.println(circumferenceArea.getCircumference(r));
    }
}