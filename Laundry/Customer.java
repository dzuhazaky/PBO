package Laundry;

public class Customer {
    private String nama;
    private String alamat; 
    private char jk;
    private int saldo;

    public void setNamaCustomer(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setJk(char jk){
        this.jk=jk;
    }
    public char getJk(){
        return jk;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    public int getSaldo(){
        return saldo;
    }
}

