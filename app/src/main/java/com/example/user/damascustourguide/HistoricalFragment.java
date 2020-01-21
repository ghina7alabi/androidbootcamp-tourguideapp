package com.example.user.damascustourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalFragment extends Fragment {


    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.OLD_DAMASCENE_HOME, R.string.AL_AZEM_PALACE));
        attractions.add(new Attraction(R.string.ROMAN_REMAINS, R.string.BAB_SHARQI));
        attractions.add(new Attraction(R.string.OLD_CITY_LANDMARK, R.string.DAMASCUS_CITADEL));
        attractions.add(new Attraction(R.string.OLD_CITY_LANDMARK_KHANS, R.string.KHAN_ASAAD_PASHA_AL_AZEM));
        attractions.add(new Attraction(R.string.OLD_CITY_LANDMARK_MANSION, R.string.MAKTAB_ANBAR));
        attractions.add(new Attraction(R.string.MARKET, R.string.SOUQ_AL_HAMIDIYA));
        attractions.add(new Attraction(R.string.MARKET, R.string.STRAIGHT_STREET_SOUQ_MIDHAT_PASHA));
        attractions.add(new Attraction(R.string.MUSEUM, R.string.AL_BIMARISTAN_AL_NOURI));
        attractions.add(new Attraction(R.string.ROMAN_REMAINS, R.string.BAB_AL_SAGHIR));
        attractions.add(new Attraction(R.string.ROMAN_REMAINS, R.string.BAB_AL_SALAM));
        attractions.add(new Attraction(R.string.OLD_DAMASCENE_HOME, R.string.BEIT_AL_SIBA_E));
        attractions.add(new Attraction(R.string.OLD_DAMASCENE_HOME, R.string.BEIT_LYZBONAH));
        attractions.add(new Attraction(R.string.OLD_DAMASCENE_HOME, R.string.BEIT_NIZAM));
        attractions.add(new Attraction(R.string.OLD_CITY_LANDMARK_KHANS, R.string.KHAN_SULEIMAN_PASHA));
        attractions.add(new Attraction(R.string.ROMAN_REMAINS, R.string.OUTER_WALL_OF_JUPITERTEMPLE));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_historical);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}