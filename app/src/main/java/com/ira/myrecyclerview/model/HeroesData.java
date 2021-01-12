package com.ira.myrecyclerview.model;

import com.ira.myrecyclerview.R;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Soekarno",
            "Moh. Hatta",
            "Ki Hajar Dewantoro",
            "Cut Nyak Dien",
            "Soedirman"
    };

    private static String[] heroDetails = {
            "Dr.Ir. H. Soekarno, nama lahir: Koesno Sosrodihardjo, lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun, adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
            "Dr.Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, 12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun) adalah tokoh pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang pertama. Ia bersama Soekarno memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia juga pernah menjabat sebagai Perdana Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Hatta juga dikenal sebagai Bapak Koperasi Indonesia.",
            "Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat, sejak 1922 menjadi Ki Hadjar Dewantara, EBI: Ki Hajar Dewantara, beberapa menuliskan bunyi bahasa Jawanya dengan Ki Hajar Dewantoro; lahir di Pakualaman, 2 Mei 1889 – meninggal di Yogyakarta, 26 April 1959 pada umur 69 tahun, adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikan bagi kaum pribumi Indonesia dari zaman penjajahan Belanda.",
            "Cut Nyak Dien lahir di Lampadang, Kerajaan Aceh. Tidak diketahui dengan jelas tanggal lahir dari Cut Nyak Dien. Tapi ia diketahui lahir pada tahun 1848. Cut Nyak Dien dilahirkan dari keluarga bangsawan yang taat beragama di Aceh Besar, wilayah VI Mukim pada tahun 1848. Ayahnya bernama Teuku Nanta Setia, seorang uleebalang VI Mukim, yang juga merupakan keturunan Machmoed Sati, perantau dari Sumatera Barat",
            "Jenderal Besar Sudirman ini lahir di Bodas Karangjati, Rembang, Purbalingga, 24 Januari 1916. Ayahnya bernama Karsid Kartawiuraji dan ibunya bernama Siyem. Namun ia lebih banyak tinggal bersama pamannya yang bernama Raden Cokrosunaryo yang merupakan seorang camat setelah diadopsi."
    };

    private static int[] heroesImages = {
            R.drawable.sukarno,
            R.drawable.hatta,
            R.drawable.ki,
            R.drawable.cut,
            R.drawable.sudirman

    };

    public static ArrayList<Hero> getListData() {
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

