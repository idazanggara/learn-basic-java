package JavaBasic;

public class KonversiNumber3 {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // byte = 127, jadi nanti berputar
        System.out.println(iniByte2);
    }
}

