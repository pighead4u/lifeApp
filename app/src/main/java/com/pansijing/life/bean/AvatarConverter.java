package com.pansijing.life.bean;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * 创建者：pighead4u
 * 创建数据：2017/10/5-下午2:57.
 * 创建说明：
 * <p>
 * 修改说明：
 */

public class AvatarConverter implements PropertyConverter<Avatar, String> {
    @Override
    public Avatar convertToEntityProperty(String databaseValue) {
        String[] data = databaseValue.split(",");
        Avatar avatar = new Avatar();
        avatar.id = data[0];
        avatar.template = data[1];

        return avatar;
    }

    @Override
    public String convertToDatabaseValue(Avatar entityProperty) {
        return entityProperty.toString();
    }
}
