/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hitung;

import java.util.Scanner;

/**
 *
 * @author meyda
 */
public class cottagehotel {

    public static void main(String[] args) {
        int harga = 0;
        
        int orang;
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan kamar yang kamu mau : ");
        String kamar = input.nextLine();
        System.out.println("Inputkan hari yang anda pilih :");
        String hari = input.nextLine();
        System.out.println("Inputkan jumlah orang yang datang:");
        orang = input.nextInt();

        if (kamar.equals("duku")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 915000  ;
            } else if (hari.equals("Weekend")) {
                harga = 1025000;
            } 
            else 
                harga = 0;
            }
        
        if (kamar.equals("jeruk")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 915000 ;
                } else if (hari.equals("Weekend")) {
                    harga = 1025000 ;
                }
                
                else 
                    harga = 0;
                   
                }
            }
        }
        if (kamar.equals("alpukat")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 575000 ;
                }else if (hari.equals("Weekend")) {
                    harga = 695000 ;
                } 
                else 
                    harga =0;
                   
                
            }
        }
        if (kamar.equals("jambu air")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 575000;
                } else if (hari.equals("Weekend")) {
                    harga = 695000 ;
                }
                else {
                    harga = 0;
                   
                }
            }
        }
        if (kamar.equals("durian")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 595000 ;
                }else  if (hari.equals( "Weekend")) {
                    harga = 715000;
                }
                else {
                    harga = 0;
                   
                }
            }
        }
        if (kamar.equals("melon")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 595000 ;
                } else if (hari.equals("Weekend")) {
                    harga = 595000 ;
                } else {
                    harga = 0;
                  
                }
            }
        }
        if (kamar.equals("belimbing")) {
             {
                if (hari.equals( "Weekday")) {
                    harga = 495000 ;
                } else if (hari.equals("Weekend")) {
                    harga = 575000 ;
                }else  {
                    harga = 0;
                   
                }
            }
        }
        if (kamar.equals("mangga")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 495000 ;
                } else if (hari.equals("Weekend")) {
                    harga = 575000;
                } 
                else {
                    harga = 0;
                    
                }
            }
        }
        if (kamar.equals("kedondong")) {
             {
                if (hari.equals("Weekday")) {
                    harga = 495000;
                } else if (hari.equals("Weekend")) {
                    harga = 575000;
                }
                else {
                    harga = 0;
                    
                }
            }
        }
        if (kamar.equals("barrack")) {
            {
                if (hari.equals("Weekday")) {
                    harga = 25000* orang;
                } else if (hari.equals("Weekend")) {
                    harga = 25000 * orang;
                }
                else   {
                    harga = 0;
                   
                }
            }
        }

        System.out.println(" Harga kamar " + kamar + " dengan banyak " + orang + " orang disaat " + hari + " = " + harga); 


    }
    }

