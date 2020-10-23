package com.slusher.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KlVprXSKuOlN5LiPMfKQNQDOKUic1Ebq7zV017MM")
                .clientKey("RA4EEMuRkkXzNeDLOuD4T5fvZsRETKFrYhPPNi6z")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
