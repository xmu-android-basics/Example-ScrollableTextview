package io.github.xmu_android_basics.scrollabletextviewexample;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView largeText;

    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        largeText = findViewById(R.id.large_text);

        for (i = 0; i < 10; i++) {
            largeText.append("\n" + i + ": Filling text...");
        }

        largeText.setMovementMethod(new ScrollingMovementMethod());
    }

    public void onClick(View view) {
        largeText.append("\n" + i++ + ": More text...");
    }
}
