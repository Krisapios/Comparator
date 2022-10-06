import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int lengthSurname1 = o1.getSurname().split(" ").length;
        int lengthSurname2 = o2.getSurname().split(" ").length;

        if (lengthSurname1 == lengthSurname2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (lengthSurname1 > lengthSurname2) {
            return -1;
        }
        return 1;
    }
}


