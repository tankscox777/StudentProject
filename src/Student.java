import java.util.Objects;

public class Student extends Person {
    public enum Discipline {
        JAVA,
        PYTHON,
        WEB,
        UX,
        PROJECT_MANAGEMENT;
    }
    private int numGroup;      // Номер группы
    private Discipline nameCourse; // Имя курса
    private int cntTask;       // Кол-во решенных задач
    private int cntModule;     // Колв-во пройденных модулей
    private String experience; // Опыт
    private static int cntTaskAll; // Кол-во решенных задач всеми студентами
    private static int maxCompletedModule; // Максимальное кол-во модулей, пройденных студентами
    private static final int MAX_MODULE_COUNT = 20; // Максимальное количество модулей

    // Общий конструктор класса Student
    public Student(String name, String surname, int age, int numGroup, Discipline discipline, int cntTask, int cntModule, String experience) {
        super(name, surname, age);
        this.numGroup = numGroup;
        this.nameCourse = discipline;
        this.cntTask = cntTask;
        this.cntModule = cntModule;
        this.experience = experience;
    }

    // Короткий конструктор класса Student
    public Student(String name, String surname, int age, Discipline discipline) {
        this(name, surname, age, 0, discipline, 0, 0, "отсутствует");
    }

    // Метод для получения данных по студенту
    public static String getDataStudent(Student student) {
        return student.getNameCourse() + ": " + "группа - " + student.numGroup + " | " + student.getSurname() + " " + student.getName() + " (" + student.getAge() + "), опыт - " + student.experience +
                " | Решенных задач - " + student.cntTask + ", решенных модулей - " + student.cntModule;
    }

    public String getDataStudent() {
        return this.getNameCourse() + ": " + "группа - " + this.numGroup + " | " + this.getSurname() + " " + this.getName() + " (" + this.getAge() + "), опыт - " + this.experience +
                " | Решенных задач - " + this.cntTask + ", решенных модулей - " + this.cntModule;
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

    public String getNameCourse() {
        return nameCourse.name();
    }

    public void setNameCourse(Discipline discipline) {
        this.nameCourse = discipline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return this.getAge() == student.getAge() &&
                Objects.equals(this.getName(), student.getName()) &&
                Objects.equals(this.getSurname(), student.getSurname()) &&
                Objects.equals(this.getExperience(), student.getExperience()) &&
                Objects.equals(this.getNameCourse(), student.getNameCourse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSurname(), this.getAge(), this.getExperience(), this.getNameCourse());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", numGroup=" + numGroup +
                ", nameCourse='" + nameCourse + '\'' +
                ", cntTask=" + cntTask +
                ", cntModule=" + cntModule +
                ", experience='" + experience + '\'' +
                '}';
    }
}