package com.qf.project.zuimeiyouwu.Entity;


import java.util.List;

/**
 * Created by Administrator on 2017/1/17.
 *有物列表的实体类
 */
public class ProductListEntity {

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
        /**
         * has_next : 1
         * products : [{"unlike_user_num":51,"sale_state":"on_sale","has_evaluation":0,"name":"Moorigin | 'Line' 几何吊坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/10/67a61c0e-dce3-48bf-9c40-5dc5dc231dda_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/da36d073-3f99-4115-a667-c8d3700d9be2_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/fcb8e4a7-85ed-42dc-ae6a-dd576022ac76_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/4982250b-776b-4350-90bc-0c92c6bb614c_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/78599bdb-c153-465f-bed2-e8e21b6fd951_1000x1000.jpeg"],"is_on_sale":0,"price":350,"is_foreign":0,"brief":"Moorigin | 'Line' 几何吊坠","designer":{"city":"台湾","concept":"戴上简单舒服的首饰就像喝了一口纯净好水","name":"林玮仁 ","label":"Moorigin 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg","id":296},"web_url":"http://design.zuimeia.com/product/1989/","like_user_num":141,"mark_user_num":17,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/ecdc31f8-d5d8-4f64-96d3-0176cecc400b_1000x1000.jpeg"],"publish_at":1485014400000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1989/","id":1989},{"unlike_user_num":75,"sale_state":"on_sale","has_evaluation":0,"name":"Mountain & Moon | 'Empress' 长流苏镂空耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/17/6d4008d4-8c69-43fa-b1d7-168f919ff98a_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/9dff7545-1850-49b0-8368-d742d619fb29_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/abb261f7-b478-4489-81f3-5596f1aa7751_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/c0fb68b7-22d6-4106-ade8-10b55a14d3d1_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/336ea17e-c910-4838-af41-3e1e187e36e3_1000x1000.jpeg"],"is_on_sale":0,"price":750,"is_foreign":0,"brief":"Mountain & Moon | 'Empress' 长流苏镂空耳坠","designer":{"city":"印度","concept":"喜欢一切异域和超现实的文化","name":"Ashton & Audrey","label":"Mountain & Moon 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/13/cee9b03f-c019-43cf-a576-ab1281835c04.jpg","id":244},"web_url":"http://design.zuimeia.com/product/2064/","like_user_num":66,"mark_user_num":2,"images":["http://dstatic.zuimeia.com/common/image/2017/1/17/26bdc534-8961-4318-b833-2d5d1b9f431f_1000x1000.jpeg"],"publish_at":1485014400000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2064/","id":2064},{"unlike_user_num":31,"sale_state":"on_sale","has_evaluation":0,"name":"Michael Michaud | 'Samara' 蝉翼双色吊坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/13/53cd2a37-3ea6-4f62-89f4-51c0e48c73e1_1000x1000.jpeg"],"is_on_sale":0,"price":680,"is_foreign":0,"brief":"Michael Michaud | 'Samara' 蝉翼双色吊坠","designer":{"city":"纽约","concept":"捕捉自然的美丽和精致的细节","name":"Michael Michaud","label":"Michael Michaud 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2017/1/4/2402402d-25fa-4016-b4ae-e399b91caa4f.jpg","id":317},"web_url":"http://design.zuimeia.com/product/2016/","like_user_num":132,"mark_user_num":5,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/7455beb5-3a0b-476e-a583-fca8a0f2a9a9_600x600.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/fd50b5d7-d4a4-4fbd-b09c-380c18c88a7a_600x600.jpeg"],"publish_at":1485014400000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2016/","id":2016},{"unlike_user_num":69,"sale_state":"on_sale","has_evaluation":0,"name":"Moorigin | 气泡手链","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/9/2cef9a67-c162-432d-a4c5-dd00f6940d76_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/c1cfd195-d913-4c70-b23c-cadee6b39789_1000x1000.jpeg"],"is_on_sale":0,"price":260,"is_foreign":0,"brief":"Moorigin | 气泡手链","designer":{"city":"台湾","concept":"戴上简单舒服的首饰就像喝了一口纯净好水","name":"林玮仁 ","label":"Moorigin 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg","id":296},"web_url":"http://design.zuimeia.com/product/1979/","like_user_num":403,"mark_user_num":88,"images":["http://dstatic.zuimeia.com/common/image/2017/1/9/28e6314c-9983-403e-903d-325b8ad012ab_1000x1000.jpeg"],"publish_at":1484841600000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1979/","id":1979},{"unlike_user_num":140,"sale_state":"on_sale","has_evaluation":0,"name":"Michael Michaud | 豌豆珍珠吊坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/19/498ca5dd-1614-46ca-abfa-98b9f788aaec_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/644a66ee-f13c-4f5d-b682-00429628db7f_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/051bdd07-b0ac-4910-9d98-f265bae60a88_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/bb30d27c-af25-42b6-aeae-a93eab532708_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/275809bc-85b2-47d0-b7ff-c10011fcad7b_1000x1000.jpeg"],"is_on_sale":0,"price":980,"is_foreign":0,"brief":"Michael Michaud | 豌豆珍珠吊坠","designer":{"city":"纽约","concept":"捕捉自然的美丽和精致的细节","name":"Michael Michaud","label":"Michael Michaud 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2017/1/4/2402402d-25fa-4016-b4ae-e399b91caa4f.jpg","id":317},"web_url":"http://design.zuimeia.com/product/2011/","like_user_num":277,"mark_user_num":27,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/b89352c6-bfb4-4b3d-ad60-e353da160e89_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/898ad0e9-f928-47c3-afb9-49b5133ba8bc_1000x1000.jpeg"],"publish_at":1484841600000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2011/","id":2011},{"unlike_user_num":166,"sale_state":"on_sale","has_evaluation":0,"name":"Shimell & Madden | 镂空半环耳钉","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/17/3fc57302-e7b6-4504-be41-e2a3daf0933c_788x788.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/23ea841b-d0ab-4f4c-9d73-f21b50bf860b_640x640.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/f5245482-ba33-4e3b-aa21-5f73c06a35ff_1000x1000.jpeg"],"is_on_sale":0,"price":13600,"is_foreign":0,"brief":"Shimell & Madden | 镂空半环耳钉","designer":{"city":"伦敦","concept":"设计灵感来源于几何均衡、原始形态和复杂结构这三大元素","name":"Emma Madden & Luke Shimell","label":"Shimell & Madden 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/7/93542ac6-1af3-41f4-9696-7dc63ca25368.jpg","id":234},"web_url":"http://design.zuimeia.com/product/2057/","like_user_num":299,"mark_user_num":9,"images":["http://dstatic.zuimeia.com/common/image/2017/1/17/638daf74-84a7-4138-90b1-94a731d6faae_640x640.jpeg"],"publish_at":1484755200000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2057/","id":2057},{"unlike_user_num":170,"sale_state":"on_sale","has_evaluation":0,"name":"Fallon | 'Monarch' 缠绕式水晶项链","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/17/0eaf3b54-a106-444c-8af8-428691a6f0ea_750x750.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/0dbf38f3-ff6b-4e30-a337-4830fd012f23_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/e76c67fb-1db6-4968-b827-bcbb223134f1_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/17/8548948e-bc30-4eb3-9d33-4b5e6e7859af_1000x1000.jpeg"],"is_on_sale":0,"price":2750,"is_foreign":0,"brief":"Fallon | 'Monarch' 缠绕式水晶项链","designer":{"city":"纽约","concept":"为日常增添华丽感","name":"Dana Lorenz","label":"Fallon 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/1/07738e91-c5f3-4dab-be8b-748fa4fcd535.jpg","id":214},"web_url":"http://design.zuimeia.com/product/2062/","like_user_num":327,"mark_user_num":26,"images":["http://dstatic.zuimeia.com/common/image/2017/1/17/b7a786dc-9fe1-4464-a99e-e77c0890851e_1000x1000.jpeg"],"publish_at":1484755200000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2062/","id":2062},{"unlike_user_num":144,"sale_state":"on_sale","has_evaluation":0,"name":"Moorigin | 冬雪耳钉","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/9/34ef02ac-0402-4cf8-81d7-1d252f8ad439_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/71f9ebcc-a79f-4fe2-b8f9-573bf04c4797_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/ce8328a0-b1ce-4e7d-8af5-1689978a9191_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/557e3053-b753-47ac-a8fc-a571678ce9c6_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/69a98c61-5e27-4fb5-baf6-e64e6464005d_1000x1000.jpeg"],"is_on_sale":0,"price":220,"is_foreign":0,"brief":"Moorigin | 冬雪耳钉","designer":{"city":"台湾","concept":"戴上简单舒服的首饰就像喝了一口纯净好水","name":"林玮仁 ","label":"Moorigin 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg","id":296},"web_url":"http://design.zuimeia.com/product/1977/","like_user_num":560,"mark_user_num":90,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/008fe436-3465-4771-8b00-8d9639c29d3d_1000x1000.jpeg"],"publish_at":1484668800000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1977/","id":1977},{"unlike_user_num":105,"sale_state":"on_sale","has_evaluation":0,"name":"Michael Michaud | 蕨叶吊坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/13/b7e81717-0f75-4110-a1f3-113019405889_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/1479fae9-d4ab-4f71-83cb-95425f81540c_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/7e775ae9-f7e5-405c-9b5f-84e764fb2072_1000x1000.jpeg"],"is_on_sale":0,"price":1000,"is_foreign":0,"brief":"Michael Michaud | 蕨叶吊坠","designer":{"city":"纽约","concept":"捕捉自然的美丽和精致的细节","name":"Michael Michaud","label":"Michael Michaud 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2017/1/4/2402402d-25fa-4016-b4ae-e399b91caa4f.jpg","id":317},"web_url":"http://design.zuimeia.com/product/2026/","like_user_num":478,"mark_user_num":25,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/7da1565d-c698-4ad8-9302-62979292db06_600x600.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/6c1c7f24-027f-49b7-bf9f-5e9816987a37_600x600.jpeg"],"publish_at":1484668800000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2026/","id":2026},{"unlike_user_num":98,"sale_state":"on_sale","has_evaluation":0,"name":"Moorigin | 'Ginkgo' 银杏叶吊坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/9/dc9efad8-4f56-43b2-9c31-271fdc9ba5d7_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/714b5b14-0c7f-4b68-8612-329c9481984c_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/f6895c56-e56c-46d2-9510-b77389994c0f_1000x1000.jpeg"],"is_on_sale":0,"price":260,"is_foreign":0,"brief":"Moorigin | 'Ginkgo' 银杏叶吊坠","designer":{"city":"台湾","concept":"戴上简单舒服的首饰就像喝了一口纯净好水","name":"林玮仁 ","label":"Moorigin 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg","id":296},"web_url":"http://design.zuimeia.com/product/1978/","like_user_num":765,"mark_user_num":150,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/7d8735fb-1af7-41ef-a1b6-49549eb42b6e_1000x1000.jpeg"],"publish_at":1484582400000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1978/","id":1978},{"unlike_user_num":143,"sale_state":"on_sale","has_evaluation":0,"name":"Michael Michaud | 红樱耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/13/e17eb1c9-80c8-4e61-bb69-a61fb2c0de95_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/13/64248d6f-2eea-468b-a258-6f28784f568c_1000x1000.jpeg"],"is_on_sale":0,"price":900,"is_foreign":0,"brief":"Michael Michaud | 红樱耳坠","designer":{"city":"纽约","concept":"捕捉自然的美丽和精致的细节","name":"Michael Michaud","label":"Michael Michaud 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2017/1/4/2402402d-25fa-4016-b4ae-e399b91caa4f.jpg","id":317},"web_url":"http://design.zuimeia.com/product/2014/","like_user_num":529,"mark_user_num":38,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/35161c66-f80c-4d8a-a912-1999d8cd2da4_1000x1000.jpeg"],"publish_at":1484582400000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2014/","id":2014},{"unlike_user_num":100,"sale_state":"on_sale","has_evaluation":0,"name":"Moorigin | 'Breeze' 微风耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/9/5735a78b-4f66-4968-912f-66ce342b6fd9_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/155c6c1a-77a2-4f06-bf9f-2e1b218f44b6_1000x1000.jpeg"],"is_on_sale":0,"price":260,"is_foreign":0,"brief":"Moorigin | 'Breeze' 微风耳坠","designer":{"city":"台湾","concept":"戴上简单舒服的首饰就像喝了一口纯净好水","name":"林玮仁 ","label":"Moorigin 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg","id":296},"web_url":"http://design.zuimeia.com/product/1974/","like_user_num":714,"mark_user_num":108,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/860e8363-4dfb-408d-93c3-0eea2199fa9e_1000x1000.jpeg"],"publish_at":1484496000000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1974/","id":1974},{"unlike_user_num":173,"sale_state":"on_sale","has_evaluation":0,"name":"Michael Michaud | 叶片手链","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/12/57ff4d02-ca69-491f-9b61-c58edb4f60c8_1000x1000.jpeg"],"is_on_sale":0,"price":980,"is_foreign":0,"brief":"Michael Michaud | 叶片手链","designer":{"city":"纽约","concept":"捕捉自然的美丽和精致的细节","name":"Michael Michaud","label":"Michael Michaud 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2017/1/4/2402402d-25fa-4016-b4ae-e399b91caa4f.jpg","id":317},"web_url":"http://design.zuimeia.com/product/2008/","like_user_num":400,"mark_user_num":38,"images":["http://dstatic.zuimeia.com/common/image/2017/1/12/57ff4d02-ca69-491f-9b61-c58edb4f60c8_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/12/bfe712fc-8ca9-4a24-a95d-3ec9d6228b75_1000x1000.jpeg"],"publish_at":1484496000000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/2008/","id":2008},{"unlike_user_num":381,"sale_state":"on_sale","has_evaluation":0,"name":"Miansai | 螺栓项链","cover_images":["http://dstatic.zuimeia.com/common/image/2016/7/11/036ba980-5050-4f9f-8da3-d94b0b9a3d35_1080x1080.jpeg","http://dstatic.zuimeia.com/common/image/2016/7/11/e3aee716-151b-4025-a829-cdab9289f4ae_906x906.jpeg","http://dstatic.zuimeia.com/common/image/2016/7/11/161b8521-296f-4c29-852f-74a61e3a64c8_1000x1000.jpeg"],"is_on_sale":0,"is_foreign":0,"brief":"Miansai | 螺栓项链","designer":{"city":"纽约","concept":"我希望20年后你打开你的抽屉，看到我设计的手镯，依然会惊叹，怎么这么酷","name":"Michael Saiger","label":"Miansai 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/6/13/72182cb5-e518-486e-9947-e3f47de74f89.jpg","id":25},"web_url":"http://design.zuimeia.com/product/380/","like_user_num":1323,"mark_user_num":176,"images":["http://dstatic.zuimeia.com/common/image/2016/7/11/58eb692b-5d8d-44c6-8cf8-ed5407fe53b0_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2016/7/11/795149f1-de62-4b01-bdac-44a411d461b1_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2016/7/11/3a4525f3-0b9d-441b-96fa-5af8b6e742ca_1000x1000.jpeg"],"publish_at":1484496000000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/380/","id":380},{"unlike_user_num":265,"sale_state":"on_sale","has_evaluation":0,"name":"Sarah Magid | '电波' 流苏耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/10/ed39b134-5b72-492b-9bf0-b26b6d5c4cda_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/836cf5a7-495f-40d5-8761-d05b232439d7_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/cab97fa8-a77f-4b96-b15e-61c0cf977039_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/cdeebfcd-f02c-4ad4-99b9-4eeebfac527b_1000x1000.jpeg"],"is_on_sale":0,"price":1800,"is_foreign":0,"brief":"Sarah Magid | '电波' 流苏耳坠","designer":{"city":"纽约","concept":"橘色的项链总是让我想起加州的阳光","name":"Sarah Magid","label":"Sarah Magid 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/11/8/68ae5327-4296-43aa-bb3a-575d67efc03e.jpg","id":163},"web_url":"http://design.zuimeia.com/product/1984/","like_user_num":282,"mark_user_num":10,"images":["http://dstatic.zuimeia.com/common/image/2017/1/10/f95cb1bd-10f2-4374-bffa-f3e1773645c5_1000x1000.jpeg"],"publish_at":1484409600000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1984/","id":1984},{"unlike_user_num":630,"sale_state":"on_sale","has_evaluation":0,"name":"Anthony Lent | 流离之眼项链","cover_images":["http://dstatic.zuimeia.com/common/image/2016/8/14/b397c7f2-7c62-4d08-8b15-dfb61fb89470_1023x1024.jpeg","http://dstatic.zuimeia.com/common/image/2016/8/14/021169fb-0c68-48dc-8c7f-f49e395fa1a4_750x750.png"],"is_on_sale":0,"price":16780,"is_foreign":0,"brief":"Anthony Lent | 流离之眼项链","designer":{"city":"纽约","concept":"灵感无处不在，只要拿起画笔，它们都能转化成艺术","name":"Anthony Lent","label":"Anthony Lent 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/8/6/f97805c6-9047-450b-866d-b5e00b493594.jpg","id":65},"web_url":"http://design.zuimeia.com/product/900/","like_user_num":1037,"mark_user_num":59,"images":["http://dstatic.zuimeia.com/common/image/2016/8/14/021169fb-0c68-48dc-8c7f-f49e395fa1a4_750x750.png"],"publish_at":1484409600000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/900/","id":900},{"unlike_user_num":255,"sale_state":"on_sale","has_evaluation":0,"name":"Astley Clarke | 伦敦蓝托帕石项链","cover_images":["http://dstatic.zuimeia.com/common/image/2016/9/21/f72d8af7-8ff0-4a43-812a-992e6aff6470_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2016/9/21/ff1b3766-588d-48c5-ae83-728a13ac982f_1000x1000.jpeg"],"is_on_sale":0,"price":1770,"is_foreign":0,"brief":"Astley Clarke | 伦敦蓝托帕石项链","designer":{"city":"伦敦","concept":"为奢侈品牌注入新鲜和现代的血液","name":"Bec Astley Clarke","label":"Astley Clarke 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/9/27/d80b7ad5-a9c9-4c7c-8141-b85c770532fb.jpg","id":121},"web_url":"http://design.zuimeia.com/product/1277/","like_user_num":1028,"mark_user_num":138,"images":["http://dstatic.zuimeia.com/common/image/2016/9/21/e2c7a204-3bc0-4bf6-ad6a-e30b7d31f0b9_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2016/9/21/ba8cf830-7741-460a-9ebb-4ac558cfb4af_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2016/9/21/ff1b3766-588d-48c5-ae83-728a13ac982f_1000x1000.jpeg"],"publish_at":1484323200000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1277/","id":1277},{"unlike_user_num":272,"sale_state":"on_sale","has_evaluation":0,"name":"Lena Skadegard | '空之韵' 双石耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2016/9/19/19adbe33-4aa7-4606-887f-07aa217d11f7_1000x1000.jpg"],"is_on_sale":0,"price":7740,"is_foreign":0,"brief":"Lena Skadegard | '空之韵' 双石耳坠","designer":{"city":"纽约","concept":"珠宝设计就是把我的信仰和价值观变为有形的实体","name":"Lena Skadegard ","label":"Lena Skadegard 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/8/23/15a6f4f6-0263-4f9f-a1e1-91fd38d0dd9c.jpg","id":91},"web_url":"http://design.zuimeia.com/product/1257/","like_user_num":774,"mark_user_num":57,"images":["http://dstatic.zuimeia.com/common/image/2016/9/19/19adbe33-4aa7-4606-887f-07aa217d11f7_1000x1000.jpg","http://dstatic.zuimeia.com/common/image/2016/9/19/13c21823-16f2-410e-a475-004270c775da_1000x1000.jpg"],"publish_at":1484323200000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1257/","id":1257},{"unlike_user_num":237,"sale_state":"on_sale","has_evaluation":0,"name":"Moorigin | 黑色弧光手镯","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/9/ec582de6-c154-4931-be8f-99f6e15accc2_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/1b33bab2-8dbd-4c77-a9ac-44d8f61dd486_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/9b05fa63-3a6c-48de-9b4c-0ba7cad68d1f_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/fcaec923-62c9-42f9-b44e-d51fc528dbf8_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/0adf705b-ad69-43d2-85e4-22fac82b7723_1000x1000.jpeg"],"is_on_sale":0,"price":260,"is_foreign":0,"brief":"Moorigin | 黑色弧光手镯","designer":{"city":"台湾","concept":"戴上简单舒服的首饰就像喝了一口纯净好水","name":"林玮仁 ","label":"Moorigin 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg","id":296},"web_url":"http://design.zuimeia.com/product/1975/","like_user_num":729,"mark_user_num":152,"images":["http://dstatic.zuimeia.com/common/image/2017/1/13/a878dc5c-3f83-4052-b99b-6ad2489f4a82_1000x1000.jpeg"],"publish_at":1484236800000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1975/","id":1975},{"unlike_user_num":373,"sale_state":"on_sale","has_evaluation":0,"name":"Aurelie Bidermann | 金章珊瑚流苏耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/9/d913e644-1122-45a5-a830-93bf1bb3e388_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/d986153f-0390-406e-a9dd-5e44d00c98ca_1000x1000.jpeg"],"is_on_sale":0,"price":4800,"is_foreign":0,"brief":"Aurelie Bidermann | 金章珊瑚流苏耳坠","designer":{"city":"巴黎","concept":"珠宝不仅要时尚，还应充满奇异的趣味感","name":"Aurelie Bidermann","label":"Aurelie Bidermann 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/5/ad383d30-1b29-4bae-9db2-4d6e2ce2261c.jpg","id":222},"web_url":"http://design.zuimeia.com/product/1973/","like_user_num":137,"mark_user_num":5,"images":["http://dstatic.zuimeia.com/common/image/2017/1/9/d986153f-0390-406e-a9dd-5e44d00c98ca_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/7912197f-ec87-4c01-85ba-c7e4947d12b5_1210x1210.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/e818290b-3d02-48f1-bb1f-77a60c88a346_1176x1176.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/9/02897c00-6ef7-4c58-9c70-94f869bac5d9_1000x1500.jpeg"],"publish_at":1484236800000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1973/","id":1973},{"unlike_user_num":141,"sale_state":"on_sale","has_evaluation":0,"name":"Mountain & Moon | 'Harmonia' 宝石短项链","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/7/e8a18887-2bc5-4f20-b8d6-d0b144fe21d1_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/13a47973-b1ee-4b63-81b5-64b9f97392fe_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/bd4a321d-0abd-49ee-a6e8-e9b71e9e995b_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/450e04e1-64cb-4489-bdac-1c8051dadb7c_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/0858433c-0ee2-48b6-9615-1c6f0443d739_1000x1000.jpeg"],"is_on_sale":0,"price":550,"is_foreign":0,"brief":"Mountain & Moon | 'Harmonia' 宝石短项链","designer":{"city":"印度","concept":"喜欢一切异域和超现实的文化","name":"Ashton & Audrey","label":"Mountain & Moon 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/13/cee9b03f-c019-43cf-a576-ab1281835c04.jpg","id":244},"web_url":"http://design.zuimeia.com/product/1962/","like_user_num":563,"mark_user_num":52,"images":["http://dstatic.zuimeia.com/common/image/2017/1/7/fbc17b3a-b68a-4859-bc33-6e0d2c805597_1000x1000.jpeg"],"publish_at":1484150400000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1962/","id":1962},{"unlike_user_num":155,"sale_state":"on_sale","has_evaluation":0,"name":"WWAKE | 星韵流光链式耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/7/322bdcb9-804e-4435-8a31-4e329fae011a_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/fc83bcf4-5718-4660-98a2-4ef89f122959_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/e37e2f9d-f8a7-4e0c-94ed-ccf016e43ad9_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/979b9753-eacf-45a0-b2e3-e94af40ab3d2_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/96d66403-8bc1-4c59-a0c5-69bcd6d5f08f_1000x1000.jpeg"],"is_on_sale":0,"price":10400,"is_foreign":0,"brief":"WWAKE | 星韵流光链式耳坠","designer":{"city":"纽约","concept":"耐心点，不管是对首饰还是对你的伙伴们","name":"Wing Yau","label":"WWAKE 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/11/18/018378b7-6fb4-4e72-81cc-ea1a38bb1e0f.jpg","id":184},"web_url":"http://design.zuimeia.com/product/1970/","like_user_num":522,"mark_user_num":26,"images":["http://dstatic.zuimeia.com/common/image/2017/1/7/0e684dcd-0f42-4c1b-a99a-53404a64b2f8_1000x1000.jpeg"],"publish_at":1484150400000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1970/","id":1970},{"unlike_user_num":261,"sale_state":"on_sale","has_evaluation":0,"name":"Alexis Bittar | '蝶翼' 镂空水晶耳钉","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/7/4012add5-1bb0-42ca-8503-40e9d0aad5fd_1393x1393.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/20f15017-2afb-47e3-ae96-ee0d4645f1ea_1000x1000.jpeg"],"is_on_sale":0,"price":1200,"is_foreign":0,"brief":"Alexis Bittar | '蝶翼' 镂空水晶耳钉","designer":{"city":"旧金山","concept":"喜欢一切与老古董和 old-school 相关的东西","name":"Alexis Bittar","label":"Alexis Bittar 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/1/02cb3f61-4b83-481b-90cb-cbfe0f29c0c3.jpg","id":213},"web_url":"http://design.zuimeia.com/product/1952/","like_user_num":333,"mark_user_num":19,"images":["http://dstatic.zuimeia.com/common/image/2017/1/7/4012add5-1bb0-42ca-8503-40e9d0aad5fd_1393x1393.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/7/9fe474f0-4af0-4996-b275-3020159bcebe_1000x1000.jpeg"],"publish_at":1484064000000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1952/","id":1952},{"unlike_user_num":165,"sale_state":"on_sale","has_evaluation":0,"name":"Vlum | '黑色花蕾' 套链","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/5/a30809fb-561e-4c17-a3f8-629691f53e42_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/5d7d46e3-b6fc-4651-936c-c00c1a8f6692_994x994.jpeg"],"is_on_sale":0,"price":500,"is_foreign":0,"brief":"Vlum | '黑色花蕾' 套链","designer":{"city":"法国","concept":"","name":"Dorine Decayeyx","label":"Vlum 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/30/a3dec031-5d1a-45c3-bd7a-94924b49f128.jpg","id":305},"web_url":"http://design.zuimeia.com/product/1923/","like_user_num":508,"mark_user_num":48,"images":["http://dstatic.zuimeia.com/common/image/2017/1/5/0ec02e4b-70df-47f3-b060-4120fc51e3b8_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/6747c8c4-89a6-4593-9f6d-1879649fdf74_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/2c7060ea-2b35-4942-8259-2244d7c9391e_1000x1000.jpeg"],"publish_at":1484064000000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1923/","id":1923},{"unlike_user_num":130,"sale_state":"on_sale","has_evaluation":0,"name":"Bill Skinner | '猫咪与毛球' 吊坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/5/64812db4-3e28-4e35-b9f1-f92934acabc0_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/80daa348-8e43-4603-91ff-c5c6b2ec7a1d_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/01f212cd-70ec-496d-8115-68c465edeeec_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/492db4ec-a86b-4c04-a35b-bcde3c16423f_1000x1000.jpeg"],"is_on_sale":0,"price":550,"is_foreign":0,"brief":"Bill Skinner | '猫咪与毛球' 吊坠","designer":{"city":"伦敦","concept":"","name":"Bill Skinner","label":"Bill Skinner 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2017/1/3/7102fe4a-d2bb-41ab-a2fe-18897beb3fa0.jpg","id":308},"web_url":"http://design.zuimeia.com/product/1937/","like_user_num":650,"mark_user_num":94,"images":["http://dstatic.zuimeia.com/common/image/2017/1/5/56bf9923-4730-4346-8df9-43323501e4c4_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/8806c3a6-6b2b-4186-af59-e6415fc4b707_1000x1000.jpeg"],"publish_at":1483977600000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1937/","id":1937},{"unlike_user_num":177,"sale_state":"on_sale","has_evaluation":0,"name":"Pamela love | 虎眼石不对称耳环","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/6/0c035dc6-87be-431e-8e4d-ad2131b24132_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/6/bd503e84-e4ba-49d5-bbe0-d446cba8df1a_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/6/484d44f2-2b81-4ae6-9db5-5413ad6de99a_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/6/4111d2ee-a064-4a8c-8917-771d84807f9e_1000x1000.jpeg"],"is_on_sale":0,"price":2700,"is_foreign":0,"brief":"Pamela love | 虎眼石不对称耳环","designer":{"city":"纽约","concept":"倾心于超现实主义式的魔幻美感","name":"Pamela love ","label":"Pamela love 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/3/7a7fd628-39ea-4e5a-a3fa-d8887a56e8ce.jpg","id":211},"web_url":"http://design.zuimeia.com/product/1939/","like_user_num":405,"mark_user_num":20,"images":["http://dstatic.zuimeia.com/common/image/2017/1/6/98c921be-9a6b-4f22-a049-2f4cec2d5fba_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/6/76a73fb5-1c8a-4a15-aded-0c6f3fe99985_1000x1000.jpeg"],"publish_at":1483977600000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1939/","id":1939},{"unlike_user_num":133,"sale_state":"on_sale","has_evaluation":0,"name":"Vlum | '玫瑰花蕾' 耳坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/5/17bb3053-4d8a-483d-8716-a14982e13684_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/b786681f-d55d-40af-9c49-7bd7dba13c57_1000x1000.jpeg"],"is_on_sale":0,"price":550,"is_foreign":0,"brief":"Vlum | '玫瑰花蕾' 耳坠","designer":{"city":"法国","concept":"","name":"Dorine Decayeyx","label":"Vlum 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/30/a3dec031-5d1a-45c3-bd7a-94924b49f128.jpg","id":305},"web_url":"http://design.zuimeia.com/product/1920/","like_user_num":673,"mark_user_num":71,"images":["http://dstatic.zuimeia.com/common/image/2017/1/5/0460c8de-f9c5-43fb-b006-f76c16bec838_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/2e6d03df-1670-42e2-9b08-705076f6ae01_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/5/5de2061b-9940-4c5d-8a51-3d15d85c0d6b_1000x1000.jpeg"],"publish_at":1483891200000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1920/","id":1920},{"unlike_user_num":368,"sale_state":"on_sale","has_evaluation":0,"name":"Charlotte Lowe | 贝壳堑金套戒","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/5/b5ea2043-9466-4e6c-a2ef-6bb0f38a3e01_1000x1000.jpeg"],"is_on_sale":0,"price":1360,"is_foreign":0,"brief":"Charlotte Lowe | 贝壳堑金套戒","designer":{"city":"","concept":"","name":"Charlotte Lowe","label":"Charlotte Lowe 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/30/f2bda6fc-4f5c-4777-909e-727dc263104e.jpg","id":306},"web_url":"http://design.zuimeia.com/product/1922/","like_user_num":205,"mark_user_num":17,"images":["http://dstatic.zuimeia.com/common/image/2017/1/6/4daacdac-f8e6-4c36-8953-8491d0f48b7f_1000x1000.jpeg"],"publish_at":1483891200000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1922/","id":1922},{"unlike_user_num":220,"sale_state":"on_sale","has_evaluation":0,"name":"Marshelly's | 弧光手镯","cover_images":["http://dstatic.zuimeia.com/common/image/2016/8/18/11e9f838-159c-448a-9df8-6d01ef6e3d78_1000x1000.jpeg"],"is_on_sale":0,"price":1450,"is_foreign":0,"brief":"Marshelly's | 弧光手镯","designer":{"city":"纽约","concept":"如果我延长宝石的角度，或者组合这些形状，会发生什么","name":"Sherlly Ontiveros","label":"Marshelly's Jewelry 首席设计师和 CEO","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/6/13/9b5fbec6-a727-4e93-9d7e-135e13d024aa.jpg","id":32},"web_url":"http://design.zuimeia.com/product/927/","like_user_num":1800,"mark_user_num":214,"images":["http://dstatic.zuimeia.com/common/image/2016/8/18/7ac70ba0-d230-4921-8448-b49bbafba570_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2016/8/18/1361df0a-907e-4b23-863e-2801879e4479_1000x1000.jpeg"],"publish_at":1483891200000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/927/","id":927},{"unlike_user_num":292,"sale_state":"on_sale","has_evaluation":0,"name":"Charlotte Lowe | '勿忘我' 大象吊坠","cover_images":["http://dstatic.zuimeia.com/common/image/2017/1/4/888914d8-93df-44df-ad6a-351593d35c10_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/4/ab388d0b-3144-4b60-b256-7f4b97e761a9_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/4/9c2a7c1a-5cda-4fc6-8b9c-91995042acbb_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/4/9dcfd83c-2a33-4cc7-82e8-2ce17774b427_1000x1000.jpeg"],"is_on_sale":0,"price":730,"is_foreign":0,"brief":"Charlotte Lowe | '勿忘我' 大象吊坠","designer":{"city":"","concept":"","name":"Charlotte Lowe","label":"Charlotte Lowe 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/30/f2bda6fc-4f5c-4777-909e-727dc263104e.jpg","id":306},"web_url":"http://design.zuimeia.com/product/1904/","like_user_num":390,"mark_user_num":64,"images":["http://dstatic.zuimeia.com/common/image/2017/1/4/637bfad2-24c0-4d55-8f4a-c89c6fa5bd57_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/4/28a3b0a8-a366-4f13-b0e0-1ea4b918addd_1000x1000.jpeg"],"publish_at":1483804800000,"detail_url":"https://design.zuimeia.com/product/mobile/webview/1904/","id":1904}]
         */

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

