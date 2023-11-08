import java.util.Random;

public class TD1 {

    public static void exercice5_1() {
        //PR : rien
        // Action : demande à l’utilisateur de saisir un entier n, puis de saisir n entiers.
        // Le programme affiche alors la somme des n entiers saisis.
        // Strategie : boucle for

        int somme = 0;
        int nb = 0;

        Ut.afficherSL("Saisir un nombre");
        int n = Ut.saisirEntier();

        for (int i = 0; i < n; i++) {
            Ut.afficherSL("Saisir un nombre");
            nb = Ut.saisirEntier();
            somme += nb;
        }

        Ut.afficherSL("la somme des nombres est " + somme);

    }

    public static void exercice5_2() {
        //PR : rien
        // Action : demande à l’utilisateur de saisir des entiers jusqu’à ce que l’utilisateur saisisse la valeur 0.
        // Le programme affiche alors le nombre d’entiers non nuls qui ont été saisis et leur somme.
        // Strategie : boucjle while


        int somme = 0;
        int effectif = 0;
        int nbVal = 0;

        Ut.afficherSL("Saisir un nombre (arrete lors de la saisie de 0)");
        nbVal = Ut.saisirEntier();
        while (nbVal > 0) {
            effectif++;
            somme += nbVal;
            Ut.afficherSL("Saisir un nombre (arrete lors de la saisie de 0)");
            nbVal = Ut.saisirEntier();
        }

        Ut.afficherSL("la somme des nombres est " + somme);
        Ut.afficherSL("l'effectif des nombres est " + effectif);
    }

    public static void main(String[] args) {

        //nom des procédures / fonctions que vous souhaitez executer

        moyenne();
    }

    public static void exercice6() {
        Ut.afficherSL("Saisir un entier");
        int a = Ut.saisirEntier();
        float b = 0;
        float d = 0;
        for (int i = 0; i < a; i++) {
            Ut.afficherSL("Saisir un entier");
            int c = Ut.saisirEntier();
            while (c <= 0) {
                Ut.afficherSL("Saisir un entier");
                c = Ut.saisirEntier();
            }
            b = b + c;
        }
        d = b / a;
        Ut.afficherSL("la moyenne d'age  est " + d);
    }

    public static void exercice7_1() {
        int a = 1;
        int i = 1;
        Ut.afficherSL("Saisir un entier");
        int n = Ut.saisirEntier();
        while (i != n) {
            i++;
            a = a + i;
        }
        Ut.afficherSL(a);
    }

    public static void exercice7_2() {
        //n doit etre superieur ou egal a 1
        int a = 1;
        int b = 1;
        int c = 2;
        Ut.afficherSL("Saisir un entier");
        int n = Ut.saisirEntier();
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        Ut.afficherSL(c);
    }

    public static void exercice8() {
        Ut.afficherSL("Saisir un entier");
        int n = Ut.saisirEntier();
        //le nombre que je veut diviser
        Ut.afficherSL("Saisir un entier");
        int p = Ut.saisirEntier();
        //le nombre par lequel je le divise
        int a = 0;
        //le quotient
        int res = 0;
        //le résultat
        while (res < n) {
            //tant que le résultat est inférieur au nombre de départ
            res = res + p;
            a++;
        }
        res = res - n;
        if (res >= 1) {
            a = a - 1;
        }
        Ut.afficherSL(a);
        Ut.afficherSL(res);
    }

    public static void exercice10_1() {
        int b = 2;
        int a = 1;
        for (int i = 0; i < b; i++) {
            a++;
        }
        Ut.afficherSL(a);
    }

    public static void exercice10_2() {
        int b = 2;
        int a = 1;
        while (a <= b) {
            a++;
        }
        Ut.afficherSL(a);
    }

    public static void algo_max() {
        Ut.afficherSL("Saisir un entier");
        int p = Ut.saisirEntier();
        for (int i = 0; i < 20; i++) {
            Ut.afficherSL("Saisir un entier");
            int n = Ut.saisirEntier();
            if (n > p) {
                p = n;
            }
        }
        Ut.afficherSL(p);


    }

    public static void Paire_brelan_carré() {
        Ut.afficherSL("Saisir un entier");
        int a = Ut.saisirEntier();
        Ut.afficherSL("Saisir un entier");
        int b = Ut.saisirEntier();
        Ut.afficherSL("Saisir un entier");
        int c = Ut.saisirEntier();
        Ut.afficherSL("Saisir un entier");
        int d = Ut.saisirEntier();
        int compt = 0;
        if (a == b) {
            compt++;
        }
        if (a == c) {
            compt++;
        }
        if (a == d) {
            compt++;
        }
        if (b == c) {
            compt++;
        }
        if (b == d) {
            compt++;
        }
        if (c == d) {
            compt++;
        }
        if (compt == 6) {
            Ut.afficher("C'est un carré");
        }
        if (compt == 3) {
            Ut.afficher("C'est brelan");
        }
        if (compt == 2) {
            Ut.afficher("C'est une double paire");
        }
        if (compt == 1) {
            Ut.afficher("C'est une paire");
        }
        if (compt == 0) {
            Ut.afficher("Bah pas de chance");
        }
    }

