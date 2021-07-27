package hw2_02;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "12", "2", "23"},
                {"3", "0", "56", "45"},
                {"8", "9", "7", "3"},
                {"9", "3", "12", "15"},
//                {"9", "3", "12", "15"}
        };
        int sum;
        try {
            sum = readArray(arr);
            System.out.println("Сумма элементов массива " + sum);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
            System.out.println("Строка: " + e.getI() + ", столбец: " + e.getJ());
        }

    }

    public static int readArray(String[][] arr) {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("размер массива не верный....");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Символ " + arr[i][j] + " преобразовать в число нельзя", i, j);
//                    System.out.println("Символ " + arr[i][j] + " преобразовать в число нельзя");
                }
            }

        }
        return sum;
    }
}
