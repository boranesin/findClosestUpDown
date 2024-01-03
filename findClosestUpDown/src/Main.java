import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi uzunluğunu girmesini iste
        System.out.print("Dizi uzunluğunu girin: ");
        int n = scanner.nextInt();
        int[] dizi = new int[n];

        // Kullanıcıdan diziyi girmesini iste
        System.out.println("Diziyi girin: ");
        for (int i = 0; i < n; i++) {
            dizi[i] = scanner.nextInt();
        }

        // Kullanıcıdan aranacak sayıyı girmesini iste
        System.out.print("Aranan Sayıyı Girin: ");
        int arananSayi = scanner.nextInt();

        // En yakın küçük ve büyük sayıları saklamak için değişkenleri tanımla
        int enYakinKucuk = Integer.MIN_VALUE;
        int enYakinBuyuk = Integer.MAX_VALUE;

        // Diziyi dolaşarak en yakın küçük ve büyük sayıları bul
        for (int eleman : dizi) {
            if (eleman < arananSayi && eleman > enYakinKucuk) {
                enYakinKucuk = eleman;
            }
            if (eleman > arananSayi && eleman < enYakinBuyuk) {
                enYakinBuyuk = eleman;
            }
        }

        // En yakın küçük sayıyı ekrana yazdır
        if (enYakinKucuk != Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı.");
        }

        // En yakın büyük sayıyı ekrana yazdır
        if (enYakinBuyuk != Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı.");
        }

        // Scanner'ı kapat
        scanner.close();
    }
}
