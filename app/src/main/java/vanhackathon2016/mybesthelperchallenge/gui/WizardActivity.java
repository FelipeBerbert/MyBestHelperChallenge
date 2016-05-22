package vanhackathon2016.mybesthelperchallenge.gui;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.redbooth.WelcomeCoordinatorLayout;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import vanhackathon2016.mybesthelperchallange.R;

/**
 * Created by Angelo on 21/05/2016.
 */
@EActivity(R.layout.activity_wizard)
public class WizardActivity extends AppCompatActivity {

    @ViewById
    WelcomeCoordinatorLayout coordinator;

    @ViewById
    Button skip;

    @ViewById
    Button done;

    TextView tvHeader1, tvHeader2, tvHeader3;

    @AfterViews
    public void init() {
        coordinator.addPage(
                R.layout.wizard_page_1,
                R.layout.wizard_page_2,
                R.layout.wizard_page_3);

        coordinator.setOnPageScrollListener(new WelcomeCoordinatorLayout.OnPageScrollListener() {
            @Override
            public void onScrollPage(View v, float progress, float maximum) {
            }

            @Override
            public void onPageSelected(View v, int pageSelected) {
                if (pageSelected == 0) {
                    skip.setTextColor(Color.WHITE);
                    done.setVisibility(View.GONE);
                } else if (pageSelected == 1) {
                    skip.setTextColor(Color.BLACK);
                    done.setVisibility(View.GONE);
                } else {
                    skip.setTextColor(Color.WHITE);
                    done.setVisibility(View.VISIBLE);
                }
            }
        });

        tvHeader1 = (TextView) coordinator.findViewById(R.id.tv_header_1);
        tvHeader2 = (TextView) coordinator.findViewById(R.id.tv_header_2);
        tvHeader3 = (TextView) coordinator.findViewById(R.id.tv_header_3);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/BloklettersPotlood.ttf");
        tvHeader1.setTypeface(tf);
        tvHeader2.setTypeface(tf);
        tvHeader3.setTypeface(tf);
    }

    @Click(R.id.skip)
    public void skip() {
        goToQuestionary();
    }

    @Click(R.id.done)
    public void done() {
        goToQuestionary();
    }

    private void goToQuestionary() {
        Intent intent = new Intent(this, QuestionActivity_.class);
        startActivity(intent);
    }

}