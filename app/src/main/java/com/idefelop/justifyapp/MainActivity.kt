package com.idefelop.justifyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.idefelop.justifyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgMentor.setImageResource(intent.getIntExtra("gambar", 0))
        binding.namaMentor.text = intent.getStringExtra("nama")
        binding.bidangMentor.text = intent.getStringExtra("bidang")

        val btnreview: Button = binding.btnReview1
        btnreview.setOnClickListener(this)

        val btnbackoverview: Button = binding.btnBackOverview
        btnbackoverview.setOnClickListener(this)

        val btncheckover: Button = binding.btnCheckOverview
        btncheckover.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_Review1 -> {
//                    val intent = Intent(this@OverviewActivity, Main::class.java)
//
//                    val bundle = Bundle()
//                    bundle.putInt("gambar", intent.getIntExtra("gambar", 0))
//                    bundle.putString("nama", intent.getStringExtra("nama"))
//                    bundle.putString("bidang", intent.getStringExtra("bidang"))
//
//                    intent.putExtras(bundle)
//                    startActivity(intent)
                }
                R.id.btn_backOverview -> {
//                    val intent = Intent(this@OverviewActivity, MainActivity::class.java)
//                    startActivity(intent)
                }
                R.id.btn_checkOverview -> {
//                    val intent = Intent(this@OverviewActivity, AvaibilityCheckActivity::class.java)
//                    startActivity(intent)
                }
            }
        }
    }
}