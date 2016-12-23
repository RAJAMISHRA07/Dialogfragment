package com.example.admin.dialogfragment;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDatePicker extends DialogFragment {


    public MyDatePicker() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog=null;
        //calender is used to set curent actual date
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month =calendar.get(Calendar.MONTH);
        int date=calendar.get(Calendar.DATE);
        DatePickerDialog datePickerDialog=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                //this method will be called when user clicks done button
                Toast.makeText(getActivity(), "SELECTED: "+year+"-"+monthOfYear+"-"+dayOfMonth, Toast.LENGTH_SHORT).show();
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.catchData(year+"-"+monthOfYear+"-"+dayOfMonth);
            }
        }, year, month, date);
        dialog=datePickerDialog;
        return dialog;
    }
}








