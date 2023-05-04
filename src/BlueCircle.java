public class BlueCircle extends Circle {

    public BlueCircle(float ray, String color) {
        super(ray, "BLUE");
    }
    
    @Override
    public void draw() {
        System.out.println("Dentro de Circulo " + getColor() + " de raio " + getRay()
                + "no método draw()");
    }
}
