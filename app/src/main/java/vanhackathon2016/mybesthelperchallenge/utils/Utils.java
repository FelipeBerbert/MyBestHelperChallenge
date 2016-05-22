package vanhackathon2016.mybesthelperchallenge.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import vanhackathon2016.mybesthelperchallange.R;
import vanhackathon2016.mybesthelperchallenge.models.AnswerModel;

/**
 * Created by Angelo on 21/05/2016.
 */
@EBean
public class Utils {

    public int getQuadrantBasedX(View view, int quadrant, int numOfQuadrants){
        /*Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);*/
        int size = view.getWidth();
        quadrant = (quadrant % numOfQuadrants);
        return (size / numOfQuadrants * quadrant);
    }
    public int getQuadrantBasedY(View view, int quadrant, int numOfQuadrants){
        int size = view.getHeight();
        quadrant = (quadrant % numOfQuadrants);
        return (size / numOfQuadrants * quadrant);
    }

    public int getQuadrantBasedWidth(View view, int numOfQuadrants){
       /* Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);*/
        int size = view.getWidth();
        return size / numOfQuadrants;
    }

    public int getQuadrantBasedHeight(View view, int numOfQuadrants){
        int size = view.getHeight();
        return size / numOfQuadrants;
    }

    public List<AnswerModel> getAnswersToQuestion(Context c, int questionId) {
        ArrayList<AnswerModel> answers = new ArrayList<>();

        switch (questionId) {
            case 1:
                answers.add(new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_1)));
                answers.add(new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_2)));
                answers.add(new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_3)));
                answers.add(new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_4)));
                break;
            case 2:
                answers.add(new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_1)));
                answers.add(new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_2)));
                answers.add(new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_3)));
                answers.add(new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_4)));
                break;
            case 3:
                answers.add(new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_1)));
                answers.add(new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_2)));
                answers.add(new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_3)));
                answers.add(new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_4)));
                break;
            case 4:
                answers.add(new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_1)));
                answers.add(new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_2)));
                answers.add(new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_3)));
                answers.add(new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_4)));
                break;
            case 5:
                answers.add(new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_1)));
                answers.add(new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_2)));
                answers.add(new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_3)));
                answers.add(new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_4)));
                break;
            case 6:
                answers.add(new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_1)));
                answers.add(new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_2)));
                answers.add(new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_3)));
                answers.add(new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_4)));
                break;
            case 7:
                answers.add(new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_1)));
                answers.add(new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_2)));
                answers.add(new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_3)));
                answers.add(new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_4)));
                break;
            case 8:
                answers.add(new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_1)));
                answers.add(new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_2)));
                answers.add(new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_3)));
                answers.add(new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_4)));
                break;
            case 9:
                answers.add(new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_1)));
                answers.add(new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_2)));
                answers.add(new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_3)));
                answers.add(new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_4)));
                break;
            case 10:
                answers.add(new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_1)));
                answers.add(new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_2)));
                answers.add(new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_3)));
                answers.add(new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_4)));
                break;
        }

        return answers;
    }


    public static boolean isKitkat(){
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }

    public static boolean isLollipop(){
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

}