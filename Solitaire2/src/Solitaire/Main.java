package Solitaire;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Plateau plateau = new Plateau();
       
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        String direction = new String();
        plateau.getVoirPlateau();
       
        System.out.println("Dans quelle colone votre bille se trouve?");              
            j = sc.nextInt();     
        j--;
        System.out.println("Dans quelle ligne votre bille se trouve?");    
            i = sc.nextInt();
        i--;
        sc.nextLine();
        System.out.println("Dans quelle direction (gauche,droite,haut,bas,triche)?");
                direction = sc.nextLine();
        Mouvement.deplacerBille(plateau, i, j, direction);
       

        while(Exception.rejouerOk(plateau))
        {
            rejouer(plateau);
        }
       
        System.out.println("Fin de la partie .");
        //sc.close();
    }
   
    public static void rejouer(Plateau plateau) {
        Scanner sc = new Scanner(System.in);
        String direction = new String();
        int i;
        int j;
        System.out.println("Dans quelle colone votre bille se trouve?");
        j = sc.nextInt();
        j--;
        System.out.println("Dans quelle ligne votre bille se trouve?");
        i = sc.nextInt();
        i--;
        sc.nextLine();
        System.out.println("Dans quelle direction (gauche,droite,haut,bas,triche)?");
                direction = sc.nextLine();
        Mouvement.deplacerBille(plateau, i, j, direction);
        //sc.close();
    }
   
   
}

