package com.areeb.zindagi.trending_retro;

public class trending_common {
    private static  final String BASE_URL = "https://api.themoviedb.org";


    public static  Retrofit_interface getTrending(){
        return  Retrofit_client.getClient(BASE_URL).create(Retrofit_interface.class);
    }
}
