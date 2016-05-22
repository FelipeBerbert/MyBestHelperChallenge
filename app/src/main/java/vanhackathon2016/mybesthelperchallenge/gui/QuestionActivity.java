package vanhackathon2016.mybesthelperchallenge.gui;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewAnimationUtils;
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
import java.util.List;

import vanhackathon2016.mybesthelperchallange.R;
import vanhackathon2016.mybesthelperchallenge.models.AnswerModel;
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

    List<QuestionModel> questionList;
    List<Button> answerButtonList;

    @AfterViews
    void init() {
       /* if (Utils.isKitkat())
            TransitionManager.beginDelayedTransition(llQuestion);

        tvQuestion.setText(getString(R.string.question_1));
        ivScene.setVisibility(View.INVISIBLE);
        ivScene.setImageDrawable(getResources().getDrawable(R.drawable.pergunta1_2));*/
        questionList = utils.getQuestions(this);
        answerButtonList = new ArrayList<>();
        answerButtonList.add(btAnswer1);
        answerButtonList.add(btAnswer2);
        answerButtonList.add(btAnswer3);
        answerButtonList.add(btAnswer4);


        ivScene.post(new Runnable() {
            @Override
            public void run() {
                animateRevealShow(ivScene);
                callNextQuestion();
            }
        });

    }

    private void resizeSceneArea(){
        LinearLayout.LayoutParams sceneParams = (LinearLayout.LayoutParams) flSceneFrame.getLayoutParams();
        sceneParams.height = flSceneFrame.getWidth();
        flSceneFrame.setLayoutParams(sceneParams);
    }

    @Nullable
    private QuestionModel getQuestionById(int id) {
        for (QuestionModel question : questionList) {
            if (question.getId() == id)
                return question;
        }
        return null;
    }

    private void callNextQuestion() { // Apagar botao next, apagar etiqueta da resposta, reposicionar botoes
        questionProgress++;
        if (Utils.isKitkat()) TransitionManager.beginDelayedTransition(llBody);


        btNext.setVisibility(View.GONE);
        final QuestionModel question = getQuestionById(questionProgress);

        ivScene.setImageDrawable(getResources().getDrawable(question.getScene()));
        ivScene.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                ivScene.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                resizeSceneArea();
                for (int i = 0; i < 4; i ++){
                    positionAnswer(answerButtonList.get(i), question.getAnswers().get(i));
                }
            }
        });
        tvQuestion.setText(question.getText());
    }

    private void positionAnswer(Button btAnswer, AnswerModel answer){
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) btAnswer.getLayoutParams();
        params.setMargins(utils.getQuadrantBasedX(flSceneFrame, answer.getRelativeCoordinateX()), utils.getQuadrantBasedY(flSceneFrame, answer.getRelativeCoordinateY()), 0, 0);
        params.height = utils.getQuadrantBasedHeight(flSceneFrame, answer.getRelativeSize());
        params.width = utils.getQuadrantBasedWidth(flSceneFrame, answer.getRelativeSize());
        btAnswer.setLayoutParams(params);
    }

    @Click(R.id.bt_answer1)
    void clickAnswer1() {
        Toast.makeText(QuestionActivity.this, "hit! answer 1", Toast.LENGTH_LONG).show();
        showResult();
    }
    @Click(R.id.bt_answer2)
    void clickAnswer2() {
        Toast.makeText(QuestionActivity.this, "hit! answer 2", Toast.LENGTH_LONG).show();
        showResult();
    }
    @Click(R.id.bt_answer3)
    void clickAnswer3() {
        Toast.makeText(QuestionActivity.this, "hit! answer 3", Toast.LENGTH_LONG).show();
        showResult();
    }
    @Click(R.id.bt_answer4)
    void clickAnswer4() {
        Toast.makeText(QuestionActivity.this, "hit! answer 4", Toast.LENGTH_LONG).show();
        showResult();
    }
    @Click(R.id.bt_next)
    void clickNext(){
        callNextQuestion();
    }

    private void showResult(){ // Mostrar botao next e etiqueta com a resposta escolhida.
        if (Utils.isKitkat()) TransitionManager.beginDelayedTransition(llBody);
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
