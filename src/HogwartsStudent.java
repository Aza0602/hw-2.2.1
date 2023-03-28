public abstract class HogwartsStudent {

    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int baseAbility() {
        return magic + transgression;
    }
    public abstract int ability();


    public abstract String tribeName();

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = baseAbility();
        int ability2 = hogwartsStudent.baseAbility();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    getName(), hogwartsStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    hogwartsStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n",
                    hogwartsStudent.getName(), getName(), ability1, ability2);
        }
    }

    void compare(HogwartsStudent hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("%s %s лучше, чем %s %s: %d VS %d%n",
                    tribeName(), getName(), tribeName(), hogwartsStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("%s %s лучше, чем %s %s: %d VS %d%n",
                    tribeName(), hogwartsStudent.getName(), tribeName(), getName(), ability2, ability1);
        } else {
            System.out.printf("%s %s такой же, как студент %s: %d VS %d%n",
                    tribeName(), hogwartsStudent.getName(), tribeName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", name, magic, transgression);
    }

    public void print() {
        System.out.println(this);
    }

}
