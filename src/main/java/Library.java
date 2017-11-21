import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import org.test.git.cad.bean.Persona;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        // This is a test.
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> result = listOfNumbers.stream().filter(p -> p >= (3 + 1) ).map(p -> p + 1).collect(Collectors.toList());
        // This is another line.
        result.forEach(System.out::println);
        // This is 3
        System.out.println("this is a new lien");

        System.out.println("this is a second line");

        Person person = new Person("Carlos");

        System.out.println(persona.getName());

        BinaryOperator<Integer> calc = (p1, p2) -> p1 + p2;

        System.out.println(calc.apply(1, 2));
    }
}
