package day18PassByValueDateTime;

import java.time.*;

public class DateTime02 {
    public static void main(String[] args) {

        LocalDate cd = LocalDate.now();
        System.out.println(cd);//2022-09-28

        LocalTime ct =LocalTime.now();
        System.out.println(ct);//23:09:18.609412600

        LocalDateTime ctd = LocalDateTime.now();
        System.out.println(ctd);//2022-09-28T23:09:18.609412600

        LocalDate cld = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(cld);//2022-09-29

        LocalTime clt = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(clt);//03:41:27.745604400

        LocalDateTime cldt = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(cldt);//2022-09-29T03:50:24.583364100

        LocalDate localDatefuture = cld.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(localDatefuture);//2025-06-28

        LocalDate localDatePast = cld.minusYears(2).minusMonths(5).minusDays(120);
        System.out.println(localDatePast);//2019-12-31

        LocalTime vld = LocalTime.now();
        int hour  = vld.getHour();
        System.out.println(vld);//23:32:43.429441200

        int minute = vld.getMinute();

        System.out.println(minute);//35;

        LocalDate dob1 = LocalDate.of(2002, 10, 12);
        System.out.println(dob1);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY, 21);
        System.out.println(dob2);

        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is  = dob2.isBefore(dob1);
        System.out.println(is);//false




















    }
}
