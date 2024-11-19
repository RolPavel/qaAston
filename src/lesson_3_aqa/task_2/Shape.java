package lesson_3_aqa.task_2;

interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();
    void setFillColor(String color);
    void setBorderColor(String color);

    // Метод по умолчанию для вывода информации о фигуре
    default void displayInfo() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("--------------------");
    }
}
