abstract class Shape implements Comparable<Shape>{
     abstract double calculateArea();

    abstract double calculatePerimeter();
    static int state = 0;

    public int compareTo(Shape shape) {
        if (state == 0) {
            if (this.calculateArea() != shape.calculateArea()) {
                return Double.compare(this.calculateArea(), shape.calculateArea());
            }
        } else if (state == 1) {
            if (this.calculateArea() != shape.calculateArea()) {
                return Double.compare(shape.calculateArea(), this.calculateArea());
            }
        }
        return 0;
    }
}
