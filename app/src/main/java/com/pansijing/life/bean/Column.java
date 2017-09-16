package com.pansijing.life.bean;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:01.
 * @desc:
 */

public final class Column {

    private int last_updated;
    private String description;
    private String permission;
    private int member_id;
    private String contribute_permission;
    private String translated_comment_permission;
    private boolean can_manage;
    private String intro;
    private String url_token;
    private int id;
    private String image_path;
    private String slug;
    private String apply_reason;
    private String name;
    private String title;
    private String url;
    private String comment_permission;
    private boolean can_post;
    private int created;
    private String state;
    private int followers;
    private boolean activate_author_requested;
    private boolean following;
    private String image_url;
    private int articles_count;

    public int getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(int last_updated) {
        this.last_updated = last_updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getContribute_permission() {
        return contribute_permission;
    }

    public void setContribute_permission(String contribute_permission) {
        this.contribute_permission = contribute_permission;
    }

    public String getTranslated_comment_permission() {
        return translated_comment_permission;
    }

    public void setTranslated_comment_permission(String translated_comment_permission) {
        this.translated_comment_permission = translated_comment_permission;
    }

    public boolean isCan_manage() {
        return can_manage;
    }

    public void setCan_manage(boolean can_manage) {
        this.can_manage = can_manage;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getUrl_token() {
        return url_token;
    }

    public void setUrl_token(String url_token) {
        this.url_token = url_token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getApply_reason() {
        return apply_reason;
    }

    public void setApply_reason(String apply_reason) {
        this.apply_reason = apply_reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComment_permission() {
        return comment_permission;
    }

    public void setComment_permission(String comment_permission) {
        this.comment_permission = comment_permission;
    }

    public boolean isCan_post() {
        return can_post;
    }

    public void setCan_post(boolean can_post) {
        this.can_post = can_post;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public boolean isActivate_author_requested() {
        return activate_author_requested;
    }

    public void setActivate_author_requested(boolean activate_author_requested) {
        this.activate_author_requested = activate_author_requested;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getArticles_count() {
        return articles_count;
    }

    public void setArticles_count(int articles_count) {
        this.articles_count = articles_count;
    }
}
