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
        fruits.add(new Fruit ("Лимон", "Помогает при старости", R.drawable.lemon));
        fruits.add(new Fruit ("Киви", "это не то киви! пожалучта уберите это отсюда!", R.drawable.qiwi));
        fruits.add(new Fruit ("Яблоко", "Красный снаружи, котик внутри", R.drawable.apple));
        fruits.add(new Fruit ("Ананас", "Этот мужчина предлагает вам Ананас. Примешь ли ты его предложение?", R.drawable.pinapple));

    }

    public void showToast(View view) {
        //создаём и отображаем текстовое уведомление
        TextView textView = (TextView)view.findViewById(R.id.name);
        String text = textView.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
                "Выбрано: "+ text, Toast.LENGTH_SHORT);
        toast.show();
    }
}