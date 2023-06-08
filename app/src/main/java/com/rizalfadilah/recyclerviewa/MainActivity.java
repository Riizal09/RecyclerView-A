package com.rizalfadilah.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albanbia");
        nm.setDeskripsi("Negara ini menggunakan bendera erwarna merah.");
        nm.setUrl("https://cdn.britannica.com/00/6200-004-42B7690E/Flag-Albania.jpg");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Hungary");
        nm.setDeskripsi("Negara ini bernama hungarai dalam bahasa indonesia");
        nm.setUrl("https://cdn.britannica.com/55/1455-004-5897143C/Flag-Hungary.jpg");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Slovenia");
        nm.setDeskripsi("Negara sup-alpen di eropa tengah. Slovenia berbatasan dengan italia di barat.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Flag_of_Slovenia.svg/800px-Flag_of_Slovenia.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Belgium");
        nm.setDeskripsi("namanya belgia dalam bahasa indonesia. negara ini terdapat di eropa.");
        nm.setUrl("https://cdn.britannica.com/08/6408-004-405E272F/Flag-Belgium.jpg");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Negara ini terdapat di sebelah utara negara amerika serikat");
        nm.setUrl("https://cdn.britannica.com/68/7068-004-7848FEB4/Flag-Canada.jpg");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(),negaraModelList);
        _recyclerView1.setAdapter(na);

    }
}