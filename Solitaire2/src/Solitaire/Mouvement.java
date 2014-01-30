package Solitaire;

public class Mouvement {
		   
	    public static void deplacerBille(Plateau plateau,int i,int j,String direction)
	    {
	       
	        if(plateau.echiquier[i][j]/*getValeurIJ(i, j)*/ == "O")
	        {
	        if(direction.equals("droite"))
	        {
	        if((plateau.echiquier[i][j+1]/*getValeurIJ(i, j+1)*/ == "O") && (plateau.echiquier[i][j+2]/*getValeurIJ(i, j+2)*/ == "X") && (j+2 < 9)) // Mouvement vers la droite
	        {
	            plateau.setDroite(i,j);
	        }
	        else {
	            System.out.println("Déplacement impossible.");
	            plateau.getVoirPlateau();
	        }
	        }
	        else if(direction.equals("gauche"))
	        {
	        if((plateau.echiquier[i][j-1]/*getValeurIJ(i, j-1)*/ == "O") && (plateau.echiquier[i][j-2]/*getValeurIJ(i,j-2)*/ == "X") && (j-2 >= 0))// Mouvement vers la gauche
	        {
	            plateau.setGauche(i,j);
	        }
	        else {
	            System.out.println("Déplacement impossible.");
	            plateau.getVoirPlateau();
	        }
	        }
	        else if(direction.equals("bas"))
	        {
	        if((plateau.echiquier[i+1][j]/*getValeurIJ(i+1, j)*/ == "O") && (plateau.echiquier[i+2][j]/*getValeurIJ(i+2,j)*/ == "X") && (j+2 < 9))// Mouvement vers le bas
	        {
	            plateau.setBas(i,j);
	        }
	        else {
	            System.out.println("Déplacement impossible.");       
	            plateau.getVoirPlateau();
	        }
	        }
	        else if(direction.equals("haut"))
	        {
	        if((plateau.echiquier[i-1][j]/*getValeurIJ(i-1, j)*/ == "O") && (plateau.echiquier[i-2][j]/*getValeurIJ(i-2,j)*/ == "X") && (j-2 >= 0))// Mouvement vers le haut
	        {
	            plateau.setHaut(i,j);
	        }
	        else {
	            System.out.println("Déplacement impossible.");
	            plateau.getVoirPlateau();
	        }
	        }
	        /*else if(direction.equals("triche"))
	        {
	        	if(plateau.echiquier[i][j] == "O")
	        		plateau.setTriche(i, j);
	        	else {
	        		System.out.println("Vous n'arrivez meme pas à tricher...");
		            plateau.getVoirPlateau();
	        	}
	        }*/
	        else
	        {
	            System.out.println("Le destination sélectionnée n'existe pas.");
	            plateau.getVoirPlateau();
	        }
	        }
	        else
	        {
	            System.out.println("Vous pouvez sélectionnez uniquement une bille (O).");
	        }
	    }
	}
