public class HashClient {
    public static void main(String[] args) {

        // PART I

        // Recall our process of implementing a HashMap. We basically copied our
        // HashSet and made a few modifications. This resulted in a fair bit of
        // duplicate code/logic. Streamline the code so that HashSet uses our HashMap
        // as its underlying data structure, rather than an array of Lists. Try to
        // eliminate as much duplicate code as possible.

        // Hint: How are the KEYS stored/retrieved in HashMap?

        // PART II -- Add the following students to this hashset
        Set<Student> students = new HashSet<>();

        Student malcolm = new Student(111, "Malcolm");
        Student river = new Student(222, "River");
        Student inara = new Student(333, "Inara");
        Student jayne = new Student(444, "Jayne");
        Student kaylee = new Student(555, "Kaylee");
        Student shepherd = new Student(777, "Shepherd");
        students.add(malcolm);
        students.add(malcolm); // Purposely duplicated
        students.add(river);
        students.add(inara);
        students.add(jayne);
        students.add(kaylee);
        students.add(shepherd);

        // They should print out in an indeterminate order:
        System.out.println(students);
        // output: [Shepherd, Malcolm, River, Jayne, Kaylee, Inara]

        // However, you control the hash function -- the order is not actually indeterminate.
        // Modify the --> hashing algorithm as appropriate <-- so that IN THIS CASE the students
        // print in alphabetical order. Elements in general do not need to print in order. Do not
        // modify toString().
        System.out.println(students);
        // expected: [Inara, Jayne, Kaylee, Malcolm, River, Shepherd]

        // NOTE: Both of the above will print the same thing at any given time -- That's OK!

    }

}
