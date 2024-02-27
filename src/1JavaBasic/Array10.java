package JavaBasic;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[6];
        arrayString[0] = "idaz";
        arrayString[2] = "anggara";
        arrayString[4] = "kurniawan";

        System.out.println(arrayString); // kalau di print hash
        System.out.println(arrayString[0]);
        System.out.println(arrayString.length);
        System.out.println(Arrays.toString(arrayString));

        int[] arrayInt = new int[6];
        arrayInt[0] = 1;
        arrayInt[3] = 2;
        arrayInt[5] = 4;

        System.out.println(Arrays.toString(arrayInt));

        int[] newArrIntInt = new int[]{1,4,5};

        System.out.println(Arrays.toString(newArrIntInt));

        int[] newArrInt = {1,2,4};

        System.out.println(Arrays.toString(newArrInt));

        String[][] members = {
                {"Idaz", "Anggara"},
                {"Kurniawan", "Adi"},
                {"Joko"}
        };

        System.out.println(Arrays.toString(members));

        for (var i = 0; i < members.length; i++) {
            System.out.println(Arrays.toString(members[i]));
        }

        System.out.println("FOR EACH");
        for (var member: members) { // String member
            System.out.println(Arrays.toString(member));
        }

    }
}
