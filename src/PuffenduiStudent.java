public class PuffenduiStudent extends HogwartsStudent {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public PuffenduiStudent(String name, int magic, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public int ability() {
        return hardWork + loyalty + honesty;
    }

    @Override
    public String tribeName() {
        return "Пуффендуец";
    }

    public void comparePuffendui(PuffenduiStudent puffenduiStudent) {
        compare(puffenduiStudent);
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; , верность: %d; честность: %d", super.toString(), hardWork, loyalty, honesty);
    }
}
