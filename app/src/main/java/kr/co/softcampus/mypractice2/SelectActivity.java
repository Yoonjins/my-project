//package kr.co.softcampus.mypractice2;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//public class SelectActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_prestart);
//
//        Button scanStartButton = findViewById(R.id.scan_start_button);
//        BtnListener btnListener = new BtnListener();
//        scanStartButton.setOnClickListener(btnListener);
//    }
//
//    class BtnListener implements View.OnClickListener {
//        @Override
//        public void onClick(View view) {
//            Intent intent = new Intent(SelectActivity.this, GuideActivity2.class);
//            startActivity(intent);
//        }
//    }
//}
