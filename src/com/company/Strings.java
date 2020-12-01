package com.company;

public class Strings {

    public static int[] exercici1(String paraula) {
        int [] vocals = {0,0,0,0,0};

        for (int i=0;i<paraula.length();i++) {

            if (paraula.charAt(i) == 'a') {
                vocals[0]++;
            }
            if (paraula.charAt(i) == 'e') {
                vocals[1]++;
            }
            if (paraula.charAt(i) == 'i') {
                vocals[2]++;

            }
            if (paraula.charAt(i) == 'o') {
                vocals[3]++;
            }
            if (paraula.charAt(i) == 'u') {
                vocals[4]++;
            }
        }
        return vocals;
    }

    public static void exercici2 (String vocals){

        int ini = 0;
        int fin = vocals.length()-1;

        boolean bError = false;
        while ((ini<fin)&&(!bError)){

            if (vocals.charAt(ini)==vocals.charAt(fin)){
                ini++;
                fin--;

            } else{
                bError = true;
            }
            if (!bError) {
                System.out.println(vocals + "Si lo es");
            }
            else{
                    System.out.println(vocals+ "no lo es");}



    }



    }






    }








