import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        GryffindorStudent harry = generateGriffindorStudent("Гарри Поттер");
        GryffindorStudent hermiona = generateGriffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGriffindorStudent("Рон Уизли");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grehem = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregori = generateSlytherinStudent("Грегори Гойл");
        PuffenduiStudent zahariya = generatePuffenduiStudent("Захария Смит");
        PuffenduiStudent sedric = generatePuffenduiStudent("Седрик Диггори");
        PuffenduiStudent justin = generatePuffenduiStudent("Джастин Финч-Флетчли");
        KogtevranStudent chzhou = generateKogtevranStudent("Чжоу Чанг");
        KogtevranStudent padma = generateKogtevranStudent("Падма Патил");
        KogtevranStudent marcus = generateKogtevranStudent("Маркус Белби");

        harry.print();
        ron.print();
        zahariya.print();
        marcus.print();
        hermiona.print();

        harry.compareHogwarts(draco);
        harry.compareHogwarts(ron);
        harry.compareGryffindor(hermiona);
    }

    private static GryffindorStudent generateGriffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static KogtevranStudent generateKogtevranStudent(String name) {
        return new KogtevranStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static PuffenduiStudent generatePuffenduiStudent(String name) {
        return new PuffenduiStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}