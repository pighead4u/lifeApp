package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.converter.TypeConverter;

/**
 * @author: pighead
 * @time: 2017/9/18-下午8:21.
 * @desc:
 */

@com.raizlabs.android.dbflow.annotation.TypeConverter
public class AvatarConverter extends TypeConverter<String, Avatar> {
    @Override
    public String getDBValue(Avatar model) {
        return model == null ? null : model.id + "," + model.template;
    }

    @Override
    public Avatar getModelValue(String data) {
        String[] values = data.split(",");
        if (values.length < 2) {
            return null;
        } else {
            Avatar avatar = new Avatar();
            avatar.id = values[0];
            avatar.template = values[1];
            return avatar;
        }
    }


}
