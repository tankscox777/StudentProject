public class Main {
    public static void main(String[] args) {
        Student newStudent1 = new Student("Andrey", "Kolosov", 23);
        System.out.println(newStudent1.getDataStudent());
        Student newStudent2 = new Student("Liza", "Pavlova", 19);
        System.out.println(newStudent2.getDataStudent());
        // Проверим, разные ли студенты
        if (newStudent1.equals(newStudent2)) {
            System.out.printf("Студенты 1 (hashCode: %d) и 2 (hashCode: %d) одинаковые!\n", newStudent1.hashCode(), newStudent2.hashCode());
        } else {
            System.out.printf("Студенты 1 (hashCode: %d) и 2 (hashCode: %d) разные!\n", newStudent1.hashCode(), newStudent2.hashCode());
        }
        System.out.println(newStudent1.toString());
    }
}
