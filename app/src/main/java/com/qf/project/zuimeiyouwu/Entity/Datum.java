package com.qf.project.zuimeiyouwu.Entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.squareup.picasso.Target;

/**
 * Simple model class
 * One important requirement for DeckView to function
 * is that all items in the dataset *must be* uniquely
 * identifiable. No two items can be such
 * that `item1.equals(item2)` returns `true`.
 * See equals() implementation below.
 * `id` is generated using `DeckViewSampleActivity#generateuniqueKey()`
 * Implementing `Parcelable` serves only one purpose - to persist data
 * on configuration change.
 */
public class Datum implements Parcelable {

    public int id;
    public String headerTitle, link,title,subTitle,avatar_url,
            sign,num;
    public Target target;

    public Datum() {
        // Nothing
    }
    //重写Parcelable接口方法,不用管
    @Override
    public int describeContents() {
        return 0;
    }
    //构造方法传值给readFromParcel
    public Datum(Parcel in) {
        readFromParcel(in);
    }
    //读取Parcel in数据赋值给属性
    public void readFromParcel(Parcel in) {
        id = in.readInt();
        headerTitle = in.readString();
        title=in.readString();
        subTitle=in.readString();
        link = in.readString();
        avatar_url = in.readString();
        sign = in.readString();
        num = in.readString();
    }


     //写入接口函数，打包
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(headerTitle);
        dest.writeString(link);
        dest.writeString(title);
        dest.writeString(subTitle);
        dest.writeString(avatar_url);
        dest.writeString(sign);
        dest.writeString(num);
    }

    public static final Creator<Datum> CREATOR = new Creator<Datum>() {
        public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return new Datum[size];
        }
    };

    @Override
    public boolean equals(Object o) {
        return ((Datum) o).id == this.id;
    }
}