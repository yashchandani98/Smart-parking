package com.him.s_parking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FeedBackFragment extends Fragment {

    Button btn_feedback;
    EditText etext_feedback;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.fragment_feedback,container,false);
        getActivity().setTitle("FeedBack");

        btn_feedback = rootView.findViewById(R.id.btn_feedback);
        etext_feedback = rootView.findViewById(R.id.etext_feedback);
        return  rootView;
    }
}
