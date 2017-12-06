package com.pansijing.life.bean;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * 创建者：pighead4u
 * 创建数据：2017/10/5-下午3:08.
 * 创建说明：Author的数据库映射类
 * <p>
 * 修改说明：
 */

public final class AuthorConverter implements PropertyConverter<Author, String> {
    @Override
    public Author convertToEntityProperty(String databaseValue) {
        String[] tmp = databaseValue.split(",");

        Author author = new Author();
        author.bio = tmp[0];
        author.isFollowing = Boolean.valueOf(tmp[1]);
        author.hash = tmp[2];
        author.uid = Long.valueOf(tmp[3]);
        author.isOrg = Boolean.valueOf(tmp[4]);
        author.slug = tmp[5];
        author.isFollowed = Boolean.valueOf(tmp[6]);
        author.description = tmp[7];
        author.name = tmp[8];
        author.profileUrl = tmp[9];
        author.isOrgWhiteList = Boolean.valueOf(tmp[10]);

        Avatar avatar = new Avatar();
        avatar.id = tmp[11];
        avatar.template = tmp[12];

        author.avatar = avatar;

        return author;
    }

    @Override
    public String convertToDatabaseValue(Author entityProperty) {
        return entityProperty.toString();
    }
}
