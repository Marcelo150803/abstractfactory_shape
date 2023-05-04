public class BlueRectangle extends Rectangle {

    public BlueRectangle(float base, String color) {
        super(base, "BLUE");
    }
    
    @Override
    public void draw() {
        System.out.println("Dentro de Retangulo " + getColor() + " de base " + getBase()
                + "no método draw()");
    }
}
