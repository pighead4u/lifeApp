package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.converter.TypeConverter;

/**
 * @author: pighead
 * @time: 2017/9/18-下午8:31.
 * @desc:
 */

public class ZhiHuColumnConverter extends TypeConverter<String, ZhiHuColumn> {
    @Override
    public String getDBValue(ZhiHuColumn model) {

        return model == null ? null : String.valueOf(model.last_updated) + "," +
                model.description + "," +
                model.permission + "," +
                String.valueOf(model.member_id) + "," +
                model.contribute_permission + "," +
                model.translated_comment_permission + "," +
                String.valueOf(model.can_manage) + "," +
                model.intro + "," +
                model.url_token + "," +
                String.valueOf(model.id) + "," +
                model.image_path + "," +
                model.slug + "," +
                model.apply_reason + "," +
                model.name + "," +
                model.title + "," +
                model.url + "," +
                model.comment_permission + "," +
                String.valueOf(model.can_post) + "," +
                String.valueOf(model.created) + "," +
                model.state + "," +
                String.valueOf(model.followers) + "," +
                String.valueOf(model.activate_author_requested) + "," +
                String.valueOf(model.following) + "," +
                model.image_url + "," +
                String.valueOf(model.articles_count);
    }

    @Override
    public ZhiHuColumn getModelValue(String data) {
        String[] values = data.split(",");
        if (values.length < 25) {
            return null;
        } else {
            ZhiHuColumn zhiHuColumn = new ZhiHuColumn();
            zhiHuColumn.last_updated = Integer.valueOf(values[0]);
            zhiHuColumn.description = values[1];
            zhiHuColumn.permission = values[2];
            zhiHuColumn.member_id = Integer.valueOf(values[3]);
            zhiHuColumn.contribute_permission = values[4];
            zhiHuColumn.translated_comment_permission = values[5];
            zhiHuColumn.can_manage = Boolean.valueOf(values[6]);
            zhiHuColumn.intro = values[7];
            zhiHuColumn.url_token = values[8];
            zhiHuColumn.id = Integer.valueOf(values[9]);
            zhiHuColumn.image_path = values[10];
            zhiHuColumn.slug = values[11];
            zhiHuColumn.apply_reason = values[12];
            zhiHuColumn.name = values[13];
            zhiHuColumn.title = values[14];
            zhiHuColumn.url = values[15];
            zhiHuColumn.comment_permission = values[16];
            zhiHuColumn.can_post = Boolean.valueOf(values[17]);
            zhiHuColumn.created = Integer.valueOf(values[18]);
            zhiHuColumn.state = values[19];
            zhiHuColumn.followers = Integer.valueOf(values[20]);
            zhiHuColumn.activate_author_requested = Boolean.valueOf(values[21]);
            zhiHuColumn.following = Boolean.valueOf(values[22]);
            zhiHuColumn.image_url = values[23];
            zhiHuColumn.articles_count = Integer.valueOf(values[24]);
            return zhiHuColumn;
        }
    }
}
