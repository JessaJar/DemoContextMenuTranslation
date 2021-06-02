package sg.edu.rp.c346.id20014241.democontextmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText, tvTranslatedText2;
    String wordClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
        registerForContextMenu(tvTranslatedText2);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1,1,"Chinese");
        menu.add(0, 2,2,"Malay");
        menu.add(0, 3,3,"Tamil");
        menu.add(0, 4,4,"Italian");

        if (v == tvTranslatedText){
            wordClicked = "Hello";
        }
        else if (v == tvTranslatedText2){
            wordClicked = "Bye";
        }


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 0) {
            Toast.makeText(MainActivity.this, "English Selected", Toast.LENGTH_LONG);
            if (wordClicked.equalsIgnoreCase("Hello")) {
                tvTranslatedText.setText("Hello");
            } else if (wordClicked.equalsIgnoreCase("Bye")) {
                tvTranslatedText2.setText("Bye");
            }
            return true;
        } else if (item.getItemId() == 1) {
            Toast.makeText(MainActivity.this, "Chinese Selected", Toast.LENGTH_LONG);
            if (wordClicked.equalsIgnoreCase("Hello")) {
                tvTranslatedText.setText("你好");
            } else if (wordClicked.equalsIgnoreCase("Bye")) {
                tvTranslatedText2.setText("再见");
            }
            return true;
        } else if (item.getItemId() == 2) {
            Toast.makeText(MainActivity.this, "Malay Selected", Toast.LENGTH_LONG);
            if (wordClicked.equalsIgnoreCase("Hello")) {
                tvTranslatedText.setText("Hello");
            } else if (wordClicked.equalsIgnoreCase("Bye")) {
                tvTranslatedText2.setText("selamat tinggal");
            }
            return true;
        } else if (item.getItemId() == 3) {
            Toast.makeText(MainActivity.this, "Tamil Selected", Toast.LENGTH_LONG);
            if (wordClicked.equalsIgnoreCase("Hello")) {
                tvTranslatedText.setText("வணக்கம்");
            } else if (wordClicked.equalsIgnoreCase("Bye")) {
                tvTranslatedText2.setText("வருகிறேன்");
            }
            return true;
        } else if (item.getItemId() == 4){
            Toast.makeText(MainActivity.this, "Italian Selected", Toast.LENGTH_LONG);
            if (wordClicked.equalsIgnoreCase("Hello")) {
                tvTranslatedText.setText("Ciao");
            } else if (wordClicked.equalsIgnoreCase("Bye")) {
                tvTranslatedText2.setText("Addio");
            }
            return true;
        }
        return super.onContextItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //menut.add(0, 0, 100, "English");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}