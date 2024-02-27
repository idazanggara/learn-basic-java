package JavaBasic;

public class Variable2 {
    public static void main(String[] args) {
        String name;
        name = "Idaz Anggara";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Budi Nugraha";
        name = "buda";
        System.out.println(name);

//        var name ;
//        name = "Idaz Anggara";
        var age1 = 30;
        var address1 = "Indonesia";

        System.out.println(age1);
        System.out.println(address1);

        // final sama dengan const

        final String theName =  "Anggara";
//        theName = "idaz";
        System.out.println(theName);
    }
}
