public class Student {
    private String name;       // Имя
    private String surname;    // Фамилия
    private int age;           // Возраст
    private int numGroup;      // Номер группы
    private int cntTask;       // Кол-во решенных задач
    private int cntModule;     // Колв-во пройденных модулей
    private String experience; // Опыт
    private static int cntTaskAll; // Кол-во решенных задач всеми студентами
    private static int maxCompletedModule; // Максимальное кол-во модулей, пройденных студентами
    private static final int MAX_MODULE_COUNT = 20; // Максимальное количество модулей

    public static void main(String[] args) {
        Student newStudent = new Student("Andrey", "Kolosov", 23);
        System.out.println(newStudent.getDataStudent(newStudent));
    }

    // Общий конструктор класса Student
    public Student(String name, String surname, int age, int numGroup, int cntTask, int cntModule, String experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numGroup = numGroup;
        this.cntTask = cntTask;
        this.cntModule = cntModule;
        this.experience = experience;
    }

    // Короткий конструктор класса Student
    public Student(String name, String surname, int age) {
        this(name, surname, age, 0, 0, 0, "отсутствует");
    }

    // Метод для получения данных по студенту
    public String getDataStudent(Student student) {
        return "Группа - " + student.numGroup + " | " + student.surname + " " + student.name + " (" + student.age + "), опыт - " + student.experience +
                " | Решенных задач - " + student.cntTask + ", решенных модулей - " + student.cntModule;
    }

    // Метод - выполнить задание
    public void performTask() {
        System.out.println("Задание выполнено");
        cntTask++;
        cntTaskAll++;
    }

    // Метод - пройти модуль
    public void passModule() {
        if (cntModule < MAX_MODULE_COUNT) {
            cntModule++;
            System.out.println("Модуль пройден");
            // Обновляем максимальное кол-во модулей, пройденных студентами
            if (cntModule > maxCompletedModule) {
                maxCompletedModule = cntModule;
            }
        } else {
            System.out.println("Поздравляем! Все модули пройдены!");
        }
    }

    // Метод - задать вопрос
    public void askQuestion() {

    }

    // Метод - пообщаться с куратором
    public void chatCurator() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public int getCntTask() {
        return cntTask;
    }

    public void setCntTask(int cntTask) {
        this.cntTask = cntTask;
    }

    public int getCntModule() {
        return cntModule;
    }

    public void setCntModule(int cntModule) {
        this.cntModule = cntModule;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}