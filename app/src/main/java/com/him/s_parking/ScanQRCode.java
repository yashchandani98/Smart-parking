package com.him.s_parking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class ScanQRCode extends AppCompatActivity implements View.OnClickListener {

    private Button scanBtn;

    private TextView tvScanFormat, tvScanContent;

    private LinearLayout llSearch;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_scanner_layout);

        scanBtn =  findViewById(R.id.scan_button);

        tvScanFormat =  findViewById(R.id.tvScanFormat);

        tvScanContent =  findViewById(R.id.tvScanContent);

        llSearch =  findViewById(R.id.llSearch);

        scanBtn.setOnClickListener(this);

    }
    public void onClick(View v) {

        llSearch.setVisibility(View.GONE);


        IntentIntegrator integrator = new IntentIntegrator(this);

        integrator.setPrompt("Scan a barcode or QRCode");

        integrator.setOrientationLocked(true);

        integrator.setCameraId(0);

        integrator.setCaptureActivity(AnyOrientationCaptureActivity.class);

        integrator.initiateScan();







//        Use this for more customization

//        IntentIntegrator integrator = new IntentIntegrator(this);

//        integrator.setDesiredBarcodeFormats(IntentIntegrator.ONE_D_CODE_TYPES);

//        integrator.setPrompt("Scan a barcode");

//        integrator.setCameraId(0);  // Use a specific camera of the device

//        integrator.setBeepEnabled(false);

//        integrator.setBarcodeImageEnabled(true);

//        integrator.initiateScan();


    }

    @Override

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if (result != null) {

            if (result.getContents() == null) {

                llSearch.setVisibility(View.GONE);

                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();

            } else {

                llSearch.setVisibility(View.VISIBLE);

                tvScanContent.setText(result.getContents());

                tvScanFormat.setText(result.getFormatName());

            }

        } else {

            super.onActivityResult(requestCode, resultCode, data);

        }

    }

}
