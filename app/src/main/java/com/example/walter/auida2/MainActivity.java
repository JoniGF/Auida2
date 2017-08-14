package com.example.walter.auida2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity {
     ExpandableListView expandableListView;
     Adapter adapter;
    RelativeLayout rl1, rl2;
    TextView txt;
    ImageButton bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl1 = (RelativeLayout)findViewById(R.id.rl1);
        rl2 = (RelativeLayout)findViewById(R.id.rl2);

        txt=(TextView)findViewById(R.id.txt);
        bt=(ImageButton) findViewById(R.id.volver);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl1.setVisibility(View.VISIBLE);
                rl2.setVisibility(View.INVISIBLE);
                bt.setVisibility(View.INVISIBLE);
            }
        });

        expandableListView = (ExpandableListView) findViewById(R.id.list_item);
        expandableListView.setGroupIndicator(null);
        setItems();
        setListener();
    }
    public void setItems(){

        ArrayList<String> header = new ArrayList<String>();

        List<String> child1 = new ArrayList<String>();
        List<String> child2 = new ArrayList<String>();
        List<String> child3 = new ArrayList<String>();
        List<String> child4 = new ArrayList<String>();

        HashMap<String, List<String>> hashMap = new HashMap<>();

        header.add("Teoria");
        header.add("Test");
        header.add("Preguntas Frecuentes");
        header.add("Registro");

        child1.add("Teoria del examen");
        child2.add("Simulador");

        String[] preguntas = getResources().getStringArray(R.array.preguntas);

        for (int i=0; i<=9; i++){
            child3.add(preguntas[i]);
        }

        child4.add("Registro de Berazategui");

        hashMap.put(header.get(0), child1);
        hashMap.put(header.get(1), child2);
        hashMap.put(header.get(2), child3);
        hashMap.put(header.get(3), child4);

        adapter = new Adapter(MainActivity.this, header, hashMap);
        expandableListView.setAdapter(adapter);
    }

    public void setListener(){


       /* expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView listview, View view,int group_pos, long id) {

                Toast.makeText(MainActivity.this,"You clicked : " + adapter.getGroup(group_pos),Toast.LENGTH_SHORT).show();

                return false;
            }
        });*/


        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)

                            expandableListView.collapseGroup(previousGroup);

                        previousGroup = groupPosition;
                    }
                });


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView listview, View view,int groupPos, int childPos, long id) {
                switch (groupPos){
                    case 0:
                        switch (childPos){
                            case 0:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.teoria);
                                break;
                        }
                        break;
                    case 1:
                        switch (childPos){
                            case 0:
                                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                                startActivity(intent);
                                break;
                        }
                        break;
                    case 2:
                        switch (childPos){
                            case 0:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta1);
                                break;
                            case 1:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta2);
                                break;
                            case 2:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta3);
                                break;
                            case 3:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta4);
                                break;
                            case 4:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta5);
                                break;
                            case 5:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta6);
                                break;
                            case 6:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta7);
                                break;
                            case 7:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta8);
                                break;
                            case 8:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta9);
                                break;
                            case 9:
                                rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(R.string.pregunta10);
                                break;
                        }
                        break;
                    case 3:
                        switch (childPos){
                            case 0:
                                Uri uri = Uri.parse("http://berazategui.eregulations.org/procedure/7/7/step/15?l=es");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);
                                /*rl1.setVisibility(View.INVISIBLE);
                                rl2.setVisibility(View.VISIBLE);
                                bt.setVisibility(View.VISIBLE);
                                txt.setText(Html.fromHtml( "<a href='http://berazategui.eregulations.org/procedure/7/7/step/15?l=es'>Registro de berazategui</a>" ));
                                txt.setMovementMethod(LinkMovementMethod.getInstance());*/
                                break;
                        }
                }
                return false;
            }
        });
    }
}
