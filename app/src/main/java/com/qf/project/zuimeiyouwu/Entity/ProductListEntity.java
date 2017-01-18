package com.qf.project.zuimeiyouwu.Entity;

import java.util.List;

/**
 * Created by Administrator on 2017/1/17.
 *有物列表的实体类
 */
public class ProductListEntity {

    /**
     * unlike_user_num : 58
     * sale_state : on_sale
     * has_evaluation : 0
     * name : Perrin Paris | 黑白拼色肩背包
     * cover_images : ["http://dstatic.zuimeia.com/common/image/2017/1/16/ba11539e-ce61-49bc-980a-bee3a5933f50_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/16/86ceb547-417e-4632-8466-71013013e3de_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/16/e050feaf-cf36-48f5-b8c9-f891bfaf5c2b_1000x1000.jpeg"]
     * is_on_sale : 0
     * price : 13400
     * is_foreign : 0
     * brief : Perrin Paris | 黑白拼色肩背包
     * designer : {"city":"巴黎","concept":"用古怪，幽默的方式去平衡优雅和繁复","name":"Chloé Perrin","label":"Perrin Paris 设计总监","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/5/93514753-bbc0-4fd6-bfd1-bdfc8a2e4c40.jpg","id":225}
     * web_url : http://design.zuimeia.com/product/2031/
     * like_user_num : 63
     * mark_user_num : 2
     * images : ["http://dstatic.zuimeia.com/common/image/2017/1/16/eb6ecd87-fe1d-491d-83d2-3d88f4cf168f_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/16/fff5bdc9-60ae-4ec7-9609-d26685a4f430_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/16/00db1f83-32a2-4746-967a-bfc01646072b_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/16/a9d908c3-99b4-43fa-b216-b6f18812eea1_1000x1000.jpeg"]
     * publish_at : 1484582400000
     * detail_url : https://design.zuimeia.com/product/mobile/webview/2031/
     * id : 2031
     */

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

    public static class DesignerEntity {
        /**
         * city : 巴黎
         * concept : 用古怪，幽默的方式去平衡优雅和繁复
         * name : Chloé Perrin
         * label : Perrin Paris 设计总监
         * avatar_url : http://dstatic.zuimeia.com/designer/avatar/2016/12/5/93514753-bbc0-4fd6-bfd1-bdfc8a2e4c40.jpg
         * id : 225
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
