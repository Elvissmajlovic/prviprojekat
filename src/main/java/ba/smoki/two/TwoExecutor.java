package ba.smoki.two;

public class TwoExecutor {
    public static void main(String[] args){
        /*
        CIJELI BROJEVI
        */
        //promjenljive -128....0....127
        byte byteNumber = -128;
        //16 bit
        short maxShortnumber = 32767;
        short minShortNumber = -32768;
      //32 bit....DEFAUKT CIJELI BROJ TIP
       int number = 1000000000;
       // 64 bit
        long longnumber = 10000000000L;
        /**
         * DECIMALNI BROJEVI
         */
        //32 bit
        float floatNumber = 23.03F;
        //64 bit
        double doublenumber = 23.03;
        /**
         * CHARACTERS
         */
        char slovo = '!';
        System.out.println("provjera:" + slovo );
        slovo = 65;
        System.out.println("Provjera:" + slovo);
        slovo = 'A';
        int slovoNumber = slovo ;
        System.out.println("Broj:" + slovoNumber);
        /**
         * BOOLEAN
         */
        boolean condition =true;

    }
}
