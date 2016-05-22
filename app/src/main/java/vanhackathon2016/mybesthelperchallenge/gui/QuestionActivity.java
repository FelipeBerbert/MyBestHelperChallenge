package vanhackathon2016.mybesthelperchallenge.gui;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

import vanhackathon2016.mybesthelperchallange.R;
import vanhackathon2016.mybesthelperchallenge.models.QuestionModel;
import vanhackathon2016.mybesthelperchallenge.utils.Utils;

/**
 * Created by Felipe Berbert on 21/05/2016.
 */
@EActivity(R.layout.actv_question)
public class QuestionActivity extends AppCompatActivity {

    @Bean
    Utils utils;

    @ViewById
    ImageView ivScene;

    @ViewById
    TextView tvQuestion;

    @ViewById
    Button btAnswer1, btAnswer2, btAnswer3, btAnswer4, btNext;

    @ViewById
    LinearLayout llBody, llQuestion;

    @ViewById
    FrameLayout flSceneFrame;

    private int questionProgress;

    ArrayList<QuestionModel> questionList;

    @AfterViews
    void init() {
       /* if (Utils.isKitkat())
            TransitionManager.beginDelayedTransition(llQuestion);

        tvQuestion.setText(getString(R.string.question_1));
        ivScene.setVisibility(View.INVISIBLE);
        ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));*/

        questionList = new ArrayList<>();
        questionList.add(new QuestionModel(1, getString(R.string.question_1), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(2, getString(R.string.question_2), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(3, getString(R.string.question_3), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(4, getString(R.string.question_4), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(5, getString(R.string.question_5), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(6, getString(R.string.question_6), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(7, getString(R.string.question_7), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(8, getString(R.string.question_8), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(9, getString(R.string.question_9), null, R.drawable.pergunta1_2));
        questionList.add(new QuestionModel(10, getString(R.string.question_10), null, R.drawable.pergunta1_2));


        ivScene.post(new Runnable() {
            @Override
            public void run() {
                callNextQuestion();
                //animateRevealShow(ivScene);
            }
        });

    }

    @Nullable
    private QuestionModel getQuestionById(int id) {
        for (QuestionModel question : questionList) {
            if (question.getId() == id)
                return question;
        }
        return null;
    }

    private void callNextQuestion() { // Apagar botao next, apagar etiqueta da resposta, passar as views para
        questionProgress++;
        if (Utils.isKitkat()) TransitionManager.beginDelayedTransition(llQuestion);
        btNext.setVisibility(View.GONE);
        QuestionModel question = getQuestionById(questionProgress);
        ivScene.setImageDrawable(getResources().getDrawable(question.getScene()));
        ivScene.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                ivScene.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) btAnswer1.getLayoutParams();
                params.setMargins(utils.getQuadrantBasedX(ivScene, 1, 20), utils.getQuadrantBasedY(ivScene, 5, 10), 0, 0);
                params.height = utils.getQuadrantBasedHeight(ivScene, 4);
                params.width = utils.getQuadrantBasedWidth(ivScene, 4);
                btAnswer1.setLayoutParams(params);
            }
        });
        tvQuestion.setText(question.getText());


    }


    @Click(R.id.bt_answer1)
    void clickAnswer1() {
        Toast.makeText(QuestionActivity.this, "hit! answer 1", Toast.LENGTH_LONG).show();
    }
    @Click(R.id.bt_answer2)
    void clickAnswer2() {
        Toast.makeText(QuestionActivity.this, "hit! answer 2", Toast.LENGTH_LONG).show();
    }
    @Click(R.id.bt_answer3)
    void clickAnswer3() {
        Toast.makeText(QuestionActivity.this, "hit! answer 3", Toast.LENGTH_LONG).show();
    }
    @Click(R.id.bt_answer4)
    void clickAnswer4() {
        Toast.makeText(QuestionActivity.this, "hit! answer 4", Toast.LENGTH_LONG).show();
    }
    @Click(R.id.bt_next)
    void clickNext(){
        callNextQuestion();
    }

    private void showResult(){
        btNext.setVisibility(View.VISIBLE);
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
