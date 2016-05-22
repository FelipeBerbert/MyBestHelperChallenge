package vanhackathon2016.mybesthelperchallenge.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.redbooth.WelcomeCoordinatorLayout;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import vanhackathon2016.mybesthelperchallange.R;

@EActivity(R.layout.activity_result)
public class ResultActivity extends AppCompatActivity {

    public static int result;

    @ViewById
    WelcomeCoordinatorLayout coordinator;

    Button btContinue;

    ImageView imgResult;

    TextView tvResult, tvDescription;

    @AfterViews
    public void init() {
        coordinator.addPage(
                R.layout.result_page);

        imgResult = (ImageView) coordinator.findViewById(R.id.img_result);
        tvResult = (TextView) coordinator.findViewById(R.id.tv_result);
        tvDescription = (TextView) coordinator.findViewById(R.id.tv_description);
        btContinue = (Button) coordinator.findViewById(R.id.bt_continue);

        switch (result) {
            case 1:
                tvResult.setText("Happiest Helper");
                tvDescription.setText("");
                imgResult.setBackground(getResources().getDrawable(R.drawable.hh));
                break;
            case 2:
                tvResult.setText("Get things done");
                tvDescription.setText("");
                imgResult.setBackground(getResources().getDrawable(R.drawable.gtd));
                break;
            case 3:
                tvResult.setText("Most reliable");
                tvDescription.setText("");
                imgResult.setBackground(getResources().getDrawable(R.drawable.mr));
                break;
            default:
                tvResult.setText("Like a genie");
                tvDescription.setText("");
                imgResult.setBackground(getResources().getDrawable(R.drawable.lg));
                break;
        }

        btContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                continueProcess();
            }
        });
    }

    private void continueProcess() {
        Intent intent = new Intent(this, UserInfoActivity_.class);
        startActivity(intent);
    }

}