public class Student extends Person {
    private int cntCompletedTask; // Кол-во решенных задач
    private boolean completedTaskAll; // Флаг того, что студент решил все задания
    private Mentor mentor; // Ментор
    private static int cntCompletedTaskStudent = 0; // Кол-во решенных задач всеми студентами

    // Консруктор класса Student
    public Student(String name, String surname, int age, Mentor mentor) {
        super(name, surname, age);
        this.cntCompletedTask = 0;
        this.completedTaskAll = false;
        this.mentor = mentor;
    }

    public int getCntCompletedTask() {
        return cntCompletedTask;
    }

    public void setCntCompletedTask(int cntCompletedTask) {
        this.cntCompletedTask = cntCompletedTask;
    }

    public boolean isCompletedTaskAll() {
        return completedTaskAll;
    }

    public static int getCntCompletedTaskStudent() {
        return cntCompletedTaskStudent;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    // Метод - решить задачи
    public void solveTasks(int cntTask, Task[] arrTask) {
        int end = Math.min(this.cntCompletedTask + cntTask, arrTask.length);
        // Выолняем заявленное кол-во задач
        for (int i = this.cntCompletedTask; i < end; i++) {
            this.solveOneTask(arrTask[i]);
        }
        // Проверяем, весь ли набор задач выполнил студент
        if (this.cntCompletedTask == arrTask.length) {
            System.out.println("Поздравляем, " + this.getName() + "! Все задачи выполнены!");
            this.completedTaskAll = true;
        } else {
            System.out.println(this.name + ", продолжайте в том же духе!");
        }
    }

    // Метод - решить задачу
    private void solveOneTask(Task task) {
        // Проверка на то, что задание проверяется автоматически на основе наличия интерфейса у объекта task
        if (task instanceof AutoChecked) {
            System.out.println("Задача №" + task.numTask + " \"" + task.textTask + "\" - выполнена!");
        } else {
            // Отправляем задание ментору до тех пор, пока он её не зачтёт
            boolean result;
            do {
                result = this.mentor.checkCode(task);
            } while (!result);
        }
        // Увеличиваем число решенных задач студентом
        this.cntCompletedTask++;
        cntCompletedTaskStudent++;
    }
}