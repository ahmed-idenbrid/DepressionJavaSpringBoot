package com.example.demo.depression;

public class Depression {
        private Long id;
        private Long user_id;
        private String score;
        private String level_of_depression;

    public Depression() {
    }

    public Depression(Long id, Long user_id, String score, String level_of_depression) {
        this.id = id;
        this.user_id = user_id;
        this.score = score;
        this.level_of_depression = level_of_depression;
    }

    public Depression(Long user_id, String score, String level_of_depression) {
        this.user_id = user_id;
        this.score = score;
        this.level_of_depression = level_of_depression;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLevel_of_depression() {
        return level_of_depression;
    }

    public void setLevel_of_depression(String level_of_depression) {
        this.level_of_depression = level_of_depression;
    }

    @Override
    public String toString() {
        return "Depression{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", score='" + score + '\'' +
                ", level_of_depression='" + level_of_depression + '\'' +
                '}';
    }
}

