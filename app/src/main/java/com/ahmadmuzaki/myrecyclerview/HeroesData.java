package com.ahmadmuzaki.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Situs Karangkamulyan",
            "Situ Lengkong Panjalu",
            "Darmacaang",
            "Curug Panganten",
            "Kampung Madu",
            "Puncak Bangku",
            "Kampung Adat Kuta",
            "Wisata Alam Cireong",
            "Sukahaji Waterboom",
            "Astana Gede Kawali"
    };

    private static String[] heroDetails = {
            "Situs Karangkamulyan adalah situs arkeologi yang terletak di Desa Karangkamulyan, Cijeungjing, Ciamis, Jawa Barat. Situs ini merupakan peninggalan dari zaman Kerajaan Galuh. Lokasinya berada di jalan poros Ciamis-Banjar dengan luas 25,5 hektar. Situs ini bercorak Hindu-Sunda. Situs Karangkamulyan merupakan obyek wisata seni budaya yang dikelola oleh pemerintah daerah Kabupaten Ciamis dan telah memiliki pamor hingga mancanegara dengan Gong Perdamaian dunia disimpan dan di rawat di sana.",
            "Situ Lengkong merupakan suatu danau yang memiliki luas 57,95 Ha. Konon di kawasan Situ Lengkong dahulunya menjadi pusat pemerintahan Kerajaan Panjalu Ciamis. Terletak di sepanjang tepi utara Panjalu. Sekarang terdapat 3 buah nusa (pulau kecil). Masing-masing digunakan sebagai tempat bangunan istana kerajaan, kepatihan, dan staf kerajaan, juga sebagai taman rekreasi.",
            "Wisata hutan pinus dengan nuansa alam yang asri ternyata masih banyak diminati. Tak hanya ada di Jogja, wisata hutan pinus ini juga ada di Darmacaang, Ciamis. Orang-orang menyebutnya hutan pinus Darmacaang, sesuai dengan nama lokasinya.",
            "Eksotisnya air terjun Panganten di Desa Nasol, Kecamatan Cikoneng Kabupaten Ciamis, Jawa Barat memiliki cerita mitos tersendiri. Untuk namanya disebut Curug Panganten karena curug tersebut ada dua seperti berpasangan.  Namun cerita mitosnya, konon percaya atau tidak, kalau melakukan ritual mandi sambil berzikir di lokasi curug maka tujuan dan keinginan yang diucapkan bisa tercapai.",
            "Di Kabupaten Ciamis ada kampung yang unik dan menarik untuk dikunjungi. Hampir semua warganya budidaya lebah, sehingga dijuluki Kampung Madu. Kampung madu ini tepatnya berada di Dusun Sindangasih, Desa Banjaranyar, Kecamatan Banjaranyar, Kabupaten Ciamis. Bila dari pusat kota jaraknya sekitar 1,5 jam dengan menggunakan kendaraan pribadi. Berada di daerah perbukitan, sehingga akses ke lokasi didominasi tanjakan. Di lokasi ini banyak jenis lebah lokal yang dibudidayakan masyarakat. Sedikitnya ada 10 spesies lebah, yakni lebah trigona, itama atau teuweul, leviset, lebah hutan atau Odeng, lebah matahari, nyiruan dan berbagai jenis lainnya yang belum diketahui.",
            "Puncak bangku adalah destinasi wisata berjuluk \"Negeri di Atas Awan\" begitu diminati wisatawan zaman now. Akitivitas wisatawan yang dapat dilakukan disana yaitu menikmati keindahan panorama awan tak selalu harus naik atau mendaki gunung. Letak Puncak Bangku yaitu di Desa Situmandala, Kecamatan Rancah, Kabupaten Ciamis, Jawa Barat. Fenomena Negeri di Atas Awan ternyata bisa dinikmati dari perkampungan dan kini dibuat jadi tempat wisata Puncak Bangku.",
            "Ada tiga hal yang setidaknya melekat pada Kampung Kuta hingga selanjutnya dijuluki sebagai kampung adat. Pertama adalah bahan dan bentuk bangunan rumah tinggal penduduknya sama. Kedua, adat istiadatnya masih kental. Ketiga, ada ketua adat yang mengendalikan jalannya adat istiadat.",
            "Sungai Cireong, merupakan objek wisata alam di kabupaten Ciamis, Jawa Barat yang relatif baru. Namun, kehadirannya telah menarik banyak pengunjung dari berbagai daerah sekitar seperti Tasikmalaya, bahkan Cirebon yang terbilang lumayan jauh jalannya. Salah satu yang  ‘dijual’ di objek wisata yang satu ini adalah kejernihan air sungai yang bisa dimanfaatkan untuk menghilangkan penat dan bersuka ria bersama sahabat serta kerabat. Selain itu, kehadiran Warung Wisata yang dibangun baru-baru ini di kawasan Wisata Alam Sungai Cireong memungkinkan para pengunjung untuk membeli oleh-oleh, hingga ngaliwet. Ngaliwet merupakan tradisi orang Sunda yaitu makan nasi liwet bersama-sama di suatu tempat.",
            "Sukahaji Waterboom berlokasikan di jalan Cihaurbeuti desa Sukahaji Kabupaten Ciamis. Dibangun diatas tanah 10.000 m2 dan didesain khusus sebagai Taman Rekreasi Air dan bermain dengan konsep nuansa alam yang eksotik dengan pemandangan Gunung Galunggung.  Berbagai macam aktivitas permainan atraksi Air dan taman bermain anak-anak yang menarik, unik, dan mengasyikkan dan penuh petualangan bagi anak-anak, sampai dengan remaja yang dapat anda nikmati.",
            "Situs Astana Gede merupakan obyek wisata sejarah yang dikelola oleh pemerintah daerah Kabupaten Ciamis merupakan tempat suci pada masa pemerintahan kerajaan Sunda-Galuh di Kawali. Sebagai pusat pemerintahan raja-raja yang pernah bertahta di ternpat ini adalah Prabu Ajiguna Linggawisesa, yang dikenal dengan sebutan Sang Lumahing kiding, Prabu Ragamulya atau Aki Kolot, Prabu Linggabuwana yang gugur pada peristiwa bubat, Rahyang Niskala Wastukancana yang meninggalkan beberapa prasasti di Astana Gede ( Situs Kawali ) dan Dewa Niskala anak dari Rahyang Wastukancana."
    };

    private static int[] heroesImages = {
            R.drawable.karangkamulyan,
            R.drawable.situ_panjalu,
            R.drawable.darmacaang,
            R.drawable.curug_panganten,
            R.drawable.kampung_madu,
            R.drawable.puncak_bangku,
            R.drawable.kampung_adat_kuta,
            R.drawable.cireong,
            R.drawable.sukahaji,
            R.drawable.astana_gede_kawali
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
