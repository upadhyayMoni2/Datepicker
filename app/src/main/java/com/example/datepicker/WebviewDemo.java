package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.example.datepicker.R;

public class WebviewDemo extends AppCompatActivity {

    EditText edit_url;
    Button btn_url;
    WebView web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_demo);

        edit_url = findViewById(R.id.edit_url);
        btn_url = findViewById(R.id.btn_load);
        web_view = findViewById(R.id.web_view);


        btn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = edit_url.getText().toString();

                web_view.getSettings().setLoadsImagesAutomatically(true);
                web_view.getSettings().setJavaScriptEnabled(true);
                web_view.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                web_view.loadUrl(url);

            }
        });
    }
}
