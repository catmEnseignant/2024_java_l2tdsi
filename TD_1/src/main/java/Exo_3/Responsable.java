/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo_3;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

class Responsable extends Employe
{
    private ArrayList<Employe> subordonnes;

    public Responsable(String nom, String matricule, double indiceSalarial)
    {
        super(nom, matricule, indiceSalarial);
        subordonnes = new ArrayList<>();
    }

    public void ajouterSubordonne(Employe e)
    {
        subordonnes.add(e);
    }

    public void afficherSubordonnesDirects()
    {
        System.out.println("Subordonnés directs de " + super.nom + ":");
        for (Employe e : subordonnes)
        {
            e.afficher();
        }
    }

    public void afficherSubordonnesIndirects()
    {
        System.out.println("Subordonnés directs ou indirects de " + super.nom + ":");
        for (Employe e : subordonnes)
        {
            e.afficher();
            if (e instanceof Responsable) {
                ((Responsable) e).afficherSubordonnesIndirects();
            }
        }
    }
}

