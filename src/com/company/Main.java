package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Nombre nombre1 = new Nombre(23);
        Nombre nombre2 = new Nombre(10);
        System.out.println("Choisissez l'operateur: +,-,/,*"); // dialog avec utilisateur

        Scanner sc = new Scanner(System.in); // je declare mon scanner
        String operateur = sc.nextLine(); //lecture clavier utilisateur



        System.out.println("Choisissez l'operand 1:"); // dialog avec utilisateur
        nombre1.setValeur(sc.nextInt()); // la valeur entré est stocké dans "nombre1"

        System.out.println("Choisissez l'operand 2: ");// dialog avec utilisateur
        nombre2.setValeur(sc.nextInt());// la valeur entré est stocké dans "nombre2"
        int resultat = 0;// je crée une variable resultat qui est égale à 0 par defaut

        if (operateur.equals("+")){//je crée une fonction pour choisir quelle operateur appliquer. Je compare operateur entré par l'utilisateur avec un opérateur existant (+)
            resultat = nombre1.additionner(nombre2); // si c'est égale, il fait l'addition, sinon passe à la suite
        }
        if(operateur.equals("/")){//il compare avec "/"
            resultat = nombre1.diviser(nombre2); // je fait le calcule
            if (nombre1.isErreur()==true){ //en cas d'erreur, mon bouléan passe a "vrais"
                System.out.println("Division par 0 impossible!!!");// j'affiche le message d'erreur
            }

        }
        if (operateur.equals("-")){ //il compare avec "-"
            resultat = nombre1.soustraire(nombre2);// je fait le calcule
        }
        if (operateur.equals("*")){//il compare avec "*"
            resultat = nombre1.multiplier(nombre2);// je fait le calcule
        }



        System.out.println("Resultat egale "+resultat);// affichage de resultat




    }
}
