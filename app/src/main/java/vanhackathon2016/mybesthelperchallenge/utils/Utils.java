package vanhackathon2016.mybesthelperchallenge.utils;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.View;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import vanhackathon2016.mybesthelperchallange.R;
import vanhackathon2016.mybesthelperchallenge.models.AnswerModel;
import vanhackathon2016.mybesthelperchallenge.models.QuestionModel;
import vanhackathon2016.mybesthelperchallenge.models.RelativeCoordinate;

/**
 * Created by Angelo on 21/05/2016.
 */
@EBean
public class Utils {

    public int getQuadrantBasedX(View view, RelativeCoordinate coordinates){
        /*Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);*/

        int size = view.getWidth();
        coordinates.relativePosition = (coordinates.relativePosition % coordinates.reference); // for safety
        return (size / coordinates.reference * coordinates.relativePosition);
    }
    public int getQuadrantBasedY(View view, RelativeCoordinate coordinates){
        int size = view.getWidth(); // its a square
        coordinates.relativePosition = (coordinates.relativePosition % coordinates.reference); // for safety
        return (size / coordinates.reference * coordinates.relativePosition);
    }

    public int getQuadrantBasedWidth(View view, int numOfQuadrants){
       /* Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);*/
        int size = view.getWidth();
        return size / numOfQuadrants;
    }

    public int getQuadrantBasedHeight(View view, int numOfQuadrants){
        int size = view.getWidth(); // its a square
        return size / numOfQuadrants;
    }

    public List<QuestionModel> getQuestions(Context c){
        ArrayList<QuestionModel> questionList = new ArrayList<>();
        questionList.add(new QuestionModel(1, c.getString(R.string.question_1), getAnswersToQuestion(c, 1), R.drawable.pergunta1));
        questionList.add(new QuestionModel(2, c.getString(R.string.question_2), getAnswersToQuestion(c, 2), R.drawable.pergunta2));
        questionList.add(new QuestionModel(3, c.getString(R.string.question_3), getAnswersToQuestion(c, 3), R.drawable.pergunta3));
        questionList.add(new QuestionModel(4, c.getString(R.string.question_4), getAnswersToQuestion(c, 4), R.drawable.pergunta4));
        questionList.add(new QuestionModel(5, c.getString(R.string.question_5), getAnswersToQuestion(c, 5), R.drawable.pergunta5));
        questionList.add(new QuestionModel(6, c.getString(R.string.question_6), getAnswersToQuestion(c, 6), R.drawable.pergunta6));
        questionList.add(new QuestionModel(7, c.getString(R.string.question_7), getAnswersToQuestion(c, 7), R.drawable.pergunta7));
        questionList.add(new QuestionModel(8, c.getString(R.string.question_8), getAnswersToQuestion(c, 8), R.drawable.pergunta8));
        questionList.add(new QuestionModel(9, c.getString(R.string.question_9), getAnswersToQuestion(c, 9), R.drawable.pergunta9));
        questionList.add(new QuestionModel(10, c.getString(R.string.question_10), getAnswersToQuestion(c, 10), R.drawable.pergunta10));
        return questionList;
    }

    public List<AnswerModel> getAnswersToQuestion(Context c, int questionId) {
        ArrayList<AnswerModel> answers = new ArrayList<>();

        switch (questionId) {
            case 1:
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_1),
                                new RelativeCoordinate(1, 36),
                                new RelativeCoordinate(15, 32), 4));
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_2),
                                new RelativeCoordinate(22, 36),
                                new RelativeCoordinate(15, 32), 3));
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_3),
                                new RelativeCoordinate(14, 36),
                                new RelativeCoordinate(8, 32), 4));
                answers.add(
                        new AnswerModel(1, c.getResources().getString(R.string.answer_1_question_4),
                                new RelativeCoordinate(4, 36),
                                new RelativeCoordinate(24, 32), 4));
                break;
            case 2:
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_1),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_2),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_3),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(1, 2), 2));
                answers.add(
                        new AnswerModel(2, c.getResources().getString(R.string.answer_2_question_4),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(1, 2), 2));
                break;
            case 3:
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_1),
                                new RelativeCoordinate(1, 36),
                                new RelativeCoordinate(6, 37), 4));
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_2),
                                new RelativeCoordinate(29, 36),
                                new RelativeCoordinate(7, 37), 4));
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_3),
                                new RelativeCoordinate(18, 36),
                                new RelativeCoordinate(10, 37), 4));
                answers.add(
                        new AnswerModel(3, c.getResources().getString(R.string.answer_3_question_4),
                                new RelativeCoordinate(9, 36),
                                new RelativeCoordinate(24, 37), 4));
                break;
            case 4:
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_1),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_2),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_3),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(1, 2), 2));
                answers.add(
                        new AnswerModel(4, c.getResources().getString(R.string.answer_4_question_4),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(1, 2), 2));
                break;
            case 5:
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_1),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_2),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(1, 2), 2));
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_3),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(5, c.getResources().getString(R.string.answer_5_question_4),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(1, 2), 2));
                break;
            case 6:
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_1),
                                new RelativeCoordinate(3, 36),
                                new RelativeCoordinate(9, 37), 4));
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_2),
                                new RelativeCoordinate(21, 36),
                                new RelativeCoordinate(19, 37), 4));
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_3),
                                new RelativeCoordinate(21, 36),
                                new RelativeCoordinate(1, 37), 4));
                answers.add(
                        new AnswerModel(6, c.getResources().getString(R.string.answer_6_question_4),
                                new RelativeCoordinate(1, 36),
                                new RelativeCoordinate(25, 37), 4));
                break;
            case 7:
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_1),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_2),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_3),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(1, 2), 2));
                answers.add(
                        new AnswerModel(7, c.getResources().getString(R.string.answer_7_question_4),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(1, 2), 2));
                break;
            case 8:
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_1),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(1, 2), 2));
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_2),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_3),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(8, c.getResources().getString(R.string.answer_8_question_4),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(1, 2), 2));
                break;
            case 9:
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_1),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_2),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(1, 2), 2));
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_3),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(9, c.getResources().getString(R.string.answer_9_question_4),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(1, 2), 2));
                break;
            case 10:
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_1),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_2),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(0, 2), 2));
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_3),
                                new RelativeCoordinate(0, 2),
                                new RelativeCoordinate(1, 2), 2));
                answers.add(
                        new AnswerModel(10, c.getResources().getString(R.string.answer_10_question_4),
                                new RelativeCoordinate(1, 2),
                                new RelativeCoordinate(1, 2), 2));
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

    public void playAudio(Context context) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.plim);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }

}