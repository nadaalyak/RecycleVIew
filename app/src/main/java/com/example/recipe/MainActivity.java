package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Pure Alpukat","1 buah pisang ambon matang\n"+
                "1/2 buah alpukat\n" +
                "ASI secukupnya\n"
                ,"Kandungan Gizi : \n",
                "vitamin C, vitamin K, folat, kalium\n" +
                "zat besi, vitamin E, dan vitamin B6.\n" +
                "Efek kombinasi dari nutrisi yang terkandung dalam alpukat \n" +
                "menawarkan manfaat besar sebagai anti-peradangan.\n",R.drawable.chicken_roll));

        recipes1.add(new Recipes("Puree Jagung Manis, Tahu dan Telur","30 gr jagung manis pipil\n" +
                "15 gram tahu putih\n" +
                "25 gram telur\n" +
                "1 siung bawang putih\n"
               ,"Kandungan Gizi :","mengandung karbohidrat kompleks\n" +
                "vitamin B, vitamin C, dan vitamin D\n"+
                "serta asam lemak omega-3 sebagai nutrisi esensial yang dibutuhkan otak\n",R.drawable.donut1));
        recipes1.add(new Recipes("Bubur Daging Tofu Tomat","1 set Promina Homemade ayam Brokoli 50 gr \n" +
                "daging sapi cincang 1 buah\n" +
                "tahu ukuran kecil 1 lembar daun salam \n" +
                "2 bawang putih cincang dan 1/2 buah tomat cincang \n" +
                "1 sdm minyak 200 ml air\n","Kandungan Gizi",
                "Tiap 100 gram tomat mengandung kalori 20 kal\n" +
                "protein 1 gram, lemak 0,3 gram, karbohidrat 4,2 gram\n" +
                "kalsium 5 miligram, karoten (vitamin A) 1500 SI, thiamin (vitamin B) 60 mikrogram\n" +
                "asam Askorbat (vitamin C) 40 miligram, fosfor 27 miligram, zat besi 0,5 miligram, potassium 360 miligram\n",R.drawable.dosa1));
        recipes1.add(new Recipes("Nasi Tim Ikan Salmon","2 iris ikan salmon dan 4 sdm beras\n" +
                "2 sdm wortel kukus yang sudah dicincang\n" +
                "1 siung bawang putih dan merah\n" +
                "½ tomat kupas dan 1 buah keju balok\n" +
                "500 ml air dan Garam gula secukupnya\n"
                ,"Kandungan Gizi",
                "kalium, selenium, dan vitamin B12\n"+
                "asam lemak omega-3\n"+
                "asam EPA (eicosapentaenoic acid) dan DHA\n",R.drawable.pancakes));
        recipes1.add(new Recipes("Pasta","150 gram macaroni\n" +
                "4 lembar smoked beef, potong dadu\n" +
                "1 bonggol kecil brokoli, potong per kuntum\n" +
                "2 sdm butter dan 80 gram keju cheddar parut\n" +
                "50 gram keju mozarella\n" +
                "300 ml susu cair plain\n" +
                "2 sdm tepung terigu\n" +
                "1/2 bawang bombay, cincang halus\n" +
                "1 sdt parsley cincang\n" +
                "Garam, gula, dan lada bubuk secukupnya\n","Kandungan Gizi",
                "Makanan pasta khas Italia yang mengandung 16% protein dan sedikit kandungan lemak\n" +
                " mengandung 80% karbohidrat yang dibutuhkan untuk tumbuh kembang\n" ,R.drawable.pasta1));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
