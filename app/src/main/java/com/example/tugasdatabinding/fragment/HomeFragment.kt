package com.example.tugasdatabinding.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasdatabinding.DataBerita
import com.example.tugasdatabinding.R
import com.example.tugasdatabinding.adapter.BeritaAdapter
import com.example.tugasdatabinding.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding
    private lateinit var beritaAdapter: BeritaAdapter
    private lateinit var listArrBerita : ArrayList<DataBerita>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listArrBerita = arrayListOf(
            DataBerita("KPK Tetapkan Bupati Meranti-Kepala BPKAD-Auditor BPK Riau Jadi Tersangka",
                "Jumat, 07 Apr 2023 23:41 WIB", "Anggi Muliawati", "Politik",
                R.drawable.img_berita_ott_kpk, "KPK menetapkan Bupati Kepulauan Meranti Muhammad Adil sebagai tersangka dugaan korupsi pemotongan anggran, gratifikasi jasa travel umrah dan suap pemeriksa keuangan. Selain itu, KPK juga menetapkan Kepala BPKAD Pemkab Kepulauan Meranti, FN dan Auditor BPK Perwakilan Provinsi Riau, MFA, sebagai tersangka.\n" +
                        "Pada kesempatan ini KPK telah menetapkan tiga orang tersangka yaitu pertama MA Bupati Kabupaten Kepulauan Meranti periode 2021-2024, kemudian FN, ini kepala BPKAD Pemkab Kepulauan Meranti sekaligus kepala cabang PT TN, kemudian MFA auditor BPK Perwakilan Provinsi Riau, kata Wakil Ketua KPK Alexander Marwata dalam konferensi persnya, Jumat (7/4/2023).\n" +
                        "Bupati juga menerima potongan uang persediaan dan ganti uang persediaan serta penerimaan lainnya tahun 2021 sampai 2023, juga cukup besar, kata Ketua KPK Firli Bahuri dalam keterangannya, Jumat (7/4)."),
            DataBerita("Soal Penolakan Israel di AWBG, Okto: Berikan Solusi!","Kamis, 06 Apr 2023 02:37 WIB", "Randy Prasatya", "Sport",
                R.drawable.img_berita_penolakan_awbg, "Kontingen Israel berpotensi ditolak kehadirannya di ANOC World Beach Games (AWBG). Ketua Komite Olimpiade Indonesia (NOC), Raja Sapta Oktohari, berharap diberikan solusi.\n AWBG dijadwalkan bergulir di Bali pada 5-12 Agustus 2023. Pesta olahraga pantai ini akan dihadiri 205 negara dan Israel di antaranya \n+" +
                        "Terkait hal tersebut, Israel ditakuti ditolak khalayak banyak di Indonesia. Situasi tersebut sempat juga terjadi pada ajang Piala Dunia U-20, yang berimbas dicabutnya status tuan rumah Indonesia oleh FIFA. \n +" +
                        "Memang pada konstitusi dan juga Permenlu Nomor 3 tahun 2029 melarang untuk mengibarkan bendera dan lagu kebangsaan Israel sebagai satu entitas di Indonesia. Tetapi, perlu diingat bahwa olahraga itu sebagai alat pemersatu bangsa dan juga memiliki misi mengangkat martabat bangsa. \n +" +
                        "Okto hanya bisa berharap ada solusi yang diberikan sehingga ANOC World Beach Games 2023 bisa berlangsung dan tidak lagi menimbulkan kemelut. Apalagi, Indonesia sudah terikat kontrak dengan ANOC."),
            DataBerita("Dua Kali Beruntun Gagal Podium, Ada Apa Fabio Quartararo?", "Rabu, 05 Apr 2023 13:30 WIB", "Afif Farhan", "Sport", R.drawable.img_berita_fabio, "Dua kali awal balapan MotoGP kali ini, sejak tahun 2019 untuk pertama kalinya Fabio Quartararo gagal naik podium. Ada apa dengan rider Yamaha itu? \n" +
                    "MotoGP 2023 jadi awal yang aneh buat Fabio Quartararo. Dirinya gagal naik podium, malah finis di luar peringkat lima besar dalam dua balapan awalnya! El Diablo finis kedelapan di MotoGP Portugal. Lalu, dirinya finis ketujuh di MotoGP Argentina. \n" +
                    "Dilansir dari Crash, Fabio Quartararo sejatinya dapat motor baru dari Yamaha yakni Yamaha YZR-M1 2023. Sayangnya, sepertinya masih ada saja masalahnya. \n" +
                    "'Saya tahu masih banyak pekerjaan yang harus dilakukan untuk menjadi yang teratas,' ujarnya. 'Saya pikir kami akan memiliki knalpot untuk dicoba yang sepertinya sedikit lebih baik dan beberapa aero yang menurut saya sangat penting untuk saat ini. Kami menggunakan beberapa barang yang sangat tua, tetapi kami perlu menemukan cara untuk meningkatkannya,' sambungnya"),
            DataBerita("Ternyata Ini yang Bikin WHO Pantau Ketat Varian Arcturus, Sudah Ada di 22 Negara", "Jumat, 07 Apr 2023 18:02 WIB",
                "Suci Risanti Rahmadania", "Health", R.drawable.img_berita_arcturus, "Organisasi Kesehatan Dunia (WHO) memantau ketat COVID-19 varian Arcturus atau subvarian Omicron XBB 1.16. Pasalnya, subvarian tersebut diduga sebagai 'biang kerok' COVID-19 di India melonjak tinggi.\n " +
                        "Dikutip dari Livermint, India melaporkan 4.435 kasus baru COVID-19 dan menjadikan beban kasus aktif meningkat menjadi 21.091 kasus, menurut data Kementerian Kesehatan setempat yang diperbarui pada 5 April 2023. Kasus COVID-19 baru di India ini merupakan kenaikan satu hari tertinggi dalam 163 hari.\n" +
                        "'Sebagian besar sequence-nya berasal dari India dan di India XBB.1.16 telah menggantikan varian lain yang beredar. Jadi, ini salah satu yang harus diperhatikan,' pemimpin teknis COVID-19 WHO, Dr Maria Van Kerkhove, dikutip dari laman resmi WHO. \nSelain India, subvarian Omicron baru itu saat ini dilaporkan sudah terdeteksi di 22 negara, termasuk Singapura hingga Amerika Serikat."),
            DataBerita("Makin Banyak Dipakai, Aplikasi Ojol Geber Keamanan Data", "Jumat, 07 Apr 2023 19:59 WIB", "Sylke Febrina Laucereno",
                "Economy", R.drawable.img_berita_apk_gojek, "Transportasi berbasis aplikasi kini makin diminati oleh masyarakat Indonesia. Karena itu dibutuhkan keamanan dan kenyamanan agar pengguna mendapatkan pengalaman yang menyenangkan. \n" +
                        "Keamanan menjadi faktor yang sangat krusial, terutama untuk para pengguna. Salah satu penyedia layanan transportasi online, inDrive menggandeng Shield untuk meningkatkan fitur keamanan pada aplikasi. \n" +
                        "Dengan teknologi SHIELD, inDrive menghilangkan ketidakadilan dan ketidakadilan dengan memastikan bahwa negosiasi dan harga tetap transparan. Pengguna yang tidak jujur dan curang dijauhkan dari platform inDrive, mencegah mereka menyebabkan masalah seperti kenaikan harga yang tidak beralasan. \n" +
                        "Sementara itu, inDrive juga melakukan program uji coba untuk meningkatkan keselamatan dan pengalaman pengguna dengan program baru, seperti modul Safety+ dan Top Driver Club. \n" +
                        "Business Development Manager inDrive, Georgy Malkov, menjelaskan, keselamatan tetap menjadi salah satu pilar utama perusahaan ingin memberikan layanan berkualitas dan tepercaya kepada pengguna.\n" +
                        "'Kami terus berupaya meningkatkan layanan inDrive dengan memfokuskan upaya kami pada pengembangan program layanan yang lebih baik untuk memberikan peningkatan keamanan dan kenyamanan bagi pengguna inDrive saat memesan layanan ride-hailing,' kata dia dalam keterangannya, Jumat (7/4/2023)."),
            DataBerita("Gegara Jualan 'Tahu Busuk', Penjual Ini Dikejar dan Diusir Polisi", "Jumat, 07 Apr 2023 19:00 WIB", "Sonia Basoni",
                "Kuliner", R.drawable.img_tahu_busuk, "Gegara jualan camilan tahu busuk atau stinky tofu khas Taiwan. Penjual makanan di Malaysia ini dikejar-kejar sampai diusir oleh polisi. \n" +
                        "Malaysia tak hanya kaya akan kuliner khas Melayunya saja, tapi juga sentuhan kuliner China yang populer di sana. Seperti camilan stinky tofu atau yang dikenal juga dengan nama 'chou doufu' atau 'tahu bau' khas China yang populer di Taiwan. \n" +
                        "Biasanya tahu ini disajikan dengan macam-macam campuran bumbu, tergantung masing-masing tempat. Karena baunya yang menyengat, ada yang menyebut jika penjual stinky tofu bisa dicari hanya dengan menggunakan indera penciuman. Bahkan saking baunya, ada yang menjuluki stinky tofu dengan sebutan baby poo alias kotoran bayi. \n" +
                        "Dilansir dari WOB (06/04), aroma busuk yang menyengat inilah, yang membuat penjual stinky tofu di Kluang, Malaysia harus berurusan dengan polisi. Lewat curhatan di akun Facebooknya, Leon menjelaskan dirinya sempat ditegur dan diusir polisi setempat."),
            DataBerita("Bocoran Harga Mobil Listrik Mini Ala Jimny dari Wuling", "Jumat, 07 Apr 2023 09:15 WIB", "Ridwan Arifin", "Otomotif", R.drawable.img_wuling, "Perusahaan patungan SAIC-GM-Wuling (SGMW) bakal meluncurkan mobil listrik mungil ala SUV di China. Namanya Baojun Yep! kabarnya harga mobil listrik ini mepet-mepet dengan mobil listrik kecil Wuling Bingo yang sudah meluncur lebih dulu. \n" +
                    "Baojun Yep akan diperkenalkan pada Shanghai Auto Show pada 18 April 2023 nanti. Sedangkan pengiriman ke konsumen dijadwalkan pada Mei. \n" +
                    "Secara tampilan, tampang dari Baojun Yep ini terkesan seperti SUV mini yang compact. Kesan futuristis juga terpancar dari penggunaan lampu depan lima LED. Pada area moncong juga terdapat 'grille' hitam dengan logo Baojun di tengahnya. \n" +
                    "Baojun Yep memiliki konfigurasi empat tempat duduk. Secara dimensi Baojun Yep punya panjang 3.381 mm, lebar 1685 mm, dan tinggi 1.721 mm, lalu Baojun punya jarak sumbu roda 2110 mm. \n" +
                    "Secara ukuran Baojun Yep memang lebih kecil ketimbang Suzuki Jimnya yang memiliki panjang 3.985 mm, lebar 1.645 mm, tinggi 1.720 mm, dan sumbu roda 2.250 mm. \n" +
                    "Mobil listrik ini dilengkapi dengan motor listrik tunggal yang terletak di bagian belakang, dan dapat menghasilkan tenaga maksimum 68 tenaga kuda (atau 50 kW) dan menghasilkan torsi puncak 140 Nm. \n" +
                    "Mobil tersebut dapat mencapai kecepatan tertinggi 100 kilometer per jam. Selain penggerak roda belakang yang bakal meluncur, Baojun Yep dengan motor kembar dan penggerak empat roda dikatakan sedang dalam pengembangan dan akan diluncurkan akhir tahun ini.")
        )
        beritaAdapter = BeritaAdapter(requireContext(), listArrBerita)
        binding.rvBerita.adapter = beritaAdapter
        binding.rvBerita.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


    }

}