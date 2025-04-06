    package switchexample;
    import java.util.Scanner;

    public class Switch_Example {

        public static void main(String[]args)  {
        Scanner read = new Scanner(System.in);
        int choose = read.nextInt();

        System.out.println("Vizyondaki filmlerden dilediğinizi seçiniz." + "\n");
        System.out.println("(1) Maria");
        System.out.println("(2) Babygirl");
        System.out.println("(3) Bataklık");
        System.out.println("(4) Acıya Yer Yok");
        System.out.println("(5) Kaptan Amerika: Cesur Yeni Dünya");
        System.out.println("(6) Exorcism Chronicles: Başlangıç");
        System.out.println("(7) Komşum Totoro");
        System.out.println("(8) Yürüyen Şato");
        System.out.println("(9) Persona");
        System.out.println("(10) Çocuk ve Balıkçıl");
        choose = read.nextInt();

        switch (choose)   {
            case 1:
                System.out.println("Maria");
                System.out.println("1970’lerin Paris’inde, dünyaca ünlü opera" +
                        " sanatçısı Maria Callas’ın çalkantılı, güzel ve trajik" +
                        " hayatının son günlerini yeniden yaşatan ve hayal ettiren filmin " +
                        "başrollerinde Angelina Jolie, Haluk Bilginer ve Alba Rohrwacher var.");

                break;
        }
    }

}