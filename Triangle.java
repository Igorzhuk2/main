public class Triangle implements PerimeterCalculable, AreaCalculable {
    private int sideA;
    private int sideB;
    private int sideC;
    private String backgroundColor;
    private String borderColor;

    // Конструктор
    public Triangle(int sideA, int sideB, int sideC, String backgroundColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public String toString() {
        return "Информация о треугольнике:\n" +
                "  Периметр: " + calculatePerimeter() + "\n" +
                "  Площадь: " + calculateArea() + "\n" +
                "  Цвет фона: " + backgroundColor + "\n" +
                "  Цвет границ: " + borderColor + "\n";
    }
}