package id.pajerosportdakar.MatkulProgdas.tumpukan;

public class Main {  
    public static void main(String[] args) {  
        tumpukanGG a = new tumpukanGG();  

        // Menambahkan bilangan  
        a.push(4);  
        a.push(5);  
        a.push(7);  
        a.push(10);  
        a.push(2);  
        a.push(3);  

        // Mencetak tumpukan  
        a.cetakGanjil();  
        a.cetakGenap();  

        // Mengeluarkan bilangan  
        System.out.println("Pop Ganjil: " + a.popGanjil());  
        System.out.println("Pop Genap: " + a.popGenap());  

        // Cetak setelah pop  
        a.cetakGanjil();  
        a.cetakGenap();  
    }  
}