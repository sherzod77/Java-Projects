public class object {
    public static void main(String[] args) {
        Byte orindiqlar = 5;
        Short otkuchi = 105;
        Integer narxi = 11000;

        Float benzinsarfitrassada = 8.3F;

        Boolean shikastlanganmi = true;

        String avtomobilnomi = "Chevrolet Lacetti";
        String Kiritilayoganavtomobil = new String("Chevrolet Lacetti");

        System.out.println("O'rindiqlar soni: " + orindiqlar);
        System.out.println("Ot kuchi: " + otkuchi + " hp");
        System.out.println("Narxi: " + narxi + "$");
        System.out.println("Benzin sarfi trassada: " + benzinsarfitrassada + "Litr");
        System.out.println("Shikastlanganmi: " + shikastlanganmi);
        System.out.println("Avtomobil modeli: " + avtomobilnomi);
        System.out.println("Avtomobil modeli katta xarflar bilan: " + avtomobilnomi.toUpperCase());
        System.out.println("Avtomobil modeli kichik xarflar bilan: " + avtomobilnomi.toLowerCase());
        System.out.println("Avtomobil nomi Yangi kiritilgan: " + Kiritilayoganavtomobil);
        System.out.println("Avtomobil Yangi kiritilgan avtomobil oldingisiga teng:  " + Kiritilayoganavtomobil.equals(avtomobilnomi));
    }
}
