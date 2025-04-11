public class MyArray {

    static int count = 0;

    public static int myArraySize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива не соответствует требованиям!");
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i].length != 4) {
                throw new MyArraySizeException("Размер массива не соответствует требованиям");
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    Integer.parseInt(array[i][j]);
                    count += Integer.parseInt(array[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не верное значение " + "'" + array[i][j] + "'" + " в ячейке" + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        return count;
    }
}
