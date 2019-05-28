package tk.nox.vm.droid.ui.launcher

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.virtualapp.R


/**
 * @program: VirtualApp
 * @description:
 * @author: gavinliu
 * @create: 2019-05-28 16:53
 **/
class LauncherFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_launcher, container, false)
    }

}