package average.laaptu.dagger.simple

import android.os.Bundle
import average.laaptu.dagger.BaseActivity
import average.laaptu.dagger.R
import kotlinx.android.synthetic.main.activity_simple.*
import timber.log.Timber
import javax.inject.Inject

class SimpleActivity : BaseActivity() {

    @Inject
    lateinit var activeService1: ActiveService

    @Inject
    lateinit var appService: AppService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        txtInfo.text = activeService.fetchSomeData()

        appDb.storeToAppDb()
        appService.showAppService()
        Timber.d("ActiveService1 = $activeService1")
    }
}
