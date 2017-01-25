package com.qf.project.zuimeiyouwu.Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/1/23.
 */
public class ProductDetailsEntity {
    private DataEntity data;
    private int result;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public DataEntity getData() {
        return data;
    }

    public int getResult() {
        return result;
    }

    public static class DataEntity {

        private int is_foreign;
        private int has_want_buy;
        private String web_url;
        private String digest;
        private int has_evaluation;
        private int id;
        private String detail_url;
        private String brief;
        private int like_user_num;
        private String sale_state;
        private DesignerEntity designer;
        private int comment_num;
        private int price;
        private int mark_user_num;
        private long publish_at;
        private String desc;
        private int unlike_user_num;
        private String name;
        private int is_on_sale;
        private int want_buy_count;
        private List<ReferProductsEntity> refer_products;
        /**
         * images : ["http://dstatic.zuimeia.com/common/image/2017/1/7/710843e8-ffc1-4248-aa69-64c654398b5e_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/88baa9ee-1361-4cf7-bd48-73a25737b448_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/cdccf863-bf77-49a5-9346-1e3ec2434cb9_1000x1000.jpeg"]
         */

        private List<String> images;
        /**
         * new_comments : [{"content":"淘宝已经有类似的卖的，不知道是谁抄袭了谁","is_evaluation":0,"created_at":1485046923000,"id":14969,"author":{"username":"秋水上夕阳下","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/4EB48D3179C06CC0AD90E1158A0E40C8/100","is_admin":0,"id":122499,"sign":"遇见最美的自己"}},{"content":"棒！美观，希望实用","is_evaluation":0,"created_at":1484897940000,"id":14765,"author":{"username":"ChingChingY(^_^)Y","avatar_url":"http://wx.qlogo.cn/mmopen/7SPO0mRJt6Apot8Kwib9Hv71ZKmz3XA1xsWejOztaxKKY473qpOowG23LAepIMCzL5abiaVK5ARx2mOZNh770hFT9SJEY7kEsq/0","is_admin":0,"id":121298,"sign":"遇见最美的自己"}},{"content":"哎 种着花花草草干嘛？不就是为了美观与在闲暇时候浇浇水吗？不就是为了看着每天为它浇水看他茁壮成长么","is_evaluation":0,"created_at":1484835762000,"id":14637,"author":{"username":"♚Good boy♚","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/D49B2D1289DFC3D3C411F89A82D8C6BA/100","is_admin":0,"id":120856,"sign":"遇见最美的自己"}},{"content":"可惜是玻璃喔，易碎","is_evaluation":0,"created_at":1484749578000,"id":14356,"author":{"username":"Future","avatar_url":"http://wx.qlogo.cn/mmopen/7SPO0mRJt6D0HpH8X0ib7y67TYQxrxJSLa4YPpobdCNqxc3eALMAbRTL1stkqM3npkK9u0uC1jYY5YiaSlhWxqMg/0","is_admin":0,"id":119655,"sign":"遇见最美的自己"}},{"content":"整整","is_evaluation":0,"created_at":1484741756000,"id":14323,"author":{"username":"赏小海","avatar_url":"http://wx.qlogo.cn/mmopen/Q3auHgzwzM78WLib5uVal9G6qX3kZCDHBABYXveynRVm46sS5tqVRRtszictf9vBia9LQib5BO9JPNY7C7Opc7Ne0DZHgwchrjTAx9Cb2V40bAY/0","is_admin":0,"id":119460,"sign":"遇见最美的自己"}}]
         */

