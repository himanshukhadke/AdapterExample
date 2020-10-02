package com.example.adapterexamples;

public class Name {

    private String first_name;
    private String last_name;
    private int imagerResourseId;

    public Name(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Name(String first_name, String last_name, int imagerResourseId) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.imagerResourseId = imagerResourseId;
    }

    public int getImagerResourseId() {
        return imagerResourseId;
    }

    public void setImagerResourseId(int imagerResourseId) {
        this.imagerResourseId = imagerResourseId;
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
