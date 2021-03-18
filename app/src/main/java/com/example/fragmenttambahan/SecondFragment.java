package com.example.fragmenttambahan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName;
    private TextView txtTTL;
    private TextView txtCita;
    private TextView txtHobi;
    private TextView txtImpian;
    public SecondFragment () {
// Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtTTL = view.findViewById(R.id.textViewTTL);
        txtCita = view.findViewById(R.id.textViewCita);
        txtHobi = view.findViewById(R.id.textViewHobi);
        txtImpian = view.findViewById(R.id.textViewImpian);
        pageViewModel.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName.setText(s);
                    }
                });
        pageViewModel.getTTL().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtTTL.setText(s);
                    }
                });
        pageViewModel.getHobi().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtHobi.setText(s);
                    }
                });
        pageViewModel.getCita().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtCita.setText(s);
                    }
                });
        pageViewModel.getImpian().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtImpian.setText(s);
                    }
                });
    }
}