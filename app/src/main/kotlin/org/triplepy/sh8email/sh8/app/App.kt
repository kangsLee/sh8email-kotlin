package org.triplepy.sh8email.sh8.app

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import org.triplepy.sh8email.sh8.SharedPreferencesController

/**
 * The sh8email-android Project.
 * ==============================
 * org.triplepy.sh8email.sh8.app
 * ==============================
 * Created by igangsan on 2016. 8. 28..
 *
 * Application 클래스
 * 현재 Crashlytics만 추가하였습니다.
 *
 * @author 이강산 (river-mountain)
 */

class App : Application() {
    companion object{
        lateinit var pref: SharedPreferencesController
    }

    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())

        pref = SharedPreferencesController(this, "sh8Pref")
    }

}
