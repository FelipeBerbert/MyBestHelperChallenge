package vanhackathon2016.mybesthelperchallenge.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import vanhackathon2016.mybesthelperchallange.R;

@EActivity(R.layout.activity_welcome)
public class WelcomeActivity extends AppCompatActivity {

    @Click(R.id.bt_start)
    void start(){
        Intent intent = new Intent(this, QuestionActivity_.class);
        startActivity(intent);
    }

}