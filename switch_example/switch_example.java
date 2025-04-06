    package switch_example;
    import java.util.Scanner;

    public class switch_example {

        public static void main(String[]args)  {
        Scanner read = new Scanner(System.in);
        int choose = read.nextInt();

        System.out.println("Vizyondaki filmlerden dilediğinizi seçiniz." + "\n");
        System.out.println("(1) Maria");
        System.out.println("(2) Hamlet");
        System.out.println("(3) Bataklık");
        System.out.println("(4) Acıya Yer Yok");
        System.out.println("(5) Kaptan Amerika: Cesur Yeni Dünya");
        System.out.println("(6) Exorcism Chronicles: Başlangıç");
        System.out.println("(7) Komşum Totoro");
        System.out.println("(8) Yürüyen Şato");
        System.out.println("(9) Persona");
        System.out.println("(10)Çocuk ve Balıkçıl");
        choose = read.nextInt();

        switch (choose)   {
            case 1:
                System.out.println("Maria");
                System.out.println("1970’lerin Paris’inde, dünyaca ünlü opera" +
                                   "sanatçısı Maria Callas’ın çalkantılı, güzel ve trajik" +
                                   "hayatının son günlerini yeniden yaşatan ve hayal ettiren filmin " +
                                   "başrollerinde Angelina Jolie, Haluk Bilginer ve Alba Rohrwacher var.\n");

            case 2:
                System.out.println("Hamlet");
                System.out.println("Ülke savaşın tam ortasına düştüğünde, Hamlet’in ailesi" +
                                   "büyük bir çöküş yaşar. Babasının ölümünün intikamını almak" +
                                   "zorunda kalan Hamlet, bu ağır yükü omuzlarında taşıyamaz ve " +
                                   "içsel çatışmalarla boğuşurken akıl sağlığını ve ülkesinin " +
                                   "güvenliğini riske atar.\n");
            case 3:
                System.out.println("Bataklık");
                System.out.println("The Bayou, Louisiana Bayou'da korkunç bir yırtıcı tarafından" +
                                   "kovalanan bir grup arkadaşın hikayesini konu ediyor.\n" +
                                    "\n");
            case 4:
                System.out.println("Acıya Yer yok");
                System.out.println("Acıya Yer Yok filmi, hoşlandığı kadını kurtarmak için acıyı " +
                                   "hissetmeme durumunu kullanan Nate'in verdiği mücadeleyi anlatıyor.\n" +
                                    "\n");
            case 5:
                System.out.println("Kaptan Amerika: Cesur Yeni Dünya");
                System.out.println("Film, yeni seçilen ABD Başkanı Thaddeus Ross ile bir görüşmesinin" +
                                   "ardından kendini uluslararası bir krizin ortasında bulan yeni " +
                                   "Kaptan Amerika Sam Wilson’ın hikâyesini anlatıyor.\n");
            case 6:
                System.out.println("Exorcism Chronicles: Başlangıç");
                System.out.println("Peder Park, doğaüstü kötülüklere inanmayı reddeden bir kilise" +
                                   "adına düzenlediği şeytan çıkarma ayinlerinin ardından aforoz " +
                                   "edilen bir doktorken, rahip olmaya karar verir. Bir gün, eski" +
                                   " dostu olan, gizli büyülerle uğraşan bir tapınak keşişi ondan" +
                                   "yardım ister. Görevi, saf ama olağanüstü güçlere sahip bir çocuğu" +
                                   "şeytani bir efendiden korumaktır. Peder Park, bu mücadelede yalnızca" +
                                   "karanlık güçlerle değil, kendi geçmişiyle de yüzleşmek zorunda kalır.\n");
            case 7:
                System.out.println("Komşum Totoro");
                System.out.println("Komşum Totoro'da anneleri, isimlendirmeyen ve uzun süreli bir hastalığa" +
                                   "yakalandığında ona daha yakın olmak için yattığı hastanenin yakınındaki" +
                                   "eski bir eve taşınmak isteyen iki küçük kız, bir profesör olan babalarını" +
                                   "da ikna edip bu kırsal yere taşınırlar. Küçük kızlar Satsuki ve Mei zamanla" +
                                   "evin içerisinde onlarla birlikte yaşamakta olan, bazı varlıkların olduğunu " +
                                   "fark ederler. Bu varlıklardan bir şekilde kurtulduklarında, evlerinin karşısındaki" +
                                   "ormanda karşılaştıkları büyüleyici varlıklar iki kardeşi büyülü bir dünyanın " +
                                   "içerisine sürüklerler.\n" +
                                    "\n");

            case 8:
                System.out.println("Yürüyen Şato");
                System.out.println("Yürüyen Şato, kendisine yapılan büyünün etkisini yok etmeye çalışan " +
                                   "genç bir kızın hikayesini anlatıyor. Sıradan bir genç kız olan Sophie" +
                                   " şeytani bir cadı tarafından büyüyle doksan yaşında bir kadına dönüşür." +
                                   "Sophie artık fazlasıyla yaşlanmış ve çevresi tarafından tanınmaz bir " +
                                   "görünüme bürünmüştür. Bu yüzden büyük bir umutsuzluğa kapılan ve yaşadığı" +
                                   "yeri terk etmek zorunda kalan Sophie, Howl isimli yürüyen bir şatoda yaşayan" +
                                   "bir büyücünün yanına yerleşir.\n");
            case 9:
                System.out.println("Persona");
                System.out.println("Dönemin en gözde tiyatro oyuncusu, güzeller güzeli Elisabeth Vogler," +
                                   "önemli bir piyes sırasında aniden susar. Şaşkına dönen insanlar ne " +
                                   "olup bittiğini anlayabilmek için ellerinden geleni yapsalar da Vogler" +
                                   "konuşmamaya devam eder. Son çare olarak bir kliniğe yatırılan kadın" +
                                   "burada da dilsizliğine devam eder. Bedeninde tıbbi olarak hiçbir problem" +
                                   "bulunamayan kadın, doktorun tavsiyesiyle gözden uzak bir yazlığa gönderilir.\n");
            case 10:
                System.out.println("Çocuk ve Balıkçıl");
                System.out.println("Çocuk ve Balıkçıl, İkinci Dünya Savaşı sırasında geçiyor ve küçük Mahito’yu" +
                                   "izliyor. Annesini kaybeden Mahito, alelacele babasının yanına taşraya taşınmak" +
                                   "zorunda kalır. Burada terk edilmiş bir kulenin civarında oynar, gri bir balıkçıl" +
                                   "kuşu sürekli karşısına çıkar. Kısa süre sonra hiçbir şeyin aslında göründüğü gibi" +
                                   "olmadığını anlar.\n");



        }
    }

}