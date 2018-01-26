package com.pansijing.life.bean;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

/**
 * 创建者：pighead4u
 * 创建数据：2017/10/5-下午4:36.
 * 创建说明：
 * <p>
 * 修改说明：
 */
@Entity
public final class ZhiHuDetail {

    private boolean isTitleImageFullScreen;
    private String rating;
    private String titleImage;
    private LinksEntity links;
    private boolean admin_closed_comment;
    private TitleImageSizeEntity titleImageSize;
    private String href;
    private int collapsedCount;
    private String excerptTitle;
    @PrimaryKey
    private AuthorEntity author;
    private String tipjarState;
    private String content;
    private String state;
    private String sourceUrl;
    private int pageCommentsCount;
    private boolean canComment;
    private boolean has_publishing_draft;
    private String snapshotUrl;
    private int slug;
    private String publishedTime;
    private String url;
    private String title;
    private String summary;
    private int reviewingCommentsCount;
    @Embedded
    private MetaEntity meta;
    private Object annotation_detail;
    private String commentPermission;
    private int commentsCount;
    private int likesCount;
    private List<?> reviewers;
    private List<TopicsEntity> topics;
    private List<?> annotation_action;
    private List<LastestLikersEntity> lastestLikers;

    public boolean isIsTitleImageFullScreen() {
        return isTitleImageFullScreen;
    }

