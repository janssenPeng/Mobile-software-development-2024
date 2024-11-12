package com.example.myapplicationpetcareassistant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationpetcareassistant.databinding.ActivityAddPetBinding

class AddPetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddPetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 使用 ViewBinding
        binding = ActivityAddPetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 设置返回按钮
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "添加宠物"

        // 确认按钮的点击事件
        binding.confirmButton.setOnClickListener {
            val petName = binding.petNameEditText.text.toString()
            val petAge = binding.petAgeEditText.text.toString()

            // 可以添加保存数据的逻辑，比如存储在数据库中，或者返回给主页面

            // 完成后可以结束当前 Activity 返回主页面
            finish()
        }
    }

    // 处理返回按钮点击
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
