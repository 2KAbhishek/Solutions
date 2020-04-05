import java.util.EventListener;
import java.util.Random;

public class TestInstrument{
    public static void main(String[] args) {
        Instrument inst[] = new Instrument[10];
        Random rand = new Random();
        for (int i = 0; i < inst.length; i++){
            int randNum = rand.nextInt(3) + 1;
            switch (randNum){
                case 1:
                    inst[i] = new Piano();
                    break;
                case 2:
                    inst[i] = new Flute();
                    break;
                case 3:
                    inst[i] = new Guitar();
                    break;
            }
            inst[i].play();
            if (inst[i] instanceof Piano)
                System.out.println("> Instance of Piano");
            else if (inst[i] instanceof Flute)
                System.out.println("> Instance of Flute");
            else
                System.out.println("> Instance of Guitar");
        }
    }
}
