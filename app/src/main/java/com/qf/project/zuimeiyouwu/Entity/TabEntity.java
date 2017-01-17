package com.qf.project.zuimeiyouwu.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * 导航的实体类
 */
public class TabEntity implements Serializable{
    private int id;
    private String name;
    private List<SubCategoriesEntity> sub_categories;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSub_categories(List<SubCategoriesEntity> sub_categories) {
        this.sub_categories = sub_categories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<SubCategoriesEntity> getSub_categories() {
        return sub_categories;
    }

    public static class SubCategoriesEntity implements Serializable{
        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
