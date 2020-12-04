/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRARY;

/**
 *
 * @author tomy
 */
public class Algoritma {
    // Algoritma
        
        // Buat Sebuah array of object allBooks, yang berisi kumpulan buku dan yang bersifat global sehingga bisa diakses dimana saja
        // Buat sebuah variable isUsed dengan tipe data boolean untuk menyimpan apakah pengguna akan keluar dari program atau tidak
    
        // Lakukan pengkondisian, selagi variable isUsed = true, maka selalu jalankan kode dibawah
        // Munculkan Tulisan
        // Pilihan Sebagai Berikut
        // 1. Masukan Data Buku
        // 2. Hapus Data Buku
        // 3. Lihat Data Buku
        // 4. Keluar
        
        // Munculkan Tulisan Masukan Pilihan dan tangkap ke variable selection
        // Lakukan pengkondisian 
            // Jika variable selection == 1
                // Jalankan Funsi Insert Data dan masukan ke dalam variable array global allBooks,
            // Jika variable selection == 2
                // Jalankan Fungsi Delete Data dan hapus array allBooks sesuai nilai yang dikembalikan
            // Jika variable selection == 3
                // Jalankan Fungsi Show Data dan berikan argumen variable allBooks
            // Jika variable selection == 4
                // Jalankan Fungsi Exit Program, dan tanyakan kembali
                // Jika exit program = true, maka ubah variable global isUsed ke false 
                

        // Fungsi Insert Data
            // Tanyakan jumlah data yang akan di input dan masukan ke dalam variable amountOfData
            // Buat sebuah array [] untuk menyimpan semua buku yang akan di inputkan (books)
            // Jalankan perulangan sesuai jumlah variable amountData
            // Buat sebuah array asosiatif yang nantinya akan menyimpan data perbuku (book)
            // Tanyakan dan tangkap kode buku, ke dalam variable book dengan key bookCode
            // Tanyakan dan tangkap judul buku, ke dalam variable book dengan key bookTitle
            // Tanyakan dan tangkap stok buku, ke dalam variable book dengan key numberOfBooks
            // Sehingga nanti akan menghasilan array assosiatif book seperti berikut
            // ex: book [
            //        'bookCode'      => 00123,      
            //        'bookTitle'     => 'Gerhana', 
            //        'numberOfBooks' => 15
            //      ];
            // Setelah itu masukan variable book ke dalam variable books
            // Lakukan perulangan tadi sampai sama dengan jumlah variable amountData 
            // Setelah perulangan tadi diharapkan variable books akan seperti berikut
            // books = [book, book, book,... ]
            // Lalu kembalikan nilai (return) variable books 
            
            
        // Fungsi Delete Data
            // Tanyakan data ke berapa yang akan dihapus dan tangkap ke dalam variable deletedNumber
            // Lalu kembalikan nilai (return) variable deletedNumber
            
        // Fungsi Show Data
            // Tangkap argumen ke dalam parameter books
            // Jalankan perulangan sesuai jumlah books
            // lalu tampilkan sesuai masing masing key

        // Fungsi Exit Program
            // Tangkap dan tanyakan apakah ingin keluar, ke dalam variable is Exit
            // Lakukan pengkondisian dan kembalikan nilai (return) variable isExit
}

