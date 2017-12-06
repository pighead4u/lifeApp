package com.pansijing.life.bean;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * 创建者：pighead4u
 * 创建数据：2017/10/5-下午3:37.
 * 创建说明：zhihu专栏的映射类
 * <p>
 * 修改说明：
 */

public final class ZhiHuColumnConverter implements PropertyConverter<ZhiHuColumn, String> {
    @Override
    public ZhiHuColumn convertToEntityProperty(String databaseValue) {
        String[] tmp = databaseValue.split(",");
        ZhiHuColumn zhiHu = new ZhiHuColumn();
        zhiHu.last_updated = Integer.valueOf(tmp[0]);
        zhiHu.description = tmp[1];
        zhiHu.permission = tmp[2];
        zhiHu.member_id = Integer.valueOf(tmp[3]);
        zhiHu.contribute_permission = tmp[4];
        zhiHu.translated_comment_permission = tmp[5];
        zhiHu.can_manage = Boolean.valueOf(tmp[6]);
        zhiHu.intro = tmp[7];
        zhiHu.url_token = tmp[8];
        zhiHu.id = Integer.valueOf(tmp[9]);
        zhiHu.image_path = tmp[10];
        zhiHu.slug = tmp[11];
        zhiHu.apply_reason = tmp[12];
        zhiHu.name = tmp[13];
        zhiHu.title = tmp[14];
        zhiHu.url = tmp[15];
        zhiHu.comment_permission = tmp[16];
        zhiHu.can_post = Boolean.valueOf(tmp[17]);
        zhiHu.created = Integer.valueOf(tmp[18]);
        zhiHu.state = tmp[19];
        zhiHu.followers = Integer.valueOf(tmp[20]);
        zhiHu.activate_author_requested = Boolean.valueOf(tmp[21]);
        zhiHu.following = Boolean.valueOf(tmp[22]);
        zhiHu.image_url = tmp[23];
        zhiHu.articles_count = Integer.valueOf(tmp[24]);

        return zhiHu;
    }

    @Override
    public String convertToDatabaseValue(ZhiHuColumn entityProperty) {
        return entityProperty.toString();
    }
}
