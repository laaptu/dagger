package average.laaptu.dagger.simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import average.laaptu.dagger.R
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_simple.*
import javax.inject.Inject

class SimpleActivity : AppCompatActivity() {

    @Inject
    lateinit var activeService: ActiveService

    @Inject
    lateinit var activeService1: ActiveService


    @Inject
    lateinit var appDb: AppDb
    @Inject
    lateinit var appDb1: AppDb

    @Inject
    lateinit var appService: AppService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_simple)
        txtInfo.text = activeService.fetchSomeData()
        println(activeService)
        println(activeService1)

        appDb.storeToAppDb()
        appService.showAppService()
        println(appDb)
        println(appDb1)
    }
}
