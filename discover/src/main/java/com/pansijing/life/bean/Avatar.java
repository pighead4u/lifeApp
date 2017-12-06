package com.pansijing.life.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:00.
 * @desc:
 */
@Entity
public final class Avatar {

    public String id;

    public String template;

    @Generated(hash = 723749969)
    public Avatar(String id, String template) {
        this.id = id;
        this.template = template;
    }

    @Generated(hash = 1438353277)
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
