package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * @author: pighead
 * @time: 2017/9/16-下午9:59.
 * @desc:
 */

@Table(database = ZhiHuDB.class)
public final class Author extends BaseModel {
    @Column
    public String bio;
    @Column
    public boolean isFollowing;
    @Column
    public String hash;
    @Column
    public long uid;
    @Column
    public boolean isOrg;
    @Column
    public String slug;
    @Column
    public boolean isFollowed;
    @Column
    public String description;
    @PrimaryKey
    public String name;
    @Column
    public String profileUrl;
    @Column(typeConverter = AvatarConverter.class)
    public Avatar avatar;
    @Column
    public boolean isOrgWhiteList;

}
