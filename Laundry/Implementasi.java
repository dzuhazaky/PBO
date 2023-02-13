package Laundry;
import java.util.*;;
public class Implementasi {
    public static void main(String[] args) {
        int input, inp;
        Scanner in = new Scanner(System.in);

        Laundry l = new Laundry();
        Kasir k = new Kasir("Tono", 'L');
        Customer c = new Customer();

        System.out.print("Masukkan Saldo anda: ");
        c.setSaldo(in.nextInt());
        System.out.print("Masukkan Alamat anda: ");
        c.setAlamat(in.next());
        System.out.print("Masukkan Jenis Kelamin anda: ");
        c.setJk(in.next().charAt(0));
        System.out.print("Masukkan Nama anda: ");
        c.setNamaCustomer(in.next());

        System.out.print("-\tTerima Kasih sudah Mengisi!\t-");

        switch(c.getJk()){

            case 'l':
            case 'L':
                System.out.print("\nJENIS\tHARGA Per Kg\n1. Celana\t10.000\n2. Baju\t\t8.000\n>:");
                input = in.nextInt();
                System.out.println("Total Kilo:");
                inp = in.nextInt();
                if(input==1){
                    int total = l.totalLaundry(10000, inp);
                    System.out.println("Total: "+total);
                } else if (input==2){
                    int total = l.totalLaundry(8000, inp);
                    System.out.print("Total: "+total);
                }else {
                    System.out.println("Jenis Kelamin Tidak ditemukan");
                }
                break;
                
            case 'W':
            case 'w':
                System.out.print("\nJENIS\tHARGA Per Kg\nRok\t10.000\nBaju\t8.000\n>:");
                input = in.nextInt();
                System.out.print("Total kilo:");
                inp = in.nextInt();
                if(input==1){
                    int total = l.totalLaundry(10000, inp);
                    System.out.println("Total: "+total);
                } else if (input==2){
                    int total = l.totalLaundry(8000, inp);
                    System.out.print("Total: "+total);
                }break;
            default: 
                System.out.println("Jenis kelamin tidak ditemukan");
            
        }
    }
}
