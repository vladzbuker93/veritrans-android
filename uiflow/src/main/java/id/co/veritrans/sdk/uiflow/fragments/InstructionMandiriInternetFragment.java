package id.co.veritrans.sdk.uiflow.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.co.veritrans.sdk.uiflow.R;

/**
 * Created by rakawm on 2/23/16.
 */
public class InstructionMandiriInternetFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_instruction_mandiri_internet, container, false);
        return view;
    }

}
