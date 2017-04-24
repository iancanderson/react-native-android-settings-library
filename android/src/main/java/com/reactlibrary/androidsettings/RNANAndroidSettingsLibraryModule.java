
package com.reactlibrary.androidsettings;

import android.content.Intent;
import android.provider.Settings;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNANAndroidSettingsLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNANAndroidSettingsLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNANAndroidSettingsLibrary";
  }

  @ReactMethod
  public void open(String type_setting) {
    Intent intentCl = new Intent();
    Settings action = Settings.valueOf(type_setting);
    intentCl.setAction(action);
    intentCl.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivity(intentCl);
  }

  @ReactMethod
  public void main() {
      open("main");
  }
}
