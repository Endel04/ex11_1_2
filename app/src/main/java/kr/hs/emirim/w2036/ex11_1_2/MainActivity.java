package kr.hs.emirim.w2036.ex11_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] arr = {"최수빈", "최연준", "최범규", "강태현", "휴닝카이"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list1 = findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, andriod.R.layout.simple_list_item_multiple_choice, arr);
        list1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), arr[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}