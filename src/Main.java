import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task1
        int someYear = 1861;
        Main.checkLeapYear(someYear);

        //Task2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        Main.detectOSVersion(clientOS, clientDeviceYear);

        //Task3
        System.out.println("Задание 3:");
        int deliveryDistance = 95;
        int deliveryDays = Main.deliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    //Task1
    public static void checkLeapYear(int year) {
        System.out.println("Задание 1:");
        boolean isLeapYear = (year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0));
        if (isLeapYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //Task2
    public static void detectOSVersion(int isAndroid, int clientDeviceYear) {
        System.out.println("Task 2:");
        int currentYear = LocalDate.now().getYear();
        String operationSystem;
        String version;
        if(isAndroid == 1){
            operationSystem = "Android";
        } else {
            operationSystem = "iOS";
        }
        if (clientDeviceYear < currentYear){
            version = "облегченную"+" ";
        } else {
            version = "";
        }
        System.out.println("Установите "+version+"версию приложения для "+operationSystem+" по ссылку");
    }

    //Task3
    public static int deliveryDays(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
        } else if (deliveryDistance > 100) {
            System.out.println("Мы не доставляем на расстояние более 100 км");
            deliveryTime = Integer.MAX_VALUE;
        }
        return deliveryTime;
    }

}