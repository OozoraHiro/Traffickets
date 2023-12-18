package com.marcangelolopez.traffickets.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.marcangelolopez.traffickets.R;
import com.marcangelolopez.traffickets.data.ViolatorModel;
import com.marcangelolopez.traffickets.databinding.FragmentHomeBinding;

import java.util.List;


public class HomeFragment extends Fragment {

    ViolationAdapter violationAdapter = null;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

                HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//        DatabaseHelper db = new DatabaseHelper(root.getContext());
//        List<ViolatorModel> data = db.getAllViolators();
        final RecyclerView recyclerView = root.findViewById(R.id.rvNotes);
//        violationAdapter = new ViolationAdapter(
//                data,
//                new ViolationAdapter.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(ViolatorModel item) {
//                        Bundle bundle = new Bundle();
//                        bundle.putInt("violatorID", item.violatorID);
//                        Navigation.findNavController(root).navigate(R.id.nav_edit_violation, bundle);
//                    }
//                },
////                new ViolationAdapter.OnDeleteClickListener() {
////                    @Override
////                    public void onItemClick(ViolatorModel item, int position) {
////                        db.deleteViolator(item.violatorID);
////                        data.remove(position);
////                        violationAdapter.notifyDataSetChanged();
////                        Snackbar.make(root, item.violatorTitle + " has been deleted", Snackbar.LENGTH_LONG).show();
////                    }
////                },
//                root.getContext());
//        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
//        recyclerView.setAdapter(violationAdapter);

        FloatingActionButton fabAdd = root.findViewById(R.id.add);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(root).navigate(R.id.nav_add_new_violation);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}