    public static void nombre_de_valeurs_paires() {
        int compt = 0;
        Ut.afficher("saisir un entier (jusqu'a 0)");
        int a = Ut.saisirEntier2();
        while (a != 0) {
            if (a % 2 == 0) {
                compt++;

            }
            a = Ut.saisirEntier2();
        }
        Ut.afficher(compt);
    }

    public static void racine() {
        Ut.afficherSL("saisir un entier ");
        int a = Ut.saisirEntier2();
        Ut.afficherSL("saisir un entier");
        int b = Ut.saisirEntier2();
        Ut.afficherSL("saisir un entier");
        int c = Ut.saisirEntier2();
        int alpha = (b * b) - 4 * a * c;
        if (alpha > 0) {
            double x1 = (-b - Math.sqrt(alpha)) / (2 * a);
            double x2 = (-b + Math.sqrt(alpha)) / (2 * a);
            Ut.afficherSL("x1 :" + x1);
            Ut.afficherSL("x2 :" + x2);


        } else if (alpha == 0) {
            double x0 = (-b) / (2 * a);
            Ut.afficherSL("x0 :" + x0);
        } else {
            Ut.afficherSL("pas de solution");
        }
    }

    public static void racine2() {
        Ut.afficherSL("saisir un entier ");
        int a = Ut.saisirEntier2();
        Ut.afficherSL("saisir un entier");
        int b = Ut.saisirEntier2();
        Ut.afficherSL("saisir un entier");
        int c = Ut.saisirEntier2();
        Ut.afficherSL("saisir un entier");
        int d = Ut.saisirEntier2();
        for (int i = -100; i < 101; i++) {
            if ((a * (i * i * i)) + (b * (i * i)) + (c * i) + d == 0) {
                Ut.afficherSL(i);
            }
        }
    }


