package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:05.
 * @desc:
 */

@Table(database = ZhiHuDB.class)
public final class ColumnAndPerson extends BaseModel {
    @Column
    public int followersCount;
    @PrimaryKey
    public String name;
    @Column
    public String url;
    @Column
    public int postsCount;
    @Column
    public String description;
    @Column
    public String slug;
    @Column
    public Avatar avatar;

}
