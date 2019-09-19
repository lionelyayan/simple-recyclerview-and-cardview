package com.example.wisatabandung;

import java.util.ArrayList;

public class DataWisata {

    private static String[] namaWisata ={
      "Farm House",
      "Kebun Teh",
      "Pinisi Resto Dan Glamping Lakeside",
      "Gunung Tangkuban Perahu",
      "Kawah Putih",
      "Puncak Bintang",
      "Danau Situ Patenggang",
      "Curug Cimahi",
      "Taman Hutan Raya",
      "Situ Cisanti",
      "Maribaya",
      "Museum Geologi"
    };

    private static String[] detailWisata ={
      "Farm house tepatnya berlokasi di Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Bandung Barat. adalah salah satu destinasi wisata yang sangat direkomendasikan untuk wisatawan yang senang mencari spot untuk foto yang bagus. Dengan desain atmosfer ala eropa, banyak spot unik yang pastinya bakal menarik untuk swafoto/selfie, dan di posting di media sosial.",
      "Kebun Teh Sukawana berada di bawah PTPN VIII, termasuk dalam kebun Bukit unggul, bagian Sukawana. Sebelumnya, area ini dikenal dengan nama ‘pangheotan‘. Katanya, nama ini berasal dari nama Van Houten, seorang meneer Belanda yang memiliki perkebunan disini. Tempat ini juga sangat rekomendasi untuk foto dengan suasana alam yang hijau.",
      "Pinisi Resto Dan Glamping Lakeside Rancabali ini adalah salah satu tempat wisata Bandung selatan. Tempat wisata yang bisa dikatakan cukup mahal ini memiliki fasilitas yang lengkap, seperti tempat parkir yang luas, toilet yang banyak dan banyak spot tempat makan dan cinderamata juga. Selain itu disini juga banyak terdapat spot menarik untuk dinikmati.",
      "Gunung Tangkuban Perahu terletak di perbatasan Bandung barat dan subang, tepatnya setelah cikole Lembang adalah salah satu objek wisata paling populer di daerah Bandung dan sekitarnya dan hampir menjadi kewajiban wisatawan jika berlibur ke Bandung. Terkenal karena legenda jawab barat tentang terbentuknya gunung ini menjadi faktor utama wisatawan untuk mendatangi Gunung tangkuban perahu.",
      "Kawah Putih terletak di daerah Bandung selatan, setelah Ciwidey. Terletak kira-kira 50 KM dari pusat kota Bandung. Kawah putih ini adalah salah satu pilihan favorit bagi para pencari objek wisata bandung selain gunung tangkuban perahu. Menikmati kawah lebih dekat untuk mengabadikannya adalah tujuan utama, selain itu di sekitar daerah kawah putih terdapat banyak penginapan untuk wisatawan yang mau menginap.",
      "Puncak Bintang Bandung merupakan tempat wisata di Bandung yang relatif terbilang baru. Lokasinya berada di puncak bukit, tidak jauh dari warung daweung atau moko yang sudah lebih dulu dikenal para traveller. Karena itu pula tempat ini sering disebut juga puncak bintang moko atau puncak bintang bukit moko. Terletak di ketinggian 1442 meter diatas permukaan laut, daerah ini terbilang dingin dan sering juga dilingkupi oleh kabut.",
      "Danau Situ Patenggang terletak sekitar 7 km dari lokasi kawah putih, Danau ini juga dikenal karena legenda yang bersangkut paut dengan hubungan cinta. Disebutkan 2 orang titisan Dewa bernama Raden Santang dan Dewi Rengganis yang terpisahkan sekian lama dan kemudian bertemu ditempat yang sekarang dikenal dengan batu cinta, Dewi Rengganis memohon dibuatkan perahu untuk berlayar mereka berdua, dan perahu inilah yang kemudian menjadi pulau di tengah situ patenggang.",
      "Curug Cimahi letaknya di Jl. Kolonel Masturi No.325, Cisarua, Bandung Barat, merupakan tempat wisata yang belum banyak dikunjungi. untuk menuju lokasi curug cimahi, bisa menggunakan banyak jalur alternatif baik dari arah Cimahi, pusat kota Bandung, ataupun dari Lembang. Salah satu akses paling mudah adalah melalui jalur Lembang – Parongpong.",
      "Taman Hutan Raya Juanda adalah salah satu hutan raya yang menjadi kawasan konservasi alam. Awalnya luas hutan raya ini hanya 10 ha saha (1965), tapi sekarang sudah mencapai luas 590 ha dan membentang dari Dago Pakar sampai ke kawasan Maribaya Lembang. Taman Hutan Raya ini dibuka setiap hari mulai pukul 8 pagi hingga pukul 6 sore.",
      "Situ Cisanti danau kecil ini memang masih kalah dengan nama danau atau situ lain di Bandung seperti situ patenggang atau situ cileunca. Meskipun demikian, ternyata tempatnya ga kalah indah lho. Bahkan dalam beberapa hal bisa dikatakan lebih adem.",
      "Maribaya Letaknya kurang lebih 6 KM dari pasar Lembang, atau kurang lebih 14 KM dari pusat kota (Gedung Sate). Letaknya memang tidak begitu jauh dari kota, namun suasananya cukup kontras; hijau, dan segar. Dengan harga tiket yang cukup mahal sebanding dengan area-area yang ada di dalamnya yang lumayan banyak dan tak kalah instagramable dari objek wisata lain.",
      "Museum Geologi, Dari sekian banyak museum yang ada di Indonesia, salah satu nya yang tertua adalah museum geologi bandung. Di tempat ini banyak menyimpan fosil sejarah jaman purba dan pengetahuan tentang geologi. Jika kita ingin aktifitas wisata kita bukan sekedar senang senang semata, tapi juga sekaligus menambah wawasan tentang ilmu pengetahuan, kunjungi museum ini."
    };

    private static int[] fotoWisata ={
        R.drawable.farmhouse,
        R.drawable.kebunteh,
        R.drawable.pinisiresto,
        R.drawable.tangkubanperahu,
        R.drawable.kawahputih,
        R.drawable.puncakbintang,
        R.drawable.situpatenggang,
        R.drawable.curugcimahi,
        R.drawable.tamanhutanraya,
        R.drawable.situcisanti,
        R.drawable.maribaya,
        R.drawable.museumgeologi
    };

    static ArrayList<model> getListData(){
        ArrayList<model> list = new ArrayList<>();
        for (int position = 0; position < namaWisata.length; position++){
            model mmodel = new model();
            mmodel.setNama(namaWisata[position]);
            mmodel.setDetail(detailWisata[position]);
            mmodel.setFoto(fotoWisata[position]);

            list.add(mmodel);
        }
        return list;
    }
}
