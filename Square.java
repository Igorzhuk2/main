public class Square implements PerimeterCalculable, AreaCalculable {
    private int side;
    private String backgroundColor;
    private String borderColor;

    public Square(int side, String backgroundColor, String borderColor) {
        this.side = side;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public int calculatePerimeter() {
        return 4 * side;
    }

    public int calculateArea() {
        return side * side;
    }

    public String toString() {
        return "Информация о квадрате:\n" +
                "  Периметр: " + calculatePerimeter() + "\n" +
                "  Площадь: " + calculateArea() + "\n" +
                "  Цвет фона: " + backgroundColor + "\n" +
                "  Цвет границ: " + borderColor + "\n";
    }
}