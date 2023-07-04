package com.rajnipkg.assignment

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.rajnipkg.assignment.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding


    // private lateinit var binding:
    //  private val photoAdapter = PhotoAdapter(listOf(DtPhoto()))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.recGrid.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        var photoViewModel = getViewModel<PhotoViewModel>()
        photoViewModel.photos.observe(this, { photos ->
            Log.i("chkr_pic",photos.get(0).toString())

            binding.recGrid.apply {
                layoutManager=LinearLayoutManager(this@MainActivity)
                adapter=PhotoAdapter(photos)
            }

            //val adapter = PhotoAdapter(photos)
            // recyclerView.adapter = adapter
        })

        photoViewModel.fetchPhotos()
    }

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val photoViewModel = getViewModel<PhotoViewModel>()
        photoViewModel.photos.observe(this, { photos ->
            Log.i("chkr_pic",photos.get(0).toString())

            //val adapter = PhotoAdapter(photos)
            // recyclerView.adapter = adapter
        })

        photoViewModel.fetchPhotos()*/



        /* setContent {
             AssignmentTheme {
                 // A surface container using the 'background' color from the theme
                 Surface(
                     modifier = Modifier.fillMaxSize(),
                     color = MaterialTheme.colorScheme.background
                 ) {
                     Greeting("Android")
                 }


             }
         }*/
    }


/*private lateinit var binding: ActivityMainBinding
    private val photoAdapter = PhotoAdapter(listOf(DtPhoto()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.recGrid.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=photoAdapter
        }

    }
*/