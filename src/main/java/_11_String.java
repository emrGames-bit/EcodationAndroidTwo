import java.util.Locale;

public class _11_String {
    public static void main(String[] args) {
        //String
        String kelime=" Android java firebase java";
        System.out.println(kelime);
        System.out.println("Karakter Sayısı"+kelime.length());
        System.out.println("Bosluklari al"+kelime.trim());
        System.out.println("Baslama"+kelime.startsWith("a"));
        System.out.println("Bitme"+kelime.endsWith(" "));
        System.out.println("Herseyi Kucuk Yap"+kelime.toLowerCase());
        System.out.println("Herseyi Buyuk Yap"+kelime.toUpperCase());
        System.out.println("Ilk Karakter"+kelime.charAt(0));
        System.out.println("Kelime Arama Soldan Sağa İlk Bulduğu"+kelime.indexOf("java"));
        System.out.println("Kelime Arama Sondaki ni bulur "+kelime.lastIndexOf("java"));

        String kelimeyeni=" Yeni Kelime";

        System.out.println("Yer değiştirme"+kelime.replace(kelime,kelimeyeni));
        System.out.println("Geçiyor mu"+kelime.contains("firebase"));
        System.out.println("Yazılan index sayısından itibaren gösterir"+kelime.substring(1));
        System.out.println("İndex arasını gösterir"+kelime.substring(0,3));
        System.out.println("Sona Ekleme"+kelime.concat("-sona ekleme"));
        System.out.println("Dolu mu Boş Mu"+kelime.isEmpty());
    }
}
