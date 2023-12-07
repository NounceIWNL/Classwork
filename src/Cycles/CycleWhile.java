package Cycles;

public class CycleWhile {
    public static void main(String[] args) {
//        alex говорит://Кузнечик прыгает на 1 см, затем на 2, на 3 и т.д.
//        Через сколько прыжков он взберется на травинку высотой 50 см?
        int height = 0;
        int hope = 1;
        for (int i=0; i<20; i++){
            height+=hope;
            hope++;
            if (height>50) height = 50;
            System.out.println(i+" "+height);
            if (height==50) {
                break;
            }
        }

        height = 0;
        hope = 1;
        int index = 1;

        while (height < 50) {
            height+= hope++;
            if (height > 50)
                height = 50;
            System.out.println(index++ + " " + height);

        }
    }

}