    public void setIsTitleImageFullScreen(boolean isTitleImageFullScreen) {
        this.isTitleImageFullScreen = isTitleImageFullScreen;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public LinksEntity getLinks() {
        return links;
    }

    public void setLinks(LinksEntity links) {
        this.links = links;
    }

    public boolean isAdmin_closed_comment() {
        return admin_closed_comment;
    }

    public void setAdmin_closed_comment(boolean admin_closed_comment) {
        this.admin_closed_comment = admin_closed_comment;
    }

    public TitleImageSizeEntity getTitleImageSize() {
        return titleImageSize;
    }

    public void setTitleImageSize(TitleImageSizeEntity titleImageSize) {
        this.titleImageSize = titleImageSize;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getCollapsedCount() {
        return collapsedCount;
    }

    public void setCollapsedCount(int collapsedCount) {
        this.collapsedCount = collapsedCount;
    }

    public String getExcerptTitle() {
        return excerptTitle;
    }

    public void setExcerptTitle(String excerptTitle) {
        this.excerptTitle = excerptTitle;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public String getTipjarState() {
        return tipjarState;
    }

    public void setTipjarState(String tipjarState) {
        this.tipjarState = tipjarState;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public int getPageCommentsCount() {
        return pageCommentsCount;
    }

    public void setPageCommentsCount(int pageCommentsCount) {
        this.pageCommentsCount = pageCommentsCount;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isHas_publishing_draft() {
        return has_publishing_draft;
    }

    public void setHas_publishing_draft(boolean has_publishing_draft) {
        this.has_publishing_draft = has_publishing_draft;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public int getSlug() {
        return slug;
    }

    public void setSlug(int slug) {
        this.slug = slug;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getReviewingCommentsCount() {
        return reviewingCommentsCount;
    }

    public void setReviewingCommentsCount(int reviewingCommentsCount) {
        this.reviewingCommentsCount = reviewingCommentsCount;
    }

    public MetaEntity getMeta() {
        return meta;
    }

    public void setMeta(MetaEntity meta) {
        this.meta = meta;
    }

    public Object getAnnotation_detail() {
        return annotation_detail;
    }

    public void setAnnotation_detail(Object annotation_detail) {
        this.annotation_detail = annotation_detail;
    }

    public String getCommentPermission() {
        return commentPermission;
    }

    public void setCommentPermission(String commentPermission) {
        this.commentPermission = commentPermission;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public List<?> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<?> reviewers) {
        this.reviewers = reviewers;
    }

    public List<TopicsEntity> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicsEntity> topics) {
        this.topics = topics;
    }

    public List<?> getAnnotation_action() {
        return annotation_action;
    }

    public void setAnnotation_action(List<?> annotation_action) {
        this.annotation_action = annotation_action;
    }

    public List<LastestLikersEntity> getLastestLikers() {
        return lastestLikers;
    }

    public void setLastestLikers(List<LastestLikersEntity> lastestLikers) {
        this.lastestLikers = lastestLikers;
    }

    public static class LinksEntity {
        /**
         * comments : /api/posts/29862524/comments
         */

        private String comments;

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }
    }

    public static class TitleImageSizeEntity {
        /**
         * width : 1600
         * height : 884
         */

        private int width;
        private int height;

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    @Entity
    public static class AuthorEntity {
        private String bio;
        private boolean isFollowing;
        private String hash;
        @PrimaryKey
        private long uid;
        private boolean isOrg;
        private String slug;
        private boolean isFollowed;
        private String description;
        private String name;
        private String profileUrl;
        @Embedded
        private AvatarEntity avatar;
        private boolean isOrgWhiteList;
        @Embedded
        private BadgeEntity badge;

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public boolean isIsFollowing() {
            return isFollowing;
        }

        public void setIsFollowing(boolean isFollowing) {
            this.isFollowing = isFollowing;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public long getUid() {
            return uid;
        }

        public void setUid(long uid) {
            this.uid = uid;
        }

        public boolean isIsOrg() {
            return isOrg;
        }

        public void setIsOrg(boolean isOrg) {
            this.isOrg = isOrg;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public boolean isIsFollowed() {
            return isFollowed;
        }

        public void setIsFollowed(boolean isFollowed) {
            this.isFollowed = isFollowed;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public AvatarEntity getAvatar() {
            return avatar;
        }

        public void setAvatar(AvatarEntity avatar) {
            this.avatar = avatar;
        }

        public boolean isIsOrgWhiteList() {
            return isOrgWhiteList;
        }

        public void setIsOrgWhiteList(boolean isOrgWhiteList) {
            this.isOrgWhiteList = isOrgWhiteList;
        }

        public BadgeEntity getBadge() {
            return badge;
        }

        public void setBadge(BadgeEntity badge) {
            this.badge = badge;
        }

        public static class AvatarEntity {
            /**
             * id : v2-017c1ff108d23d687620b44494f973ba
             * template : https://pic3.zhimg.com/{id}_{size}.jpg
             */

            private String id;
            private String template;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTemplate() {
                return template;
            }

            public void setTemplate(String template) {
                this.template = template;
            }
        }

        public static class BadgeEntity {
            /**
             * identity : null
             * best_answerer : null
             */

            private Object identity;
            private Object best_answerer;

            public Object getIdentity() {
                return identity;
            }

            public void setIdentity(Object identity) {
                this.identity = identity;
            }

            public Object getBest_answerer() {
                return best_answerer;
            }

            public void setBest_answerer(Object best_answerer) {
                this.best_answerer = best_answerer;
            }
        }
    }

    @Entity
    public static class MetaEntity {
        /**
         * previous : null
         * next : null
         */

        private Object previous;
        private Object next;

        public Object getPrevious() {
            return previous;
        }

        public void setPrevious(Object previous) {
            this.previous = previous;
        }

        public Object getNext() {
            return next;
        }

        public void setNext(Object next) {
            this.next = next;
        }
    }

    @Entity
    public static class TopicsEntity {
        /**
         * url : https://www.zhihu.com/topic/19558438
         * id : 19558438
         * name : 建筑
         */

        private String url;
        private String id;
        private String name;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Entity
    public static class LastestLikersEntity {
        /**
         * bio : 公共事业管理大一学森
         * isFollowing : false
         * hash : 6c8eadf6c0989a27fa7077987a45c454
         * uid : 876217736362078208
         * isOrg : false
         * slug : lou-jiu-16
         * isFollowed : false
         * description :
         * name : 楼久
         * profileUrl : https://www.zhihu.com/people/lou-jiu-16
         * avatar : {"id":"v2-afca183e4f37998ab4258c94406e002a","template":"https://pic3.zhimg.com/{id}_{size}.jpg"}
         * isOrgWhiteList : false
         */

        private String bio;
        private boolean isFollowing;
        private String hash;
        private long uid;
        private boolean isOrg;
        private String slug;
        private boolean isFollowed;
        private String description;
        private String name;
        private String profileUrl;
        @Embedded
        private AvatarEntityX avatar;
        private boolean isOrgWhiteList;

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public boolean isIsFollowing() {
            return isFollowing;
        }

        public void setIsFollowing(boolean isFollowing) {
            this.isFollowing = isFollowing;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public long getUid() {
            return uid;
        }

        public void setUid(long uid) {
            this.uid = uid;
        }

        public boolean isIsOrg() {
            return isOrg;
        }

        public void setIsOrg(boolean isOrg) {
            this.isOrg = isOrg;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public boolean isIsFollowed() {
            return isFollowed;
        }

        public void setIsFollowed(boolean isFollowed) {
            this.isFollowed = isFollowed;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public AvatarEntityX getAvatar() {
            return avatar;
        }

        public void setAvatar(AvatarEntityX avatar) {
            this.avatar = avatar;
        }

        public boolean isIsOrgWhiteList() {
            return isOrgWhiteList;
        }

        public void setIsOrgWhiteList(boolean isOrgWhiteList) {
            this.isOrgWhiteList = isOrgWhiteList;
        }

        @Entity
        public static class AvatarEntityX {
            /**
             * id : v2-afca183e4f37998ab4258c94406e002a
             * template : https://pic3.zhimg.com/{id}_{size}.jpg
             */

            private String id;
            private String template;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTemplate() {
                return template;
            }

            public void setTemplate(String template) {
                this.template = template;
            }
        }
    }
}
