public class Grif extends HogwartsSt {
    private int nobility;
    private int honor;
    private int bravery;

    public Grif(String name, int magic, int transgession, int nobility, int honor, int bravery) {
        super(name, magic, transgession);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    public int ability() {
        return nobility + honor + bravery;
    }

    public void compareGrifHogwartsSt(Grif grif) {
        int ability1 = ability();
        int ability2 = grif.ability();
        if (ability1 > ability2) {
            System.out.printf("Сеудент Гриф %s стедент Гриф лучше  name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Сеудент Гриф %s стедент Гриф лучше  name %s (% d & % d)%n ",
                    HogwartsSt.getname,
                    getname,
                    ability2,
                    ability1);
        } else {
            System.out.printf("Сеудент Гриф %s  точно такой же, как  Сеудент   Гриф name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        }

    }

    @Override
    public String toString() {
        return String.format("%s, благородство: %d; честь: %d; храборость: %d;",
                super.toString(),
                nobility,
                honor,
                bravery);
    }
}
