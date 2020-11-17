import java.util.Random;

public class Mentor extends Person implements Staff {
    private boolean moodMentor; // Настроение ментора (true - хорошее настроение, false - плохое)
    private Random random; // Константа рандома

    // Конструктор
    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        this.moodMentor = true;
        this.random = new Random();
    }

    // Метод - помощь студенту
    @Override
    public void helpStudent(Student student) {
        System.out.println("Уважаемый, " + student.getName() + ". Ваши текущие успехи, есть результат Вашей кропотливой работы. С таким подходом, Вам, по плечу любая поставленная задача. Так держать!");
    }

    // Метод - проверить код
    public boolean checkCode(Task task) {
        // Генерируем случайное число
        int randomVal = this.random.nextInt();
        // Определяем настроение ментора
        this.moodMentor = randomVal > 1000;
        // Определяем статус задачи, в зависимости от настроения ментора
        if (!this.moodMentor) {
            System.out.println("Ваше задание №" + task.numTask + " не принято!");
            return false;
        } else {
            System.out.println("Ваша задача принята!");
            return true;
        }
    }
}
