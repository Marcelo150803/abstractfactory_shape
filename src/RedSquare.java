public class RedSquare extends Square {

    public RedSquare(float height, String color) {
        super(height, "RED");
    }
    
    @Override
    public void draw() {
        System.out.println("Dentro de Quadrado " + getColor() + " de altura " + getHeight()
                + "no método draw()");
    }
}
