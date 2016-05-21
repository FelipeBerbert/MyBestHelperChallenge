package vanhackathon2016.mybesthelperchallenge.utils;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import vanhackathon2016.mybesthelperchallange.R;

/**
 * Created by Angelo on 21/05/2016.
 */
public class Utils {

    public List<String> getAnswersToQuestion(Context c, int questionId) {
        ArrayList<String> answers = new ArrayList<>();

        switch (questionId) {
            case 1:
                answers.add(c.getResources().getString(R.string.answer_1_question_1));
                answers.add(c.getResources().getString(R.string.answer_1_question_2));
                answers.add(c.getResources().getString(R.string.answer_1_question_3));
                answers.add(c.getResources().getString(R.string.answer_1_question_4));
                break;
            case 2:
                answers.add(c.getResources().getString(R.string.answer_2_question_1));
                answers.add(c.getResources().getString(R.string.answer_2_question_2));
                answers.add(c.getResources().getString(R.string.answer_2_question_3));
                answers.add(c.getResources().getString(R.string.answer_2_question_4));
                break;
            case 3:
                answers.add(c.getResources().getString(R.string.answer_3_question_1));
                answers.add(c.getResources().getString(R.string.answer_3_question_2));
                answers.add(c.getResources().getString(R.string.answer_3_question_3));
                answers.add(c.getResources().getString(R.string.answer_3_question_4));
                break;
            case 4:
                answers.add(c.getResources().getString(R.string.answer_4_question_1));
                answers.add(c.getResources().getString(R.string.answer_4_question_2));
                answers.add(c.getResources().getString(R.string.answer_4_question_3));
                answers.add(c.getResources().getString(R.string.answer_4_question_4));
                break;
            case 5:
                answers.add(c.getResources().getString(R.string.answer_5_question_1));
                answers.add(c.getResources().getString(R.string.answer_5_question_2));
                answers.add(c.getResources().getString(R.string.answer_5_question_3));
                answers.add(c.getResources().getString(R.string.answer_5_question_4));
                break;
            case 6:
                answers.add(c.getResources().getString(R.string.answer_6_question_1));
                answers.add(c.getResources().getString(R.string.answer_6_question_2));
                answers.add(c.getResources().getString(R.string.answer_6_question_3));
                answers.add(c.getResources().getString(R.string.answer_6_question_4));
                break;
            case 7:
                answers.add(c.getResources().getString(R.string.answer_7_question_1));
                answers.add(c.getResources().getString(R.string.answer_7_question_2));
                answers.add(c.getResources().getString(R.string.answer_7_question_3));
                answers.add(c.getResources().getString(R.string.answer_7_question_4));
                break;
            case 8:
                answers.add(c.getResources().getString(R.string.answer_8_question_1));
                answers.add(c.getResources().getString(R.string.answer_8_question_2));
                answers.add(c.getResources().getString(R.string.answer_8_question_3));
                answers.add(c.getResources().getString(R.string.answer_8_question_4));
                break;
            case 9:
                answers.add(c.getResources().getString(R.string.answer_9_question_1));
                answers.add(c.getResources().getString(R.string.answer_9_question_2));
                answers.add(c.getResources().getString(R.string.answer_9_question_3));
                answers.add(c.getResources().getString(R.string.answer_9_question_4));
                break;
            case 10:
                answers.add(c.getResources().getString(R.string.answer_10_question_1));
                answers.add(c.getResources().getString(R.string.answer_10_question_2));
                answers.add(c.getResources().getString(R.string.answer_10_question_3));
                answers.add(c.getResources().getString(R.string.answer_10_question_4));
                break;
        }

        return answers;
    }

}