public class KogtevranStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public KogtevranStudent(String name, int magic, int transgression, int smart, int wise, int witty, int creativity) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public int ability() {
        return smart + wise + witty + creativity;
    }

    @Override
    public String tribeName() {
        return "Когтевранец";
    }

    public void compareKogtevran(KogtevranStudent kogtevranStudent) {
        compare(kogtevranStudent);
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; остроумие: %d;  творчествo: %d",
                super.toString(),
                smart,
                wise,
                witty,
                creativity);
    }
}
