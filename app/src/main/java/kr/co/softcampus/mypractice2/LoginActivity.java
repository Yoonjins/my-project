package kr.co.softcampus.mypractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button logButton = findViewById(R.id.loginButton);
        LoginActivity.BtnListener listener1 = new LoginActivity.BtnListener();
        logButton.setOnClickListener(listener1);
    }

    class BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(LoginActivity.this, SubActivity.class);
            startActivity(intent);
        }
    }
}