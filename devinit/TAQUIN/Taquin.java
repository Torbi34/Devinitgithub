
public class Taquin {

   
    public static void main (String [] args) {
	
	jouer();
	
    }

    /** Résultat : vrai si les carreaux (i1,j1) et (i2,j2) sont dans l'ordre, et faux sinon.
	L'ordre est lexicographique, selon la ligne, puis la colonne.
    */
    public static boolean sontDansLOrdre(int i1, int j1, int i2, int j2) {
	
	/* A MODIFIER */

	if(i1<i2){
		return true;
	}
	else if (i1==i2){
		if(j1<j2){
		return true;
		}
	}
	return false;
    }
    
    /** Résultat : vrai si le carreau de numéro carreau se trouve aux coordonnées (i,j) dans la grille,
                   et faux sinon 
    */
    public static boolean estCarreauTrouveIci(int[][] grille, int carreau, int i , int j) {
	
	/* A MODIFIER */
	return grille[i][j]==carreau;
    }

    /** Résultat : un tableau de deux cases contenant les coordonnées du trou dans la grille 
     */
    public static int[] positionTrou(int[][] grille) {
	int [] trou;       // Déclaration d'un tableau
	trou = new int[2]; // Allocation mémoire d'un tableau (vide) de deux cases de type entier

	/* A MODIFIER */
	for(int i=0;i< grille.length; i++){
		for(int j=0;j< grille.length; j++){
			if (grille[i][j]== 0){
			trou[0]=i;
			trou[1]=j;
			}
		}
	}
	return trou;
    }

    /** Résultat : vrai si la grille contient les nombres dans l'ordre, et le trou en bas à droite ; faux sinon 
     */ 
    public static boolean estGagnant(int[][] grille) {

	/* A MODIFIER */
	int a=1;
	for(int i=0;i< grille.length; i++){
		for(int j=0;j< grille.length; j++){
			if (i==grille.length-1 && j==grille[i].length-1){
			return true;
			}
			if (grille[i][j]!=a){
		return false;
		}
		a++;
	}
	}
	return true;

    }

    /** Résultat : une grille générée aléatoirement mais valide, c'est-à-dire qui contient tous les nombres 
                   entre 0 et n^2 - 1
     */ 
    public static int[][] genererGrille(int n){
        //generation d'une grille de Taquin aleaoirement remplie de dimensions taillextaille
        //0 represente le trou
        int[][] grille = new int[n][n];

        for (int ligne = 0 ; ligne < grille.length ; ligne++) {
            for (int col = 0; col < grille[ligne].length; col++) {
                grille[ligne][col]=-1;
            }
        }
        int i;
        int j;
        for (int val = 0 ; val<grille.length*grille.length ; val++){
            do {
                i = Ut.randomMinMax(0, grille.length-1);
                j = Ut.randomMinMax(0, grille.length-1);
            } while(grille[i][j]>=0);
            grille[i][j]=val;
        }
        return grille;
    }
    
    public static char saisirDeplacement(){
    Ut.afficher("Veuillez saisir un mouvement n/s/e/o :");
    return Ut.saisirCaractere();
    }
    
    public static void deplacerTrou(int[][] grille, int[] posTrou){
    char mouvementChoisi = saisirDeplacement();
    int ligne = posTrou[0];
    int col = posTrou[1];
    if (mouvementChoisi=='n'){
    	grille[ligne][col]=grille[ligne-1][col];
    	grille[ligne-1][col]=0;
    	posTrou[0]=ligne-1;
    	posTrou[1]=col;

    }
    if (mouvementChoisi=='s'){
    	grille[ligne][col]=grille[ligne+1][col];
    	grille[ligne+1][col]=0;
    	posTrou[0]=ligne+1;
    	posTrou[1]=col;
    }
    if (mouvementChoisi=='e'){
    	grille[ligne][col]=grille[ligne][col+1];
    	grille[ligne][col+1]=0;
    	posTrou[0]=ligne;
    	posTrou[1]=col+1;
    }
    if (mouvementChoisi=='o'){
    	grille[ligne][col]=grille[ligne][col-1];
    	grille[ligne][col-1]=0;
    	posTrou[0]=ligne;
    	posTrou[1]=col-1;
    }
    }
    public static void jouer(){
    int[][] grillejeu = { {1,2,3},
			    {4,5,6},
			    {8,7,0},
    };
    int[] posTrou = positionTrou(grillejeu);
    Ut.afficher(grillejeu);
    while(estGagnant(grillejeu)==false){
    deplacerTrou(grillejeu,posTrou);
    Ut.afficher(grillejeu);
    }
    }
}
