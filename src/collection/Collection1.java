package collection;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("*** First task ***");
        LinkedList<Pet> pets = new LinkedList<>();
        pets.add(new Pet("cat", 2));
        pets.add(new Pet("cat", 3));
        pets.add(new Pet("dog", 3));
        pets.add(new Pet("hamster", 1));
        pets.add(new Pet("horse", 7));

        System.out.println("1) collection created");
        System.out.println("2) " + pets);
        System.out.println("3) " + pets.get(0) + ", " + pets.get(pets.size() - 1));
        System.out.println("4) " + pets.remove(pets.size() - 1) + " deleted");
        System.out.println("5) " + pets);
        System.out.println("6) " + pets.remove() + " deleted");
        System.out.println("7) " + pets);
        System.out.println("8) " + pets.poll() + " deleted");
        System.out.println("9) the element" + (pets.offerFirst(new Pet("cock", 5)) ? " has been" : " was not ") + " added");
        System.out.println("10) " + pets);
        System.out.println("11) the element" + (pets.offer(new Pet("hamster", 1)) ? " has been" : " was not ") + " added");
        System.out.println("12) " + pets);
        System.out.println("13) the element" + (pets.offer(new Pet("dog", 3)) ? " has been" : " was not ") + " added");
        System.out.println("14) " + pets);
    }

    public static void task2() {
        System.out.println("\n*** Second task ***");
        Map<Person, PersonInformation> people = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getSurname().equals(o2.getSurname()) && o1.getName().equals(o2.getName()))
                    return  o1.getPatronymic().compareTo(o2.getPatronymic());
                if (o1.getSurname().equals(o2.getSurname()))
                    return  o1.getName().compareTo(o2.getName());
                return  o1.getSurname().compareTo(o2.getSurname());
            }
        });
        Person teacher1 = new Person(1, "Иванов", "Иван", "ИВанович", 52);
        Person teacher2 = new Person(2, "Петров", "Петр", "Петрович", 33);
        Person teacher3 = new Person(3, "Ди", "Алик", "Степанович", 70);
        Person student1 = new Person(4, "Бурундук", "Ян", "Олегович", 20);
        Person student2 = new Person(5, "Иванов", "Александр", "Сергеевич", 24);
        Person student3 = new Person(6, "Гладкий", "Владислав", "Сергеевич", 23);
        Person student4 = new Person(7, "Абрамов", "Джон", "Карамович", 23);
        Person student5 = new Person(8, "Ди", "Нозавр", "Аликович", 23);

        people.put(teacher1, new PersonInformation("преподаватель", "прикладной математики"));
        people.put(teacher2, new PersonInformation("преподаватель", "прикладной математики"));
        people.put(teacher3, new PersonInformation("преподаватель", "философии"));
        people.put(student1, new PersonInformation("студент", "09-411"));
        people.put(student2, new PersonInformation("студент", "09-411"));
        people.put(student3, new PersonInformation("студент", "09-412"));
        people.put(student4, new PersonInformation("студент", "09-412"));
        people.put(student5, new PersonInformation("студент", "09-413"));

        int index = 0;
        Person min = null;
        Person max = null;
        for (Map.Entry<Person, PersonInformation> elem : people.entrySet()) {
            if (index == 0) {
                min = elem.getKey();
                max = elem.getKey();
            } else if (elem.getKey().getAge() < min.getAge()) {
                min = elem.getKey();
            } else if (elem.getKey().getAge() > max.getAge()) {
                max = elem.getKey();
            }
            System.out.println(++index + ") " + elem.getKey() + " - " + elem.getValue());
        }
        System.out.println("Самый молодой - "  + min);
        System.out.println("Самый старый - "  + max);
    }
    public static void task3() {
        System.out.println("\n*** Third task ***");
        Set<Integer> hSet = new HashSet<>();
        Set<Integer> tSet = new TreeSet<>();
        Set<Integer> lSet = new LinkedHashSet<>();
        int range = 20;
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            hSet.add(random.nextInt() % range);
            tSet.add(random.nextInt() % range);
            lSet.add(random.nextInt() % range);
        }
        System.out.println("HashSet\n" + hSet);
        System.out.println("TreeSet\n" + tSet);
        System.out.println("LinkedHashSet\n" + lSet);

        Set<Integer> hashSet = new HashSet<>(List.of(3, 7, 2, 5, 6, 8, 0));
        System.out.println("HashSet2\n" + hashSet);
        for (Integer elem : hashSet)
            tSet.remove(elem);
        System.out.println("new TreeSet\n" + tSet);
    }
}