        private List<NewCommentsEntity> new_comments;
        /**
         * comments : [{"content":"淘宝已经有类似的卖的，不知道是谁抄袭了谁","is_evaluation":0,"created_at":1485046923000,"id":14969,"author":{"username":"秋水上夕阳下","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/4EB48D3179C06CC0AD90E1158A0E40C8/100","is_admin":0,"id":122499,"sign":"遇见最美的自己"}},{"content":"棒！美观，希望实用","is_evaluation":0,"created_at":1484897940000,"id":14765,"author":{"username":"ChingChingY(^_^)Y","avatar_url":"http://wx.qlogo.cn/mmopen/7SPO0mRJt6Apot8Kwib9Hv71ZKmz3XA1xsWejOztaxKKY473qpOowG23LAepIMCzL5abiaVK5ARx2mOZNh770hFT9SJEY7kEsq/0","is_admin":0,"id":121298,"sign":"遇见最美的自己"}},{"content":"哎 种着花花草草干嘛？不就是为了美观与在闲暇时候浇浇水吗？不就是为了看着每天为它浇水看他茁壮成长么","is_evaluation":0,"created_at":1484835762000,"id":14637,"author":{"username":"♚Good boy♚","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/D49B2D1289DFC3D3C411F89A82D8C6BA/100","is_admin":0,"id":120856,"sign":"遇见最美的自己"}},{"content":"可惜是玻璃喔，易碎","is_evaluation":0,"created_at":1484749578000,"id":14356,"author":{"username":"Future","avatar_url":"http://wx.qlogo.cn/mmopen/7SPO0mRJt6D0HpH8X0ib7y67TYQxrxJSLa4YPpobdCNqxc3eALMAbRTL1stkqM3npkK9u0uC1jYY5YiaSlhWxqMg/0","is_admin":0,"id":119655,"sign":"遇见最美的自己"}},{"content":"整整","is_evaluation":0,"created_at":1484741756000,"id":14323,"author":{"username":"赏小海","avatar_url":"http://wx.qlogo.cn/mmopen/Q3auHgzwzM78WLib5uVal9G6qX3kZCDHBABYXveynRVm46sS5tqVRRtszictf9vBia9LQib5BO9JPNY7C7Opc7Ne0DZHgwchrjTAx9Cb2V40bAY/0","is_admin":0,"id":119460,"sign":"遇见最美的自己"}},{"content":"玻璃和软木塞可能没那么配吧","is_evaluation":0,"created_at":1484733416000,"id":14291,"author":{"username":"够钟","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/9A1611521FCA0E9262016F4C2CC04148/100","is_admin":0,"id":119261,"sign":"遇见最美的自己"}},{"content":"健忘症和懒人必备欧","is_evaluation":0,"created_at":1484728590000,"id":14270,"author":{"username":"王叔依白","avatar_url":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEIiblaIw7zFnuaQjlGyD8A40QFC7ibMzPOKPevtNHUdOXsJG6HHp2W6ck7so2IwVAf0zxO5UtfmM5aA/0","is_admin":0,"id":119174,"sign":"遇见最美的自己"}},{"content":"很厉害","is_evaluation":0,"created_at":1484706137000,"id":14215,"author":{"username":"Jayce_LML","avatar_url":"http://tva3.sinaimg.cn/crop.0.0.996.996.180/006ghxXAjw8fbti9l5pgxj30ro0rognx.jpg","is_admin":0,"id":118714,"sign":"遇见最美的自己"}},{"content":"占空间哦。","is_evaluation":0,"created_at":1484663868000,"id":14187,"author":{"username":"々","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/19BED31770D73668D93A9F3AA9EB7CDC/100","is_admin":0,"id":118352,"sign":"遇见最美的自己"}},{"content":"上下两个瓶子可以拆开吗，可以就更好了","is_evaluation":0,"created_at":1484660474000,"id":14168,"author":{"username":"智障要什么名字","avatar_url":"http://tva3.sinaimg.cn/crop.0.0.996.996.180/be51666ajw8fbo9xefd2mj20ro0ro762.jpg","is_admin":0,"id":118294,"sign":"遇见最美的自己"}}]
         */

        private List<CommentsEntity> comments;
        /**
         * desc_types : [{"desc":"适合风格：自然气息的现代简约风","image_url":"http://dstatic.zuimeia.com/product/desctype/image/2016/9/28/a8fe369e-5ba3-4c83-a94b-e7dd3cdf51a4.png","id":1,"name":"关于人"},{"desc":"适配场景：厨房、书房或卧室的窗台，封闭式阳台的花架，客厅的茶几和小咖啡桌","image_url":"http://dstatic.zuimeia.com/product/desctype/image/2016/9/28/a3c06a80-0228-4ec9-bf13-553b63429218.png","id":3,"name":"关于场景"},{"desc":"设计亮点：简洁流畅的沙漏型曲线，透明和雾面磨砂玻璃的趣味对比，这气质清新的自动浇水花瓶尤其适合作为绿植的容器，只需在下方的储水罐中加入清水，外出旅行时也不用担心家里的宝贝花草没人照料了~","image_url":"http://dstatic.zuimeia.com/product/desctype/image/2016/9/28/93d0ba12-ef73-48d8-9b6d-ff5f78352da3.png","id":2,"name":"关于商品"}]
         */

        private List<DescTypesEntity> desc_types;
        /**
         * cover_images : ["http://dstatic.zuimeia.com/common/image/2017/1/7/9b1736ae-b0d1-4f71-879b-4981ea619709_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/b6a14b27-8b0b-45e8-a1a9-00d620f37d9b_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/e4737d33-d4c4-489e-90d6-f9e98037d187_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/c2421fbe-39f3-4489-b65c-2314c78ccf7a_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/e0500eb9-d0d1-4365-bba7-a1a6e1b12e7a_1000x1000.jpeg"]
         */

