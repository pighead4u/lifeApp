package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:00.
 * @desc:
 */

@Table(database = ZhiHuDB.class)
public final class Avatar {
    @PrimaryKey
    public String id;
    @Column
    public String template;

    @Override
    public String toString() {
        return id + "," + template;
    }
}
