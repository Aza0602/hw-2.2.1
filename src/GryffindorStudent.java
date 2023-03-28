public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int courage) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public int ability() {
        return nobility + honor + courage;
    }

    @Override
    public String tribeName() {
        return "Гриффиндорец";
    }

    public void compareGryffindor(GryffindorStudent gryffindorStudent) {
        compare(gryffindorStudent);
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), nobility, honor, courage);
    }

}
