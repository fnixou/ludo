package Solitaire;

public class Plateau {
    String echiquier[][] = new String[9][9];


public Plateau(){     
        for(int i = 0; i < echiquier.length; i++)
        {
           for(int j = 0; j < echiquier.length; j++)
           {
               if((i < 3 && j < 3) || (i < 3 && j > 5) || (i > 5 && j < 3) || (i > 5 && j > 5))
               {
                   echiquier[i][j] = " ";
               }
               else if(i == 4 && j == 4)
               {
                   echiquier[i][j] = "X";
               }
               else
               {
                   echiquier[i][j] = "0";
               }
           }
        }
  }
public void setDroite(int i, int j){ 
    echiquier[i][j] = "X";
    echiquier[i][j+1] = "X";
    echiquier[i][j+2] = "O";
    getVoirPlateau();
}

public void setGauche(int i, int j){ 
echiquier[i][j] = "X";
echiquier[i][j-1] = "X";
echiquier[i][j-2] = "O";
getVoirPlateau();
}

public void setHaut(int i, int j){ 
    echiquier[i][j] = "X";
    echiquier[i-1][j] = "X";
    echiquier[i-2][j] = "O";
    getVoirPlateau();
}

public void setBas(int i, int j){ 
    echiquier[i][j] = "X";
    echiquier[i+1][j] = "X";
    echiquier[i+2][j] = "O";
getVoirPlateau();
}

/*public void setTriche(int i, int j){
	echiquier[i][j] = "X";
	getVoirPlateau();
}*/

/*public int getTaillePlateau(){ 
    int valeur = echiquier.length;
    return valeur;
}*/

/*public String getValeurIJ(int i, int j){ 
    String valeur = echiquier[i][j];
    return valeur;
}*/

public void getVoirPlateau()
{
    for(int i = 0; i < echiquier.length; i++)
    {
       for(int j = 0; j < echiquier.length; j++)
       {
           if(j==8) {
               System.out.println("|" +echiquier[i][j]/*getValeurIJ(i, j)*/+"|");
           }
           else {
               System.out.print("|"+/*getValeurIJ(i, j)*/echiquier[i][j]);
           }
       }
    }
}
}