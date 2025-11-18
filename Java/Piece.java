
import java.util.Arrays;
import java.util.Scanner;

class Piece {


    public static final String [] TYPES  = {
        "pion", "tour", "cavalier", "fou", "reine", "roi"
    };
    public static final String [] COULEURS = {
        "blanche", "noire"
    };

    private static final String [] TYPEPROMO = {
        "tour", "cavalier", "fou", "reine"
    };

    private String type;

    private String couleur;

    public Piece(String type, String couleur){

            // verifie si le type entré est valide
        if (Arrays.asList(TYPES).contains(type)) {
            this.type = type;

        } //cas ou le type n'est pas valide
        else { System.out.println("le type de piece entrré n'est pas valide"); }

        if (Arrays.asList(COULEURS).contains(couleur)){
            this.couleur = couleur;
        }// cas ou la couleur n'est pas valide
        else { System.out.println("la couleur n'est pas valide"); }

    }
    // cette méthode retourne le type et la couleur
    public String toString(){
        return type+couleur;
    }

    public void promotion(){
        System.out.println("choisi une pièce pour la promotion entre : tour, cavalier, fou, reine");
        Scanner scanner = new Scanner(System.in);
        String promo;
        promo = scanner.nextLine().toLowerCase();

        if (Arrays.asList(TYPEPROMO).contains(promo)) {
            this.type = promo;
        }

        scanner.close();
    }
}
