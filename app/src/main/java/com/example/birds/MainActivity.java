package com.example.birds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener {
    private RecyclerView recycle;
    private ArrayList<BirdModel> birdlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini();
        buildlist();
        recyclerview();
    }

    private void ini(){
        recycle=findViewById(R.id.Recycler);
    }

    private void buildlist(){
      for(int i=0;i<101;i++){
          if(i%4==0){
              BirdModel bird=new BirdModel("Eagle",R.drawable.eagle);
              birdlist.add(bird);
          }
          if(i%4==1) {
              BirdModel bird1 = new BirdModel("Owl", R.drawable.owl);
              birdlist.add(bird1);
          }
          if(i%4==2) {
              BirdModel bird2 = new BirdModel("Crow", R.drawable.crow);
              birdlist.add(bird2);
          }
          if(i%4==3) {
              BirdModel bird3 = new BirdModel("Parrot", R.drawable.parrot11);
              birdlist.add(bird3);
          }
      }
    }
    private void recyclerview() {
        BirdAdapter birdadap = new BirdAdapter(birdlist, this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 4);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(birdadap);
    }

    @Override
    public void onitemclicked(BirdModel birdModel, int position) {
        Toast.makeText(this, birdModel.getName(),Toast.LENGTH_SHORT).show();
    }
}