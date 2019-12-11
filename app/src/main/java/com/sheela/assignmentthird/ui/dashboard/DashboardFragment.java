package com.sheela.assignmentthird.ui.dashboard;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sheela.assignmentthird.R;

public class DashboardFragment extends Fragment implements View.OnClickListener {
    private EditText etFullName, etAge, etAddress;
    private TextView txtStudentDetails, txtGender;
    private RadioButton rdoMale, rdoFemale, rdoOthers;
    private Button btnSave;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        dashboardViewModel =
//                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
//        final TextView textView = root.findViewById(R.id.text_dashboard);
//        dashboardViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
        etFullName = view.findViewById(R.id.etFullName);
        etAge = view.findViewById(R.id.etAge);
        rdoMale = view.findViewById(R.id.rdoMale);
        rdoFemale = view.findViewById(R.id.rdoFemale);
        rdoOthers = view.findViewById(R.id.rdoOthers);
        txtStudentDetails = view.findViewById(R.id.txtStudentDetails);
        txtGender = view.findViewById(R.id.txtGender);
        etAddress = view.findViewById(R.id.etAddress);
        btnSave = view.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etFullName.getText())) {
            etFullName.setError("Please enter full name");
            etFullName.requestFocus();
            return;

        } else if (TextUtils.isEmpty(etAge.getText())) {
            etAge.setError("enter your age");
            etAge.requestFocus();
            return;
        } else if (TextUtils.isEmpty(etAddress.getText())) {
            etAddress.setError("enter your address");
            etAddress.requestFocus();
            return;
        }
    }
}