public class Circle implements PerimeterCalculable, AreaCalculable {
    private int radius;
    private String backgroundColor;
    private String borderColor;

    public Circle(int radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Информация о круге:\n" +
                "  Периметр: " + calculatePerimeter() + "\n" +
                "  Площадь: " + calculateArea() + "\n" +
                "  Цвет фона: " + backgroundColor + "\n" +
                "  Цвет границ: " + borderColor + "\n";
    }
}
