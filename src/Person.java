abstract class Person {
    protected String name; // Имя
    protected String surname; // Фамилия
    protected int age; // Возраст

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    abstract String getName();

    abstract void setName(String name);

    abstract String getSurname();

    abstract void setSurname(String surname);

    abstract int getAge();

    abstract void setAge(int age);

    abstract public String toString();
}
