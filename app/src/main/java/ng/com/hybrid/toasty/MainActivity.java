package ng.com.hybrid.toasty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    Button warning,error,success;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        warning = findViewById(R.id.warning);
        error = findViewById(R.id.error);
        success = findViewById(R.id.success);

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.warning(getApplicationContext(),"This is a warning toast", Toast.LENGTH_SHORT,true).show();

            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(getApplicationContext(),"This is a error toast", Toast.LENGTH_SHORT,true).show();
            }
        });

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(getApplicationContext(),"This is a success toast", Toast.LENGTH_SHORT,true).show();
            }
        });
    }
}
