package com.example.demo.activity;

public class Activity {
    private Long id;
    private String activity_id;
    private String method_id;
    private String prospective;
    private String retrospective;
    private String pi;
    private String mi;

    public Activity() {
    }

    public Activity(Long id, String activity_id, String method_id, String prospective, String retrospective, String pi, String mi) {
        this.id = id;
        this.activity_id = activity_id;
        this.method_id = method_id;
        this.prospective = prospective;
        this.retrospective = retrospective;
        this.pi = pi;
        this.mi = mi;
    }

    public Activity(String activity_id, String method_id, String prospective, String retrospective, String pi, String mi) {
        this.activity_id = activity_id;
        this.method_id = method_id;
        this.prospective = prospective;
        this.retrospective = retrospective;
        this.pi = pi;
        this.mi = mi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public String getMethod_id() {
        return method_id;
    }

    public void setMethod_id(String method_id) {
        this.method_id = method_id;
    }

    public String getProspective() {
        return prospective;
    }

    public void setProspective(String prospective) {
        this.prospective = prospective;
    }

    public String getRetrospective() {
        return retrospective;
    }

    public void setRetrospective(String retrospective) {
        this.retrospective = retrospective;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", activity_id='" + activity_id + '\'' +
                ", method_id='" + method_id + '\'' +
                ", prospective='" + prospective + '\'' +
                ", retrospective='" + retrospective + '\'' +
                ", pi='" + pi + '\'' +
                ", mi='" + mi + '\'' +
                '}';
    }
}

