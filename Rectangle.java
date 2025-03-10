public class Rectangle implements PerimeterCalculable, AreaCalculable {
    private int width;
    private int height;
    private String backgroundColor;
    private String borderColor;

    public Rectangle(int width, int height, String backgroundColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public int calculateArea() {
        return width * height;
    }

    public String toString() {
        return "Информация о прямоугольнике:\n" +
                "  Периметр: " + calculatePerimeter() + "\n" +
                "  Площадь: " + calculateArea() + "\n" +
                "  Цвет фона: " + backgroundColor + "\n" +
                "  Цвет границ: " + borderColor + "\n";
    }
}