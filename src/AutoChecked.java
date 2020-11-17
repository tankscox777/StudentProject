public interface AutoChecked {

    // Дефолтный метод - выполнить задание
    default void performTask() {
        System.out.println("Задание выполнено!");
    }
}
