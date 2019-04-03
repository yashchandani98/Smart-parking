package com.him.s_parking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class CancelFragment extends Fragment implements View.OnClickListener {

    private Button btn_cancelBooking;
    private EditText etxt_cancleBId;
    private View rootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_cancle_booking,container,false);
        getActivity().setTitle("Cancel Booking");

        btn_cancelBooking = rootView.findViewById(R.id.btn_cancleBooking);
        etxt_cancleBId = rootView.findViewById(R.id.etxt_cancelBooking);

        btn_cancelBooking.setOnClickListener(this);



        return rootView;
    }

    @Override
    public void onClick(View v) {
        Snackbar.make(rootView, "Booking Cancelled ", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
