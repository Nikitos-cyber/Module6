package OOPTask3;

public class Main {
    public static void main(String[] args) {
       Cat an = new Cat("Зефирка", 5,"Британская", 5.23);
        System.out.printf("Кличка: %s Возраст: %d Порода: %s Вес: %.1f", an.getName(),an.getAge(), an.getPedigree(), an.getWeight());
    }
}
