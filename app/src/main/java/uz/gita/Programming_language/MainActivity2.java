package uz.gita.Programming_language;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private ConstraintLayout cPluPlus;
    private ConstraintLayout java;
    private ConstraintLayout python;
    private ConstraintLayout javascript;
    private ConstraintLayout csharp;
    private ConstraintLayout kotlin;
    private ConstraintLayout html;
    private ConstraintLayout go;
    private ConstraintLayout css;
    private ConstraintLayout swift;
    private AppCompatImageButton info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();

        cPluPlus.setOnClickListener(view -> {
            openInfo(1);
        });
        java.setOnClickListener(view -> {
            openInfo(2);
        });
        python.setOnClickListener(view -> {
            openInfo(3);
        });
        javascript.setOnClickListener(view -> {
            openInfo(4);
        });
        csharp.setOnClickListener(view -> {
            openInfo(5);
        });
        kotlin.setOnClickListener(view -> {
            openInfo(6);
        });
        html.setOnClickListener(view -> {
            openInfo(7);
        });
        go.setOnClickListener(view -> {
            openInfo(8);
        });

        css.setOnClickListener(view -> {
            openInfo(9);
        });

        swift.setOnClickListener(view -> {
            openInfo(10);
        });

        info.setOnClickListener(view -> {
            openAbout();
        });
    }

    private void openInfo(int number) {
        Intent intent = new Intent(this, Info.class);
        intent.putExtra("POSITION", number);
        startActivity(intent);
    }

    private void openAbout() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_about);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        dialog.show();

        AppCompatButton btnBack = dialog.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> {
            dialog.dismiss();
        });
    }

    private void initView() {
        cPluPlus = findViewById(R.id.cPlusPlus);
        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        javascript = findViewById(R.id.javaScript);
        csharp = findViewById(R.id.cSharp);
        kotlin = findViewById(R.id.kotlin);
        html = findViewById(R.id.html);
        go = findViewById(R.id.go);
        info = findViewById(R.id.btnInfo);
        css = findViewById(R.id.css);
        swift = findViewById(R.id.swift);
    }
}