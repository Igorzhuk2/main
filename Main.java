public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Красный", "Чёрный");
        Square square = new Square(5, "Синий", "Белый");
        Rectangle rectangle = new Rectangle(8, 5, "Зелёный", "Жёлтый");
        Triangle triangle = new Triangle(3, 4, 5, "Оранжевый", "Фиолетовый");

        printShapeInfo(circle);
        printShapeInfo(square);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    public static void printShapeInfo(Object shape) {
        System.out.println(shape);
    }
}