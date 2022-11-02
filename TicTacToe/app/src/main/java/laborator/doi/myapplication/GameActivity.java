package laborator.doi.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.WrappedDrawable;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    Toolbar toolbar;
    TextView turn;
    Button bt_zero_zero, bt_zero_one, bt_zero_two,
            bt_one_zero, bt_one_one, bt_one_two,
            bt_two_zero, bt_two_one, bt_two_two;
    Button colorPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        constraintLayout = findViewById(R.id.game_background);
        toolbar = findViewById(R.id.toolbar);
        turn = findViewById(R.id.turn);
        bt_zero_zero = findViewById(R.id.bt_zero_zero);
        bt_zero_one = findViewById(R.id.bt_zero_one);
        bt_zero_two = findViewById(R.id.bt_zero_two);
        bt_one_zero = findViewById(R.id.bt_one_zero);
        bt_one_one = findViewById(R.id.bt_one_one);
        bt_one_two = findViewById(R.id.bt_one_two);
        bt_two_zero = findViewById(R.id.bt_two_zero);
        bt_two_one = findViewById(R.id.bt_two_one);
        bt_two_two = findViewById(R.id.bt_two_two);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.restart:
                Toast.makeText(this,"Reset selected",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.backgroud_color:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.purple_200));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}