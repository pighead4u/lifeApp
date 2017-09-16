package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:01.
 * @desc:
 */

@Table(database = ZhiHuDB.class)
public final class ZhiHuColumn extends BaseModel {
    @Column
    public int last_updated;
    @Column
    public String description;
    @Column
    public String permission;
    @Column
    public int member_id;
    @Column
    public String contribute_permission;
    @Column
    public String translated_comment_permission;
    @Column
    public boolean can_manage;
    @Column
    public String intro;
    @Column
    public String url_token;
    @Column
    public int id;
    @Column
    public String image_path;
    @Column
    public String slug;
    @Column
    public String apply_reason;
    @PrimaryKey
    public String name;
    @Column
    public String title;
    @Column
    public String url;
    @Column
    public String comment_permission;
    @Column
    public boolean can_post;
    @Column
    public int created;
    @Column
    public String state;
    @Column
    public int followers;
    @Column
    public boolean activate_author_requested;
    @Column
    public boolean following;
    @Column
    public String image_url;
    @Column
    public int articles_count;

}
