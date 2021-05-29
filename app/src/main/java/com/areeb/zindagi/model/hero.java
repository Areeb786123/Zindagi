package com.areeb.zindagi.model;

import java.util.SplittableRandom;

public class hero {
    private String name ;
    private String realname ;
    private String imageurl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public hero(String name, String realname, String imageurl) {
        this.name = name;
        this.realname = realname;
        this.imageurl = imageurl;
    }
}
