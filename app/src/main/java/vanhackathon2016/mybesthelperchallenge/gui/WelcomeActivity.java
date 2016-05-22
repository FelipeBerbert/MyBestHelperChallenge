package vanhackathon2016.mybesthelperchallenge.gui;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.redbooth.WelcomeCoordinatorLayout;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import vanhackathon2016.mybesthelperchallange.R;

@EActivity(R.layout.activity_welcome)
public class WelcomeActivity extends AppCompatActivity {

    @ViewById
    WelcomeCoordinatorLayout coordinator;

    TextInputLayout tilUserName;

    TextInputEditText edUserName;

    Button start;

    @AfterViews
    public void init() {
        coordinator.addPage(
                R.layout.user_page_name);

        tilUserName = (TextInputLayout) coordinator.findViewById(R.id.til_user_name);
        edUserName = (TextInputEditText) coordinator.findViewById(R.id.ed_user_name);
        start = (Button) coordinator.findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToQuestions();
            }
        });
    }

    private void goToQuestions() {
        if (edUserName.getText() == null || edUserName.getText().toString().isEmpty()) {
            tilUserName.setError(getString(R.string.msg_error_user_name));
            return;
        }

        Intent intent = new Intent(this, QuestionActivity_.class);
        startActivity(intent);
    }

}