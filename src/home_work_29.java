import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;

public class home_work_29 {

    /*--- Task ---

    Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
Создать дату , например день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран текущее время
текущее время + 3 часа
Создать дату на неделю позже сегодняшней
Создать даты tomorrow и yesterday и проверить
находятся ли они до или после сегодняшней

     */
    public static void main(String[] args) {


//-текущий год, месяц и день
        LocalDate localDateYear = LocalDate.now();
        System.out.println(localDateYear);// 2024-01-29

//Создать дату , например день рождения и вывести на экран
        LocalDate localNewDate = LocalDate.of(1981,5,20);
        System.out.println(localNewDate);//1981-05-20//

//Получить и вывести на экран текущее время
        LocalTime localTime = LocalTime.now();
        System.out.println("Time now is " + localTime); // Time now is 15:07:25.933747500
//текущее время + 3 часа
        System.out.println("add hours:" + localTime.plusHours(3));//add hours:18:08:55.506051200

//Создать дату на неделю позже сегодняшней
        LocalDate datePlusWeek = localDateYear.plusWeeks(1);
        System.out.println(datePlusWeek);//2024-02-05

//Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = localDateYear.plusDays(1);
        System.out.println(tomorrow);//2024-01-28
        LocalDate yesterday = localDateYear.minusDays(1);
        System.out.println(yesterday);//2024-01-30

        System.out.println(yesterday.isBefore(LocalDate.now()));//true
        System.out.println(tomorrow.isAfter(LocalDate.now()));//true

    }
}
