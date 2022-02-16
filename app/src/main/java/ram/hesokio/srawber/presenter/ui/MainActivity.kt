package ram.hesokio.srawber.presenter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import ram.hesokio.srawber.R
import ram.hesokio.srawber.presenter.ui.menu.FMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.frgmContainer, FMenu())
        }
    }
}