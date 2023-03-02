package com.foranj.farmtow.bgnjjuuj

import android.app.Application
import android.content.Context
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hy5hy5
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hy59hy59hy59hy
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.yy9u9u9
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.vfbrfgfrgrfgrfgyrfgy
import com.foranj.farmtow.hyjuujju.bgbgnhhy5995uj5ju
import com.foranj.farmtow.hyjuujju.hyju5ju8
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class ApleApleAPleClasaa:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        b59h5y()

        val gthyhyhyjuuj5 = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val bhyhjyujujuj = getSharedPreferences("PREFS_NAME", 0)

        val b26ju = MyTracker.getTrackerParams()
        val gtngtgtjiogtji = MyTracker.getTrackerConfig()
        val hy5j9u59uj = MyTracker.getInstanceId(this)
        gtngtgtjiogtji.isTrackingLaunchEnabled = true
        val bgnuju9 = UUID.randomUUID().toString()

        if (bhyhjyujujuj.getBoolean("my_first_time", true)) {
            b26ju.setCustomUserId(bgnuju9)
            gthyhyhyjuuj5.edit().putString(hy59hy59hy59hy, bgnuju9).apply()
            gthyhyhyjuuj5.edit().putString(yy9u9u9, hy5j9u59uj).apply()
            bhyhjyujujuj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val nrfedfrerfrf = gthyhyhyjuuj5.getString(hy59hy59hy59hy, bgnuju9)
            b26ju.setCustomUserId(nrfedfrerfrf)
        }
        MyTracker.initTracker(hy5hy5, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ApleApleAPleClasaa)
            modules(
                listOf(
                    bgbgnhhy5995uj5ju, hyju5ju8
                )
            )
        }
    }

    private fun b59h5y() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }
}