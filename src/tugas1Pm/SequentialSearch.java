package tugas1Pm;

public class SequentialSearch {
    public static void main(String[] args) {
        SequentialSearch Data = new SequentialSearch();
        Data.tampilkanAngka();
        Data.array(8);
    }
    int [] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public void tampilkanAngka() {
        for (int data : angka) {
            System.out.print(data + " ");
        }
        System.out.println( );
    }

    public void array(int data) {
        int index = 0;
        boolean ketemu = false;
        for(int i = index; i < angka.length; i++) {
            if(data == angka[i]) {
                ketemu = true;
                index = i;
            }
        }
        if(ketemu) {
            System.out.println("Angka " + data + " terdapat pada array index ke - " + index);
        }
        else {
            System.out.println("Angka " + data + " tidak terdapat pada array");
        }
    }
}
