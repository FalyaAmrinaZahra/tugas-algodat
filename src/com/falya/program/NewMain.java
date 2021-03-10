/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.falya.program;

/**
 *
 * @author falya amrina zahra
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String [][] kamar ={
    {"1", "2", "3", "4", "x"},
    {"1", "2", "3", "4", "5"},
    {"1", "2", "3", "4", "5"},
    {"1", "2", "3", "x", "5"},// TODO code application logic here
    };
int kamarkosong = 0;
for ( int i = 0; i < kamar.length; i++){
for (int j = 0; j < kamar [i].length; j++){
if ("x".equals(kamar[i][j])){
System.out.println (" Tamu berada di lantai " + (i+1) + "Kamar" + (j+1));
}else{
kamarkosong += 1;
}
}
System.out.println("");}
System.out.println("Kamar yang tersedia ada"+ kamarkosong);
}
}  

