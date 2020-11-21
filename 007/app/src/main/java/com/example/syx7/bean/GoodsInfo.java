package com.example.syx7.bean;

import com.example.syx7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "凯迪拉克", "别克微蓝6", "别克微蓝7", "雪佛兰 开拓者", "上汽大众 帕萨特", "雪佛兰 畅巡","上汽大众 辉昂","上汽大众 途观L "
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = new String[]{
            "凯迪拉克 XT6 至享安全版 新车订金",
            "别克微蓝6纯电动车410KM 汽车新车订金",
            "别克微蓝7纯电动SUV 汽车新车订金",
            "雪佛兰 开拓者 全系新车订金",
            "上汽大众 帕萨特 全系新车订金",
            "雪佛兰 畅巡 全系新车订金",
            "上汽大众 辉昂 全系新车订金",
            "上汽大众 途观L 全系新车订金"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {62990, 21990, 24990, 52990, 18990, 19980,169900,49990};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.kdlk_s, R.drawable.bk6_s, R.drawable.bk7_s,
            R.drawable.ktz_s, R.drawable.pst_s, R.drawable.xflcx_s, R.drawable.huia_s,R.drawable.tgl_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.kdlk, R.drawable.bk6, R.drawable.bk7,
            R.drawable.ktz, R.drawable.pst, R.drawable.xflcx,
            R.drawable.huia, R.drawable.tgl
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
