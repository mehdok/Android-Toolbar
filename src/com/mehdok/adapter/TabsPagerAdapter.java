package com.mehdok.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mehdok.toolbartest.GamesFragment;
import com.mehdok.toolbartest.MoviesFragment;
import com.mehdok.toolbartest.TopRatedFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter 
{
	public TabsPagerAdapter(FragmentManager fm) 
	{
		super(fm);
	}
	
	@Override
	public Fragment getItem(int index) 
	{
		switch (index) 
		{
		case 0:
			// Top Rated fragment activity
			return new TopRatedFragment();
		case 1:
			// Games fragment activity
			return new GamesFragment();
		case 2:
			// Movies fragment activity
			return new MoviesFragment();
		}
		return null;
	}
	
	@Override
	public int getCount() 
	{
		// get item count - equal to number of tabs
			return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) 
	{
		// TODO Auto-generated method stub
		switch (position) 
		{
		case 0:
			return "first";
		case 1:
			return "second";
		case 2:
			return "third";

		default:
			break;
		}
		return super.getPageTitle(position);
	}
	
	
}