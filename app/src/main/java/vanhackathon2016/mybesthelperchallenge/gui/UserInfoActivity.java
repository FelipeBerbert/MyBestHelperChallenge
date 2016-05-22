package vanhackathon2016.mybesthelperchallenge.gui;

import android.support.design.widget.Snackbar;
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
public class UserInfoActivity extends AppCompatActivity {

    @ViewById
    WelcomeCoordinatorLayout coordinator;

    TextInputLayout tilUserEmail, tilUserAge;

    TextInputEditText edUserEmail, edUserAge;

    Button submit;

    @AfterViews
    public void init() {
        coordinator.addPage(
                R.layout.user_page_info);

        tilUserEmail = (TextInputLayout) coordinator.findViewById(R.id.til_user_email);
        edUserEmail = (TextInputEditText) coordinator.findViewById(R.id.ed_user_email);
        tilUserAge = (TextInputLayout) coordinator.findViewById(R.id.til_user_age);
        edUserAge = (TextInputEditText) coordinator.findViewById(R.id.ed_user_age);
        submit = (Button) coordinator.findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToQuestions();
            }
        });
    }

    private void goToQuestions() {
        if (edUserEmail.getText() == null || edUserEmail.getText().toString().isEmpty()) {
            tilUserEmail.setError(getString(R.string.msg_error_user_email));
            return;
        }

        if (edUserAge.getText() == null || edUserAge.getText().toString().isEmpty()) {
            tilUserAge.setError(getString(R.string.msg_error_user_age));
            return;
        }

        Snackbar.make(coordinator, getString(R.string.msg_welcome), Snackbar.LENGTH_LONG).show();
    }

}