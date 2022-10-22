import java.util.ArrayList;
import java.util.Comparator;
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

        Comparator<Person> comparator = (person1, person2) -> {
            if (person1.getSurname().split(" ").length < person2.getSurname().split(" ").length) {
                return 1;
            } else if (person1.getSurname().split(" ").length > person2.getSurname().split(" ").length) {
                return -1;
            } else
                return Integer.compare(person2.getAge(), person1.getAge());
        };
        people.sort(comparator);
        System.out.println(people);
    }
}