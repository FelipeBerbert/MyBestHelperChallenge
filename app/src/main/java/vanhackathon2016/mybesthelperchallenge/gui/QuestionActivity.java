package vanhackathon2016.mybesthelperchallenge.gui;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import vanhackathon2016.mybesthelperchallange.R;
import vanhackathon2016.mybesthelperchallenge.utils.Utils;

/**
 * Created by Felipe Berbert on 21/05/2016.
 */
@EActivity(R.layout.actv_question)
public class QuestionActivity extends AppCompatActivity {


    @ViewById
    ImageView ivScene;

    @ViewById
    TextView tvQuestion;

    @ViewById
    LinearLayout llBody, llQuestion;

    private int questionProgress;

    @AfterViews
    void init() {
       /* if (Utils.isKitkat())
            TransitionManager.beginDelayedTransition(llQuestion);

        tvQuestion.setText(getString(R.string.question_1));
        ivScene.setVisibility(View.INVISIBLE);
        ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));*/
        ivScene.post(new Runnable() {
            @Override
            public void run() {
                animateRevealShow(ivScene);
                callNextQuestion();
            }
        });

    }

    private void callNextQuestion(){
        questionProgress ++;
        if (Utils.isKitkat())
            TransitionManager.beginDelayedTransition(llQuestion);
        switch (questionProgress){
            case 1:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_1));
                break;
            case 2:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_2));
                break;
            case 3:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_3));
                break;
            case 4:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_4));
                break;
            case 5:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_5));
                break;
            case 6:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_6));
                break;
            case 7:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_7));
                break;
            case 8:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_8));
                break;
            case 9:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_9));
                break;
            case 10:
                ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));
                tvQuestion.setText(getString(R.string.question_10));
                break;

        }
    }


    @TargetApi(21)
    private void animateRevealShow(View viewRoot) {
        int cx = (viewRoot.getLeft() + viewRoot.getRight()) / 2;
        int cy = (viewRoot.getTop() + viewRoot.getBottom()) / 2;
        int finalRadius = Math.max(viewRoot.getWidth(), viewRoot.getHeight());

        Animator anim = ViewAnimationUtils.createCircularReveal(viewRoot, cx, cy, 0, finalRadius);
        viewRoot.setVisibility(View.VISIBLE);
        anim.setDuration(1000);
        anim.setInterpolator(new AccelerateInterpolator());
        anim.start();
    }
}
