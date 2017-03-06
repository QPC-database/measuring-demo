package com.nacode.measuring.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.nacode.measuring.R;
import com.nacode.measuring.analytics.ga.TagManager;

public class WelcomeActivity extends BaseActivity {

    public static final String LOG_TAG = WelcomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TagManager.logScreenName(getString(R.string.scr_welcome));
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void viewsBinding() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_up:
                startActivity(new Intent(this, SignUpActivity.class));
                break;
            default:
                Log.d(LOG_TAG, "non click action");
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
