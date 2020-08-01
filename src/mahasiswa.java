
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herda
 */
import java.util.Scanner;
public class mahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String nama, nim,ilustrasi,fak; 
        
        System.out.print("Ilustrasi : " );
        ilustrasi = input.nextLine();
        System.out.print("Nim : " );
        nim = input.nextLine();
        System.out.print("Nama : " );
        nama = input.nextLine();
        System.out.print("Fakultas : " );
        fak = input.nextLine();
        
   

        System.out.println("");
        
        
        System.out.println("+------------------------------------------+");
        System.out.println("|          Biodata Mahasiswa               |");
        System.out.println("+------------------------------------------+");
        System.out.println("ilustrasi: " + ilustrasi);
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Fakultas : " + fak);
       
        
    }
}
