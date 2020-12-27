package com.anas.mtcapp;

import android.widget.ImageView;

public class MemberModel {
    private String MemberName , MemeberDescription ;
    private int MemberImg ;
    public MemberModel(String Mname , String Mdesc,int Mimg){
        this.MemberName=Mname;
        this.MemeberDescription=Mdesc;
        this.MemberImg=Mimg;
    }

    public MemberModel() {

    }

    public String getMemberName (){
        return MemberName ;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemeberDescription() {
        return MemeberDescription;
    }

    public void setMemeberDescription(String memeberDescription) {
        MemeberDescription = memeberDescription;
    }

    public int getMemberImg() {
        return MemberImg;
    }

    public void setMemberImg(int memberImg) {
        MemberImg = memberImg;
    }
}