package com.example.netclanassignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.netclanassignment.databinding.ActivityMainBinding

// new netclanAssingment
class MainActivity : AppCompatActivity() {

//    lateinit var drawerLayout : DrawerLayout

    private val bindings : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(bindings.root)
//
//
//        bindings.materialToolbar.setNavigationOnClickListener {
//
//            drawerLayout.open()
//        }
//


//        bindings.refinebutton.setOnClickListener{
//            val refineFragment = refine_fragment()
//            val transient = supportFragmentManager.beginTransaction()
//            transient.replace(R.id.main, refineFragment)
//
//            transient.addToBackStack(null)
//            transient.commit()
//        }

    }
}