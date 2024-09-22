package com.example.practic2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // определяем слушателя нажатия элемента в списке
        StateAdapter.OnStateClickListener stateClickListener = new StateAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(State state, int position) {

                Toast.makeText(getApplicationContext(), "Описание страны " + state.getName() + ": " + state.GetDescription(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states, stateClickListener);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Китай", "Пекин","Китай – густонаселенная страна в Восточной Азии с разнообразными ландшафтами и рельефом. Здесь можно найти луга, пустыни, горы, озера, реки и побережья протяженностью более 14 тыс. км. Столица страны, Пекин, славится современной архитектурой и древними памятниками, среди которых дворцовый комплекс Запретный город и площадь Тяньаньмэнь." ,R.drawable.china));
        states.add(new State ("Россия", "Москва","Российская Федерация — самое большое по площади государство на Земле, занимает 1/9 часть суши. Это страна с многовековой историей, богатыми традициями и щедрой природой. Она находится на девятом месте в мире по количеству памятников ЮНЕСКО, всего их здесь 31." ,R.drawable.russia));
        states.add(new State ("США", "Вашингтон","Соединенные Штаты Америки – государство, состоящее из 50 штатов, занимает значительную часть Северной Америки. Штат Аляска расположен на северо-западе континента, а Гавайи – в Тихом океане. К крупным городам атлантического побережья относятся Нью-Йорк и столица Вашингтон." ,R.drawable.usa));
        states.add(new State ("Великобритания", "Лондон", "Великобритания (официальное название – Соединенное Королевство Великобритании и Северной Ирландии) – островное государство на северо-западе Европы, состоящее из Англии, Шотландии, Уэльса и Северной Ирландии. ",R.drawable.grtbrt));
    }
}