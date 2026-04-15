public class Triangle extends ShapeBase {
    private final int HEIGHT = 5;

    @Override
    public void drawHere() {
        for (int i = 1; i <= HEIGHT; i++) {

            for (int j = HEIGHT; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n" + "-".repeat(10));
    }
}
