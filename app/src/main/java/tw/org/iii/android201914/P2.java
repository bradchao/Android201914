package tw.org.iii.android201914;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;


/**
 * A simple {@link Fragment} subclass.
 */
public class P2 extends Fragment {
    private View mainView;
    private ViewFlipper viewFlipper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_p2, container, false);
            viewFlipper = mainView.findViewById(R.id.viewFlipper);

        }
        return mainView;
    }

}
