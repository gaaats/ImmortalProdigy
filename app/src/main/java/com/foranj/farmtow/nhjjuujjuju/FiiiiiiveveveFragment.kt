package com.foranj.farmtow.nhjjuujjuju

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.ttttt
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.gt2hyhyhy
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.frfrfrf
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.gthyhjyhyjuuj
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.iii
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hy59hy59hy59hy
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hy5hy95h
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hy6hy59hy
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.yy9u9u9
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hjjuju
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.foranj.farmtow.vbgbggb.LinkkkakakakakakakActivity2
import com.foranj.farmtow.R
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hjuu9ju9
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.vfvf

import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hhh
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.trolologttggt
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.iikki
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.vbfbfrrfhrfhfrhfrfr
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.loolol
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiiiiiiveveveFragment : Fragment() {

    private fun frhhgigithgihugthugt(fhrirfurfuhrf: Intent) {
        startActivity(fhrirfurfuhrf)
    }

    private fun hy5hy59hy59hy() {
        activity?.finish()
    }

    override fun onStart() {
        super.onStart()


        val g5t5gt5: String? = gy5hy59h5hy.getString(yy9u9u9, null)
        val uj5ki = gy5hy59h5hy.getString("deepSt", null)
        val jujki5ki5ik = gy5hy59h5hy.getString(vfvf, null)
        val ju5k = gy5hy59h5hy.getString(hjjuju, null)
        val jik2loolol = gy5hy59h5hy.getString(hjuu9ju9, null)
        val gjgtojgt = gy5hy59h5hy.getString(frfrfrf, null)
        val hyuj95ik9ikik = hy5hy95h
        val hy5uj5uj = Build.VERSION.RELEASE
        val hy59y5uj5ju5ju = gy5hy59h5hy.getString(hy59hy59hy59hy, null)
        val gthutguhugthgtgtgt = gy5hy59h5hy.getString("appCamp", null)
        val nnnmj2j2ju = gy5hy59h5hy.getString("mainId", null)

        val fhrirfurfuhrf = Intent(activity, LinkkkakakakakakakActivity2::class.java)
        val vfbfryrfgfrgfgrgfrrfrf = Intent(activity, GaaaamymmymymyActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(hy2ju2uj26uj)
        hyhuj59uj5uj59uj()

        gy5hy59h5hy.edit().putString(ttttt, afIdhyhyhy).apply()

        val gngnufhhth = "$jik2loolol$iikki$gthutguhugthgtgtgt&$hhh$afIdhyhyhy&$loolol$nnnmj2j2ju&$gt2hyhyhy$hyuj95ik9ikik&$vbfbfrrfhrfhfrhfrfr$hy5uj5uj&$hy6hy59hy$gthyhjyhyjuuj"
        val hy59hy59hy59hy = "$jik2loolol$hhh$hy59y5uj5ju5ju&$loolol$g5t5gt5&$gt2hyhyhy$hyuj95ik9ikik&$vbfbfrrfhrfhfrhfrfr$hy5uj5uj&$hy6hy59hy$gthyhjyhyjuuj"
        val vbyrfgrfrfg = "$jik2loolol$iikki$uj5ki&$hhh$afIdhyhyhy&$loolol$nnnmj2j2ju&$gt2hyhyhy$hyuj95ik9ikik&$vbfbfrrfhrfhfrhfrfr$hy5uj5uj&$hy6hy59hy$trolologttggt"
        val hy5uj9uj9uj = "$jik2loolol$iikki$uj5ki&$hhh$hy59y5uj5ju5ju&$loolol$g5t5gt5&$gt2hyhyhy$hyuj95ik9ikik&$vbfbfrrfhrfhfrhfrfr$hy5uj5uj&$hy6hy59hy$trolologttggt"

        when(ju5k) {
            "1" ->
                if(gthutguhugthgtgtgt!="null") {
                    gy5hy59h5hy.edit().putString(iii, gngnufhhth).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "campaign").apply()
                    frhhgigithgihugthugt(fhrirfurfuhrf)
                    hy5hy59hy59hy()
                } else if (uj5ki!=null||jujki5ki5ik!!.contains(gjgtojgt.toString())) {
                    gy5hy59h5hy.edit().putString(iii, vbyrfgrfrfg).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "deepLink").apply()
                    frhhgigithgihugthugt(fhrirfurfuhrf)
                    hy5hy59hy59hy()
                } else {
                    frhhgigithgihugthugt(vfbfryrfgfrgfgrgfrrfrf)
                    hy5hy59hy59hy()
                }
            "0" ->
                if(uj5ki!=null) {
                    gy5hy59h5hy.edit().putString(iii, hy5uj9uj9uj).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "deepLinkNOApps").apply()
                    frhhgigithgihugthugt(fhrirfurfuhrf)
                    hy5hy59hy59hy()
                } else if (jujki5ki5ik!!.contains(gjgtojgt.toString())) {
                    gy5hy59h5hy.edit().putString(iii, hy59hy59hy59hy).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "geo").apply()
                    frhhgigithgihugthugt(fhrirfurfuhrf)
                    hy5hy59hy59hy()
                } else {
                    frhhgigithgihugthugt(vfbfryrfgfrgfgrgfrrfrf)
                    hy5hy59hy59hy()
                }
        }
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiiiiveveve, container, false)
    }

    private fun hyhuj59uj5uj59uj() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }

    private lateinit var hy2ju2uj26uj: Context
    val gy5hy59h5hy: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hy2ju2uj26uj = context
    }

}