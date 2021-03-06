package com.example.admin.dialogfragment;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyTimePicker extends DialogFragment {


    public MyTimePicker() {
        // Required empty public constructor
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog=null;
        Calendar calendar=Calendar.getInstance();
        int hour =calendar.get(Calendar.HOUR);
        int min=calendar.get(Calendar.MINUTE);
        // TimePickerDialog timePickerDialog=new TimePickerDialog(getActivity(),null,10,06,false);

        TimePickerDialog timePickerDialog=new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(getActivity(), "TIME: "+hourOfDay+":"+minute, Toast.LENGTH_SHORT).show();
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.catchData(hourOfDay+":"+minute);
            }
        }, hour, min, false);
        dialog=timePickerDialog;
        return dialog;
    }
}



