package com.foranj.farmtow.nhjjuujjuju

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import com.foranj.farmtow.hnhjujujuuj.JIjrfjrfirfijrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.foranj.farmtow.R
import com.foranj.farmtow.gthyhyhyhy.IJjifirijiii.hjjuju




class FooooooooorrFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fooooooooorr, container, false)
    }

    val hy2hy26ju26uj by activityViewModel<JIjrfjrfirfijrf>(named("MainModel"))
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var hy5hy95ju95ujju: String
    private lateinit var mContextgtgtgt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val g5t955gt595gt = sharePgtgtgt.getString(hjjuju, null)
        val hyhyhyhyhy = sharePgtgtgt.getString("appCamp", null)

        if (g5t955gt595gt=="1" &&hyhyhyhyhy == null) {
            hy2hy26ju26uj.gtthyhyhy(mContextgtgtgt)
            hy2hy26ju26uj.hy5yh59.observe(viewLifecycleOwner) {
                if (it != null) {
                    hy5hy95ju95ujju = it.toString()
                    sharePgtgtgt.edit().putString("appCamp", hy5hy95ju95ujju).apply()
                    gtjiogtjigtjijigt()
                }
            }
        } else {
            gtjiogtjigtjijigt()
        }
    }

    private fun gtjiogtjigtjijigt() {
        findNavController().navigate(R.id.action_fooooooooorrFragment_to_fiiiiiiveveveFragment)
    }

}