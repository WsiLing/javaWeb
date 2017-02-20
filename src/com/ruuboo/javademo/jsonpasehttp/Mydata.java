package com.ruuboo.javademo.jsonpasehttp;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Mydata {
    private int id;
    private String name;
    private int budget;
    private String start_date;
    private String description;
    private int plan_days_count;
    private String user_name;
    private String image_url;
    private long updated_at;

    public Mydata() {
    }

    public Mydata(int id, String name, int budget, String start_date, String description, int plan_days_count, String user_name, String image_url, long updated_at) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.start_date = start_date;
        this.description = description;
        this.plan_days_count = plan_days_count;
        this.user_name = user_name;
        this.image_url = image_url;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPlan_days_count() {
        return plan_days_count;
    }

    public void setPlan_days_count(int plan_days_count) {
        this.plan_days_count = plan_days_count;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }
}
