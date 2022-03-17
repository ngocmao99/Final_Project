package com.example.finalproject.view.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import com.example.finalproject.R;

public class LoadingDialogCustom {
    private Context context;
    Dialog dialog;

    public LoadingDialogCustom(Context context) {
        this.context = context;
    }

    public void showLoadingDialog(){
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.create();
        dialog.show();
    }

    public void hideLoadingDialog(){
        dialog.dismiss();
    }
}
