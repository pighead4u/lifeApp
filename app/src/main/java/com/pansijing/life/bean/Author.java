package com.pansijing.life.bean;

/**
 * @author: pighead
 * @time: 2017/9/16-下午9:59.
 * @desc:
 */

public final class Author {
    private String bio;
    private boolean isFollowing;
    private String hash;
    private long uid;
    private boolean isOrg;
    private String slug;
    private boolean isFollowed;
    private String description;
    private String name;
    private String profileUrl;
    private Avatar avatar;
    private boolean isOrgWhiteList;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isFollowing() {
        return isFollowing;
    }

    public void setFollowing(boolean following) {
        isFollowing = following;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public boolean isOrg() {
        return isOrg;
    }

    public void setOrg(boolean org) {
        isOrg = org;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isFollowed() {
        return isFollowed;
    }

    public void setFollowed(boolean followed) {
        isFollowed = followed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public boolean isOrgWhiteList() {
        return isOrgWhiteList;
    }

    public void setOrgWhiteList(boolean orgWhiteList) {
        isOrgWhiteList = orgWhiteList;
    }
}
