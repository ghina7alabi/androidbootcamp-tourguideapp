package com.example.user.damascustourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {



    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.five_star, R.string.SHERATON_HOTEL, R.drawable.sheraton));
        attractions.add(new Attraction(R.string.five_star, R.string.BEIT_AL_WALI, R.drawable.beit_al_wali));
        attractions.add(new Attraction(R.string.five_star, R.string.BAIK_BASH, R.drawable.baik_bash));
        attractions.add(new Attraction(R.string.five_star, R.string.HOTEL_ART_HOUSE, R.drawable.hotel_art_house));
        attractions.add(new Attraction(R.string.four_star, R.string.OMAYAD_HOTEL, R.drawable.omayad));
        attractions.add(new Attraction(R.string.five_star, R.string.TALISMAN_BAB_AL_SALAM, R.drawable.talisman));
        attractions.add(new Attraction(R.string.five_star, R.string.BEIT_AL_MAMLOUKA, R.drawable.beit_al_mamlouka));
        attractions.add(new Attraction(R.string.five_star, R.string.FOUR_SEASONS_HOTEL_DAMASCUS, R.drawable.four_seasons));
        attractions.add(new Attraction(R.string.four_star, R.string.FARDOSS_TOWER_HOTEL, R.drawable.fardoss));
        attractions.add(new Attraction(R.string.five_star, R.string.AL_SHAHBANDAR_PALACE_HOTEL, R.drawable.shahbandar));
        attractions.add(new Attraction(R.string.four_star, R.string.QUEEN_CENTRE, R.drawable.queen_centre));
        attractions.add(new Attraction(R.string.three_star, R.string.ORIENT_PALACE_HOTEL, R.drawable.orient_palace));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_hotels);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}