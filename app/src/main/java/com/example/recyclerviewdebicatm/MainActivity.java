package com.example.recyclerviewdebicatm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruits = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        FruitAdapter adapter = new FruitAdapter(this, fruits);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        fruits.add(new Fruit ("Велосипед Ridley Orion",getResources().getString(R.string.desc1), R.drawable.busekle1, getResources().getString(R.string.avalable)));
        fruits.add(new Fruit ("Pro-Lite Trentino Track Bike", getResources().getString(R.string.desc2), R.drawable.busekle1, getResources().getString(R.string.avalable)));
        fruits.add(new Fruit ("Велосипед Zycle PRIME Fix", getResources().getString(R.string.desc3), R.drawable.busekle1, getResources().getString(R.string.unavalable)));
        fruits.add(new Fruit ("Northug Gold", getResources().getString(R.string.desc4), R.drawable.northerngold, getResources().getString(R.string.avalable)));
        fruits.add(new Fruit ("Northug Silver", getResources().getString(R.string.desc5), R.drawable.northerngold, getResources().getString(R.string.unavalable)));
    }

    public void showToast(View view) {
        //создаём и отображаем текстовое уведомление
        TextView textView = (TextView)view.findViewById(R.id.name);
        String text = textView.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
                "Добавлено в корзину: "+ text, Toast.LENGTH_SHORT);
        toast.show();
    }
}