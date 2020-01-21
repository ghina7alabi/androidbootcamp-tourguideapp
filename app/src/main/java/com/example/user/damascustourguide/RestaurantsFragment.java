package com.example.user.damascustourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {



    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.STARS_GOOGLE4, R.string.HARETNA, R.drawable.haretna));
        attractions.add(new Attraction(R.string.STARS_GOOGLE2, R.string.NARANJ, R.drawable.naranj));
        attractions.add(new Attraction(R.string.STARS_GOOGLE4, R.string.BEIT_SITTI, R.drawable.beit_sitti));
        attractions.add(new Attraction(R.string.STARS_GOOGLE4, R.string.RUSTY_03, R.drawable.rusty03));
        attractions.add(new Attraction(R.string.STARS_GOOGLE4, R.string.ELISSAR, R.drawable.elissar));
        attractions.add(new Attraction(R.string.STARS_GOOGLE3, R.string.ROADHOUSE, R.drawable.roadhouse));
        attractions.add(new Attraction(R.string.STARS_GOOGLE2, R.string.RESTAURANT_CHAMPS_ÉLYSÉES, R.drawable.champs_elysees));
        attractions.add(new Attraction(R.string.STARS_GOOGLE1, R.string.LE_BARON_RESTAURANT, R.drawable.le_baron));
        attractions.add(new Attraction(R.string.STARS_GOOGLE, R.string.HANABI_SUSHI_BAR, R.drawable.hanabi_sushi_bar));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_restaurants);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}