package JavaBasic;

public class ForLoop9 {
    public static void main(String[] args) {
//        for (;;){ // hati" jangan buat program yg infinit loop seperti ini, apalagi kalau nanti sudah bermaind engan array atau obejcr
//            System.out.println("Perulangan");
//        }

        var counter = 1;
        for (;counter <= 10;){
            System.out.println("Perulangan for loop "+counter);
            counter++;
        }
        System.out.println(counter);

        // init statement dan post statement

        for (var counter1 = 1; counter1 <= 10; counter1++){
            System.out.println("Perulangan for loop inc,dec "+counter1);

        }

        // While
        var counterLoop = 1;
        // counterLoop <= 10
        // while (counterLoop <= 10) {
        while (true) {
            if ( counterLoop % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan while " + counterLoop);
            counterLoop++;

            if(counterLoop > 5){
                break;
            }

        }

        // Do While
        var counterDo = 100;
        do {
            System.out.println("Perulangan do "+ counterDo);
            counterDo++;
        }while (counterDo <=10);


    }



}
