package com.br.ce.isaveapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.br.ce.isaveapp.CadastrarRuaFragment;
import com.br.ce.isaveapp.FormLogin;
import com.br.ce.isaveapp.HomeFragment;
import com.br.ce.isaveapp.ListaAmigosFragment;

import java.util.Objects;

public class FragmentPageAdapter extends FragmentPagerAdapter {

    private String[] mTabTitles;

    public FragmentPageAdapter(FragmentManager fa, String[] mTabTitles) {
        super(fa);
     this.mTabTitles = mTabTitles;

    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

   @Override
    public CharSequence getPageTitle(int position){

        return this.mTabTitles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new CadastrarRuaFragment();
            case 2:
                return new ListaAmigosFragment();
            default:
                return null;
        }
    }
}

