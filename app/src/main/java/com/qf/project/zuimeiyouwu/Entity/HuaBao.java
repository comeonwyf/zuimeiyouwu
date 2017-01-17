package com.qf.project.zuimeiyouwu.Entity;

import com.squareup.picasso.Target;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */
public class HuaBao {

    private DataEntity data;


    private int result;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public static class DataEntity {
        private int has_next;
        /**
         * author : {"username":"苏潜","avatar_url":"http://dstatic.zuimeia.com/user/avatar/2016/08/27/a6743869c424b81b9a7faf5c283203db_225x226.jpg","is_admin":0,"id":44171,"sign":"设计故纸堆里的考古学徒"}
         * title : 川久保玲：关于我的，他们通通都猜错
         * sub_title : 她像一个孤独的男孩，和世界保持一堵墙的距离
         * favor_user_num : 7
         * web_url :
         * image_url : http://dstatic.zuimeia.com/common/image/2017/1/7/249d40ec-b168-4acf-a26a-41f7ebb504d5_500x510.jpeg
         * publish_at : 1484409600000
         * id : 147
         */

        private List<ArticlesEntity> articles;

        public int getHas_next() {
            return has_next;
        }

        public void setHas_next(int has_next) {
            this.has_next = has_next;
        }

        public List<ArticlesEntity> getArticles() {
            return articles;
        }

        public void setArticles(List<ArticlesEntity> articles) {
            this.articles = articles;
        }

        public static class ArticlesEntity {
            /**
             * username : 苏潜
             * avatar_url : http://dstatic.zuimeia.com/user/avatar/2016/08/27/a6743869c424b81b9a7faf5c283203db_225x226.jpg
             * is_admin : 0
             * id : 44171
             * sign : 设计故纸堆里的考古学徒
             */

            private AuthorEntity author;
            private String title;
            private String sub_title;
            private int favor_user_num;
            private String web_url;
            private String image_url;
            private long publish_at;
            private int id;

            public AuthorEntity getAuthor() {
                return author;
            }

            public void setAuthor(AuthorEntity author) {
                this.author = author;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public int getFavor_user_num() {
                return favor_user_num;
            }

            public void setFavor_user_num(int favor_user_num) {
                this.favor_user_num = favor_user_num;
            }

            public String getWeb_url() {
                return web_url;
            }

            public void setWeb_url(String web_url) {
                this.web_url = web_url;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public long getPublish_at() {
                return publish_at;
            }

            public void setPublish_at(long publish_at) {
                this.publish_at = publish_at;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public static class AuthorEntity {
                private String username;
                private String avatar_url;
                private int is_admin;
                private int id;
                private String sign;

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public int getIs_admin() {
                    return is_admin;
                }

                public void setIs_admin(int is_admin) {
                    this.is_admin = is_admin;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getSign() {
                    return sign;
                }

                public void setSign(String sign) {
                    this.sign = sign;
                }
            }
        }
    }
}
