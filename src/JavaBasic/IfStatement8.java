package JavaBasic;

public class IfStatement8 {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen =  absen >= 75;

        var lulusAnd = lulusAbsen && lulusNilai;
        var lulusOr = lulusAbsen || lulusNilai;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }


        // Switch statment perbandingan sederhana hanya untuk sama dengan saja (==).

        var nilaiSwitch = "A" ;

        switch (nilaiSwitch) {
            case "A":
                System.out.println("Wow, Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // switch lamba semenja java 14
        switch (nilaiSwitch) {
            case "A" -> System.out.println("Wow, Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai Anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }

        //switch lamda tanpa yield
        String ucapan;
        switch (nilaiSwitch) {
            case "A" -> ucapan = "Wow, Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai Anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan);

        //switch lamda dengan yield
        String ucapanYield = switch (nilaiSwitch) {
            case "A" : yield  "Wow, Anda lulus dengan baik";
            case "B", "C" : yield  "Nilai Anda cukup baik";
            case "D" : yield  "Anda tidak lulus";
            default : yield  "Mungkin anda salah jurusan";
        };
        System.out.println(ucapanYield);

        // ternaryOp
        var nilaTer = 75;
        String ucapanTer;

        if(nilaTer >= 75 ) {
            ucapanTer = "Selamat Anda lulus";
        }else {
            ucapanTer = "Maaf Anda belum lulus";
        }
        System.out.println(ucapanTer);

        var newUcapanTer = nilaTer >= 75 ? "Selamat Anda lulus": "Maaf Anda belum lulus";
        System.out.println(newUcapanTer);


    }
}
