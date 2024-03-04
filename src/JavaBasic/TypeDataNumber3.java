package JavaBasic;

public class TypeDataNumber3 {
    public static void main(String[] args) {
        byte iniByte =  100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L; // atau bisa tambahkan L di belakang untuk meberitahukan ini long

        float iniFloat = 10.12F; // bisa F besar atau f kecil
        double iniDouble = 12.2424;

        int decimalInt = 25;
        int hecInt = 0xA132B; // 0x-baru angka hexadecimal
        int binInt = 0b01010101; // 0b-angka binary

        // sejah java versi 8
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        String output = "iniByte: " + iniByte + ", iniShort: " + iniShort + ", iniInt: " + iniInt +
                ", iniLong: " + iniLong + ", iniLong2: " + iniLong2 + ", iniFloat: " + iniFloat +
                ", iniDouble: " + iniDouble;

        System.out.printf("iniByte: %d, iniShort: %d, iniInt: %d, iniLong: %d, iniLong2: %d, iniFloat: %f, iniDouble: %f%n",
                iniByte, iniShort, iniInt, iniLong, iniLong2, iniFloat, iniDouble);

        System.out.println(output);

        // Conversi/Casting type data number
        // Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        //  secara otomatis tapi ikut aturan diatas, dari kiri ini otomatis bisa di conversi ke paling kanan, karena ukurannya masih ke handle di sebelah kanan
        // Narrowing Casting (Manual) : double -> float -> long -> int -> char ->  short -> byte
        // ini harus secara manual

        int smallNumber = 10;
        double bigNumber = smallNumber; // Implicit Casting: int ke double
        System.out.println(bigNumber); // Output: 10.0

        double bigNumber1 = 10.5;
        int smallNumber1 = (int) bigNumber1; // Explicit Casting: double ke int
        System.out.println(smallNumber1); // Output: 10






    }
}
