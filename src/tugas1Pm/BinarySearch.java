package tugas1Pm;

public class BinarySearch {
        static int binarySearch (int[]angka,int cari,int i, int j){
            int index = -1;
            while (i <= j){
                int mid = (i+j)/2;
                if (angka[mid] < cari){
                    i = mid + 1;
                }
                else if (angka[mid] > cari){
                    j = mid -1;
                }
                else if (angka [mid] == cari){
                    index = mid;
                    break;
                }
            }
            return index;
        }
        public static void main(String[] args){
            int[] angka = {1,2,3,4,5,6,7,8,9,10};
            int cari = 8; int i =0; int j = angka.length-1;
            int index = binarySearch(angka,cari,i,j);
            if (index == -1){
                System.out.print("Angka "+ cari + " tidak terdapat pada array");
            }
            else
                System.out.print("Angka " +cari+" terdapat pada array index ke - "+index);
        }
    }