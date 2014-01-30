package Solitaire;

public class Exception {

	    public static boolean rejouerOk(Plateau plateau)
	    {
	        int taille = plateau.echiquier.length;
	        int nombreDeO = 0;
	        for(int i = 0; i < taille; i++)
	        {
	            for(int j = 0; j < taille; j++)
	            {
	                if((plateau.echiquier[i][j] ) == "O")
	                {
	                     nombreDeO++;
	                    if(possibilit�(plateau,i,j,taille))
	                    {
	                        return true;
	                    }
	                }
	            }
	        }
	        if(nombreDeO == 1)
	        {
	        System.out.println("F�licitation vous avez gagn� !!!!");
	        return false;   
	        }
	        else
	        {
	            System.out.println("Il n'y a plus de possibilit�s de jeu. Vous avez perdu.");
	            return false;
	        }
	       
	    }
	   
	    public static boolean possibilit�(Plateau plateau,int i,int j,int taille)
	    {
	       
	        if(j+2 <= taille)
	        {
	        	
	        if((plateau.echiquier[i][j+1] == "O") && (plateau.echiquier[i][j+2]/*getValeurIJ(i, j+2)*/ == "X") && (j+2 < taille)) //test mouvement droite
	        {
	            return true;
	        }
	        }
	       
	       
	        if(j-2 >= 0)
	        {
	        if((plateau.echiquier[i][j-1]/*getValeurIJ(i, j-1)*/ == "O") && (plateau.echiquier[i][j-2]/*getValeurIJ(i,j-2)*/ == "X") && (j-2 >= 0))    //test mouvement gauche
	        {
	            return true;
	        }
	        }
	       
	       
	        if(i+2 <= taille)
	        {
	        if((plateau.echiquier[i+1][j]/*getValeurIJ(i+1, j)*/ == "O") && (plateau.echiquier[i+2][j]/*getValeurIJ(i+2,j)*/ == "X") && (i+2 < taille)) //test mouvement bas
	        {
	            return true;
	        }
	        }
	       
	       
	        if(i-2 >= 0)
	        {
	        if((plateau.echiquier[i-1][j]/*getValeurIJ(i-1, j)*/ == "O") && (plateau.echiquier[i-2][j]/*getValeurIJ(i-2,j)*/ == "X") && (i-2 >= 0)) //test mouvement haut
	        {
	            return true;
	        }
	        }
	        return false; //Si aucune possibilit� n'est possible.
	    }
	}

