package app;

public class Application {
        public final static int QUANTITE = 1024;
        public final static int MIN = 1;
        public final static int MAX = 100;

        public static void main(String[] args) {
                int[] tab = new int[QUANTITE];

                for (int i = 0; i < tab.length; i++) {
                        tab[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
                }
                int nombrePaire = 0;

                for (int i = 0; i < tab.length; i++) {
                        if (tab[i] % 2 == 0) {
                                nombrePaire++;
                        }
                }
                for (int i = 0; i < tab.length; i++) {
                        System.out.println(tab[i]);
                }
                System.out.println("Il y a " + nombrePaire + " nombre pairs dans le tableau");
                System.out.println("La moyenne des nombres du tableau est " + moyenne(tab));
        }

        public static double moyenne(int[] tab) {
                int somme = 0;
                for (int i = 0; i < tab.length; i++) {
                        somme += tab[i];
                }
                double moyenne = (double) somme / tab.length;
                return moyenne;
        }

}
