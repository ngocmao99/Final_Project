package com.example.finalproject.utils;

public class Constants {
    public static final String EMAIL_REGEX = "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
            + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
            + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
            + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

    public static final String NAME_REGEX1= "^[a-zA-Z\\s]+$";
    public static final String NAME_REGEX2="[0-9]";
    public static final int RC_SING_IN = 100;
    public static final String TAG = "GOOGLE_SIGN_IN_TAG";
    public static final String FB_TAG = "FACEBOOK_SIGN_IN_TAG";

    public static final int FM_HOME =1;
    public static final int FM_ABOUT_APP =2;
    public static final int FM_HELP = 3;
    public static final int FM_FEED=4;
    public static final int FM_PROFILE=5;
    public static final int FM_FAVORITE=6;

    public static final String FB_LINK = "https://www.facebook.com/ngockhanh.nguyen.944023";
    public static final String GITHUB_LINK = "https://github.com/ngocmao99/NgocKhanh_FinalApp";


}
