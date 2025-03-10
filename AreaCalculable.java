public interface AreaCalculable {
    default int calculateArea(int width, int height) {
        return width * height;
    }
}