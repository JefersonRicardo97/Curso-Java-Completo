package arrays_listas.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data_Hora  {
    static void main() {

        LocalDate d01 = LocalDate.now();
        //Horario Local
        LocalDateTime d02 = LocalDateTime.now();
        //Horario Global
        Instant d03 = Instant.now();
        LocalDate d04 =LocalDate.parse("2026-07-07");
        LocalDateTime d05 = LocalDateTime.parse("2026-07-01T22:00:20");
// transformando em texto na ordem dia/mes/ano
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d04 = "+ d04.format(fmt1));
        System.out.println("d04 = "+ fmt1.format(d04));
        System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d04 = "+ fmt1.format(d04));
        System.out.println("d05= "+ fmt2.format(d05));





    }
}
