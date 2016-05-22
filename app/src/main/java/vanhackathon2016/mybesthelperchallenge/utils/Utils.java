package vanhackathon2016.mybesthelperchallenge.utils;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.ArrayList;
import java.util.List;

import vanhackathon2016.mybesthelperchallange.R;
import vanhackathon2016.mybesthelperchallenge.models.AnswerModel;
import vanhackathon2016.mybesthelperchallenge.models.RelativeCoordinate;

/**
 * Created by Angelo on 21/05/2016.
 */
public class Utils {

    public List<AnswerModel> getAnswersToQuestion(Context c, int questionId) {
        ArrayList<AnswerModel> answers = new ArrayList<>();

        switch (questionId) {
            case 1:
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_1),
                                new RelativeCoordinate(2, 36),
                                new RelativeCoordinate(18, 32)));
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_2),
                                new RelativeCoordinate(23, 36),
                                new RelativeCoordinate(18, 32)));
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_3),
                                new RelativeCoordinate(16, 36),
                                new RelativeCoordinate(11, 32)));
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_4),
                                new RelativeCoordinate(7, 36),
                                new RelativeCoordinate(29, 32)));
                break;
            case 2:
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
            case 3:
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_1),
                                new RelativeCoordinate(1, 36),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_2),
                                new RelativeCoordinate(1, 36),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_3),
                                new RelativeCoordinate(1, 36),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_4),
                                new RelativeCoordinate(1, 36),
                                new RelativeCoordinate(1, 1)));
                break;
            case 4:
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
            case 5:
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
            case 6:
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
            case 7:
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
            case 8:
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
            case 9:
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
            case 10:
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_1),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_2),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_3),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_4),
                                new RelativeCoordinate(1, 1),
                                new RelativeCoordinate(1, 1)));
                break;
        }

        return answers;
    }

    public void playAudio(Context context) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.plim);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }

}