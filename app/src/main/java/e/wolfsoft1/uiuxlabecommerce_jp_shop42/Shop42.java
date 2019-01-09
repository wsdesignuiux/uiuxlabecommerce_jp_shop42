package e.wolfsoft1.uiuxlabecommerce_jp_shop42;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop42.adapter.ColorAdapter_42;
import e.wolfsoft1.uiuxlabecommerce_jp_shop42.adapter.SizeAdapter_42;
import e.wolfsoft1.uiuxlabecommerce_jp_shop42.model.Color_Model;
import e.wolfsoft1.uiuxlabecommerce_jp_shop42.model.Size_Model;

public class Shop42 extends AppCompatActivity {

    private String size[] = {"SL", "X", "XL", "XS", "LS"};
    private Integer color[] = {R.drawable.ic_color42_1, R.drawable.ic_color42_2, R.drawable.ic_color42_3, R.drawable.ic_color42_4, R.drawable.ic_color42_5, R.drawable.ic_color42_6};

    RecyclerView color_recyclerview42, size_recyclerview42;

    ArrayList<Size_Model> size_modelArrayList;
    ArrayList<Color_Model> color_modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop42);

        size_recyclerview42 = findViewById(R.id.size_recyclerview42);
        color_recyclerview42 = findViewById(R.id.color_recyclerview42);

        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model size_model = new Size_Model(size[i]);
            size_modelArrayList.add(size_model);
        }
        color_modelArrayList = new ArrayList<>();

        for (int i = 0; i < color.length; i++) {
            Color_Model color_model = new Color_Model(color[i]);
            color_modelArrayList.add(color_model);
        }

        size_recyclerview42.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_42 sizeAdapter = new SizeAdapter_42(this, size_modelArrayList);
        size_recyclerview42.setAdapter(sizeAdapter);

        color_recyclerview42.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_42 adapter = new ColorAdapter_42(this, color_modelArrayList);
        color_recyclerview42.setAdapter(adapter);
    }
}
