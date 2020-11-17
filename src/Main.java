import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomCntTask = new Random();
        Task[] arrayTasks = new Task[50];
        // Заполнение массива с задачами
        fillArrayTask(arrayTasks);
        Student[] arrayStudents = new Student[30];
        // Заполнение массива со студентами
        fillArrayStudent(arrayStudents);
        while (Student.getCntCompletedTaskStudent() < (arrayTasks.length * arrayStudents.length)) {
            for (Student student: arrayStudents) {
                if (!student.isCompletedTaskAll()) {
                    student.solveTasks(randomCntTask.nextInt(arrayTasks.length), arrayTasks);
                }
            }
        }
        System.out.println("Все студенты решили все задачи");
    }

    // Метод для заполнения массива с задачами
    private static void fillArrayTask(Task[] arrayTasks) {
        for (int i = 0; i < arrayTasks.length; i++) {
            // Заполнение разными задачами
            switch (i % 3) {
                case 0:
                    arrayTasks[i] = new Code();
                    break;
                case 1:
                    arrayTasks[i] = new DragAndDrop();
                    break;
                case 2:
                    arrayTasks[i] = new Test();
                    break;
            }
            // Заполнение номера задачи
            arrayTasks[i].numTask = i;
        }
    }

    // Метод для заполнения массива со студентами
    private static void fillArrayStudent(Student[] arrayStudents) {
        // Создание менторов для студентов
        Mentor mentorOne = new Mentor("Mentor 1", "Super", 30);
        Mentor mentorTwo = new Mentor("Mentor 2", "Super", 40);
        Mentor mentorThree = new Mentor("Mentor 3", "Super", 50);
        for (int i = 0; i < arrayStudents.length; i++) {
            switch (i % 3) {
                case 0:
                    arrayStudents[i] = new Student("Student " + i, "Bad", i + 10, mentorOne);
                    break;
                case 1:
                    arrayStudents[i] = new Student("Student " + i, "Good", i + 20, mentorTwo);
                    break;
                case 2:
                    arrayStudents[i] = new Student("Student " + i, "Pro", i + 30, mentorThree);
                    break;
            }
        }
    }
}
