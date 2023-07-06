package uz.gita.Programming_language;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Info extends AppCompatActivity {
    private TextView textView;
    private TextView textDescription;
    private ImageView imageLogo;
    private AppCompatImageView btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        loadDate();
        btnBack.setOnClickListener(view -> {
            finish();
        });

    }

    private void loadDate() {
        textView = findViewById(R.id.txtTitle);
        textDescription = findViewById(R.id.txtDescription);
        imageLogo = findViewById(R.id.imgLogo);
        btnBack = findViewById(R.id.before);

        int position = getIntent().getIntExtra("POSITION", 1);
        switch (position) {
            case 1:
                imageLogo.setImageResource(R.drawable.img_1);
                textView.setText(R.string.cplusplus);
                textDescription.setText(R.string.cplus);
                break;
            case 2:
                imageLogo.setImageResource(R.drawable.javaimg);
                textView.setText(R.string.java);
                textDescription.setText(R.string.javaInfo);
                break;
            case 3:
                imageLogo.setImageResource(R.drawable.pythonimg);
                textView.setText(R.string.python);
                textDescription.setText(R.string.pythonInfo);
                break;
            case 4:
                imageLogo.setImageResource(R.drawable.javascriptimg);
                textView.setText(R.string.javaScript);
                textDescription.setText(R.string.javaScriptInfo);
                break;
            case 5:
                imageLogo.setImageResource(R.drawable.cshharpimg);
                textView.setText(R.string.c);
                textDescription.setText(R.string.cSharpInfo);
                break;
            case 6:
                imageLogo.setImageResource(R.drawable.kotlinimg);
                textView.setText(R.string.kotlin);
                textDescription.setText(R.string.kotlinInfo);
                break;
            case 7:
                imageLogo.setImageResource(R.drawable.htmlimg);
                textView.setText(R.string.html);
                textDescription.setText(R.string.htmlInfo);
                break;
            case 8:
                imageLogo.setImageResource(R.drawable.goimg);
                textView.setText(R.string.go);
                textDescription.setText(R.string.goInfo);
                break;
            case 9:
                imageLogo.setImageResource(R.drawable.cssimg);
                textView.setText(R.string.css);
                textDescription.setText(R.string.cssInfo);
                break;
            case 10:
                imageLogo.setImageResource(R.drawable.swiftimg);
                textView.setText(R.string.swift);
                textDescription.setText(R.string.swiftInfo);
                break;
        }
    }
}