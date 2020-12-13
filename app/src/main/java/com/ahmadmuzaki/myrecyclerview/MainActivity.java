package com.ahmadmuzaki.myrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.ahmadmuzaki.myrecyclerview.adapter.CardViewHeroAdapter;
import com.ahmadmuzaki.myrecyclerview.adapter.GridHeroAdapter;
import com.ahmadmuzaki.myrecyclerview.adapter.ListHeroAdapter;
import com.ahmadmuzaki.myrecyclerview.halamandetail.AstanaGedeKawaliActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.CurugPangantenActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.DarmacaangActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.KampungAdatKutaActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.KampungMaduActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.PuncakBangkuActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.SituLengkongPanjaluActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.SitusKarangkamulyanActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.SukahajiWaterboomActivity;
import com.ahmadmuzaki.myrecyclerview.halamandetail.WisataAlamCireongActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();
    private String title = "Destinasi";
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);
        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.karangkamulyan));
        sliderItems.add(new SliderItem(R.drawable.puncak_bangku));
        sliderItems.add(new SliderItem(R.drawable.sukahaji));
        sliderItems.add(new SliderItem(R.drawable.curug_panganten));
        sliderItems.add(new SliderItem(R.drawable.darmacaang));
        sliderItems.add(new SliderItem(R.drawable.situ_panjalu));
        sliderItems.add(new SliderItem(R.drawable.kampung_adat_kuta));
        sliderItems.add(new SliderItem(R.drawable.astana_gede_kawali));
        sliderItems.add(new SliderItem(R.drawable.cireong));
        sliderItems.add(new SliderItem(R.drawable.kampung_madu));

        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setCurrentItem(1,true);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(0));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);

        list.addAll(HeroesData.getListData());
        showRecyclerList();
        setActionBarTitle(title);

    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        GridHeroAdapter gridHeroAdapter = new GridHeroAdapter(list);
        rvHeroes.setAdapter(gridHeroAdapter);

        gridHeroAdapter.setOnItemClickCallback(new GridHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecycleCardView(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        CardViewHeroAdapter cardViewHeroAdapter = new CardViewHeroAdapter(list);
        rvHeroes.setAdapter(cardViewHeroAdapter);
    }

    //Digunakan untuk menganti Title aplikasi saat berganti mode
    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                title = "Destinasi";
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                title = "Destinasi";
                break;
            case R.id.action_cardview:
                title = "Destinasi";
                showRecycleCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void showSelectedHero(Hero hero){
        if (hero.getName() == "Situs Karangkamulyan"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intentAhmadYani = new Intent(MainActivity.this, SitusKarangkamulyanActivity.class);
            startActivity(intentAhmadYani);
        }else if (hero.getName() == "Situ Lengkong Panjalu"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SituLengkongPanjaluActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Darmacaang"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, DarmacaangActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Curug Panganten"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, CurugPangantenActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Kampung Madu"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, KampungMaduActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Puncak Bangku"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, PuncakBangkuActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Kampung Adat Kuta"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, KampungAdatKutaActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Wisata Alam Cireong"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, WisataAlamCireongActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Sukahaji Waterboom"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SukahajiWaterboomActivity.class);
            startActivity(intent);
        }else if (hero.getName() == "Astana Gede Kawali"){
            Toast.makeText(this, "Kamu Memilih " +hero.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, AstanaGedeKawaliActivity.class);
            startActivity(intent);
        }
    }
}