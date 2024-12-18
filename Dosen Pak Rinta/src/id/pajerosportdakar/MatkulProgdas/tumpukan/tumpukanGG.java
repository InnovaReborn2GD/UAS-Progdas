package id.pajerosportdakar.MatkulProgdas.tumpukan;

public class tumpukanGG {  
    protected node headGanjil;  
    protected node headGenap;  

    public tumpukanGG() {  
        headGanjil = null;  
        headGenap = null;  
    }  

    // Metode untuk memasukkan angka  
    public void push(int angka) {  
        node newNode = new node(angka, null);  
        if (angka % 2 == 0) { // Bilangan genap  
            newNode.ptr = headGenap;  
            headGenap = newNode;  
        } else { // Bilangan ganjil  
            newNode.ptr = headGanjil;  
            headGanjil = newNode;  
        }  
    }  

    // Metode untuk mengeluarkan bilangan ganjil  
    public Integer popGanjil() {  
        if (headGanjil == null) {  
            return null; // Tidak ada bilangan ganjil  
        }  
        Integer dataGanjil = headGanjil.dataNode;  
        headGanjil = headGanjil.ptr; // Menghapus node dari tumpukan ganjil  
        return dataGanjil;  
    }  

    // Metode untuk mengeluarkan bilangan genap  
    public Integer popGenap() {  
        if (headGenap == null) {  
            return null; // Tidak ada bilangan genap  
        }  
        Integer dataGenap = headGenap.dataNode;  
        headGenap = headGenap.ptr; // Menghapus node dari tumpukan genap  
        return dataGenap;  
    }  

    // Metode untuk mencetak bilangan ganjil  
    public void cetakGanjil() {  
        node current = headGanjil;  
        System.out.print("Bilangan Ganjil: ");  
        while (current != null) {  
            System.out.print(current.dataNode + " ");  
            current = current.ptr;  
        }  
        System.out.println();  
    }  

    // Metode untuk mencetak bilangan genap  
    public void cetakGenap() {  
        node current = headGenap;  
        System.out.print("Bilangan Genap: ");  
        while (current != null) {  
            System.out.print(current.dataNode + " ");  
            current = current.ptr;  
        }  
        System.out.println();  
    }  
}