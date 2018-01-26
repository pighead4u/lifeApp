package com.pansijing.life.bean;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:00.
 * @desc:
 */
@Entity
public final class Avatar {
    @PrimaryKey
    @ColumnInfo(name = "avatar_id")
    public String id;

    public String template;

    public Avatar() {
    }


    @Override
    public String toString() {
        return id + "," + template;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
