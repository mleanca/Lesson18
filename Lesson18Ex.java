import java.time.*;

public class Lesson18Ex {

    public static void main(String[] args) {

        System.out.println("Practice exercise answers:");

        //Creați o LocalDate care va reprezente data de 2 ianuarie 2024
        LocalDate date1 = LocalDate.of(2024, 01, 02);
        System.out.println("1. Date: " + date1);

        //Creați o LocalTime care va reprezenta ora 13:20
        LocalTime time1 = LocalTime.of(13, 20);
        System.out.println("2. Time: " + time1);

        //Creați o LocalDateTime care va reprezente data de 2 ianuarie 2024 ora 13:20
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 01, 02, 13, 20); // created an object and method from APO
        System.out.println("3. Date & Time: " + dateTime1);

        //Creați o ZoneDateTime care va reprezente data de 2 ianuarie 2024 ora 13:20 în America
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2024, 1, 2, 13, 20, 0 , 0, ZoneId.of("America/New_York"));
        System.out.println("4. Date, Time, & Zone: " + zonedDateTime1);

        //Adăugați un minut, o ora, o zi, un an, la data de mai sus
        ZonedDateTime zoneDateTime2 = zonedDateTime1.plusMinutes(1);
        ZonedDateTime zoneDateTime3 = zonedDateTime1.plusHours(1);
        ZonedDateTime zoneDateTime4 = zonedDateTime1.plusDays(1);
        ZonedDateTime zoneDateTime5 = zonedDateTime1.plusYears(1);

        System.out.println("5. DTZ + 1: " + zoneDateTime5);

        //Practice exercise answers:
        //1. Date: 2024-01-02
        //2. Time: 13:20
        //3. Date & Time: 2024-01-02T13:20
        //4. Date, Time, & Zone: 2024-01-02T13:20-05:00[America/New_York]
        //5. DTZ + 1: 2025-01-02T13:20-05:00[America/New_York]
    }
}
