package com.pansijing.life.bean;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: pighead
 * @time: 2017/9/16-下午10:05.
 * @desc:
 */

@Entity
public final class ColumnAndPerson {
     
    public int followersCount;

    public String name;

    public String url;

    public int postsCount;

    public String description;

    public String slug;

    @Convert(converter = AvatarConverter.class, columnType = String.class)
    public Avatar avatar;

    @Generated(hash = 1975360588)
    public ColumnAndPerson(int followersCount, String name, String url,
                           int postsCount, String description, String slug, Avatar avatar) {
        this.followersCount = followersCount;
        this.name = name;
        this.url = url;
        this.postsCount = postsCount;
        this.description = description;
        this.slug = slug;
        this.avatar = avatar;
    }

    @Generated(hash = 1469211948)
    public ColumnAndPerson() {
    }

    public int getFollowersCount() {
        return this.followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPostsCount() {
        return this.postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

}
