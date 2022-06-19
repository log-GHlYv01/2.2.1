public class RevencLawSt extends HogwartsSt{
    private int clewrness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RevencLawSt(String name, int magic, int transgession, int clewrness, int wisdom, int wit) {
        super(name, magic, transgession);
        this.clewrness = clewrness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getClewrness() {
        return clewrness;
    }

    public void setClewrness(int clewrness) {
        this.clewrness = clewrness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int ability  (){
        return clewrness + wisdom + wit + creativity;
    }

    public void compareRevencLawStHogwartsSt(RevencLawSt revencLawSt) {
        int ability1 = ability();
        int ability2 = RevencLawSt.ability();
        if (ability1 > ability2) {
            System.out.printf("Сеудент Когтеврана %s стедент Когтеврана лучше  name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Сеудент Когтеврана %s стедент Когтеврана лучше  name %s (% d & % d)%n ",
                    HogwartsSt.getname,
                    getname,
                    ability2,
                    ability1);
        } else {
            System.out.printf("Сеудент Когтеврана %s  точно такой же, как  Сеудент  Когтеврана name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        }

    }
    @Override
    public String toString() {
        return String.format("%s, ум: %d; мудрость: %d; сообразительность: %d;творчество: %d",
                super.toString(),
                clewrness,
                wisdom,
                wit,
                creativity);
    }
}
