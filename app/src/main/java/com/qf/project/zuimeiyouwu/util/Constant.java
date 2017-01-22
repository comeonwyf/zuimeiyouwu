package com.qf.project.zuimeiyouwu.util;

/**
 * Created by Administrator on 2017/1/16.
 */
public interface Constant {
    String HUABAO_URL = "http://design.zuimeia.com/api/v1/articles/daily/simple/?page=";
    //有物-导航标题
    String TAB_URL = "http://design.zuimeia.com/api/v1/product/categories/?device_id=864394010282103&platform=android&lang=zh&appVersion=1.2.6&appVersionCode=10260&systemVersion=19&countryCode=CN&user_id=0&token=&package_name=com.zuiapps.zuiworld";
    //有物-标题详细信息前半部分的url
    String TAB_DETAILS_BEFORE_URL = "http://design.zuimeia.com/api/v1/products/category/%d/?page=%d&page_size=30&device_id=864394010282103&platform=android&lang=zh&appVersion=1.2.6&appVersionCode=10260&systemVersion=19&countryCode=CN&user_id=0&token=&package_name=com.zuiapps.zuiworld";
    //有物-设计师推荐页
    String DESIGNER_URl="http://design.zuimeia.com/api/v1/designers/recommend/?page=1&page_size=30&device_id=864394011605716&platform=android&lang=zh&appVersion=1.2.6&appVersionCode=10260&systemVersion=19&countryCode=CN&user_id=0&token=&package_name=com.zuiapps.zuiworld";
    //有物-设计师推荐页Tablayot数组
    String [] TABLAYOUT_ARR={"推荐","最受欢迎","独立设计师","大牌设计师"};

    //用户协议地址
    String XIEYI = "http://design.zuimeia.com/term_of_use.html";
    //画报详情url
    String HUABAO_CONTENT_URL = "http://design.zuimeia.com/api/v1/article/";
}
