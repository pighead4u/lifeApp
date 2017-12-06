package com.pansijing.life.discover;

import com.pansijing.life.bean.ZhiHuDetail;

/**
 * 创建者：pighead4u
 * 创建数据：2017/10/5-下午4:29.
 * 创建说明：点击发现页面中的一个item对应的bean
 * <p>
 * 修改说明：
 */

public final class ZhiHuDetailBussiness {
    /**
     * 标题
     */
    private String title;
    /**
     * 标题的图片
     */
    private String titleImagePath;
    /**
     * 专栏的头像
     */
    private String avatarPath;
    /**
     * 网页的url
     */
    private String url;

    public void transforData(ZhiHuDetail detail) {
        title = detail.getTitle();
        titleImagePath = detail.getTitleImage();
        avatarPath = transforAvatar(detail.getAuthor().getAvatar());
        url = detail.getContent();
    }

    private String transforAvatar(ZhiHuDetail.AuthorEntity.AvatarEntity avatarEntity) {
        String url = avatarEntity.getTemplate().replace("{id}", avatarEntity.getId());

        return url.replace("{size}", "l");
    }

    public String getTitle() {
        return title;
    }

    public String getTitleImagePath() {
        return titleImagePath;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public String getUrl() {
        return url;
    }
}
