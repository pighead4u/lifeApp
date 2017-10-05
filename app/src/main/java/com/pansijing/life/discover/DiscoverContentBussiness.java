package com.pansijing.life.discover;

import com.pansijing.life.bean.Avatar;
import com.pansijing.life.bean.DiscoverContent;

/**
 * @author: zhuhuanhuan
 * @time: 2017/9/30-下午1:14.
 * @desc: 发现页面使用的对象
 */

public final class DiscoverContentBussiness {

    /**
     * 头像
     */
    private String avatar;

    /**
     * 专栏的名字
     */
    private String name;

    /**
     * 多少天前
     */
    private String date;

    /**
     * 话题的图片
     */
    private String titleImage;

    /**
     * 话题的题目
     */
    private String title;

    /**
     * 话题的内容
     */
    private String summary;

    /**
     * 喜欢的人数
     */
    private String likesCount;

    /**
     * 评论的人数
     */
    private String commentsCount;

    public void transforData(DiscoverContent discoverContent) {
        this.avatar = transforAvatarURL(discoverContent.author.avatar);
        this.name = discoverContent.author.name;
        this.date = discoverContent.publishedTime;
        this.titleImage = discoverContent.image_url;
        this.title = discoverContent.title;
        this.summary = discoverContent.summary;
        this.likesCount = String.valueOf(discoverContent.likesCount);
        this.commentsCount = String.valueOf(discoverContent.commentsCount);
    }

    private String transforAvatarURL(Avatar avatar) {
        String url = avatar.template.replace("{id}", avatar.id);
        return url.replace("{size}", "l");
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public String getCommentsCount() {
        return commentsCount;
    }
}
