package vanhackathon2016.mybesthelperchallenge.gui;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;

import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EView;
import org.androidannotations.annotations.UiThread;

/**
 * Created by Felipe Berbert on 21/05/2016.
 */
@EView
public class MovingButton extends Button {

    public static final String TAG = "MyBestHelper";

    int x, y;
    FrameLayout.LayoutParams params;
    Context context;
    boolean isChosen;

    public MovingButton(Context context) {
        super(context);
        this.context = context;
    }


    public void drop(int initialX, int initialY) {
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) getLayoutParams();
        params.setMargins(initialX, initialY, 0, 0);
        x = initialX;
        y = initialY;
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                isChosen = true;
            }
        });
        /*if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Animator anim = ViewAnimationUtils.createCircularReveal(this, params.width / 2, params.height / 2, 0, Math.max(params.height, params.width));
            setVisibility(View.VISIBLE);
            anim.setDuration(1000);
            anim.setInterpolator(new AccelerateInterpolator());
            anim.start();
        }*/

        move();
    }

    @Background
    void move() {
        Display display = ((Activity)context).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        while (y < size.y && !isChosen) {
            y++;
            Log.d(TAG, "gamecycle " + y);
            updateUi(y);
            try {
                Thread.sleep(5);
                Log.d(TAG, "sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @UiThread
    void updateUi(int y) {
        Log.d(TAG, "update ui " + y);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) getLayoutParams();
        params.setMargins(x, y, 0, 0);
        setLayoutParams(params);
    }

}
