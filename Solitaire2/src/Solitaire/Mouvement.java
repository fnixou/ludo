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
	            System.out.println("D�placement impossible.");
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
	            System.out.println("D�placement impossible.");
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
	            System.out.println("D�placement impossible.");       
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
	            System.out.println("D�placement impossible.");
	            plateau.getVoirPlateau();
	        }
	        }
	        /*else if(direction.equals("triche"))
	        {
	        	if(plateau.echiquier[i][j] == "O")
	        		plateau.setTriche(i, j);
	        	else {
	        		System.out.println("Vous n'arrivez meme pas � tricher...");
		            plateau.getVoirPlateau();
	        	}
	        }*/
	        else
	        {
	            System.out.println("Le destination s�lectionn�e n'existe pas.");
	            plateau.getVoirPlateau();
	        }
	        }
	        else
	        {
	            System.out.println("Vous pouvez s�lectionnez uniquement une bille (O).");
	        }
	    }
	}
