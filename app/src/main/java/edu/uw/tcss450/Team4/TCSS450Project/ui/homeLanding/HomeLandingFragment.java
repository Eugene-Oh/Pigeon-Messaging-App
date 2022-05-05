package edu.uw.tcss450.Team4.TCSS450Project.ui.homeLanding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.Team4.TCSS450Project.R;

/**
 * Class to define the fragment lifecycle for the HomeLanding Fragment
 *
 * @author team4
 * @version May 2022
 */
public class HomeLandingFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_landing, container, false);
    }
}