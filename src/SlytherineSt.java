public class SlytherineSt extends HogwartsSt{
    private int cunning;
    private int determinatsion;
    private int amdition;
    private int ingetuity;
    private int thirstForPower;

    public SlytherineSt(String name, int magic, int transgession, int cunning, int determinatsion, int amdition) {
        super(name, magic, transgession);
        this.cunning = cunning;
        this.determinatsion = determinatsion;
        this.amdition = amdition;
        this.ingetuity = ingetuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDeterminatsion() {
        return determinatsion;
    }

    public void setDeterminatsion(int determinatsion) {
        this.determinatsion = determinatsion;
    }

    public int getAmdition() {
        return amdition;
    }

    public void setAmdition(int amdition) {
        this.amdition = amdition;
    }

    public int getIngetuity() {
        return ingetuity;
    }

    public void setIngetuity(int ingetuity) {
        this.ingetuity = ingetuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    private int ability  (){
        return cunning + determinatsion + amdition + ingetuity + thirstForPower;
    }

    public void compareSlytherineStHogwartsSt(SlytherineSt slytherineSt) {
        int ability1 = ability();
        int ability2 = slytherineSt.ability();
        if (ability1 > ability2) {
            System.out.printf("Сеудент Слизарен %s стедент Слизарен лучше  name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Сеудент Слизарен %s стедент Слизарен лучше  name %s (% d & % d)%n ",
                    HogwartsSt.getname,
                    getname,
                    ability2,
                    ability1);
        } else {
            System.out.printf("Сеудент Слизарен %s точно такой же, как  Сеудент  Слизарен name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        }

    }
    @Override
    public String toString() {
        return String.format("%s, хитрость: %d; решительность: %d; амбициознасть: %d; находчивость: %d, жажда влсти: %d",
                super.toString(),
                cunning,
                determinatsion,
                amdition,
                ingetuity,
                thirstForPower);
    }
}
