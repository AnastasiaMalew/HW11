
public class Main {

        public static void main (String[]args) {
        System.out.println("Задание 1");
        int yearToCheck = 2024;
        checkLeapYear(yearToCheck);
    }

        public static void checkLeapYear ( int year){
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }

    public static void task (String[] args) {
            System.out.println("Задание 2");
            int clientDeviceOs = 0;
            int clientDeviceYear = 2015;
            checkerDeviceClient(clientDeviceOs, clientDeviceYear);
        }
        public static void checkerDeviceClient(int deviceOS, int deviceYear) {
        if (deviceOS == 0) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (deviceOS == 1) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Выберете операционную систему вашего устройства");
        }
    }
    public static int distanceTime(int km) {
    System.out.println("Задание 3");
            if (km <= 20) {
                return 1;
            } else if (km > 20 && km < 60) {
                return 2;
            } else if (km >= 60 && km < 100) {
                return 3;
            } else {
                // Тут можно возвращать специальное значение, например 0, что означает "доставки нет".
                return 0;
            }
        }
    public static void main(String[] args) {
        int deliveryDistance = 50;
        distanceTime(deliveryDistance);
        int days = distanceTime(deliveryDistance);
            if (days > 0) {
                System.out.println("Потребуется дней: " + days + " срок доставки.");
            } else {
                System.out.println("Доставки нет.");
            }
        }
    }
