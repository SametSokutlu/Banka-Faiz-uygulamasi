import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banka banka = new Banka();
        banka.bankaId = 1;
        banka.bankaName = "Banka";
        banka.bankaAddress = "İstanbul/pendik";
        banka.bankaCity = "istanbul";

        banka.musteriTemsilcisi = banka.musteriTemsilcisi;

        MusteriTemsilcisi musteriTemsilcisi = new MusteriTemsilcisi();
        musteriTemsilcisi.musteriTemsilcisiId = 1;
        musteriTemsilcisi.musteriTemsilcisiAdi = "Ahmet";
        musteriTemsilcisi.musteriTemsilcisiSoyAdi = "Türk";

        List<Musteri> musteriler = new ArrayList<>();
        Musteri musteri1 = new Musteri();
        musteriler.add(musteri1);
        musteri1.musteriId = 2;
        musteri1.musteriAdi = "Samet";
        musteri1.musteriSoyAdi = "Sökütlü";
        musteri1.musteriEmail="adjansjmk@gmail.com";
        musteri1.musteriSifresi = "0123";
        musteri1.musteriTelefon = "02451255";

        Musteri musteri2 = new Musteri();
        musteriler.add(musteri2);
        musteri2.musteriId = 3;
        musteri2.musteriAdi = "Samet";
        musteri2.musteriSoyAdi = "aaljsdn";
        musteri2.musteriSifresi = "1245";
        musteri2.musteriTelefon = "5341";
        musteri2.musteriEmail = "adansjmk@gmadsil.com";

       List<Musteri>musteriler2 = new ArrayList<>();

        Kredi kredi = new Kredi();
        kredi.müsteriler=new ArrayList<>();
        kredi.müsteriler.add(musteri1);
        kredi.müsteriler.add(musteri2);
        kredi.krediId = 2;
        kredi.krediAdi = "Tüketici Kredisi";
        kredi.krediTutari = 200000;
        //kredi.totalAmount=;

        Kredi kredi2 = new Kredi();
        kredi2.müsteriler=new ArrayList<>();
        kredi2.müsteriler.add(musteri1);
        kredi2.krediId = 3;
        kredi2.krediAdi = "İhtiyac kredisi";
        kredi2.krediTutari = 2000;

        List<KrediFaiz> krediFaizler = new ArrayList<>();
        KrediFaiz kredifaiz = new KrediFaiz();
        kredifaiz.faizOrani = 5.55;
        KrediFaiz kredifaiz2 = new KrediFaiz();
        kredifaiz2.faizOrani =8.55;

        krediFaizler.add(kredifaiz);
        krediFaizler.add(kredifaiz2);
        System.out.println("DİREK KREDİ HESAPLAMA GERİ ÖDENECEK:"+krediHesaplama(200000,7));
        System.out.println("MÜŞTERİ TEMSİLCİSİ:"+musteriTemsilcisi.musteriTemsilcisiAdi);
        System.out.println("MÜŞTERİ ADI:"+musteri1.musteriAdi);
        System.out.println("KREDİ ADI:"+kredi.krediAdi);
        System.out.println("KREDİ TUTARI:"+kredi.krediTutari);
        System.out.println("KREDİ FAİZİ:"+kredifaiz.faizOrani);
        System.out.println("TOPLAM GERİ ÖDENECEK:"+krediHesaplama(100000,5.0));
        System.out.println(krediHesaplama(230000,3));


    }

    public static double calculatorTotalAmount(List<Kredi> krediler) {
        double result = 0;
        for (int i = 0; i < krediler.size(); i++) {
            Kredi kredi = krediler.get(i);
            result += kredi.krediTutari;
        }
        return result;
    }

    public static double krediHesaplama(double krediTutari ,double kredifaiz) {

       return  krediTutari*kredifaiz;


    }
}