package com.him.s_parking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class NewBookingFragment extends Fragment {

    private Button btnQr;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        final View rootView = inflater.inflate(R.layout.fragment_new_booking, container,
                false);
        getActivity().setTitle("New Booking");

        btnQr = rootView.findViewById(R.id.scan_qr_code);
        btnQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Snackbar.make(rootView,"ScanQrCode",Snackbar.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),ScanQRCode.class);
                startActivity(intent);
            }
        });


        return rootView;
    }



}

