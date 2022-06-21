public class HogwartsSt {

    protected static Object getname;
    private String name;
    private int magic;
    private int transgession;

    public HogwartsSt(String name, int magic, int transgession) {
        this.name = name;
        this.magic = magic;
        this.transgession = transgession;
    }
    public HogwartsSt(String name, int magic, int transgession, int nextInt, int nextInt1, int nextInt2) {
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
    public int getTransgession() {
        return transgession;
    }
    public void setTransgession(int transgession) {
        this.transgession = transgession;
    }
    @Override
    public String toString() {
        return String.format("Сеудент Хогварца %s: сила магии - %d, сиа преврощения %d",
                name,
                magic,
                transgession);
    }
    private int abilityHogwartsSt(){

        return magic+ transgession;
    }
    public void compareHogwartsSt (HogwartsSt hogwartsSt){
        int ability1 = abilityHogwartsSt();
        int ability2 = hogwartsSt.abilityHogwartsSt();
        if (ability1 > ability2){
            System.out.printf("Сеудент Хогварца %s стедент Хогорца лучше  name %s (% d & % d)%n ",
                    name,
                    hogwartsSt.name,
                    ability1,
                    ability2);

        }else if (ability2 > ability1){
            System.out.printf("Сеудент Хогварца %s стедент Хогорца лучше  name %s (% d & % d)%n ",
                    hogwartsSt.name,
                    name,
                    ability2,
                    ability1);
        }else {
            System.out.printf("Сеудент Хогварца %s стедент Хогорца точно такой же, как  Сеуден   Хогварца name %s (% d & % d)%n ",
                    name,
                    hogwartsSt.name,
                    ability1,
                    ability2);

        }
    }



    public void print(){
        System.out.println(this);
    }
}
