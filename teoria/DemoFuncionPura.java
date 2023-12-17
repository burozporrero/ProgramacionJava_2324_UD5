package teoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DemoFuncionPura {

    long edadUsuario;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String sBirthDate;
        LocalDate birthDate;

        System.out.print("Introduce tu fecha de cumpleaños con el formato dd/mm/aaaa: ");
        sBirthDate = sc.next();

        birthDate = LocalDate.parse(sBirthDate, formatDate);

        calcularEdad(birthDate);
        calcularEdadEnDia(birthDate, LocalDate.now());
        //calcularEdadEnDiaYGuardar(birthDate, LocalDate.now());

        sc.close();
    }

    // Método sin efectos secundarios pero no predecible
    public static long calcularEdad(LocalDate birthDate)
    {
        LocalDate today = LocalDate.now();  // el uso del LocalDate.now genera código no predecible

        return ChronoUnit.YEARS.between(birthDate, today);
    }

    // Pasando el día por parámetro convertimos la función anterior en una función pura.
    // Sin efectos secundarios e idempotente.
    public static long calcularEdadEnDia(LocalDate birthDate, LocalDate today)
    {
        return ChronoUnit.YEARS.between(birthDate, today);
    }

    // Método idempotente pero con efectos secundarios
    public void calcularEdadEnDiaYGuardar(LocalDate birthDate, LocalDate today)
    {
        edadUsuario = ChronoUnit.YEARS.between(birthDate, today);  // cambio del estado de la aplicación
    }
}
