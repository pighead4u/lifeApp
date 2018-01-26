package com.pansijing.life.bean;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:01.
 * @desc:
 */
@Entity
public final class ZhiHuColumn {
    
    public int last_updated;

    @ColumnInfo(name = "zhihu_description")
    public String description;

    public String permission;

    @PrimaryKey
    @ColumnInfo(name = "zhihucolumn_member_id")
    public int member_id;

    public String contribute_permission;

    public String translated_comment_permission;

    public boolean can_manage;

    public String intro;

    public String url_token;

    @ColumnInfo(name = "zhihu_id")
    public int id;

    public String image_path;

    @ColumnInfo(name = "zhihu_slug")
    public String slug;

    public String apply_reason;
    @ColumnInfo(name = "zhihu_name")
    public String name;

    public String title;

    public String url;

    public String comment_permission;

    public boolean can_post;

    public int created;

    public String state;

    public int followers;

    public boolean activate_author_requested;

    public boolean following;

    public String image_url;

    public int articles_count;

    public ZhiHuColumn() {
    }

    @Override
    public String toString() {
        return last_updated + "," +
                description + "," +
                permission + "," +
                member_id + "," +
                contribute_permission + "," +
                translated_comment_permission + "," +
                can_manage + "," +
                intro + "," +
                url_token + "," +
                id + "," +
                image_path + "," +
                slug + "," +
                apply_reason + "," +
                name + "," +
                title + "," +
                url + "," +
                comment_permission + "," +
                can_post + "," +
                created + "," +
                state + "," +
                followers + "," +
                activate_author_requested + "," +
                following + "," +
                image_url + "," +
                articles_count;
    }

    public int getLast_updated() {
        return this.last_updated;
    }

    public void setLast_updated(int last_updated) {
        this.last_updated = last_updated;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public int getMember_id() {
        return this.member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getContribute_permission() {
        return this.contribute_permission;
    }

    public void setContribute_permission(String contribute_permission) {
        this.contribute_permission = contribute_permission;
    }

    public String getTranslated_comment_permission() {
        return this.translated_comment_permission;
    }

    public void setTranslated_comment_permission(
            String translated_comment_permission) {
        this.translated_comment_permission = translated_comment_permission;
    }

    public boolean getCan_manage() {
        return this.can_manage;
    }

    public void setCan_manage(boolean can_manage) {
        this.can_manage = can_manage;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getUrl_token() {
        return this.url_token;
    }

    public void setUrl_token(String url_token) {
        this.url_token = url_token;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_path() {
        return this.image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getApply_reason() {
        return this.apply_reason;
    }

    public void setApply_reason(String apply_reason) {
        this.apply_reason = apply_reason;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean getCan_post() {
        return this.can_post;
    }

    public void setCan_post(boolean can_post) {
        this.can_post = can_post;
    }

    public int getCreated() {
        return this.created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getFollowers() {
        return this.followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public boolean getActivate_author_requested() {
        return this.activate_author_requested;
    }

    public void setActivate_author_requested(boolean activate_author_requested) {
        this.activate_author_requested = activate_author_requested;
    }

    public boolean getFollowing() {
        return this.following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getArticles_count() {
        return this.articles_count;
    }

    public void setArticles_count(int articles_count) {
        this.articles_count = articles_count;
    }
}
