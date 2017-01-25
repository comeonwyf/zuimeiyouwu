package com.qf.project.zuimeiyouwu.Entity;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/1/17.
 *有物列表的实体类
 */
public class ProductListEntity implements Serializable{

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

    public static class DataEntity implements Serializable{
        private int has_next;
        private List<ProductsEntity> products;

        public void setHas_next(int has_next) {
            this.has_next = has_next;
        }

        public void setProducts(List<ProductsEntity> products) {
            this.products = products;
        }

        public int getHas_next() {
            return has_next;
        }

        public List<ProductsEntity> getProducts() {
            return products;
        }

        public static class ProductsEntity implements Serializable {
            private int unlike_user_num;
            private String sale_state;
            private int has_evaluation;
            private String name;
            private int is_on_sale;
            private int price;
            private int is_foreign;
            private String brief;
            private DesignerEntity designer;
            private String web_url;
            private int like_user_num;
            private int mark_user_num;
            private long publish_at;
            private String detail_url;
            private int id;
            private List<String> cover_images;
            private List<String> images;

            public void setUnlike_user_num(int unlike_user_num) {
                this.unlike_user_num = unlike_user_num;
            }

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

            public void setDesigner(DesignerEntity designer) {
                this.designer = designer;
            }

            public void setWeb_url(String web_url) {
                this.web_url = web_url;
            }

            public void setLike_user_num(int like_user_num) {
                this.like_user_num = like_user_num;
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

            public int getUnlike_user_num() {
                return unlike_user_num;
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

            public DesignerEntity getDesigner() {
                return designer;
            }

            public String getWeb_url() {
                return web_url;
            }

            public int getLike_user_num() {
                return like_user_num;
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

            public static class DesignerEntity implements Serializable{
                /**
                 * city : 台湾
                 * concept : 戴上简单舒服的首饰就像喝了一口纯净好水
                 * name : 林玮仁
                 * label : Moorigin 创始人
                 * avatar_url : http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg
                 * id : 296
                 */

                private String city;
                private String concept;
                private String name;
                private String label;
                private String avatar_url;
                private int id;

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
            }
        }
    }
}
