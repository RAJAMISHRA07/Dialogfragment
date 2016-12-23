package com.example.admin.dialogfragment;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyProgressDialog extends DialogFragment {
ProgressDialog progressDialog;

    public MyProgressDialog() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog=null;
        progressDialog=new ProgressDialog(getActivity());
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setTitle("uploading");//title
        progressDialog.setMessage("2 out of 20 images upload");//message
        // progressDialog.setProgress(20);
        progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);//FOR HORIZONTAL
        dialog=progressDialog;
        return dialog;
    }

    @Override
    public void onResume() {
        super.onResume();
        progressDialog.setProgress(20);

    }
}



