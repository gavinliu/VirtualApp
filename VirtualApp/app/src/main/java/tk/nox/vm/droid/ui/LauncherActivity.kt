package tk.nox.vm.droid.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.virtualapp.R


/**
 * @program: VirtualApp
 * @description:
 * @author: gavinliu
 * @create: 2019-05-28 16:53
 **/
class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
    }

    companion object {

        fun goLauncher(context: Context) {
            val intent = Intent(context, LauncherActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }

    }

}