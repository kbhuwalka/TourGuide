package com.dev.kunal.tourguide;

/**
 * Created by Kunal on 10/11/2017.
 */

public class Paris {

    public static final Place[] places = {
        new Place(R.string.eiffel_tower, R.string.eiffel_desc, R.drawable.eiffel),
        new Place(R.string.louvre, R.string.louvre_desc, R.drawable.louvre),
        new Place(R.string.arc, R.string.arc_desc, R.drawable.arcdetriomphe),
        new Place(R.string.disney, R.string.disney_desc, R.drawable.disneyland),
        new Place(R.string.notre, R.string.notre_desc, R.drawable.notredam)
    };

    public static final Event[] events = {
        new Event(R.string.event_bastille, R.string.bastille_date),
        new Event(R.string.event_fete, R.string.fete_date),
        new Event(R.string.event_festival, R.string.festival_date),
        new Event(R.string.event_nice, R.string.nice_date),
        new Event(R.string.event_tour, R.string.tour_date),
        new Event(R.string.event_plages, R.string.plages_date)
    };

    public static final Restaurant[] restaurants = {
        new Restaurant(R.string.restaurant_baratin, R.string.baratin_desc),
        new Restaurant(R.string.restaurant_desnoyer, R.string.desnoyer_desc),
        new Restaurant(R.string.restaurant_arlots, R.string.arlots_desc)
    };

    public static final SimilarPlace[] similarPlaces = {
        new SimilarPlace(R.string.place_copenhagen, R.string.copenhagen_desc),
        new SimilarPlace(R.string.place_venice, R.string.venice_desc),
        new SimilarPlace(R.string.place_prague, R.string.prague_desc)
    };

    public static class Event {
        public int name;
        public int date;

        Event(int name, int date){
            this.name = name;
            this.date = date;
        }
    }

    public static class SimilarPlace{
        public int name;
        public int description;

        SimilarPlace(int name, int description){
            this.name = name;
            this.description = description;
        }
    }

    public static class Place{
        public int name;
        public int description;
        public int imageId;

        Place(int name, int description, int imageId){
            this.name = name;
            this.description = description;
            this.imageId = imageId;
        }
    }

    public static class Restaurant{
        public int name;
        public int description;

        Restaurant(int name, int description){
            this.name = name;
            this.description = description;
        }
    }
}
