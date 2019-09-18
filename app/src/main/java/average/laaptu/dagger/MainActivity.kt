package average.laaptu.dagger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import average.laaptu.dagger.simple.ActiveService
import average.laaptu.dagger.simple.AppDb
import average.laaptu.dagger.simple.SimpleActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (firstFragment as SimpleFragment).printInjected("FirstFragment@Main")
        (secondFragment as SimpleFragment).printInjected("SecondFragment@Main")
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btnSimple -> startActivity(Intent(this, SimpleActivity::class.java))
        }
    }
}