        public static class ProductsEntity {
            /**
             * unlike_user_num : 51
             * sale_state : on_sale
             * has_evaluation : 0
             * name : Moorigin | 'Line' 几何吊坠
             * cover_images : ["http://dstatic.zuimeia.com/common/image/2017/1/10/67a61c0e-dce3-48bf-9c40-5dc5dc231dda_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/da36d073-3f99-4115-a667-c8d3700d9be2_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/fcb8e4a7-85ed-42dc-ae6a-dd576022ac76_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/4982250b-776b-4350-90bc-0c92c6bb614c_1000x1000.jpeg","http://dstatic.zuimeia.com/common/image/2017/1/10/78599bdb-c153-465f-bed2-e8e21b6fd951_1000x1000.jpeg"]
             * is_on_sale : 0
             * price : 350
             * is_foreign : 0
             * brief : Moorigin | 'Line' 几何吊坠
             * designer : {"city":"台湾","concept":"戴上简单舒服的首饰就像喝了一口纯净好水","name":"林玮仁 ","label":"Moorigin 创始人","avatar_url":"http://dstatic.zuimeia.com/designer/avatar/2016/12/27/4c86d4d1-0fda-4705-8c82-954968d9b916.jpg","id":296}
             * web_url : http://design.zuimeia.com/product/1989/
             * like_user_num : 141
             * mark_user_num : 17
             * images : ["http://dstatic.zuimeia.com/common/image/2017/1/13/ecdc31f8-d5d8-4f64-96d3-0176cecc400b_1000x1000.jpeg"]
             * publish_at : 1485014400000
             * detail_url : https://design.zuimeia.com/product/mobile/webview/1989/
             * id : 1989
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
