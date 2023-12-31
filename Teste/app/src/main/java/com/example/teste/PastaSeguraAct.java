package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;

public class PastaSeguraAct extends AppCompatActivity {

    private ArrayList<String> textList;
    private ImageButton menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actpastasegura);

        ImageButton button1 = findViewById(R.id.psbtn1);
        ImageButton button2 = findViewById(R.id.psbtn2);
        ImageButton button3 = findViewById(R.id.psbtn3);
        ImageButton button4 = findViewById(R.id.psbtn4);
        ImageButton button5 = findViewById(R.id.psbtn5);
        ImageButton button6 = findViewById(R.id.psbtn6);
        ImageButton button7 = findViewById(R.id.psbtn7);

        this.menu = (android.widget.ImageButton) this.findViewById(R.id.btnpsmenu);
        this.menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { PastaSeguraAct.this.openMainActivity();
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.psmsg1t1),
                        getString(R.string.psmsg1t2),
                        getString(R.string.psmsg1t3),
                        getString(R.string.psmsg1t4)
                };
                int imageResourceId = R.drawable.imgiconmastery;
                openActivity2(texts, imageResourceId);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.psmsg2t1),
                        getString(R.string.psmsg2t2),
                        getString(R.string.psmsg2t3),
                        getString(R.string.psmsg2t4)
                };
                int imageResourceId = R.drawable.imgiconmastery;
                openActivity2(texts, imageResourceId);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.psmsg3t1),
                        getString(R.string.psmsg3t2),
                        getString(R.string.psmsg3t3),
                        getString(R.string.psmsg3t4)
                };
                int imageResourceId = R.drawable.imgicongambit;
                openActivity2(texts, imageResourceId);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.psmsg4t1),
                        getString(R.string.psmsg4t2),
                        getString(R.string.psmsg4t3),
                        getString(R.string.psmsg4t4)
                };
                int imageResourceId = R.drawable.imgiconmontanha;
                openActivity2(texts, imageResourceId);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.psmsg5t1),
                        getString(R.string.psmsg5t2),
                        getString(R.string.psmsg5t3),
                        getString(R.string.psmsg5t4)
                };
                int imageResourceId = R.drawable.imgiconeu;
                openActivity2(texts, imageResourceId);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.psmsg6t1),
                        getString(R.string.psmsg6t2),
                        getString(R.string.psmsg6t3),
                        getString(R.string.psmsg6t4)
                };
                int imageResourceId = R.drawable.imgiconeu;
                openActivity2(texts, imageResourceId);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.psmsg7t1),
                        getString(R.string.psmsg7t2),
                        getString(R.string.psmsg7t3),
                        getString(R.string.psmsg7t4)
                };
                int imageResourceId = R.drawable.imgicongambit;
                openActivity2(texts, imageResourceId);
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    private void openActivity2(String[] texts, int imageResourceId) {
        Intent intent = new Intent(this, PSmsg1Act.class);
        intent.putExtra("texts", texts);
        intent.putExtra("imageResourceId", imageResourceId);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        hideNavigationBar();
    }

    private void hideNavigationBar() {
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }
}