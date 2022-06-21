public class HufflepuffSt extends HogwartsSt{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffSt(String name, int magic, int transgession, int diligence, int loyalty, int honesty) {
        super(name, magic, transgession);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
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
    private int ability  (){
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuffStHogwartsSt(HufflepuffSt hufflepuffSt) {
        int ability1 = ability();
        int ability2 = hufflepuffSt.ability();
        if (ability1 > ability2) {
            System.out.printf("Сеудент Пуфендуй %s стедент Пуфендуй лучше  name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Сеудент Пуфендуй %s стедент Пуфендуй лучше  name %s (% d & % d)%n ",
                    HogwartsSt.getname,
                    getname,
                    ability2,
                    ability1);
        } else {
            System.out.printf("Сеудент Пуфендуй %s  точно такой же, как  Сеудент  Пуфендуй name %s (% d & % d)%n ",
                    getname,
                    HogwartsSt.getname,
                    ability1,
                    ability2);

        }

    }
    @Override
    public String toString() {
        return String.format("%s, трудолюбие: %d; верность: %d; честность: %d;",
                super.toString(),
                diligence,
                loyalty,
                honesty);
    }
}
