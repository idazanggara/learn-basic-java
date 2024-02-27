package AplikasiTodolist;

public class AplikasiTodolist {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new  java.util.Scanner(System.in); // mengambil inputan user
    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
//        testRemoveTodoList();
//        testInput();
//        viewShowTodoList();
//        testViewShowTodoList();
//        testViewAddTodolist();
//        testViewRemoveTodoList();

        viewShowTodoList();
    }


    /**
     * Menampilkan todo list
     */
    //setiap buat bisnis logic seperti showTodoList diawah, jangan lupa buat testingnya
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            String todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }
    // testing dari showTodoList diatas
    public static void testShowTodoList(){
        model[0] = "Belajar java dasar";
        model[1] = "Studi kasusk java dasar : aplikasi todolist";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){
        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null){
                // model masih ada yg kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if(isFull) {
            var temp = model; // array tidak pass by reference
            model = new String[model.length * 2]; // kalau langsung di resize seperti ini data pasti akan ke reset, sebelum di reset, data lama kita tampung dulu diatas.

            // data model lama sudah di tampung di temp, model di ubah ukuran arraynya jadi hilang semua datanya. dan setelah itu data yg di temp kita kembalikan lagi ke model sesuai urutannya
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yg data arraynya NULL
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }
    public static void testAddTodoList(){
        for (int i = 1; i <= 25; i++) {
            addTodoList("Contoh Todo ke. "+ i);
        }
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodolist(Integer number){
        var numberIndex = number - 1;
        if ((number - 1) >= model.length){
            return false;
        } else if(model[number-1] == null){
            return false;
        } else {
            model[number-1] = null; // ini sudah ngehapus
            for (int i = (number - 1); i < model.length; i++) {
                if(i == (model.length - 1)){
                    model[i] = null; // karena kalau data terakhir, sebelumnya sudah pasti enggak ada datanya jadi null
                } else {
                    model[i] = model [i + 1]; // ngambil data yg indexnya setelahnya
                }
            }
            return true;
        }
    }
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        addTodoList("enam");

        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(7);
        System.out.println(result);

        result = removeTodolist(6);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi "+ name);

        var hobby = input("Hobby");
        System.out.println("Hi "+ hobby);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){
        while (true){
            showTodoList();

            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodoList();
            } else if (input.equals("2")){
                viewRemoveTodoList();
            } else if(input.equals("x")){
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }
    public static void testViewShowTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        addTodoList("enam");
        viewShowTodoList();

    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");
        if(todo.equals("x")){
            // batal
        } else {
            addTodoList(todo);
        }
    }
    public static void testViewAddTodolist(){
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("MENGHAPUS TODOLIST");
        var number = input("Nomor yg di hapus (x Jika Batal)");
        if(number.equals("x")){
            // batal
        } else {
            boolean success  = removeTodolist(Integer.valueOf(number));
            if(!success) {
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }
    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
