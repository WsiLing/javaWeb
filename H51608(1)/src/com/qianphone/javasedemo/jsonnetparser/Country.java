package com.qianphone.javasedemo.jsonnetparser;

/**
 * Created by Admin on 2017/1/6.
 */
public class Country {
    private int id;
    private String name_zh_cn;
    private String name_en;
    private String image_url;
    private int poi_count;
    private long updated_at;
    private float lat;
    private float lng;

    public Country() {
    }

    public Country(int id, String name_zh_cn, String name_en, String image_url, int poi_count, long updated_at, float lat, float lng) {
        this.id = id;
        this.name_zh_cn = name_zh_cn;
        this.name_en = name_en;
        this.image_url = image_url;
        this.poi_count = poi_count;
        this.updated_at = updated_at;
        this.lat = lat;
        this.lng = lng;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_zh_cn() {
        return name_zh_cn;
    }

    public void setName_zh_cn(String name_zh_cn) {
        this.name_zh_cn = name_zh_cn;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getPoi_count() {
        return poi_count;
    }

    public void setPoi_count(int poi_count) {
        this.poi_count = poi_count;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }
}
