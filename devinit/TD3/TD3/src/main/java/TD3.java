import java.util.Scanner;

public class TD3 {


    public static void main(String[] args) {
        nb_syracusien(27);
    }

    public static int max2(int a, int b) {
        int entier = 0;
        if (a >= b) {
            entier = a;
        } else {
            entier = b;
        }

        return entier;
    }

    public static int max3(int a, int b, int c) {
        int entier = 0;
        if (a >= b && a >= c) {
            entier = a;
        } else if (b >= a && b >= c) {
            entier = b;

        } else {
            entier = c;
        }
        return entier;
    }

    public static int nbChiffres(int n) {
        int entier = 0;
        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            n = n / 10;
            entier++;
        }
        return entier;
    }

    public static int nbChiffresDuCarre(int n) {
        int entier = 0;
        if (n == 0) {
            return 1;
        }
        n = n * n;
        while (n != 0) {
            n = n / 10;
            entier++;
        }

        return entier;
    }

    public static void repeteCarac(int nb, char car) {
        for (int i = 0; nb >= i; i++) {
            Ut.afficher(car);
        }
    }


    public static void pyramideSimple(int h, char c) {
        int a = 1;
        for (int i = 0; i < h; i++) {
            repeteCarac(h - a, ' ');
            repeteCarac(i + a, c);
            repeteCarac(h - a, ' ');
            Ut.afficherSL("");
            a++;

        }
    }

    public static void afficheNombresCroissants(int nb1, int nb2) {
        if (nb2 >= nb1) {
            int unb1 = nb1 % 10;
            int unb2 = nb2 % 10;
            for (int i = unb1; i != unb2; i++) {
                Ut.afficher(i);
                if (i == 9) {
                    i = i - 10;
                }
            }
            Ut.afficher(unb2);
        }
    }

    public static void afficheNombresDecroissants(int nb1, int nb2) {
        if (nb2 >= nb1) {
            int unb1 = nb1 % 10;
            int unb2 = nb2 % 10;
            for (int i = unb2; i != unb1; i--) {
                Ut.afficher(i);
                if (i == 0) {
                    i = i + 10;
                }
            }
            Ut.afficher(unb1);
        }
    }

    public static void pyramide(int h) {
        int a = 0;
        int c = 0;
        int b = 0;
        for (int i = 1; i != h; i++) {
            repeteCarac(h - c, ' ');
            if (i > 1) {
                afficheNombresCroissants(i, i + b);
                b = b + 1;
            }
            afficheNombresDecroissants(i, i + a);
            repeteCarac(h - c, ' ');
            Ut.afficherSL(" ");
            a = a + 1;
            c = c + 1;

        }
        repeteCarac(h - c, ' ');
        afficheNombresCroissants(h, h + b);
        afficheNombresDecroissants(h, h + a);
        repeteCarac(h - c, ' ');
    }

    public static int racineParfaite(int c) {
        int n = 1;
        while (n * n <= c) {
            if ((n * n) == c) {
                return n;
            }
            n++;
        }
        return -1;
    }

    public static boolean estCarreParfait(int d) {
        return racineParfaite(d) != -1;
    }

    public static boolean est_angle(int d, int e) {
        int z = (d * d) + (e * e);
        if (estCarreParfait(z) == true) {
            Ut.afficherSL(racineParfaite(z));
            return true;
        }
        return false;
    }

    public static boolean sont_amis(int p, int q) {
        if (p == q) {
            return false;
        }
        int div = 1;
        int div2 = 1;
        int somme = 0;
        int somme2 = 0;

        while (div <= p / 2) {
            if (p % div == 0) {
                somme = somme + div;
                div++;
            } else {
                div++;
            }
        }
        while (div2 <= q / 2) {
            if (q % div2 == 0) {
                somme2 = somme2 + div2;
                div2++;
            } else {
                div2++;
            }

        }
        if (p == somme2 && q == somme) {
            return true;
        }
        return false;
    }

    public static void couple_amis(int a) {
        for (int i = 1; i <= a; i++) {
            for (int b = i; b <= a; b++) {
                if (sont_amis(i, b) == true) {
                    Ut.afficherSL(i + "," + b);
                }
            }
        }

    }

    public static void triangle_rectangle(int n) {
        int somme = 0;
        int a = 1;
        int b = 1;
        while (a + b != n) {
            Ut.afficherSL(a);
            Ut.afficherSL(b);
            if (est_angle(a, b) == true) {
                somme = somme + 3;
            }
        }
        Ut.afficher(somme);
    }
    public static boolean CarreParfait(int a, int b) {
        return  (estCarreParfait((a*a)+(b*b)));
    }

    public static int Triangles(int n) {
        int somme = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                if (CarreParfait(a,b) && (a + b + racineParfaite((a * a) + (b * b)) <= n)) {
                    somme = somme + 1;
                    Ut.afficherSL(a + "," + b + "," + racineParfaite((a * a) + (b * b)));


                }
            }
        }
        return somme;



    }
    public static void nb_syracusien(int n) {
        while (n!=1){
            if (n%2 ==0) {
                n = n / 2;
                Ut.afficherSL(n);
            }
            else{
                n=3*n+1;
                Ut.afficherSL(n);
            }
        }
        Ut.afficherSL(n); ;
    }
}






