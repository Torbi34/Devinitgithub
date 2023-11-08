public class TD4 {


    public static void main(String[] args) {
        int[][] a = {
                {0, 2, 1, 1, 1},
                {2, 1, 1, 0, 1},
                {1, 2, 2, 1, 1},
                {1, 2, 1, 1, 1},
                {1, 2, 2, 1, 1}
        };
        int[][] b = {
                {23, 98, 89},
                {34, 34, 76},
                {34, 34, 90}
        };
        sudoku_win(6);
    }

    public static void afficherTabEntiers(int[] t) {
        for (int i : t) {
            System.out.println(i);
        }
    }

    public static int[] saisirTabEntiers(int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < taille; i++) {
            Ut.afficher("saisire un entier");
            tab[i] = Ut.saisirEntier();
        }
        return tab;
    }

    public static double moyenne(int[] t) {
        float moyenne = 0;
        for (int i = 0; i < t.length; i++) {
            moyenne += t[i];
        }
        return moyenne / t.length;
    }

    public static void traiterTabEntiers() {
        int[] tab = saisirTabEntiers(5);
        afficherTabEntiers(tab);
        Ut.afficherSL("");
        Ut.afficher(moyenne(tab));
        Ut.afficherSL("");
        Ut.afficherSL("");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                tab[i] += 1;
            }
        }
        afficherTabEntiers(tab);
    }

    public static int[] frequenceChiffres(int n) {
        int[] tab = new int[10];
        while (n >= 1) {
            tab[n % 10] += 1;
            n = n / 10;
        }
        return tab;
    }

    public static boolean aChiffresTousDifferents(int n) {
        int[] tab = frequenceChiffres(n);
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public static void aChiffresTousDifferentsBis(int n) {
        int a = 0;
        int b = n;
        int c = n;
        while (n > 0) {
            n = n / 10;
            a += 1;
        }
        int[] tab = new int[a];
        int[] tab2 = new int[a];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = c % 10;
            c = c / 10;
        }
        for (int j = 0; j < tab.length; j++) {
            tab2[j] = b % 10;
            b = b / 10;
        }
        for (int k : tab) {
            Ut.afficher(k);
            for (int v : tab2) {
                Ut.afficher(v);
            }

        }
    }

    public static boolean aChiffresTousDifferentsBis2(int n) {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 0;
        }
        while (n > 0) {
            tab[n % 10] += 1;
            n = n / 10;
        }
        for (int k : tab) {
            if (k > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean estPalindrome(char[] t) {
        int a = t.length;
        for (int i = 0; i < t.length / 2; i++) {
            if (t[i] != t[a - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void testPalin() {
        char[] mot = Ut.saisirCharArray();
        if (estPalindrome(mot) == true) {
            Ut.afficher("c'est un palindrome");
        } else {
            Ut.afficher("ce n'est pas un palindrome");
        }
    }

    public static void addition_matrice(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int k = 0; k < c.length; k++) {
            for (int v = 0; v < c.length; v++) {
                c[k][v] = a[k][v] + b[k][v];
                System.out.print(c[k][v] + "\t");
            }
        }
        Ut.afficherSL("");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }

        }
        Ut.afficherSL("");
        for (int q = 0; q < b.length; q++) {
            for (int s = 0; s < b.length; s++) {
                System.out.print(b[q][s]);
            }
        }
    }

    public static int sommeDiagos(int[][] mat) {
        int x = 0;
        int s = 0;
        int somme1 = 0;
        int somme2 = 0;
        for (int q = 0; q < mat.length; q++) {
            somme1 = somme1 + mat[q][s];
            s++;
        }
        for (int w = mat.length - 1; w >= 0; w--) {
            somme2 = somme2 + mat[x][w];
            x++;
        }
        somme2 += somme1;
        if (mat.length % 2 != 0) {
            somme2 -= milieu(mat);

        }
        return somme2;
    }


    public static int milieu(int[][] mat) {

        int nombreDeLignes = mat.length;
        int nombreDeColonnes = mat[0].length;

        int indiceLigneMilieu = nombreDeLignes / 2;
        int indiceColonneMilieu = nombreDeColonnes / 2;

        int elementDuMilieu = mat[indiceLigneMilieu][indiceColonneMilieu];

        return elementDuMilieu;
    }

    public static int nbr_nul(int[][] mat) {
        int a = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 0) {
                    a++;
                }
            }

        }
        return a;
    }

    public static boolean existe_nul(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean existe_nul2(int[][] matrice) {
        boolean nul = false;
        int i = 0;
        int j = 0;
        while (i < matrice.length && nul == false) {
            j = 0;
            while (j < matrice[i].length && nul == false) {
                if (matrice[i][j] == 0) {
                    nul = true;
                }
                j++;
            }
            i++;
        }

        if (nul) {
            return true;
        } else {
            return false;
        }
    }

    public static void ligne_nul(int[][] mat) {
        int lignezero = -1;
        int maximumZeros = 0;

        for (int i = 0; i < mat.length; i++) {
            int nbr_zero = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    nbr_zero++;
                }
            }
            if (nbr_zero > maximumZeros) {
                maximumZeros = nbr_zero;
                lignezero = i;
            }
        }

        if (lignezero != -1) {
            Ut.afficherSL("La ligne avec le plus de valeurs nulles est la ligne " + lignezero);
            Ut.afficherSL("Nombre de zéro : " + maximumZeros);
        }
    }

    public static boolean a_ligne_nul(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            int nbr_zero = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    nbr_zero++;
                }
            }
            if (nbr_zero >= 2) {
                return true;
            }
        }
        return false;
    }

    public static int[][] creer_mat_carre1(int n) {
        int[][] mat = new int[n][n];
        int val = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = val;
                val++;
            }
        }

        return mat;
    }

    public static int[][] creer_mat_carre2(int n) {
        int[][] mat = new int[n][n];
        int val = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = val;
                    val++;
                }
            }
            else {
                for (int j = n - 1; j >= 0; j--) {
                    mat[i][j] = val;
                    val++;
                }
            }
        }

        return mat;
    }

    public static int[][] creer_mat_carre3(int n) {

        int[][] mat = new int[n][n];
        int val = 1;

        for (int i = 0; i < n; i++) {
            int ligne = i;
            int collone = 0;
            while (ligne >= 0) {
                mat[ligne][collone] = val;
                val++;
                ligne--;
                collone++;
            }
        }

        for (int j = 1; j < n; j++) {
            int collone = j;
            int ligne = n - 1;
            while (collone < n) {
                mat[ligne][collone] = val;
                val++;
                ligne--;
                collone++;
            }
        }

        return mat;
    }

    public static int[][] carre_magique(int n) {
        // Crée une matrice de taille n x n pour le carré magique
        int[][] carreMagique = new int[n][n];

        // Initialise les indices i et j pour commencer le remplissage
        int i = 0;
        int j = n / 2;

        // Initialise la première valeur à insérer dans le carré magique
        int valeur = 1;

        // Remplit le carré magique tant que toutes les cases ne sont pas remplies
        while (valeur <= n * n) {
            // Place la valeur actuelle dans la case (i, j)
            carreMagique[i][j] = valeur;

            // Incrémente la valeur
            valeur++;

            // Calcule les indices de la prochaine cellule à remplir (saut cavalier)
            int nvI = (i - 1 + n) % n;
            int nvJ = (j + 1) % n;

            // Vérifie si la prochaine cellule est déjà occupée
            if (carreMagique[nvI][nvJ] != 0) {
                // Si occupée, déplace-toi vers le bas
                i = (i + 1) % n;
            } else {
                // Sinon, déplace-toi vers la nouvelle cellule calculée
                i = nvI;
                j = nvJ;
            }
        }

        // Retourne le carré magique rempli
        return carreMagique;
    }

    public static void for_each(int[][] mat) {
        for (int[] ligne : mat) {
            for (int valeur : ligne) {
                Ut.afficher(valeur);
            }
        }
    }

    public static int[][] carre_magique_2(int n) {

        // Crée une matrice de taille n x n pour le carré magique
        int[][] carreMagique = new int[n][n];

        // Initialise les indices i et j pour commencer le remplissage
        int i = 0;
        int j = n / 2;


        // Initialise la première valeur à insérer dans le carré magique
        int valeur = 1;
        carreMagique[i][j] = valeur;
        while(valeur < n * n) {

            i--;
            j++;
            if (i == -1) {
                i= carreMagique.length-1;
            }
            if (j == carreMagique.length) {
                j = 0;
            }
            if (carreMagique[i][j] != 0) {
                i = i - 1;
                j--;
                if (j == -1) {
                    j = carreMagique.length-1;
                }
                if (i == -1) {
                    i = carreMagique.length-1;
                }
            }
            valeur++;
            carreMagique[i][j] = valeur;
        }
        return carreMagique;
    }

    public static void sudoku_win(int n) {
        int[][] grillesudoku = new int[n][n];
        Ut.afficher(grillesudoku);
    }
}












