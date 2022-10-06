import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Сельвестер", "В Столовой", 15));
        people.add(new Person("Дайнерис", "Бурерожденная, Неопалимая, Королева Миэрина, Матерь Драконов", 18));
        people.add(new Person("Вася", "Пупкин", 36));
        people.add(new Person("Коля", "Не пей Вода", 48));
        people.add(new Person("Коля", "Крот Енот", 10));
        people.add(new Person("Гена", "Букин", 5));

        Collections.sort(people, new PersonComparator());
        System.out.println(people);

    }
}