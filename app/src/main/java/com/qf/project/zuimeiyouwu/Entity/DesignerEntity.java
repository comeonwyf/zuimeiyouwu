package com.qf.project.zuimeiyouwu.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/1/17.
 */
public class DesignerEntity implements Serializable {

    /**
     * has_next : 1
     * designers : [{"follow_num":155,"city":"波兰","concept":"灵感如风，常伴我身","name":"Justyna","label":"做出了世界上最可爱的钟","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/26/62f4c59a-31af-478e-b191-d53316a939d0.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/26/755d1088-547c-47c8-8d38-ab85137511bf_1000x625.jpeg"],"id":284,"categories":[{"id":27,"name":"家居"},{"id":30,"name":"独立设计师"}]},{"follow_num":67,"city":"米兰","concept":"","name":"Nemo","label":"灯饰公司","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/26/ab6793cc-9ac6-46a9-be97-d2864e18cd8d.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/26/cffbcbf2-615c-4a35-80f0-72eafc8e0b6d_1000x625.jpeg"],"id":283,"categories":[{"id":27,"name":"家居"},{"id":35,"name":"米兰"}]},{"follow_num":224,"city":"丹麦","concept":"","name":"Georg Jensen","label":"Georg Jensen 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/22/6e0cd04c-9015-479c-8c73-64bc9a60b269.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/22/63e6cce3-f3c1-4dd8-acc1-127105574428_1000x625.jpeg"],"id":268,"categories":[{"id":31,"name":"大牌设计师"}]},{"follow_num":908,"city":"巴黎","concept":"用古怪，幽默的方式去平衡优雅和繁复","name":"Chloé Perrin","label":"Perrin Paris 设计总监","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/5/93514753-bbc0-4fd6-bfd1-bdfc8a2e4c40.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/5/73d871ab-6a73-4c8c-8fbd-68dc532da3ba_1000x625.jpeg"],"id":225,"categories":[{"id":3,"name":"包袋"},{"id":31,"name":"大牌设计师"},{"id":39,"name":"巴黎"}]},{"follow_num":636,"city":"伦敦","concept":"新锐、前卫、浪漫与迷幻相得益彰","name":"Mary Katrantzou","label":"Mary Katrantzou 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/5/b6a889f5-a863-4190-9be1-6e584b661c42.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/5/e37420b4-f347-43a1-9b2b-7cfc28c4f125_1000x625.jpeg"],"id":224,"categories":[{"id":3,"name":"包袋"},{"id":28,"name":"伦敦"},{"id":31,"name":"大牌设计师"}]},{"follow_num":452,"city":"柏林","concept":"为珍惜和培养个人时尚风格的女性所设计","name":"Anne-Christin & Michael Georg Schmit","label":"Gretchen 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/5/59f5bc00-c5f1-4dae-8f2b-16968c794d02.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/5/b48096e2-673d-423a-8cea-8f9be072112a_1000x625.jpeg"],"id":223,"categories":[{"id":31,"name":"大牌设计师"},{"id":54,"name":"柏林"}]},{"follow_num":499,"city":"巴黎","concept":"珠宝不仅要时尚，还应充满奇异的趣味感","name":"Aurelie Bidermann","label":"Aurelie Bidermann 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/5/ad383d30-1b29-4bae-9db2-4d6e2ce2261c.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/5/be499b5b-7535-4cc4-b617-2c8ee9ebe3cc_1000x625.jpeg"],"id":222,"categories":[{"id":31,"name":"大牌设计师"},{"id":39,"name":"巴黎"}]},{"follow_num":724,"city":"伦敦","concept":"师法自然","name":"Ross Lovegrove","label":"Ross Lovegrove 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/11/30/237f87f0-ae2e-40bd-bc0b-323eebf5ca44.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/3/b8857dce-92c7-4f87-bb10-e3be9d6ee6ad_1000x625.jpeg"],"id":220,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"}]},{"follow_num":586,"city":"德国","concept":"简单的圆形能在自然中发生无数变化","name":"Johanna Otto","label":"Johanna Otto 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/3/2d34f688-6f2f-4cc1-88a0-b5b05eecb0d8.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/3/6a28b0b9-cf75-43bf-91f8-b347b4b6102b_1000x625.jpeg"],"id":219,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"}]},{"follow_num":633,"city":"米兰","concept":"好奇心是我的缪思和指南针","name":"Francisco Gomez Paz","label":"LUCEPLAN 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/2/9dff5463-58a1-4c2d-8e71-8f2ae11aaacd.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/2/da5d9163-7ddc-4759-9de3-592744fef0bf_1000x625.jpeg"],"id":218,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"},{"id":35,"name":"米兰"}]},{"follow_num":385,"city":"","concept":"为充满活力的女人所设计","name":"Jessie Randall","label":"Loeffler Randall 创始人 & 设计总监","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/2/ab2f1d11-e02a-4498-a0d3-f6051abf3692.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/2/b27f9c70-a5a6-4693-a424-9480e13d1c7d_1000x625.jpeg"],"id":217,"categories":[{"id":4,"name":"鞋履"},{"id":31,"name":"大牌设计师"}]},{"follow_num":363,"city":"纽约","concept":"纽约为数不多真正制作手工帽的设计师","name":"Albertus Q. Swanepoel","label":"Albertus Swanepoel 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/2/4b51330d-0e0c-4bd6-8b18-4ab2b05064b1.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/2/476c3c8c-b849-4d1f-b443-97ce316e719a_1000x625.jpeg"],"id":215,"categories":[{"id":2,"name":"配饰"},{"id":17,"name":"纽约"},{"id":31,"name":"大牌设计师"}]},{"follow_num":690,"city":"纽约","concept":"倾心于超现实主义式的魔幻美感","name":"Pamela love ","label":"Pamela love 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/3/7a7fd628-39ea-4e5a-a3fa-d8887a56e8ce.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/3/062329e1-d7b5-4539-abdc-d429e4fa3e67_1000x625.jpeg"],"id":211,"categories":[{"id":1,"name":"首饰"},{"id":17,"name":"纽约"},{"id":31,"name":"大牌设计师"}]},{"follow_num":625,"city":"洛杉矶","concept":"没有比微笑着去穿戴首饰更美好的事情了","name":"Jennifer Meyer","label":"Jennifer Meyer 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/3/053cc4d2-b39d-49ee-966b-c88d2e33b90f.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/3/f1e54e81-71c4-4db4-97ad-b38ed1e82e08_1000x625.jpeg"],"id":210,"categories":[{"id":1,"name":"首饰"},{"id":31,"name":"大牌设计师"}]},{"follow_num":311,"city":"纽约","concept":"衣服终究只是衣服，不需要太昂贵","name":"Phillip Lim","label":"Phillip Lim 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/3/146a8cc8-4918-4ec2-a3c6-280593ef4d7d.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/3/0162d400-d0b5-4419-a37b-8116f0942d2a_800x400.jpeg"],"id":209,"categories":[{"id":3,"name":"包袋"},{"id":17,"name":"纽约"},{"id":31,"name":"大牌设计师"},{"id":58,"name":"优雅"}]},{"follow_num":310,"city":"洛杉矶","concept":"我希望能创造出能反映个人风格的东西","name":"Jennifer Fisher ","label":"Jennifer Fisher 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/2/7abd8d58-2ff6-4ed3-91f0-3b4ad0fdac58.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/2/6819e52c-54d8-4aff-b17b-66037f97c471_1000x625.jpeg"],"id":207,"categories":[{"id":1,"name":"首饰"},{"id":25,"name":"洛杉矶"},{"id":31,"name":"大牌设计师"}]},{"follow_num":37,"city":"都柏林","concept":"设计哲学融合极简和魅惑，创新与探索","name":"Ciara Silke","label":"Ciara Silke 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/b09965a5-c184-401b-8788-13f1cdf92115.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/5dbcd4c3-8dfe-4e3a-9f35-f6561791d539_1000x625.jpeg"],"id":280,"categories":[{"id":2,"name":"配饰"},{"id":30,"name":"独立设计师"}]},{"follow_num":22,"city":"伦敦","concept":"偶尔做梦，竟然成真","name":"Youmeng Liu","label":"Dream's code 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/7e460dcf-4a4c-44a7-9c81-350ef93f22c5.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/3c8d52ff-fcd8-4c63-b6a6-bae6fc4d8b47_1000x625.jpeg"],"id":279,"categories":[]},{"follow_num":170,"city":"意大利","concept":"","name":"Sergio Terzani","label":"Terzani 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/e0f7b937-b5e1-4d9d-b039-6892ca7364b9.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/277c0266-0444-4a9a-afe7-460db1e57b40_1000x625.jpeg"],"id":277,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"}]},{"follow_num":31,"city":"西班牙","concept":"欧美高层领导者办公桌上必不可少的景色","name":"El Casco","label":"西班牙高档班台文具品牌","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/586015a1-d91e-41c7-a0b9-2c01a4ffb7b2.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/20f9e329-de14-465c-bd3e-c23829027205_1000x625.jpeg"],"id":276,"categories":[{"id":31,"name":"大牌设计师"}]},{"follow_num":111,"city":"纽约","concept":"创造熟悉而又全新的设计","name":"Jason Miller","label":"Roll & Hill 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/3c6b18d5-364a-4511-a4ed-dff5a4172e21.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/97b8fb3b-f45c-49db-98d7-1b667a575386_1000x625.jpeg"],"id":275,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"}]},{"follow_num":27,"city":"温哥华 & 柏林","concept":"","name":"Omer Arbel","label":"Bocci 创意总监","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/62ce8d54-7654-405d-afd0-225fe0b6b344.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/22/f5ca7db5-90c3-43db-bc26-1304c98250b7_1000x625.jpeg"],"id":272,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"}]},{"follow_num":109,"city":"伦敦","concept":"","name":"Filofax","label":"活页手册鼻祖","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/20/3846ab6d-5032-4098-8cdb-1605563e0c2f.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/20/3296e559-0538-493a-a8f9-c175262231a0_1000x625.jpeg"],"id":270,"categories":[{"id":28,"name":"伦敦"},{"id":31,"name":"大牌设计师"}]},{"follow_num":26,"city":"意大利","concept":"","name":"Stefano Seletti","label":"Seletti 设计总监","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/ddb45ff4-ea69-4c5b-b99a-f10407ef741a.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/eecc7eeb-1d4c-4a3c-9ca3-b1b05918b622_1000x625.jpeg"],"id":269,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"}]},{"follow_num":159,"city":"伦敦","concept":"从英国悠久的历史传承中获得灵感并将之融入居家生活的方方面面","name":"Tom Dixon","label":"Tom Dixon 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/91760003-7497-4ee6-9c1b-67c8b4dc283b.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/6c00df36-7e86-4c55-99a8-820f78ab311b_1000x625.jpeg"],"id":266,"categories":[{"id":28,"name":"伦敦"},{"id":31,"name":"大牌设计师"}]},{"follow_num":24,"city":"日本","concept":"从日本文学中的故事产生共鸣","name":"文學堂","label":"纸张设计公司","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/20/c3991a7c-5954-4f04-9242-d071ef6a846e.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/20/e380427f-b27b-4063-8108-61e20e2d44a1_1000x625.jpeg"],"id":265,"categories":[{"id":26,"name":"其他"},{"id":31,"name":"大牌设计师"}]},{"follow_num":33,"city":"法国","concept":"","name":"Rachel Convers & Benoit Convers & Cariine Jannin","label":"Ibride 联合创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/21/dc46bd39-fc3c-44a0-a961-a99e27542ca8.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/21/daeee636-9378-4d3f-9d4b-6cfaff1c7b56_1000x625.jpeg"],"id":264,"categories":[{"id":27,"name":"家居"},{"id":30,"name":"独立设计师"}]},{"follow_num":126,"city":"哥本哈根","concept":"","name":"Erik Magnussen","label":"Stelton 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/20/8e282fe2-1ad1-4de9-88b7-410e4c7fc72f.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/20/87444728-2743-4fa3-8e02-d309aac49aa1_1614x1009.jpeg"],"id":263,"categories":[{"id":27,"name":"家居"},{"id":31,"name":"大牌设计师"}]},{"follow_num":17,"city":"都灵","concept":"深知思想，美景与文化对人的巨大影响并为此不惜时间精力","name":"Cesare Verona","label":"Aurora 设计总监","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/20/12cbe5ae-e31b-4e2c-888f-16eaa7dfc113.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/20/4252dee7-3f13-4a0f-b6a5-3c22eb0bda0f_1000x625.jpeg"],"id":262,"categories":[{"id":2,"name":"配饰"},{"id":31,"name":"大牌设计师"}]},{"follow_num":470,"city":"北京","concept":"行走，发现，设计，创造","name":"Miranda Vukasovic","label":"Miranda Vukasovic 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/14/46c20087-8d9d-4666-9324-242f29400f6f.jpg","recommend_images":["http://dstatic.zuimeia.com/common/image/2016/12/14/74145763-51a0-4522-a3ef-c9cf8651744a_1000x625.jpeg"],"id":261,"categories":[{"id":1,"name":"首饰"},{"id":30,"name":"独立设计师"},{"id":71,"name":"北京"}]}]
     * categories : [{"id":1,"name":"首饰"},{"id":3,"name":"包袋"},{"id":27,"name":"家居"},{"id":5,"name":"清新"},{"id":6,"name":"性感"},{"id":8,"name":"文艺"},{"id":9,"name":"萌趣"},{"id":12,"name":"极简"},{"id":13,"name":"实用"},{"id":16,"name":"波特兰"},{"id":17,"name":"纽约"}]
     */

