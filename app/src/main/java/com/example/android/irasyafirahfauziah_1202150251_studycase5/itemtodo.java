package com.example.android.irasyafirahfauziah_1202150251_studycase5;

/**
 * Created by Syafirah on 23/03/2018.
 */
//class ini digunakan untuk mengambil variable/objek yang digunakan di dalam database
public class itemtodo {
    String name, description, priority;

    public itemtodo(String name, String description, String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
