def hitung_ganjil(angka_list):  
    jumlah_ganjil = 0  
    total_ganjil = 0  
    
    for angka in angka_list:  
        if angka % 2 == 0:  # Cek jika angka genap  
            continue  
        jumlah_ganjil += angka  
        total_ganjil += 1  
    
    # Cek jika tidak ada bilangan ganjil  
    if total_ganjil == 0:  
        return "Tidak ada bilangan ganjil", None  
    
    rata_rata = jumlah_ganjil / total_ganjil  
    return jumlah_ganjil, rata_rata  

angka_list = [2, 4, 6, 10, 16, 20, 22, 30]  
jumlah, rata_rata = hitung_ganjil(angka_list)  

if jumlah == "Tidak ada bilangan ganjil":  
    print(jumlah)  # Menampilkan pesan jika tidak ada bilangan ganjil  
else:  
    print("Jumlah angka ganjil:", jumlah)  
    print("Rata-rata angka ganjil:", rata_rata)