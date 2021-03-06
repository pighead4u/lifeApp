package com.pansijing.life.bean;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;

/**
 * @author: pighead
 * @time: 2017/9/16-下午9:49.
 * @desc:
 */
@Entity(primaryKeys = {"orig_author_id", "discover_created"})
public class DiscoverContent {

    public String titleImage;

    @ColumnInfo(name = "discover_image_path")
    public String image_path;
    @ColumnInfo(name = "discover_permission")
    public String permission;

    public String summary;

    public String copy_permission;
    @ColumnInfo(name = "discover_translated_comment_permission")
    public String translated_comment_permission;

    public int likes;
    public int orig_author_id;

    public String publishedTime;

    public String source_url;
    @ColumnInfo(name = "discover_url_token")
    public int url_token;
    @ColumnInfo(name = "discover_slug")
    public int slug;

    public boolean big_title_image;
    @ColumnInfo(name = "discover_title")
    public String title;
    @ColumnInfo(name = "discover_url")
    public String url;
    @ColumnInfo(name = "discover_comment_permission")
    public String comment_permission;

    public String snapshot_url;
    @ColumnInfo(name = "discover_created")
    public int created;

    public int comments;

    public String content;
    @ColumnInfo(name = "discover_state")
    public String state;
    @ColumnInfo(name = "discover_image_url")
    public String image_url;

    public String excerpt_title;

    public String vote_type;

    public int commentsCount;

    public int likesCount;
    @Embedded
    public Author author;
    @Embedded
    public ZhiHuColumn zhiHuColumn;

    public DiscoverContent() {
    }

    public String getTitleImage() {
        return this.titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public String getImage_path() {
        return this.image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCopy_permission() {
        return this.copy_permission;
    }

    public void setCopy_permission(String copy_permission) {
        this.copy_permission = copy_permission;
    }

    public String getTranslated_comment_permission() {
        return this.translated_comment_permission;
    }

    public void setTranslated_comment_permission(
            String translated_comment_permission) {
        this.translated_comment_permission = translated_comment_permission;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getOrig_author_id() {
        return this.orig_author_id;
    }

    public void setOrig_author_id(int orig_author_id) {
        this.orig_author_id = orig_author_id;
    }

    public String getPublishedTime() {
        return this.publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getSource_url() {
        return this.source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public int getUrl_token() {
        return this.url_token;
    }

    public void setUrl_token(int url_token) {
        this.url_token = url_token;
    }

    public int getSlug() {
        return this.slug;
    }

    public void setSlug(int slug) {
        this.slug = slug;
    }

    public boolean getBig_title_image() {
        return this.big_title_image;
    }

    public void setBig_title_image(boolean big_title_image) {
        this.big_title_image = big_title_image;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComment_permission() {
        return this.comment_permission;
    }

    public void setComment_permission(String comment_permission) {
        this.comment_permission = comment_permission;
    }

    public String getSnapshot_url() {
        return this.snapshot_url;
    }

    public void setSnapshot_url(String snapshot_url) {
        this.snapshot_url = snapshot_url;
    }

    public int getCreated() {
        return this.created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getComments() {
        return this.comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getExcerpt_title() {
        return this.excerpt_title;
    }

    public void setExcerpt_title(String excerpt_title) {
        this.excerpt_title = excerpt_title;
    }

    public String getVote_type() {
        return this.vote_type;
    }

    public void setVote_type(String vote_type) {
        this.vote_type = vote_type;
    }

    public int getCommentsCount() {
        return this.commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public int getLikesCount() {
        return this.likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public ZhiHuColumn getZhiHuColumn() {
        return this.zhiHuColumn;
    }

    public void setZhiHuColumn(ZhiHuColumn zhiHuColumn) {
        this.zhiHuColumn = zhiHuColumn;
    }


}
