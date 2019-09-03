package com.company;

public class Nombre {

    //propriété

    private boolean Erreur = false; // je crée un bouléan qui est "faux" par defaut, pour la methode de la division
    private int valeur; // je crée ma valeur

    //Constructeurs

    public Nombre(){

    }

    public Nombre(int valeur){

        this.valeur = valeur;// lecture clavier operand 1
    }

    //getter setters

    public boolean isErreur() { // bouléan pour le cas d'erreurs
        return Erreur;
    }

    public void setErreur(boolean erreur) {
        Erreur = erreur;
    }


    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    //methodes

    public int multiplier(Nombre nbr2){ // La methode pour multiplier
        int resultat = this.valeur * nbr2.valeur; //qu-est-que je multiplie?
        return resultat; // retourner le resultat
    }
    public int additionner(Nombre nbr2) { // la methode pour additionner
        int resultat = this.valeur + nbr2.valeur; //qu-est-que j'additionne?
        return resultat; // retourner le resultat
    }
    public int soustraire(Nombre nbr2) { // la methode pour soustraire
        int resultat = this.valeur - nbr2.valeur; // qu-est-que je soustrait?
        return resultat; // retourner le resultat
    }
    public int diviser(Nombre nbr2) { // la methode pour diviser
       int resultat=0; // je declare la variable "resultat" qui est égale à 0
        try{ // je crée un try cach
        resultat = this.valeur / nbr2.valeur;// qu-est-que je divise?
        return resultat;} // retourner le resultat
        catch (ArithmeticException e){// si j'ai un "cach"
            Erreur =  true; // le bouléan passe à "vrai"
            return resultat; // retourner le resultat
        }
    }

}
