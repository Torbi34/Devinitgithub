public class TD1 {
	public static void main (String [] args) {
	
	jouer();
	
   	 }


	public static void Algo5 () {
	Ut.afficher("saisir un entier ");
	int n = Ut.saisirEntier();
    	int k = n  ;
    	int t = 0 ;
    	for (int i=0;i<n;i++){
    	Ut.afficher("saisir un entier ");
    	t= Ut.saisirEntier();
    	k+=k+t;
    	}
    	}
}

