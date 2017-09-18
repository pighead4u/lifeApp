package com.pansijing.life.bean;

import com.raizlabs.android.dbflow.converter.TypeConverter;

/**
 * @author: pighead
 * @time: 2017/9/18-下午8:49.
 * @desc:
 */

public class AuthorConverter extends TypeConverter<String, Author> {
    @Override
    public String getDBValue(Author model) {
        return model == null ? null : model.bio + "," +
                String.valueOf(model.isFollowing) + "," +
                model.hash + "," +
                String.valueOf(model.uid) + "," +
                String.valueOf(model.isOrg) + "," +
                model.slug + "," +
                String.valueOf(model.isFollowed) + "," +
                model.description + "," +
                model.name + "," +
                model.profileUrl + "," +
                model.avatar + "," +
                String.valueOf(model.isOrgWhiteList);
    }

    @Override
    public Author getModelValue(String data) {
        String[] values = data.split(",");
        if (values.length < 13) {
            return null;
        } else {
            Author author = new Author();
            author.bio = values[0];
            author.isFollowing = Boolean.valueOf(values[1]);
            author.hash = values[2];
            author.uid = Long.valueOf(values[3]);
            author.isOrg = Boolean.valueOf(values[4]);
            author.slug = values[5];
            author.isFollowed = Boolean.valueOf(values[6]);
            author.description = values[7];
            author.name = values[8];
            author.profileUrl = values[9];
            Avatar avatar = new Avatar();
            avatar.id = values[10];
            avatar.template = values[11];
            author.avatar = avatar;
            author.isOrgWhiteList = Boolean.valueOf(values[12]);

            return author;
        }
    }
}
