package com.foranj.farmtow.hyjuujju

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.foranj.farmtow.frgthyhyhy.Njkfjrrfjffr
import com.foranj.farmtow.frrfokforrf.OKDoekedkfr
import com.foranj.farmtow.ghhyhy.HGYFygfrrf
import com.foranj.farmtow.gthjuujuj.KNFrnfrijrfj
import com.foranj.farmtow.hnhjujujuuj.JIjrfjrfirfijrf
import com.foranj.farmtow.hyjuujuj.Gygfrgygrfrfrf
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun hyjuu8u7u7(): Gson {
    return GsonBuilder().create()
}



val bgbgnhhy5995uj5ju = module {
    viewModel (named("MainModel")){
        JIjrfjrfirfijrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Gygfrgygrfrfrf(get())
    }
}

val hyju5ju8 = module {

    single  <OKDoekedkfr> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(OKDoekedkfr::class.java)
    }

    single <Njkfjrrfjffr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Njkfjrrfjffr::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://immortalprodigy.live/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        KNFrnfrijrfj(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        HGYFygfrrf(get(named("HostInter")))
    }
    single{
        hyjuu8u7u7()
    }
    single (named("SharedPreferences")) {
        h26hyhyhy6(androidApplication())
    }
}

fun h26hyhyhy6(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


