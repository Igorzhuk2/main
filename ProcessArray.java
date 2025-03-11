public class ProcessArray {
    public static int arrayProcess(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Ошибка! Размер массива дожен быть 4х4, а получен: " + array.length + "x" + array[0].length);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {  sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные в ячейке [" + i + "][" + j + "]: " + array[i][j], i, j);
                }
            }
        }
        return sum;
    }
}