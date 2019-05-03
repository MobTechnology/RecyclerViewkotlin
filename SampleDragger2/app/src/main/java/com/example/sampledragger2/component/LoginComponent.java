package com.example.sampledragger2.network;

import com.example.sampledragger2.LoginActivity;
import com.example.sampledragger2.module.AppModel;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {NetworkApi.class, AppModel.class})
public interface NetworkService {

    public void inject(LoginActivity activity);
}
