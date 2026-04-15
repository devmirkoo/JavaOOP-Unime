public class Main {
    public static void main(String[] args) {

        ShapeBase[] shapes = new ShapeBase[8];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = (i % 2 == 0) ? new Triangle() : new Rectangle();
        }

        for (ShapeBase shape : shapes) {
            shape.drawHere();
        }
    }
}
