package com.example.sampledragger2.module;

import android.content.Context;
import com.example.sampledragger2.LoginActivity;
import com.example.sampledragger2.qualifier.ActivityContext;
import com.example.sampledragger2.scopes.ActivityScope;
import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityContext {
    private LoginActivity loginActivity;

    public Context context;

    public LoginActivityContext(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        context = loginActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public LoginActivity providesLoginActivity() {
        return loginActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }
}
