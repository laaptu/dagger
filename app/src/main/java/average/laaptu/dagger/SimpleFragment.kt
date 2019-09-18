package average.laaptu.dagger

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import average.laaptu.dagger.simple.ActiveService
import average.laaptu.dagger.simple.AppDb
import average.laaptu.dagger.simple.FragmentService
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.DaggerFragment
import timber.log.Timber
import javax.inject.Inject

class SimpleFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        (context.applicationContext as MainApplication).androidInjector.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_simple, container, false)
    }

    @Inject
    lateinit var fragmentService1: FragmentService
    @Inject
    lateinit var fragmentService2: FragmentService


    @Inject
    lateinit var appDb: AppDb

    fun printInjected(fragmentName: String) {
        Timber.d("Fragment =$fragmentName")
        Timber.d("appDb = $appDb")
        Timber.d("FragmentService1 = $fragmentService1")
        Timber.d("FragmentService2 = $fragmentService2")
    }
}