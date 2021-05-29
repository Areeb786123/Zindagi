package com.areeb.zindagi.retero;

import com.areeb.zindagi.trending_retro.Retrofit_interface;

public class Common {

    public   static  final String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    public static  int PAGE = 1;
    public static  String API_KEY = "19e9185cec4a98676856644d3e66cc2c";
    public static String LANGUAGE= "en-US";


    public static  RetrifitService getHeroes(){
        return ReterofitClient.getClient(BASE_URL).create(RetrifitService.class);
    }


}
