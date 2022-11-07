package laborator.doi.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.slider.Slider;

import java.util.HashMap;

public class ColorPanelActivity extends AppCompatActivity {
    Slider red_slider, blue_slider, green_slider;
    LinearLayout linearLayout;
    Button keep_change;
    int red = 0, blue = 0, green = 0;
    public HashMap<String,Integer> colors = new HashMap<String,Integer>();

    public final static String RED = "";
    public final static String GREEN = "";
    public final static String BLUE = "";

    String red_string = "";
    String green_string = "";
    String blue_string = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_panel);

        linearLayout = findViewById(R.id.linearLayout);

        red_slider = findViewById(R.id.red_slider);
        blue_slider = findViewById(R.id.blue_slider);
        green_slider = findViewById(R.id.green_slider);

        keep_change = findViewById(R.id.bt_keep_change);

        red_string = "";
        green_string = "";
        blue_string = "";

        colors.put("red", 0);
        colors.put("blue", 0);
        colors.put("green", 0);


        Intent intent_background = new Intent(this, GameActivity.class);

        red_slider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                linearLayout.setBackgroundColor(Color.red((int) value));
                red = (int)value;
                colors.put("red", (int) value);
                System.out.println(value);
                System.out.println(colors);

            }
        });
        blue_slider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                blue = (int)value;
                linearLayout.setBackgroundColor(Color.blue((int) value));
                colors.put("blue", (int) value);
                System.out.println(value);
                System.out.println(colors);
            }
        });
        green_slider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                green = (int)value;
                linearLayout.setBackgroundColor(Color.green((int) value));
                colors.put("green", (int) value);
                System.out.println(value);
                System.out.println(colors);
            }
        });
        keep_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red_string = "" + red;
                System.out.println("Onclick red = "+ red_string);
                green_string = "" + green;
                blue_string = "" + blue;
                intent_background.putExtra(RED, red_string);
                intent_background.putExtra(GREEN,green_string);
                intent_background.putExtra(BLUE, blue_string);
                startActivity(intent_background);
            }
        });

    }

}