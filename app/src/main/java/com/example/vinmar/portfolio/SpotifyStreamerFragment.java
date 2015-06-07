package com.example.vinmar.portfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class SpotifyStreamerFragment extends Fragment {



    public SpotifyStreamerFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        String[] dummyArtist = {
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine",
                "Ten",
        };

        List<String> artistList = new ArrayList<>(
                Arrays.asList(dummyArtist)
        );

        ArrayAdapter<String> artists = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_artist,
                R.id.list_item_artist_textview,
                artistList);

        View rootView = inflater.inflate(R.layout.fragment_spotify_streamer, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_artist);
        listView.setAdapter(artists);

        return rootView;
    }
}
