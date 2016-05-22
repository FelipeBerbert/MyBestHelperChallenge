package vanhackathon2016.mybesthelperchallenge.gui.behaviors;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.os.Build;
import android.transition.Slide;
import android.transition.TransitionValues;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Felipe Berbert on 22/05/2016.
 */
@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class ContinuousSlide extends Slide {
    int originalSlideEdge;
    public ContinuousSlide(int slideEdge) {
        super(slideEdge);
        originalSlideEdge = slideEdge;
    }

    @Override
    public Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        setSlideEdge(originalSlideEdge);
        return super.onAppear(sceneRoot, view, startValues, endValues);
    }

    @Override
    public Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        switch (originalSlideEdge) {
            case Gravity.LEFT:
                setSlideEdge(Gravity.RIGHT);
                break;
            case Gravity.RIGHT:
                setSlideEdge(Gravity.LEFT);
                break;
        }
        return super.onDisappear(sceneRoot, view, startValues, endValues);
    }
}
