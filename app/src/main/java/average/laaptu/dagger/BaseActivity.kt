package average.laaptu.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import average.laaptu.dagger.simple.ActiveService
import average.laaptu.dagger.simple.AppDb
import dagger.android.AndroidInjection
import timber.log.Timber
import javax.inject.Inject

open class BaseActivity : AppCompatActivity() {
    @Inject
    lateinit var appDb: AppDb

    @Inject
    lateinit var activeService: ActiveService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        printDependencies()
    }

    open fun printDependencies() {
        Timber.d("AppDb = $appDb")
        Timber.d("ActiveService = $activeService")
    }
}