        private List<String> cover_images;
        /**
         * shop_urls : [{"shop_url":"http://www.holmegaard.com/shop/products/vases/self-watering-vases","shop_name":"Holmegaard 官方网店"}]
         */

        private List<ShopUrlsEntity> shop_urls;

        public void setIs_foreign(int is_foreign) {
            this.is_foreign = is_foreign;
        }

        public void setHas_want_buy(int has_want_buy) {
            this.has_want_buy = has_want_buy;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public void setHas_evaluation(int has_evaluation) {
            this.has_evaluation = has_evaluation;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setDetail_url(String detail_url) {
            this.detail_url = detail_url;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public void setLike_user_num(int like_user_num) {
            this.like_user_num = like_user_num;
        }

        public void setSale_state(String sale_state) {
            this.sale_state = sale_state;
        }

        public void setDesigner(DesignerEntity designer) {
            this.designer = designer;
        }

        public void setComment_num(int comment_num) {
            this.comment_num = comment_num;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setMark_user_num(int mark_user_num) {
            this.mark_user_num = mark_user_num;
        }

        public void setPublish_at(long publish_at) {
            this.publish_at = publish_at;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setUnlike_user_num(int unlike_user_num) {
            this.unlike_user_num = unlike_user_num;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIs_on_sale(int is_on_sale) {
            this.is_on_sale = is_on_sale;
        }

        public void setWant_buy_count(int want_buy_count) {
            this.want_buy_count = want_buy_count;
        }

        public int getIs_foreign() {
            return is_foreign;
        }

        public int getHas_want_buy() {
            return has_want_buy;
        }

        public String getWeb_url() {
            return web_url;
        }

        public String getDigest() {
            return digest;
        }

        public int getHas_evaluation() {
            return has_evaluation;
        }

        public int getId() {
            return id;
        }

        public String getDetail_url() {
            return detail_url;
        }

        public String getBrief() {
            return brief;
        }

        public int getLike_user_num() {
            return like_user_num;
        }

        public String getSale_state() {
            return sale_state;
        }

        public DesignerEntity getDesigner() {
            return designer;
        }

        public int getComment_num() {
            return comment_num;
        }

        public int getPrice() {
            return price;
        }

        public int getMark_user_num() {
            return mark_user_num;
        }

        public long getPublish_at() {
            return publish_at;
        }

        public String getDesc() {
            return desc;
        }

        public int getUnlike_user_num() {
            return unlike_user_num;
        }

        public String getName() {
            return name;
        }

        public int getIs_on_sale() {
            return is_on_sale;
        }

        public int getWant_buy_count() {
            return want_buy_count;
        }

        public void setRefer_products(List<ReferProductsEntity> refer_products) {
            this.refer_products = refer_products;
        }

        public List<ReferProductsEntity> getRefer_products() {
            return refer_products;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public List<String> getImages() {
            return images;
        }

        public void setNew_comments(List<NewCommentsEntity> new_comments) {
            this.new_comments = new_comments;
        }

        public List<NewCommentsEntity> getNew_comments() {
            return new_comments;
        }

        public void setComments(List<CommentsEntity> comments) {
            this.comments = comments;
        }

        public List<CommentsEntity> getComments() {
            return comments;
        }

        public void setDesc_types(List<DescTypesEntity> desc_types) {
            this.desc_types = desc_types;
        }

        public List<DescTypesEntity> getDesc_types() {
            return desc_types;
        }

        public void setCover_images(List<String> cover_images) {
            this.cover_images = cover_images;
        }

        public List<String> getCover_images() {
            return cover_images;
        }

        public void setShop_urls(List<ShopUrlsEntity> shop_urls) {
            this.shop_urls = shop_urls;
        }

        public List<ShopUrlsEntity> getShop_urls() {
            return shop_urls;
        }

        public static class DesignerEntity {
            /**
             * follow_num : 178
             * city : 丹麦
             * concept : 优雅的设计不但要让人乐意观赏，还要日常好用
             * name : Peter Svarrer
             * label : Holmegaard 品牌合作设计师
             * avatar_url : http://dstatic.zuimeia.com/designer/avatar/2017/1/3/de842608-ad79-425f-af3a-dd6c0624059a.jpg
             * id : 312
             * description : 设计师 Peter Svarrer 被称为灯之大师，他擅长通过捕捉光的反射来设计玻璃制品。1977 年 Peter Svarrer 和丹麦著名品牌 Holmegaard 合作。 Holmegaard 的传奇故事可以追溯到1825年。伯爵夫人 Henriette 在国王Frederik 六世的支持下，继承丈夫 Christian Danneskiold-Samsoe 伯爵的遗愿于 1825 年在一块叫 Holmegaard 的沼泽地创立了 Holmegaard 品牌，从最初只能生产绿瓶子的小磨坊，在伯爵夫人 Henriette 坚持不懈的努力下，带着七个孩子开始了谱写丹麦玻璃制造业的童话。 在 180 多年的历史长河中，Holmegaard 曾经为8代丹麦皇室服务。时至今日，设计已经不是那些放在博物馆角落站立着被观赏的艺术品。Holmegaard 的设计与人们日常生活的食物密切相关。其产品的哲学是优雅的设计不但要让人乐意观赏，还要日常好用。
             */

            private int follow_num;
            private String city;
            private String concept;
            private String name;
            private String label;
            private String avatar_url;
            private int id;
            private String description;

            public void setFollow_num(int follow_num) {
                this.follow_num = follow_num;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public void setConcept(String concept) {
                this.concept = concept;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getFollow_num() {
                return follow_num;
            }

            public String getCity() {
                return city;
            }

            public String getConcept() {
                return concept;
            }

            public String getName() {
                return name;
            }

            public String getLabel() {
                return label;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public int getId() {
                return id;
            }

            public String getDescription() {
                return description;
            }
        }

        public static class ReferProductsEntity {
            /**
             * sale_state : on_sale
             * has_evaluation : 0
             * name : Holmegaard | 'Urania' 玻璃扬声器
             * cover_images : ["http://dstatic.zuimeia.com/common/image/2017/1/7/b5ce7901-43c3-4d1c-9d68-1eb92e5540a6_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/33e24070-228f-40ec-8811-3fb0648a48a2_1000x1000.jpeg"]
             * is_on_sale : 0
             * price : 980
             * is_foreign : 0
             * brief : Holmegaard | 'Urania' 玻璃扬声器
             * web_url : http://design.zuimeia.com/product/1968/
             * mark_user_num : 80
             * images : ["http://dstatic.zuimeia.com/common/image/2017/1/7/f9e26e46-4b2a-4ba4-91f9-db66815855f9_1000x1000.jpeg"]
             * publish_at : 1484236800000
             * detail_url : https://design.zuimeia.com/product/mobile/webview/1968/
             * id : 1968
             */

            private String sale_state;
            private int has_evaluation;
            private String name;
            private int is_on_sale;
            private int price;
            private int is_foreign;
            private String brief;
            private String web_url;
            private int mark_user_num;
            private long publish_at;
            private String detail_url;
            private int id;
            private List<String> cover_images;
            private List<String> images;

            public void setSale_state(String sale_state) {
                this.sale_state = sale_state;
            }

            public void setHas_evaluation(int has_evaluation) {
                this.has_evaluation = has_evaluation;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setIs_on_sale(int is_on_sale) {
                this.is_on_sale = is_on_sale;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public void setIs_foreign(int is_foreign) {
                this.is_foreign = is_foreign;
            }

            public void setBrief(String brief) {
                this.brief = brief;
            }

            public void setWeb_url(String web_url) {
                this.web_url = web_url;
            }

            public void setMark_user_num(int mark_user_num) {
                this.mark_user_num = mark_user_num;
            }

            public void setPublish_at(long publish_at) {
                this.publish_at = publish_at;
            }

            public void setDetail_url(String detail_url) {
                this.detail_url = detail_url;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setCover_images(List<String> cover_images) {
                this.cover_images = cover_images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public String getSale_state() {
                return sale_state;
            }

            public int getHas_evaluation() {
                return has_evaluation;
            }

            public String getName() {
                return name;
            }

            public int getIs_on_sale() {
                return is_on_sale;
            }

            public int getPrice() {
                return price;
            }

            public int getIs_foreign() {
                return is_foreign;
            }

            public String getBrief() {
                return brief;
            }

            public String getWeb_url() {
                return web_url;
            }

            public int getMark_user_num() {
                return mark_user_num;
            }

            public long getPublish_at() {
                return publish_at;
            }

            public String getDetail_url() {
                return detail_url;
            }

            public int getId() {
                return id;
            }

            public List<String> getCover_images() {
                return cover_images;
            }

            public List<String> getImages() {
                return images;
            }
        }

        public static class NewCommentsEntity {
            /**
             * content : 淘宝已经有类似的卖的，不知道是谁抄袭了谁
             * is_evaluation : 0
             * created_at : 1485046923000
             * id : 14969
             * author : {"username":"秋水上夕阳下","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/4EB48D3179C06CC0AD90E1158A0E40C8/100","is_admin":0,"id":122499,"sign":"遇见最美的自己"}
             */

            private String content;
            private int is_evaluation;
            private long created_at;
            private int id;
            private AuthorEntity author;

            public void setContent(String content) {
                this.content = content;
            }

            public void setIs_evaluation(int is_evaluation) {
                this.is_evaluation = is_evaluation;
            }

            public void setCreated_at(long created_at) {
                this.created_at = created_at;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setAuthor(AuthorEntity author) {
                this.author = author;
            }

            public String getContent() {
                return content;
            }

            public int getIs_evaluation() {
                return is_evaluation;
            }

            public long getCreated_at() {
                return created_at;
            }

            public int getId() {
                return id;
            }

            public AuthorEntity getAuthor() {
                return author;
            }

            public static class AuthorEntity {
                /**
                 * username : 秋水上夕阳下
                 * avatar_url : http://q.qlogo.cn/qqapp/1105321739/4EB48D3179C06CC0AD90E1158A0E40C8/100
                 * is_admin : 0
                 * id : 122499
                 * sign : 遇见最美的自己
                 */

                private String username;
                private String avatar_url;
                private int is_admin;
                private int id;
                private String sign;

                public void setUsername(String username) {
                    this.username = username;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public void setIs_admin(int is_admin) {
                    this.is_admin = is_admin;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public void setSign(String sign) {
                    this.sign = sign;
                }

                public String getUsername() {
                    return username;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public int getIs_admin() {
                    return is_admin;
                }

                public int getId() {
                    return id;
                }

                public String getSign() {
                    return sign;
                }
            }
        }

        public static class CommentsEntity {
            /**
             * content : 淘宝已经有类似的卖的，不知道是谁抄袭了谁
             * is_evaluation : 0
             * created_at : 1485046923000
             * id : 14969
             * author : {"username":"秋水上夕阳下","avatar_url":"http://q.qlogo.cn/qqapp/1105321739/4EB48D3179C06CC0AD90E1158A0E40C8/100","is_admin":0,"id":122499,"sign":"遇见最美的自己"}
             */

            private String content;
            private int is_evaluation;
            private long created_at;
            private int id;
            private AuthorEntity author;

            public void setContent(String content) {
                this.content = content;
            }

            public void setIs_evaluation(int is_evaluation) {
                this.is_evaluation = is_evaluation;
            }

            public void setCreated_at(long created_at) {
                this.created_at = created_at;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setAuthor(AuthorEntity author) {
                this.author = author;
            }

            public String getContent() {
                return content;
            }

            public int getIs_evaluation() {
                return is_evaluation;
            }

            public long getCreated_at() {
                return created_at;
            }

            public int getId() {
                return id;
            }

            public AuthorEntity getAuthor() {
                return author;
            }

            public static class AuthorEntity {
                /**
                 * username : 秋水上夕阳下
                 * avatar_url : http://q.qlogo.cn/qqapp/1105321739/4EB48D3179C06CC0AD90E1158A0E40C8/100
                 * is_admin : 0
                 * id : 122499
                 * sign : 遇见最美的自己
                 */

                private String username;
                private String avatar_url;
                private int is_admin;
                private int id;
                private String sign;

                public void setUsername(String username) {
                    this.username = username;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public void setIs_admin(int is_admin) {
                    this.is_admin = is_admin;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public void setSign(String sign) {
                    this.sign = sign;
                }

                public String getUsername() {
                    return username;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public int getIs_admin() {
                    return is_admin;
                }

                public int getId() {
                    return id;
                }

                public String getSign() {
                    return sign;
                }
            }
        }

        public static class DescTypesEntity {
            /**
             * desc : 适合风格：自然气息的现代简约风
             * image_url : http://dstatic.zuimeia.com/product/desctype/image/2016/9/28/a8fe369e-5ba3-4c83-a94b-e7dd3cdf51a4.png
             * id : 1
             * name : 关于人
             */

            private String desc;
            private String image_url;
            private int id;
            private String name;

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDesc() {
                return desc;
            }

            public String getImage_url() {
                return image_url;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }

        public static class ShopUrlsEntity {
            /**
             * shop_url : http://www.holmegaard.com/shop/products/vases/self-watering-vases
             * shop_name : Holmegaard 官方网店
             */

            private String shop_url;
            private String shop_name;

            public void setShop_url(String shop_url) {
                this.shop_url = shop_url;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public String getShop_url() {
                return shop_url;
            }

            public String getShop_name() {
                return shop_name;
            }
        }
    }
}
