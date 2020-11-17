public interface Staff {
    // Метод - помощь студенту
    void helpStudent(Student student);

    // Дефолтный метод - дать доп. материалы
    default void giveAddMaterials() {
        System.out.println("https://habr.com/ru/post/125999/");
    }
}
