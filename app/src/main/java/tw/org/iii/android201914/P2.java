package tw.org.iii.android201914;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;


/**
 * A simple {@link Fragment} subclass.
 */
public class P2 extends Fragment {
    private MainActivity activity;
    private View mainView;
    private ViewFlipper viewFlipper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_p2, container, false);
            viewFlipper = mainView.findViewById(R.id.viewFlipper);

            View f1 = viewFlipper.getChildAt(0);
            View f2 = viewFlipper.getChildAt(1);
            View f3 = viewFlipper.getChildAt(2);

            f1.setOnTouchListener(new View.OnTouchListener() {
                GestureDetector gd = new GestureDetector(activity, new MyFlipperListener());
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    gd.onTouchEvent(event);
                    return true;
                }
            });
            f2.setOnTouchListener(new View.OnTouchListener() {
                GestureDetector gd = new GestureDetector(activity, new MyFlipperListener());
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    gd.onTouchEvent(event);
                    return true;
                }
            });
            f3.setOnTouchListener(new View.OnTouchListener() {
                GestureDetector gd = new GestureDetector(activity, new MyFlipperListener());
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    gd.onTouchEvent(event);
                    return true;
                }
            });

        }
        return mainView;
    }




    private class MyFlipperListener extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onDown(MotionEvent e) {
            //Log.v("brad", "onDown");
            return false;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (velocityY > 1000){
                // Down
                viewFlipper.showNext();
            }else if (velocityY < -1000){
                // Up
                viewFlipper.showPrevious();
            }

            return false;
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (MainActivity)context;
    }
}
