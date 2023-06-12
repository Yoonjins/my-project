package kr.co.softcampus.mypractice2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class StartActivity extends AppCompatActivity {

    private RadioButton r_btn1;
    private RadioButton r_btn2;
    private RadioGroup.OnCheckedChangeListener radioGroupButtonChangeListener;
    private RadioGroup radioGroup;
    private RadioButton r_btn3;
    private RadioButton r_btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_1);

        //라디오 버튼 설정
        r_btn1 = (RadioButton) findViewById(R.id.r_btn1);
        r_btn2 = (RadioButton) findViewById(R.id.r_btn2);
        r_btn3 = (RadioButton) findViewById(R.id.r_btn3);
        r_btn4 = (RadioButton) findViewById(R.id.r_btn4);
        r_btn1.setOnClickListener(radioButtonClickListener);
        r_btn2.setOnClickListener(radioButtonClickListener);
        r_btn3.setOnClickListener(radioButtonClickListener);
        r_btn4.setOnClickListener(radioButtonClickListener);

        //라디오 그룹 설정
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(radioGroupButtonChangeListener);


//        Button listButton1 = findViewById(R.id.list_1);
//        Button listButton2 = findViewById(R.id.list_2);
//        Button listButton3 = findViewById(R.id.list_3);
//        Button listButton4 = findViewById(R.id.list_4);
        Button listButton5 = findViewById(R.id.selectComplete);
//        StartActivity.BtnListener listener1 = new StartActivity.BtnListener();
//        StartActivity.BtnListener listener2 = new StartActivity.BtnListener();
//        StartActivity.BtnListener listener3 = new StartActivity.BtnListener();
//        StartActivity.BtnListener listener4 = new StartActivity.BtnListener();
        StartActivity.BtnListener listener5 = new StartActivity.BtnListener();
//        listButton1.setOnClickListener(listener1);
//        listButton2.setOnClickListener(listener2);
//        listButton3.setOnClickListener(listener3);
//        listButton4.setOnClickListener(listener4);
        listButton5.setOnClickListener(listener5);
    }

    //라디오 버튼 클릭 리스너
    private View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            Toast.makeText(StartActivity.this,
//                    "(주) 하나카드"+ r_btn1.isChecked() +
//                        "(주) 하나증권:" + r_btn2.isChecked() +
//                        "(주) 하나생명"+ r_btn3.isChecked() +
//                        "(주) 하나손해보험" + r_btn4.isChecked(), Toast.LENGTH_SHORT).show();
        }
    };


    class BtnListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(StartActivity.this, GuideActivity2.class);
            startActivity(intent);
        }
    }


}