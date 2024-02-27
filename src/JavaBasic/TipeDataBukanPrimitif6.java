package JavaBasic;

public class TipeDataBukanPrimitif6 {
    public static void main(String[] args) {
        Integer iniInteger =  100;
        Long iniLong = 10000L;
        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniInteger2 = iniInt; // bisa secara otomatis
        System.out.println(iniInteger2);

        int age =  30;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue(); // ini mengguanakan method
        byte byteAge = ageObject.byteValue();

        System.out.println(shortAge);
        System.out.println(byteAge);

    }
}
