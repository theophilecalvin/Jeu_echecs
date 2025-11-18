public class TestPiece {

    public static void main(String[] args) {


        System.out.println("--- Démarrage des Tests de la Classe Piece ---");
        // 1. Test du Constructeur (Création d'un pion valide)
        Piece monPion = new Piece("pion", "blanche");
        System.out.println("\n[Test 1] Pièce créée : " + monPion.toString());

        // 2. Test du Constructeur (Entrée invalide)
        System.out.println("\n[Test 2] Test d'une entrée invalide :");
        Piece pieceInvalide = new Piece("cheval", "rouge");
        // La console devrait afficher des messages d'erreur ici.
        System.out.println(pieceInvalide.toString());

        System.out.println("________________");
        System.out.println("le type : "+Piece.TYPES[0]);

        // Test du Constructeur (couleur invalide)
        Piece pieceInvalide1 = new Piece("reine", "rouge");

        // 3. Test de la Promotion
        System.out.println("\n[Test 3] Début de la Promotion...");

        // Simuler la promotion sur le pion initial

        // Appeler la méthode promotion (ajustée pour ne pas fermer le scanner)
        // Note : Nous devons ajuster la méthode promotion de Piece pour qu'elle utilise le scanner statique ou soit gérée différemment.

        // Pour simplifier, nous allons appeler une méthode promotion corrigée (voir note ci-dessous)

        // Pour l'instant, appelons directement la méthode promotion de monPion.
        // Assurez-vous d'abord de retirer le scanner.close() de Piece.java
        // ou de le laisser s'exécuter en sachant que le test sera arrêté.

        monPion.promotion();

        System.out.println("\n[Résultat] La pièce est maintenant : " + monPion.toString());

        // 4. Test d'une seconde promotion (le scanner peut échouer si fermé dans Piece.java)
        // monPion.promotion();
        // System.out.println("La pièce est maintenant : " + monPion.toString());

        System.out.println("\n--- Fin des Tests ---");



    }


}
