package com.example.user.damascustourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ReligiousFragment extends Fragment {



    public ReligiousFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.SHRINE, R.string.AL_SAYDA_RUQAIYA_SHRINE));
        attractions.add(new Attraction(R.string.ANCIENT_GATE_CHURCH, R.string.BAB_KISSAN_AND_SAINT_PAUL_CHAPEL));
        attractions.add(new Attraction(R.string.SHRINE, R.string.AL_MADRASA_AL_ZAHIRIYA));
        attractions.add(new Attraction(R.string.CHURCH, R.string.SAINT_ANANIAS_CHAPEL));
        attractions.add(new Attraction(R.string.CATHEDRAL, R.string.SAYEDAT_AL_NEYYAH_CATHEDRAL));
        attractions.add(new Attraction(R.string.MOSQUE, R.string.THE_UMAYYAD_MOSQUE));
        attractions.add(new Attraction(R.string.ISLAMIC_SCHOOL_SHRINE, R.string.AL_MADRASA_AL_ZAHIRIYA));
        attractions.add(new Attraction(R.string.CHURCH, R.string.THE_MAIN_GATE_OF_JUPITER_TEMPLE));
        attractions.add(new Attraction(R.string.CHURCH, R.string.THE_MARIAMIYA_CATHEDRAL));
        attractions.add(new Attraction(R.string.ISLAMIC_SCHOOL_SHRINE, R.string.AL_MADRASA_AL_JOQMOQIYA));
        attractions.add(new Attraction(R.string.SYNAGOGUE, R.string.AL_FARANJ_IFRANJ));
        attractions.add(new Attraction(R.string.MOSQUE, R.string.AL_YAGHOSHIYA));
        attractions.add(new Attraction(R.string.CHURCH, R.string.SYRIAC_CATHOLIC_ARCHDIOCESSE));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_religious);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}