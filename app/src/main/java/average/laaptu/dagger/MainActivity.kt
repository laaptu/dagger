package average.laaptu.dagger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import average.laaptu.dagger.simple.ActiveService
import average.laaptu.dagger.simple.AppDb
import average.laaptu.dagger.simple.SimpleActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var activeService: ActiveService

    @Inject
    lateinit var appDb: AppDb

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        println(appDb)
        println(activeService)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btnSimple -> startActivity(Intent(this, SimpleActivity::class.java))
        }
    }
}
