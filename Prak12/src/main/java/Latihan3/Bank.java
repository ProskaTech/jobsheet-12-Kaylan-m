/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author ASUS
 */
public class Bank {
    float sukuBunga(){
        return 0;
    }
}

class BRI extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 5.5f;
    }
}
