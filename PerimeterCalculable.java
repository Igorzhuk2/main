public interface PerimeterCalculable {
    default int calculatePerimeter(int... sides) {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}