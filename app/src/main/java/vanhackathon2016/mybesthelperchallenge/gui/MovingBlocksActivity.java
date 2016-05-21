package vanhackathon2016.mybesthelperchallenge.gui;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import vanhackathon2016.mybesthelperchallange.R;

/**
 * Created by Felipe Berbert on 21/05/2016.
 */
@EActivity(R.layout.actv_moving_blocks)
public class MovingBlocksActivity extends AppCompatActivity {

    public static final String TAG = "MyBestHelper";

    @ViewById
    FrameLayout gameArea;

    MovingButton tv;

    int y = 0;

    @AfterViews
    void init() {

        tv = MovingButton_.build(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tv.setText("TESTE");
        gameArea.addView(tv, params);
        tv.drop(100, 0);
    }




}
