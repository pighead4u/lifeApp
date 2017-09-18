package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * @author: pighead
 * @time: 2017/9/16-下午9:49.
 * @desc:
 */

@Table(database = ZhiHuDB.class)
public class DiscoverContent extends BaseModel {
    @Column
    public String titleImage;
    @Column
    public String image_path;
    @Column
    public String permission;
    @Column
    public String summary;
    @Column
    public String copy_permission;
    @Column
    public String translated_comment_permission;
    @Column
    public int likes;
    @Column
    public int orig_author_id;
    @Column
    public String publishedTime;
    @Column
    public String source_url;
    @Column
    public int url_token;
    @PrimaryKey
    public int slug;
    @Column
    public boolean big_title_image;
    @Column
    public String title;
    @Column
    public String url;
    @Column
    public String comment_permission;
    @Column
    public String snapshot_url;
    @Column
    public int created;
    @Column(typeConverter = ZhiHuColumnConverter.class)
    public ZhiHuColumn zhiHuColumn;
    @Column
    public int comments;
    @Column
    public String content;
    @Column
    public String state;
    @Column
    public String image_url;
    @Column(typeConverter = AuthorConverter.class)
    public Author author;
    @Column
    public String excerpt_title;
    @Column
    public String vote_type;
    @Column
    public int commentsCount;
    @Column
    public int likesCount;



}