    public static void texte90() {
        String text = "manu est sexy";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'm')
                count++;
        }
        Ut.afficherSL("Nombre total de m est: " + count);
    }

    public static void texte91() {
        String text = "batman est le meilleur super héros.";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || text.charAt(i) == '.') {
                count++;
            }

        }
        Ut.afficherSL("Nombre total de mot est: " + count);
    }

    public static void texte1() {
        int count = 0;
        char cara = Ut.saisirCaractere();
        while (cara != '.') {
            if (cara == 'm') {
                count++;
            }
            cara = Ut.saisirCaractere();
        }
        Ut.afficherSL("Nombre total de m est: " + count);
    }

    public static void texte2() {
        int count = 0;
        char cara = Ut.saisirCaractere();
        while (cara != '.') {
            if (cara == ':') {
                count++;
            }
            cara = Ut.saisirCaractere();
        }
        count++;
        Ut.afficherSL("Nombre total de mot est: " + count);
    }

    public static void texte3() {
        int count = 0;
        char cara = Ut.saisirCaractere();
        char cara_pre = ' ';
        while (cara != '.') {
            if (cara == 'e' && cara_pre == 'l') {
                count++;
            }
            cara_pre = cara;
            cara = Ut.saisirCaractere();
        }
        Ut.afficherSL("Nombre total de syllabe le est: " + count);
    }

    public static void texte4() {
        int count = 0;
        char cara = Ut.saisirCaractere();
        while (cara != '.') {
            if (cara == ':') {
                count = -1;
            }
            cara = Ut.saisirCaractere();
            if (cara == ':') {
                count = -1;
            } else {
                count++;
            }
        }
        Ut.afficherSL("Nombre total de lettre du dernier mot est le est: " + count);
    }

    public static void texte5() {
        int count_mot = 0;
        int count_max = 0;
        char cara = Ut.saisirCaractere();
        while (cara != '.') {
            if (cara == ':') {
                if (count_mot > count_max) {
                    count_max = count_mot;
                    count_mot = -1;
                }
            }
            count_mot++;
            cara = Ut.saisirCaractere();
        }
        if (count_mot > count_max) {
            count_max = count_mot;

        }
        Ut.afficherSL("Nombre total de lettre du plus long mot est: " + count_max);
    }

    public static void sum_nbr() {
        Ut.afficherSL("saisir un entier positif");
        int nb = Ut.saisirEntier2();
        int a = 0;
        int b = 0;
        while (a < nb) {
            b++;
            a += b;
        }
        if (a > nb) {
            a -= b;
        }
        Ut.afficherSL(a);

    }

    public static boolean annee_bi(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }

        }

        return false;
    }

    public static boolean date() {
        Ut.afficherSL("saisir le jour");
        int j = Ut.saisirEntier2();
        Ut.afficherSL("saisir le mois");
        int m = Ut.saisirEntier2();
        Ut.afficherSL("saisir année");
        int a = Ut.saisirEntier2();
        int nbrm = 0;
        if (m == 2) {
            if (annee_bi(a) == true) {
                nbrm = 29;
            } else {
                nbrm = 28;
            }
        }
        if (m != 2 && m % 2 == 0) {
            nbrm = 31;
        } else if (m != 2 && m % 2 != 0) {
            nbrm = 30;
        }

        if (a > 0 && m <= 12) {
            if (1 <= m && 1 <= j) {
                if (j <= nbrm) {
                    Ut.afficherSL("vrai");
                    return true;
                }
            }
        }
        Ut.afficherSL("faux");
        return false;
    }

    public static void nombre_de_jour(int j, int m, int a) {
        int nbr = 0;
        int nbrm = 0;
        for (int i = 1; i <= m - 1; i++) {
            if (i == 2) {
                if (annee_bi(a) == true) {
                    nbrm = 29;
                } else {
                    nbrm = 28;
                }
            }
            if (i != 2 && i % 2 == 0) {
                nbrm = 31;
            } else if (i != 2 && i % 2 != 0) {
                nbrm = 30;
            }
            if (i == 1) {
                nbrm = 31;
            }
            nbr = nbr + nbrm;

        }
        Ut.afficherSL(nbr);
        Ut.afficherSL(j);
        nbr = nbr + j;
        Ut.afficherSL(nbr);
    }


    public static int générateur() {
        int a = Ut.randomMinMax(1, 100);
        return a;
    }


    public static boolean arivobato() {
        int largeur = 5;
        int longueur = 8;
        int x = (largeur / 2);
        int y = 0;
        while (y < longueur) {
            int moov = générateur();


            if (moov >= 1 && moov <= 50) {
                Ut.afficherSL("");
                Ut.afficherSL("pas en avant");
                Ut.afficherSL("");
                affichePlanche(largeur,longueur,x,y);
                y=y+1;
                affichePlanche(largeur,longueur,x,y);
            }
            if (moov >= 51 && moov <= 70) {
                Ut.afficherSL("");
                Ut.afficherSL("pas vers la droite");
                Ut.afficherSL("");
                affichePlanche(largeur,longueur,x,y);
                x=x+1;
                affichePlanche(largeur,longueur,x,y);
            }
            if (moov >= 71 && moov <= 90) {
                Ut.afficherSL("");
                Ut.afficherSL("pas vers la gauche");
                Ut.afficherSL("");
                affichePlanche(largeur,longueur,x,y);
                x=x-1;
                affichePlanche(largeur,longueur,x,y);
            }
            if (moov >= 91 && moov <= 100) {
                Ut.afficherSL("pas vers l'arriere");
                Ut.afficherSL("");
                affichePlanche(largeur,longueur,x,y);
                y=y-1;
                affichePlanche(largeur,longueur,x,y);
            }
            if (x <= 0 || x >= largeur) {
                Ut.afficherSL("");
                Ut.afficherSL("il est tombé");
                Ut.afficherSL("");
                return false;
            }
            if (y <= -1) {
                Ut.afficherSL("");
                Ut.afficherSL("il a trop reculé on le replace aumilieu");
                Ut.afficherSL("");

                y = 0;
                affichePlanche(largeur,longueur,x,y);

            }
            if (y >= longueur) {
                Ut.afficherSL("");
                Ut.afficherSL("il a réussi");
                Ut.afficherSL("");
                affichePlanche(largeur,longueur,x,y);
                return true;
            }
        }
        return true ;
    }
    public static void affichePlanche(int largeur, int longueur , int x, int y){

        Ut.clearConsole();
        Ut.pause(2000);
        for (int t =0 ; t<=longueur; t++) {
            Ut.afficherSL("");
            Ut.afficher("|");
        for (int i =0 ; i<=largeur; i++) {

            if (i == x && t == y){
                Ut.afficher("0");
            }
            else if(i!=largeur) {
                Ut.afficher("-");
            }
            else{
                Ut.afficher("|");
            }
        }
        }
            }
    public static void affichetableau(){
        int monTableau[ ] = new int[1];
        System.out.println(monTableau);
    }
    public static void affichematrice() {
        int[][] matrice =
                {
                        { 0, 1, 4, 3 } , // tableau [0] de int
                        { 5, 7, 9, 11, 13, 15, 17 } // tableau [1] de int
                };
        System.out.println(matrice);
    }
    public static void table(){
        int res = 0;
        int nb = Ut.saisirEntier2() ;
        int taille = Ut.saisirEntier2();
        for(int i=taille;i<=10;i++){
            res = nb*i;
            Ut.afficherSL(nb +"x" +i +"=" +res);
        }

    }
    public static void moyenne(){
        float nbNotes = Ut.saisirEntier2();
        float note = 0;
        float somme = 0;
        for(int i=0;i<=nbNotes;i++){
            note = Ut.saisirEntier2();
            somme=somme+note;

        }
        somme=somme/nbNotes;
        Ut.afficherSL(somme);
    }
    public static void justPrix(){
        Random random = new Random();
        int nb;
        nb = random.nextInt(11);
    }
    public static int max2 (int a,int b){
        int entier = 0;
        if (a>=b){
            entier=a;
        }
        else {
            entier=b;
        }

        return entier ;
    }
}






