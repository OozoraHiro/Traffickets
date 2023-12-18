package com.marcangelolopez.traffickets.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.marcangelolopez.traffickets.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddNewViolation#newInstance} factory method to
 * create an instance of this fragment.
 */

public class AddNewViolation extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddNewViolation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddNewViolation.
     */
    // TODO: Rename and change types and number of parameters
    public static AddNewViolation newInstance(String param1, String param2) {
        AddNewViolation fragment = new AddNewViolation();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_add_new_violation, container, false);

        EditText tvName = root.findViewById(R.id.violators_name);
        EditText tvAddress = root.findViewById(R.id.violators_address);
        EditText tvLicense = root.findViewById(R.id.license_num);
        EditText tvPlateNum = root.findViewById(R.id.plate_num);
        Button btSave = root.findViewById(R.id.btnSave);
        Button btCancel = root.findViewById(R.id.btnCancel);


//        btSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (tvName.getText().toString().isEmpty()|| tvAddress.getText().toString().isEmpty() || tvLicense.getText().toString().isEmpty() || tvPlateNum.getText().toString().isEmpty()){
//                    Snackbar.make(root, "Please Fill the necessary information", Snackbar.LENGTH_SHORT).show();
//                }else{
//                    if(result < 0){
//                        Snackbar.make(root, "Something went wrong.", Snackbar.LENGTH_SHORT).show();
//                    }else{
//                        Snackbar.make(root, "Violation has been saved.", Snackbar.LENGTH_SHORT).show();
//                        Navigation.findNavController(root).navigateUp();
//                    }
//
//                }
//            }
//        });

        return root;
    }

}