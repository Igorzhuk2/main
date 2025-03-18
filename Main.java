import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Иванов", "123-456");
        directory.add("Петров", "789-012");
        directory.add("Петров", "345-678");
        directory.add("Сидоров", "901-234");

        System.out.println("Все записи в справочнике:");
        directory.printAllEntries();

        System.out.println("Номера Иванова:");
        List<String> ivanovNumbers = directory.get("Иванов");
        for (String number : ivanovNumbers) {
            System.out.println(number);
        }

        System.out.println("Номера Сидорова:");
        List<String> sidorovNumbers = directory.get("Сидоров");
        for (String number : sidorovNumbers) {
            System.out.println(number);
        }

        System.out.println("Номера Несуществующего:");
        List<String> nonExistentNumbers = directory.get("Несуществующий");
        if (nonExistentNumbers.isEmpty()) {
            System.out.println("Записи не найдены.");
        }
    }
}