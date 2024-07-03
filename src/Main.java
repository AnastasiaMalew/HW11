
public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int yearToCheck = 2024;
        checkLeapYear(yearToCheck);
        int deliveryDistance = 25;
        distanceTime(deliveryDistance);
        int deviceOs = 0;
        int deviceYear = 2015;
        checkerDeviceClient(deviceOs, deviceYear);
    }

    public static void checkLeapYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }


    public static void checkerDeviceClient(int deviceOS, int deviceYear) {
        System.out.println("Задание 2");
        if ((deviceOS == 0) && (deviceYear >= 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if ((deviceOS == 1) && (deviceYear >= 2015)) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else if {
                System.out.println("Выберете операционную систему вашего устройства");
            }
        }


        public static int distanceTime ( int km){
            System.out.println("Задание 3");
            if (km <= 20) ;
            else if (km > 20 && km < 60) ;
            else if (km >= 60 && km < 100) ;
            else if (km >= 100) ;
            return km;
        }
    }
}
