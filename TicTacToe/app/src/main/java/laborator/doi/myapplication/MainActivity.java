package laborator.doi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText player_one_name, player_two_name ;
    Button bt_start_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        player_one_name = findViewById(R.id.player_one_name);
        player_two_name = findViewById(R.id.player_two_name);
        bt_start_play = findViewById(R.id.bt_start_play);
    }

    public void startGame(View view)
    {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}