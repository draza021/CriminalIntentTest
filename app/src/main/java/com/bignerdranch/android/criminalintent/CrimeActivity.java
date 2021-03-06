package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import java.util.UUID;


public class CrimeActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {

        UUID crimeID = (UUID)getIntent()
                .getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);

        return CrimeFragment.newInstance(crimeID);

    }
}
