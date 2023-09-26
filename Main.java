public class Main {
    // Matrisi ekrana yazdırmak için yardımcı bir metod
    public static void yazdirMatris(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 7}
        };

        // Matrisin boyutlarını alalım
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        // Transpoz matrisi için yeni bir dizi oluşturduk
        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        // Matrisin transpozunu aldık
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        System.out.println("Matris:");
        yazdirMatris(matris);

        System.out.println("Transpoz:");
        yazdirMatris(transpoz);
    }
}