    private int has_next;
    /**
     * follow_num : 155
     * city : 波兰
     * concept : 灵感如风，常伴我身
     * name : Justyna
     * label : 做出了世界上最可爱的钟
     * avatar_url : http://dstatic.zuimeia.com/designer/avatar/2016/12/26/62f4c59a-31af-478e-b191-d53316a939d0.jpg
     * recommend_images : ["http://dstatic.zuimeia.com/common/image/2016/12/26/755d1088-547c-47c8-8d38-ab85137511bf_1000x625.jpeg"]
     * id : 284
     * categories : [{"id":27,"name":"家居"},{"id":30,"name":"独立设计师"}]
     */

    private List<DesignersBean> designers;
    /**
     * id : 1
     * name : 首饰
     */

    private List<CategoriesBean> categories;

    public int getHas_next() {
        return has_next;
    }

    public void setHas_next(int has_next) {
        this.has_next = has_next;
    }

    public List<DesignersBean> getDesigners() {
        return designers;
    }

    public void setDesigners(List<DesignersBean> designers) {
        this.designers = designers;
    }

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public static class DesignersBean {
        private int follow_num;
        private String city;
        private String concept;
        private String name;
        private String label;
        private String avatar_url;
        private int id;
        private List<String> recommend_images;
        /**
         * id : 27
         * name : 家居
         */

        private List<CategoriesBean> categories;

        public int getFollow_num() {
            return follow_num;
        }

        public void setFollow_num(int follow_num) {
            this.follow_num = follow_num;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getConcept() {
            return concept;
        }

        public void setConcept(String concept) {
            this.concept = concept;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getRecommend_images() {
            return recommend_images;
        }

        public void setRecommend_images(List<String> recommend_images) {
            this.recommend_images = recommend_images;
        }

        public List<CategoriesBean> getCategories() {
            return categories;
        }

        public void setCategories(List<CategoriesBean> categories) {
            this.categories = categories;
        }

        public static class CategoriesBean {
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "CategoriesBean{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DesignersBean{" +
                    "follow_num=" + follow_num +
                    ", city='" + city + '\'' +
                    ", concept='" + concept + '\'' +
                    ", name='" + name + '\'' +
                    ", label='" + label + '\'' +
                    ", avatar_url='" + avatar_url + '\'' +
                    ", id=" + id +
                    ", recommend_images=" + recommend_images +
                    ", categories=" + categories +
                    '}';
        }
    }

    public static class CategoriesBean {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "CategoriesBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DesignerEntity{" +
                "has_next=" + has_next +
                ", designers=" + designers +
                ", categories=" + categories +
                '}';
    }
}
