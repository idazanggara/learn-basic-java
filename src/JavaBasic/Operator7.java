package JavaBasic;

public class Operator7 {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        // Augmented Assignment
        int c = 100;
        c = c + 10;
        System.out.println(c);

        c -= 20;
        System.out.println(c);

        // Unary Operator
        c++;
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);

        System.out.println(!true);

        // Operator Perbandingan
        int value1 = 100;
        int value2 = 100;

        System.out.println(value1 > value2);
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);
        System.out.println(true);

        // Operasi Boolean
        var absen = 70 ;
        var nilaiAkhir = 80;

        boolean lulusAbsen =  absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulusAnd = lulusAbsen && lulusNilai;
        var lulusOr = lulusAbsen || lulusNilai;

        System.out.println("LulusAnd " + lulusAnd);
        System.out.println("LulusOr " + lulusOr);

        // Expression
        int value;
        value = 10;

        // Statement (adalah kumpulan Expression)
        System.out.println(value = 100);

    }
}
