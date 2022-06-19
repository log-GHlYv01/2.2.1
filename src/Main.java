import java.util.Random;
public class Main {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Grif hary = generateGrif("Гарри Под");
        Grif hermiona = generateGrif("Гермиона ГР");
        Grif ron = generateGrif("Рон Уиз");
        SlytherineSt drako = generateSlytherineSt("Драко Мф");
        RevencLawSt paluna = generateRevencLawSt("Палуна ЛУ");
        //HufflepuffSt celeric =generateHufflepuffSt( "Седрик");

        hary.print();
        hermiona.print();
        ron.print();
        drako.print();
        paluna.print();
        //celeric.print();

    }

    private static Grif generateGrif(String name) {
        return new Grif(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherineSt generateSlytherineSt(String name) {
        return new SlytherineSt(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RevencLawSt generateRevencLawSt(String name) {
        return new RevencLawSt(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HogwartsSt generateHogwartsSt(String name) {
        return new HogwartsSt(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}