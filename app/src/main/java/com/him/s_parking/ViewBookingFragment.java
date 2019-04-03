package com.him.s_parking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewBookingFragment extends Fragment {


    TextView tv_userId,tv_name,tv_email,tv_bookingId,tv_date,tv_hours;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_view_booking,container,false);
        getActivity().setTitle("View Booking");

        tv_userId = rootView.findViewById(R.id.tv_userId);
        tv_name = rootView.findViewById(R.id.tv_userName);
        tv_email = rootView.findViewById(R.id.tv_emaiId);
        tv_bookingId = rootView.findViewById(R.id.tv_bookingId);
        tv_date = rootView.findViewById(R.id.tv_date);
        tv_hours = rootView.findViewById(R.id.tv_hours);


        return rootView;
    }
}
