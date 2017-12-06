package com.pansijing.life.bean;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: pighead
 * @time: 2017/9/16-下午9:59.
 * @desc:
 */

@Entity
public final class Author {
      
    public String bio;

    public boolean isFollowing;

    public String hash;

    public long uid;

    public boolean isOrg;

    public String slug;

    public boolean isFollowed;

    public String description;

    public String name;

    public String profileUrl;

    public boolean isOrgWhiteList;

    @Convert(converter = AvatarConverter.class, columnType = String.class)
    public Avatar avatar;

    @Generated(hash = 1036687781)
    public Author(String bio, boolean isFollowing, String hash, long uid,
                  boolean isOrg, String slug, boolean isFollowed, String description,
                  String name, String profileUrl, boolean isOrgWhiteList, Avatar avatar) {
        this.bio = bio;
        this.isFollowing = isFollowing;
        this.hash = hash;
        this.uid = uid;
        this.isOrg = isOrg;
        this.slug = slug;
        this.isFollowed = isFollowed;
        this.description = description;
        this.name = name;
        this.profileUrl = profileUrl;
        this.isOrgWhiteList = isOrgWhiteList;
        this.avatar = avatar;
    }

    @Generated(hash = 64241762)
    public Author() {
    }

    @Override
    public String toString() {
        return bio + "," +
                isFollowing + "," +
                hash + "," +
                uid + "," +
                isOrg + "," +
                slug + "," +
                isFollowed + "," +
                description + "," +
                name + "," +
                profileUrl + "," +
                isOrgWhiteList + "," +
                avatar.toString();
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean getIsFollowing() {
        return this.isFollowing;
    }

    public void setIsFollowing(boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getUid() {
        return this.uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public boolean getIsOrg() {
        return this.isOrg;
    }

    public void setIsOrg(boolean isOrg) {
        this.isOrg = isOrg;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean getIsFollowed() {
        return this.isFollowed;
    }

    public void setIsFollowed(boolean isFollowed) {
        this.isFollowed = isFollowed;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileUrl() {
        return this.profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public boolean getIsOrgWhiteList() {
        return this.isOrgWhiteList;
    }

    public void setIsOrgWhiteList(boolean isOrgWhiteList) {
        this.isOrgWhiteList = isOrgWhiteList;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
